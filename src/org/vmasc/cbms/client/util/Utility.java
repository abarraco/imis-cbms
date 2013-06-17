package org.vmasc.cbms.client.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.vmasc.cbms.client.gui.OutputPanel;
import org.vmasc.cbms.client.test.TestRunValues;


/**
 * 
 * 
 * @author abarraco
 */
public class Utility
{	
	public static double calculateDoubleAverage(List<Double> values)
	{
		double average = -1;
		int size = values.size();
		if(size > 0)
		{
			double totalValues = 0;
			for(Double value: values)
			{
				totalValues += value.doubleValue();
			}
			average = totalValues/(double)size;
		}
		
		return average;
	}
	
	public static double calculateLongAverage(List<Long> values)
	{
		double average = -1;
		int size = values.size();
		if(size > 0)
		{
			long totalValues = 0;
			for(Long value: values)
			{
				totalValues += value.longValue();
			}
			average = (double)totalValues/(double)size;
		}
		
		return average;
	}
	
	/**
	 * Convert seconds to ISO8601 format.
	 * @param milliseconds: the number of milliseconds to be converted
	 * @return: the time in ISO8601 format.
	 */
	public static String convertMsToIso8601(long milliseconds)
	{	
		String iso8601 = String.format("0%17.3f", (double)milliseconds);
		return iso8601;
	}
	
	public static void generateFomClasses(String fileName, int numClasses)
	{
		try
		{
			FileWriter outFile = new FileWriter(fileName);
			PrintWriter out = new PrintWriter(outFile);
			
			for(int i = 1; i <= numClasses; i++)
			{
				String nextClass = " (class BaseEntity" + Integer.toString(i) + " (attribute AccelerationVector" + Integer.toString(i) + " best_effort receive))";
				out.println(nextClass);
			}
			
			out.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static LogFile initLogFile(int trialId, int clientId, int numReports, String updateSize, int reportInterval, int numSubscriptions)
	{
		LogFile logFile = new LogFile(Integer.toString(trialId) + "_" + Integer.toString(clientId) + ".log");
		logFile.logMessage(Constants.DISPLAY_STR_CLIENT_ID + Integer.toString(clientId));
		logFile.logMessage(Constants.DISPLAY_STR_NUMBER_OF_UPDATES + Integer.toString(numReports));
		logFile.logMessage(Constants.DISPLAY_STR_UPDATE_SIZE + updateSize);
		logFile.logMessage(Constants.DISPLAY_STR_UPDATE_INTERVAL + Integer.toString(reportInterval));
		logFile.logMessage(Constants.DISPLAY_STR_NUM_SUBSCRIPTIONS + Integer.toString(numSubscriptions));
		
		return logFile;
	}
	
	public static boolean isReceiverId(int id)
	{
		boolean isReceiverId = false;
		if(id >= Constants.RECEIVER_START_ID)
			isReceiverId = true;
		return isReceiverId;
	}
	
	public static void parseLine(String line, TestRunValues testRunValues)
	{
		double value = 0;
		if((value = parseLineValue(line, Constants.DISPLAY_STR_AVERAGE_TIME_TO_SEND)) != -1)
		{
			testRunValues.setAverageTimeToSend(value);
		}
		else if((value = parseLineValue(line, Constants.DISPLAY_STR_AVERAGE_UPDATE_INTERVAL)) != -1)
		{
			testRunValues.setAverageTimeSinceLastReport(value);
		}
		else if((value = parseLineValue(line, Constants.DISPLAY_STR_CLIENT_ID)) != -1)
		{
			testRunValues.setClientId((int)value);
		}
		else if((value = parseLineValue(line, Constants.DISPLAY_STR_PERCENT_LOSS)) != -1)
		{
			testRunValues.setPercentLoss(value);
		}
	}
	
	public static double parseLineValue(String line, String heading)
	{
		double value = -1;
		
		int index = line.indexOf(heading);
		if(index != -1)
		{
			String sValue = line.substring(index + heading.length());
			value = Double.parseDouble(sValue);
		}
		
		return value;
	}
	
	public static void printTestRunValues(OutputPanel outputPanel, TestRunValues testRunValues)
	{
		outputPanel.appendText("");
		outputPanel.appendText(Constants.DISPLAY_STR_TRIAL_ID + Integer.toString(testRunValues.getTrialId()));
		//outputPanel.appendText(Constants.DISPLAY_STR_CLIENT_ID + Integer.toString(testRunValues.getClientId()));
		outputPanel.appendText(Constants.DISPLAY_STR_PERCENT_LOSS + Double.toString(testRunValues.getPercentLoss()));
		outputPanel.appendText(Constants.DISPLAY_STR_AVERAGE_TIME_TO_SEND + Double.toString(testRunValues.getAverageTimeToSend()));
		outputPanel.appendText(Constants.DISPLAY_STR_AVERAGE_UPDATE_INTERVAL + Double.toString(testRunValues.getAverageTimeSinceLastReport()));
	}
	
	public static void printTestRunValuesList(OutputPanel outputPanel, List<TestRunValues>testRunValuesList)
	{
		for(TestRunValues trv: testRunValuesList)
		{
			printTestRunValues(outputPanel, trv);
		}
	}
}