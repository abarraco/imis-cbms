/*
 *   File Name: CommunicationSocket
 *
 *   Classification:  Unclassified
 *
 */

package org.vmasc.cbms.client.socket;

import java.io.IOException;

public abstract class CommunicationSocket 
{
	public static final int IPV6 = 6;
	public static final int IPV4 = 4;
	
	protected GenericListener listener = null;				//listens for incoming messages

	protected String sendServer;							//server address
	protected int sendPort;									//server port
	protected Thread thread = null;							//thread which waits for incoming messages
	protected ClientMessageCallback clientMessageCallback;	//callback interface when there is an incoming message
	
	public interface GenericListener extends Runnable
	{
	}
	
	/**
	 * 
	 * @param sendServer: the address to which messages are sent
	 * @param sendPort: the server port
	 * @param clientMessageCallback: callback interface when there is an incoming message
	 */
	public CommunicationSocket(String sendServer, int sendPort, ClientMessageCallback clientMessageCallback)
	{
		this.sendServer = sendServer;
		this.sendPort = sendPort;
		this.clientMessageCallback = clientMessageCallback;
	}
	
	/**
	 * Send messages to the simulation.
	 * @param message: the message to be sent
	 * @return: none
	 * @throws IOException
	 */
	public abstract void send(byte[] message) throws IOException;
	
	/**
	 * Start the thread which waits for incoming messages.
	 * @return: none
	 */
	public void startServer()
	{
		thread = new Thread(listener);
		thread.start();
	}
}
