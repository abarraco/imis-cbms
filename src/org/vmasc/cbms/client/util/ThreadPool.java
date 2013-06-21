package org.vmasc.cbms.client.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Global singleton that contains the worker threads
 * 
 */
public class ThreadPool
{
	private ExecutorService executor;

	public ThreadPool()
	{
		executor = Executors.newFixedThreadPool(5);
	}

	/**
	 * Schedule a task.
	 * 
	 * @return thread pool service
	 */
	public void execute(Runnable command)
	{
		executor.execute(command);
	}

	public void shutdownAndAwaitTermination()
	{
		// Cancel currently executing tasks
		executor.shutdownNow(); 
		
		// Wait a while for tasks to respond to being canceled
		try
		{
			if (!executor.awaitTermination(5, TimeUnit.SECONDS))
			{
				System.out.println("Pool did not terminate");
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
