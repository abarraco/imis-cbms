package org.vmasc.cbms.client.web;

import java.io.IOException;
import java.util.logging.Logger;
import org.xlightweb.IEventHandler;
import org.xlightweb.client.HttpClient;

/**
 * This class opens a server sent event stream.
 * @author abarraco
 *
 */
public class CbmsEvent
{
	private static final Logger LOGGER = Logger.getLogger(CbmsEvent.class.getName());
	private HttpClient httpClient;
	private String subscriptionUrl;
	
	/**
	 * Constructor
	 * @param eventHandler: handler used to retrieve server sent events asynchronously
	 */
	public CbmsEvent(String subscriptionUrl)
	{
		httpClient = new HttpClient();
		this.subscriptionUrl = subscriptionUrl;
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
	
	public boolean openEventDataSource(IEventHandler eventHandler)
	{
		boolean success = true;
		
		try 
		{
			LOGGER.info("CbmsEvent uri:" + subscriptionUrl);
			httpClient.openEventDataSource(subscriptionUrl, eventHandler);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			success = false;
		}
		
		return success;
	}
}



