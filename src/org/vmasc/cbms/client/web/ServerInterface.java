/*
 *   File Name: ServerInterface.java
 *
 *   Classification:  Unclassified
 *
 */
package org.vmasc.cbms.client.web;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.xlightweb.Event;
import org.xlightweb.IBodyDataHandler;
import org.xlightweb.IEventDataSource;
import org.xlightweb.IEventHandler;
import org.xlightweb.IHttpResponse;
import org.xlightweb.IHttpResponseHandler;
import org.xlightweb.NonBlockingBodyDataSource;
import org.vmasc.cbms.client.util.Params;


/**
 * This is the interface with the CBMS server.
 * 
 * @author abarraco
 */
public class ServerInterface
{
	//the maximum number of attempts when attempting to open a subscription data source
	private static final int MAX_CONNECTION_ATTEMPTS = 5;
	
	private static final Logger LOGGER = Logger.getLogger(ServerInterface.class.getName());
	
	//return server responses using this interface
    private CbmsMessageCallback cbmsMessageCallback = null;

	public static final String JAXRX = "jax-rx";
	public static final String SUBSCRIPTION = "subscriptions";
	public static final String BINARY = "binary";
	public static final String RESOURCE = Params.getString("RESOURCE");
	public static final String SERVER = Params.getString("SERVER");
	public static final String SYSTEM = Params.getString("SYSTEM");
	
	//the parameter key used when sending or retrieving a binary file name
	static private final String PARAM_NAME = "var";
	
	private static String postUrl;
	private static String postBinaryUrl;
	
	//the HTTP client used to post messages to the server 
	private CbmsRequest cbmsRequest = null;
	
	//the HTTP clients used to subscribe to files posted to the server
	private List <CbmsEvent> cbmsEventList = new ArrayList<CbmsEvent>();

	/**
	 * This class handles events received from the server.
	 * @author abarraco
	 *
	 */
	public class ServerEventHandler implements IEventHandler
	{ 
	    public void onConnect(IEventDataSource webEventDataSource) throws IOException 
	    {
	    	LOGGER.info("onConnect(): event stream established");
	    }
	        
	    public void onMessage(IEventDataSource webEventDataSource) throws IOException 
	    {
	      Event event = webEventDataSource.readMessage();
	      String xml = new String(event.getData());
	      
	      //send the message to the simulation
	      receiveMessageFromCbms(xml);
	    }
	        
	    public void onDisconnect(IEventDataSource webEventDataSource) throws IOException 
	    {
	    	LOGGER.info("onDisconnect(): event stream closed");
	    }
	}
	
	/**
	 * This class handles the server response to a client request.
	 * @author abarraco
	 *
	 */
	public class ServerResponseHandler implements IHttpResponseHandler 
	{
	   public void onResponse(IHttpResponse response) throws IOException 
	   {
	      int status = response.getStatus();
	      int length = response.getContentLength();
	      LOGGER.info("ServerResponseHandler length:" + length + "  contenttype:" + response.getContentType() + "  status:" + Integer.toString(status));
	      
	      //if raw binary data
	      if(response.getContentType().equals("application/octet-stream"))
	      {
	    	  String paramValue = response.getHeader(PARAM_NAME);
	    	  if(paramValue != null)
	    	  {
	    		  response.getNonBlockingBody().setDataHandler(new BinaryBodyStreamer(length, paramValue));
	    	  }
	    	  else
	    	  {
	    		  LOGGER.info("onResponse: file name missing for binary data");
	    	  }
	      }
	      //else expecting text
	      else 
	      {
	    	  response.getNonBlockingBody().setDataHandler(new TextBodyStreamer());
	      }
	   }

	   public void onException(IOException ioe) 
	   {
	      ioe.printStackTrace();
	   }
	}
	
	/**
	 * This class reads the binary data of a server response in a non-blocking manner.
	 * @author abarraco
	 *
	 */
	public class BinaryBodyStreamer implements IBodyDataHandler
	{
		private byte[] byteData;
		private int currentIndex = 0;
		private int length = 0;
		private String fileName;
		
		public BinaryBodyStreamer(int length, String fileName)
		{
			byteData = new byte[length];
			this.length = length;
			this.fileName = fileName;
		}
		
		public boolean onData(NonBlockingBodyDataSource bodyDataSource)
				throws BufferUnderflowException 
		{
			try 
			{
				//check for data to transfer
				int available = bodyDataSource.available();
				if(available > 0)
				{
					byte[] newByteData = bodyDataSource.readBytesByLength(available);
					if(newByteData != null)
					{
						int newByteDataLength = newByteData.length;
						for(int i = 0; i < newByteDataLength; i++)
						{
							if(currentIndex < length)
							{
								byteData[currentIndex] = newByteData[i];
								currentIndex++;
							}
							else
							{
								LOGGER.info("ServerInterface: array overrun error receiving binary data.");
								break;
							}
						}
					}
				}
				//else transfer complete
				else if(available == -1)
				{
					receiveBinaryFromCbms(byteData, fileName);
				}
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
			
			return true;
		}	
	}
	
	/**
	 * This class reads the string data of a server response in a non-blocking manner.
	 * @author abarraco
	 *
	 */
	public class TextBodyStreamer implements IBodyDataHandler
	{
		private String data = "";
		
		public boolean onData(NonBlockingBodyDataSource bodyDataSource)
				throws BufferUnderflowException 
		{
			try 
			{
				//check for data to transfer
				int available = bodyDataSource.available();
				if(available > 0)
				{
					String newData = bodyDataSource.readStringByLength(available);
					if(newData != null && newData.length() > 0)
					{
						data += newData;
					}
				}
				//else transfer complete
				else if(available == -1)
				{
				  if(data.length() > 0)
				  {
					  receiveMessageFromCbms(data);
				  }
				}
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
			
			return true;
		}	
	}

