/*
 *   File Name: TcpCommunicationSocket
 *
 *   Classification:  Unclassified
 *
 */

package org.vmasc.cbms.client.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class TcpCommunicationSocket extends CommunicationSocket 
{
	private static final Logger LOGGER = Logger.getLogger(TcpCommunicationSocket.class.getName());
	
	/**
	 * Thread used to listen for incoming messages
	 * @author abarraco
	 *
	 */
	public class TcpListener implements GenericListener
	{
		private int port;						//port to listen on
		private String server = "localhost";	//server address
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		boolean exiting = false;				//set this flag to true to exit the thread

		public TcpListener(String server, int port) 
		{
			this.port = port;
			this.server = server;
		}

		public void run() 
		{
			InputStream in = null;
			try 
			{
				InetAddress address = InetAddress.getByName(server);
				serverSocket = new ServerSocket(port, 0, address);

				while(!exiting) 
				{
					LOGGER.info("SSE Client: Open TCP connection at port: " + port);
					clientSocket = serverSocket.accept();

					in = clientSocket.getInputStream();
					byte[] buffer = new byte[65536];
					byte[] data = new byte[65536];
					int size = 0;
					int offset = 0;
					while ((size = in.read(buffer)) > -1) 
					{
						System.arraycopy(buffer, 0, data, offset, size);
						offset += size;
					}
					
					byte[] result = new byte[offset];
					System.arraycopy(data, 0, result, 0, offset);
					String strResult = new String(result);
					if(strResult.equals("CLOSE"))
					{
						exiting = true;
						clientMessageCallback.setExiting();
					}
					else
						clientMessageCallback.receiveMessageFromClient(strResult);
				}
			} 
			catch (IOException e) 
			{
				LOGGER.info(e.getMessage());
			} 
			catch (Exception e) 
			{
				LOGGER.info(e.getMessage());
			} 
			finally 
			{
				try 
				{
					LOGGER.info("TcpListener cleanup");
					if(in != null)
						in.close();
					
					if(clientSocket != null)
						clientSocket.close();
					
					if(serverSocket != null)
						serverSocket.close();
				} 
				catch (Exception e) 
				{
					LOGGER.info(e.getMessage());
				}
			}
		}
	}

	/**
	 * Constructor
	 * @param sendServer: the address to which we send messages
	 * @param sendPort: the send port
	 * @param receiveServer: the address on which to receive messages
	 * @param receivePort: the receive port
	 * @param clientMessageCallback
	 */
	public TcpCommunicationSocket(String sendServer, int sendPort, String receiveServer, int receivePort, ClientMessageCallback clientMessageCallback) 
	{
		super(sendServer, sendPort, clientMessageCallback);
		listener = new TcpListener(receiveServer, receivePort);
	}

	@Override
	public synchronized void send(byte[] message) throws IOException 
	{
		OutputStream out = null;
		
		InetAddress address = InetAddress.getByName(sendServer);
		Socket clientSocket = new Socket(address, sendPort);

		out = clientSocket.getOutputStream();
		byte[] buffer = new byte[message.length];
		System.arraycopy(message, 0, buffer, 0, message.length);

		out.write(buffer);
		out.flush();
		out.close();
		clientSocket.close();
	}
}
