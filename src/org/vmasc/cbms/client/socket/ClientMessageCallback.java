/*
 *   File Name: ClientMessageCallback.java
 *
 *   Classification:  Unclassified
 *
 */
package org.vmasc.cbms.client.socket;

/**
 * Implement this interface to receive a callback when 
 * a message is received from a client simulation or C2 device.
 * 
 * @author abarraco
 */
public interface ClientMessageCallback
{
	
	/**
	 * Callback when a message is received from the client server.
	 * @param message: the message received 
	 */
	public void receiveMessageFromClient(String message);
	
	/**
	 * Notify the client a message has been received to close the application.
	 */
	public void setExiting();
}
