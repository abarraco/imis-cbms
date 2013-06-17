package org.vmasc.cbms.client.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * 
 * @author abarraco
 */
public class LogFile
{
	private PrintWriter out = null;
	
	public LogFile(String fileName)
	{
		try 
		{
			FileWriter outFile = new FileWriter(fileName);
			out = new PrintWriter(outFile);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}
	
	public void close()
	{
		if(out != null)
		{
			out.close();
			out = null;
		}
	}
	
	public void logMessage(String msg)
	{
		if(out != null)
		{
			System.out.println(msg);
			out.println(msg);
		}
	}
}