/*
 *   File Name: CbmsMessageCakllback.java
 *
 *   Classification:  Unclassified
 *
 */
package org.vmasc.cbms.client.web;

/**
 * Implement this interface to receive a callback when 
 * a message is received from the CBMS server.
 * 
 * @author abarraco
 */
public interface CbmsMessageCallback
{
	/**
	 * Callback when raw binary data is received from the CBMS server.
	 * @param data: the binary data received
	 * @param fileName: the name of the binary file
	 */
	public void receiveBinaryFromCbms(byte[] binaryMessage, String fileName);
	
	/**
	 * Callback when a message is received from the CBMS server.
	 * @param message: the message received from the server
	 */
	public void receiveMessageFromCbms(String message);
	
	
}