	public ServerInterface(CbmsMessageCallback cbmsMessageCallback, int numSubscriptions)
	{
		this.cbmsMessageCallback = cbmsMessageCallback;
		
		if(numSubscriptions > 0)
			initSubscriptions(numSubscriptions);
		
		initRequests();	
	}
	
	public void close()
	{
		if(cbmsRequest != null)
			cbmsRequest.closeClient();
		
		for(CbmsEvent cbmsEvent: cbmsEventList)
			cbmsEvent.closeClient();
	}
	
	public String getPostUrl()
	{
		return postUrl;
	}
	
	/**
	 * Request to retrieve a raw binary file from the server.
	 * @param fileName: the name of the file to retrieve
	 */
	public void getBinaryRequest(String fileName)
	{
		cbmsRequest.getRequest(postBinaryUrl, PARAM_NAME, fileName);
	}
	
	public void getRequest(String url)
	{
		cbmsRequest.getRequest(url);
	}
	
	private void initRequests()
	{
		//create the URL for posting XML files
		postUrl = "http://" + SERVER + "/" + SYSTEM + "/" + JAXRX + "/" + RESOURCE;
		LOGGER.info("postUrl:" + postUrl);
		
		//create the URL for posting binary files
		postBinaryUrl = "http://" + SERVER + "/" + SYSTEM + "/" + JAXRX + "/" + BINARY + "/" + RESOURCE;
		LOGGER.info("postBinaryUrl:" + postBinaryUrl);
		
		cbmsRequest = new CbmsRequest(new ServerResponseHandler());
	}
	
	private void addSubscriptions(List <String> queries, int numSubscriptions)
	{
		int size = queries.size();
		if(size > 0 && numSubscriptions > 1)
		{
			String query = queries.get(0);
			for(int i = 1; i < numSubscriptions; i++)
			{
				String replacement = query.replace("MultinationalCompany", "MultinationalCompany" + Integer.toString(i));
				queries.add(replacement);
			}
		}
	}
	
	/**
	 * Read subscription queries and open streams to receive server sent events.
	 */
	private void initSubscriptions(int numSubscriptions)
	{
		List <String> queries = readQueries(); 
		addSubscriptions(queries, numSubscriptions);
		
		int size = queries.size();
		for(int i = 0; i < size; i++)
		{
			String subscriptionUrl = "http://" + SERVER + "/" + SYSTEM + "/" + SUBSCRIPTION + "/" + RESOURCE + "?query=" + queries.get(i);
			CbmsEvent cbmsEvent = subscribe(subscriptionUrl, new ServerEventHandler());
			cbmsEventList.add(cbmsEvent);
		}
	}
	
	/**
	 * Post a message to the server.
	 * @param message: the message to be posted to the default url
	 */
	public void postRequest(String message)
	{
		cbmsRequest.postRequest(postUrl, message);
	}
	
	/**
	 * Post a message to the server.
	 * @param postUrl: the url to post the message to
	 * @param message: the message to be posted
	 */
	public void postRequest(String postUrl, String message)
	{
		cbmsRequest.postRequest(postUrl, message);
	}
	
	/**
	 * Post a binary message to the server.
	 * @param message: the binary data to be stored
	 * @param fileName: the name of the file to store
	 */
	public void postBinaryRequest(byte[] message, String fileName)
	{
		cbmsRequest.postRequest(postBinaryUrl, message, PARAM_NAME, fileName);
	}
	
	/**
	 * Create a list of queries retrieved from the properties file.
	 * @return: a list of queries which will be used to build subscription strings
	 */
	private List<String> readQueries()
	{
		List<String> queries = new ArrayList<String>();
		String[] queriesArray = Params.getStringArray("SUBSCRIPTION_QUERIES");
		if(queriesArray != null)
		{
			queries.addAll(Arrays.asList(queriesArray));
		}
		
		return queries;
	}
	
	/**
	 * Callback to the CbmsMessageCallback interface when raw binary data is 
	 * received from the CBMS server.
	 * @param data: the binary data received
	 * @param fileName: the name of the binary file
	 */
	private void receiveBinaryFromCbms(byte[] data, String fileName)
	{
		this.cbmsMessageCallback.receiveBinaryFromCbms(data, fileName);
	}
	
	/**
	 * Callback to the CbmsMessageCallback interface when 
	 * a message is received from the CBMS server.
	 * @param message: the message received from the server
	 */
	private void receiveMessageFromCbms(String message)
	{
		this.cbmsMessageCallback.receiveMessageFromCbms(message);
	}
	
	/**
	 * Open an event data source.
	 * @param subscriptionUrl: the url and xPath expression 
	 * @param eventHandler: the handler of the received messages
	 * @return: the CbmsEvent instance created as a result of the subscription
	 */
	public CbmsEvent subscribe(String subscriptionUrl, IEventHandler eventHandler)
	{
		CbmsEvent cbmsEvent = new CbmsEvent(subscriptionUrl);
		
		//keep trying to connect until successful for up to MAX_CONNECTION_ATTEMPTS
		boolean success;
		int attempts = 0;
		do
		{
			success = cbmsEvent.openEventDataSource(eventHandler);
			attempts++;
			LOGGER.info("openEventDataSource success:" +  Boolean.toString(success) + " attempts:" + Integer.toString(attempts));
		} while(success == false && attempts < MAX_CONNECTION_ATTEMPTS);
		
		return cbmsEvent;
	}
}
