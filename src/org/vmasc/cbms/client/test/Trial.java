/**
 * This class runs a test on a single set of variables.  
 * This test will involve creating processes for one or 
 * more sending federates and one or more receiving federates.
 */

package org.vmasc.cbms.client.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.vmasc.cbms.client.gui.OutputPanel;
import org.vmasc.cbms.client.util.Constants;
import org.vmasc.cbms.client.util.Utility;

public class Trial
{
	/**
	 * This class runs as a separate thread to capture the input 
	 * streams of the subprocesses created for this test.
	 * @author abarraco
	 *
	 */
	public class ProcessHandler extends Thread
	{
		private TestRunValues testRunValues = new TestRunValues();	//the structure to hold the output of the subprocess
		private InputStream inputStream;							//the input stream of the subprocess

		public ProcessHandler(InputStream inpStr)
		{
			this.inputStream = inpStr;
		}

		public void run()
		{
			try
			{
				testRunValuesList.add(testRunValues);	
				InputStreamReader inpStrd = new InputStreamReader(inputStream);
				BufferedReader buffRd = new BufferedReader(inpStrd);
				String line = null;
				
				//read the input stream until the process terminates
				while ((line = buffRd.readLine()) != null)
				{
					outputPanel.appendText(line);
					Utility.parseLine(line, testRunValues);
				}
				buffRd.close();
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	private int trialId;
	private int senderStartId;
	private int receiverStartId;
	private int numSenders;
	private int numReceivers;
	private int numUpdates;
	private int reportInterval;
	private int updateSize;
	private int numSubscriptions;
	
	private List<Process> receiverProcessList = new ArrayList<Process>();						//the list of receiving prcoesses created for this test 
	private List<Process> senderProcessList = new ArrayList<Process>();						//the list of receiving prcoesses created for this test 
	private List<TestRunValues> testRunValuesList = new ArrayList<TestRunValues>();		//the list of results from the sending and receiving processes created for this test
	
	private OutputPanel outputPanel;
	
	public Trial(int trialId, int senderStartId, int receiverStartId, int numSenders, int numReceivers, int numUpdates, int reportInterval, int updateSize,
			int numSubscriptions, OutputPanel outputPanel)
	{
		this.outputPanel = outputPanel;
		this.trialId = trialId;
		this.senderStartId = senderStartId;
		this.receiverStartId = receiverStartId;
		this.numSenders = numSenders;
		this.numReceivers = numReceivers;
		this.numUpdates = numUpdates;
		this.reportInterval = reportInterval;
		this.updateSize = updateSize;
		this.numSubscriptions = numSubscriptions;
	}
	
	/**
	 * Generate the string that will act as the command to create a new process.
	 * @param clientId: the client id argument
	 * @param numUpdates: the number of updates argument
	 * @return: the generated string
	 */
	private String createProcessCommand(String clientId, String numUpdates)
	{
		return "java -jar imis-cbms.jar " + trialId + " " + clientId + " " + numUpdates + " " + updateSize + " " + reportInterval + " " + numSubscriptions;
	}

	/**
	 * Create the processes that will act as the sending and receiving federates.
	 */
	private void createProcesses()
	{
		createReceivingProcesses();

		// if starting both receivers and senders, give time to initialize
		if (numReceivers > 0 && numSenders > 0)
		{
			try
			{
				Thread.sleep(Constants.START_PROCESS_PAUSE);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		createSendingProcesses();	
	}

	/**
	 * Create the processes that will act as a receiving federates.
	 */
	private void createReceivingProcesses()
	{
		// if there are multiple senders, need to adjust for the number of
		// updates a receiver can expect
		String numReceiverReports = Integer.toString(numUpdates);
		if (numSenders > 1)
		{
			numReceiverReports = Integer.toString(numUpdates * numSenders);
		}

		// create a new process for each receiver
		for (int i = 0; i < numReceivers; i++)
		{
			String command = createProcessCommand(Integer.toString(i + receiverStartId), numReceiverReports);
			try
			{
				//System.out.println("command:" + command);
				outputPanel.appendText("Creating receiving process for Trial " + Integer.toString(trialId));
				Process receiverProcess = Runtime.getRuntime().exec(command);
				//outputPanel.appendText("Receiver:" + receiverProcess.toString());
				receiverProcessList.add(receiverProcess);
				startProcessHandler(receiverProcess);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	/**
	 * Create the processes that will act as a sending federates.
	 */
	private void createSendingProcesses()
	{
		long sleepTime = 0;
		if (numSenders > 1)
		{
			sleepTime = reportInterval / numSenders;
		}

		// create a new process for each sender
		for (int i = 0; i < numSenders; i++)
		{
			String command = createProcessCommand(Integer.toString(i + senderStartId), Integer.toString(numUpdates));
			try
			{
				//System.out.println("command:" + command);
				outputPanel.appendText("Creating sending process for Trial " + Integer.toString(trialId));
				Process senderProcess = Runtime.getRuntime().exec(command);
				//outputPanel.appendText("Sender" + senderProcess.toString());
				senderProcessList.add(senderProcess);
				startProcessHandler(senderProcess);

				try
				{
					Thread.sleep(sleepTime);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	/**
	 * Get the average values of the results of all the processes for this test run. 
	 * @return: the average values; the value is -1 if the average could not be calculated
	 */
	public TestRunValues getTestRunValues()
	{
		List<Double> percentLossList = new ArrayList<Double>();
		List<Double> averageTimeToSendList = new ArrayList<Double>();
		List<Double> averageTimeSinceLastReportList = new ArrayList<Double>();
		
		//average multiple receivers into one object; ignore senders
		for(TestRunValues testRunValues: testRunValuesList)
		{
			if(Utility.isReceiverId(testRunValues.getClientId()))
			{
				percentLossList.add(testRunValues.getPercentLoss());
				
				if(testRunValues.getAverageTimeToSend() > 0)
					averageTimeToSendList.add(testRunValues.getAverageTimeToSend());
				
				if(testRunValues.getAverageTimeSinceLastReport() > 0)
					averageTimeSinceLastReportList.add(testRunValues.getAverageTimeSinceLastReport());
			}		
		}
		
		double avgPercentLoss = Utility.calculateDoubleAverage(percentLossList);
		double avgTimeToSend = Utility.calculateDoubleAverage(averageTimeToSendList);
		double avgTimeSinceLastReport = Utility.calculateDoubleAverage(averageTimeSinceLastReportList);
		
		TestRunValues testRunValuesFinal = new TestRunValues();
		testRunValuesFinal.setTrialId(trialId);
		testRunValuesFinal.setAverageTimeSinceLastReport(avgTimeSinceLastReport);
		testRunValuesFinal.setAverageTimeToSend(avgTimeToSend);
		testRunValuesFinal.setPercentLoss(avgPercentLoss);
	
		return testRunValuesFinal;
	}

	/**
	 * Run the test.
	 */
	public void runTrial()
	{
		createProcesses();
		waitForProcesses();
	}

	/**
	 * Start the thread that receives the input streams from the running subprocesses.
	 * @param process
	 */
	private void startProcessHandler(Process process)
	{
		ProcessHandler inputStream = new ProcessHandler(process.getInputStream());
		inputStream.start();
	}

	/**
	 * Once the processes are running, this method waits for the subprocesses to terminate.
	 */
	private void waitForProcesses()
	{
		for (Process process : receiverProcessList)
		{
			try
			{
				int exitValue = process.waitFor();
				outputPanel.appendText("Process " + process.toString() + " complete in Trial " + Integer.toString(trialId) + " with exit value:" + Integer.toString(exitValue));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		for (Process process : senderProcessList)
		{
			process.destroy();
		}
	}
}
