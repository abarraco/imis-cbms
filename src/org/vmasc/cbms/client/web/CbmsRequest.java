package org.vmasc.cbms.client.web;

import java.io.IOException;
import java.net.MalformedURLException;
//import java.util.logging.Logger;
import org.vmasc.cbms.client.web.ServerInterface.ServerResponseHandler;
import org.xlightweb.GetRequest;
import org.xlightweb.PostRequest;
import org.xlightweb.PutRequest;
import org.xlightweb.client.HttpClient;

/**
 * This class sends requests to the server.
 * @author abarraco
 *
 */
public class CbmsRequest 
{
	//private static final Logger LOGGER = Logger.getLogger(CbmsRequest.class.getName());
	static private final String CONTENT_TYPE = "text/xml";
	static private final String BINARY_CONTENT_TYPE = "application/octet-stream";
	
	private HttpClient httpClient;
	
	private ServerResponseHandler responseHandler;
	
	/**
	 * Constructor
	 * @param responseHandler: handler to receive server responses asynchronously
	 */
	public CbmsRequest(ServerResponseHandler responseHandler)
	{
		httpClient = new HttpClient();
		this.responseHandler = responseHandler;
	}
	
	public void closeClient()
	{
		try 
		{
			httpClient.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Send a get request to the server.
	 * @param url: the url string
	 */
	public void getRequest(String url)
	{
		try 
		{
			GetRequest request = new GetRequest(url);
			httpClient.send(request, responseHandler);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Send a get request to the server.
	 * @param url: the url string
	 * @param paramName: the name of a parameter
	 * @param paramValue: the value of a parameter
	 */
	public void getRequest(String url, String paramName, String paramValue)
	{
		try 
		{
			GetRequest request = new GetRequest(url);
			request.setParameter(paramName, paramValue);
			
			httpClient.send(request, responseHandler);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Post text to the server.
	 * @param url: the url string
	 * @param message: the text to be posted
	 */
	public void postRequest(String url, String message)
	{
		try 
		{
			//LOGGER.info("postRequest message:" + message);
			
			PostRequest request = new PostRequest(url, CONTENT_TYPE, message, false);
			httpClient.send(request, responseHandler);
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}    
	}
	
	/**
	 * Post binary data to the server.
	 * @param url: the url string
	 * @param message: the binary data to post
	 * @param paramName: the name of a paramater
	 * @param paramValue: the value of a parameter
	 */
	public void postRequest(String url, byte[] message, String paramName, String paramValue)
	{
		try 
		{
			//LOGGER.info("postRequest binary message:" + message.toString());
			
			PostRequest request = new PostRequest(url, BINARY_CONTENT_TYPE, message, false);
			request.addParameter(paramName, paramValue);
			httpClient.send(request, responseHandler);
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}    
	}
	
	/**
	 * Send a put request to the server
	 * @param url: the url string
	 * @param message: the message to put
	 */
	public void putRequest(String url, String message)
	{
		try 
		{
			//LOGGER.info("putRequest message:" + message);
			
			PutRequest request = new PutRequest(url, CONTENT_TYPE, message, false);
			httpClient.send(request, responseHandler);
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}    
	
	}
}
