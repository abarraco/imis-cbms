package org.vmasc.cbms.client.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.vmasc.cbms.client.util.Constants;
import org.vmasc.cbms.client.util.LogFile;
import org.vmasc.cbms.client.util.Utility;
import org.vmasc.cbms.client.web.CbmsMessageCallback;
import org.vmasc.cbms.client.web.ServerInterface;


/**
 * 
 * 
 * @author abarraco
 */
public class Receiver implements CbmsMessageCallback
{
	private LogFile logFile;
	
	private int reportsReceived = 0;
	private int numReports;

	
	private List<Long> reportTimeHistory = new ArrayList<Long>();
	private List<Long> reportTimeIntervalHistory = new ArrayList<Long>();
	private List<Long> reportTimeToSendHistory = new ArrayList<Long>();
	
	private ServerInterface serverInterface;
	
	public Receiver(int trialId, int clientId, int numReports, String updateSize, int reportInterval, int numSubscriptions)
	{
		this.numReports = numReports;
		logFile = Utility.initLogFile(trialId, clientId, numReports, updateSize, reportInterval, numSubscriptions);
		serverInterface = new ServerInterface(this, numSubscriptions);
	}
	
	private long findTimeSinceLastReport(long currentTime)
	{
		long timeSinceLastReport = -1;
		
		//get the last time entry in the history
		int size = reportTimeHistory.size();
		if(size > 0)
		{
			long lastReportTime = reportTimeHistory.get(size - 1).longValue();
			timeSinceLastReport = currentTime - lastReportTime;
			reportTimeIntervalHistory.add(timeSinceLastReport);
		}
		
		reportTimeHistory.add(currentTime);
		
		return timeSinceLastReport;
	}
	
	private void logClosingData()
	{
		logFile.logMessage("");
			
		double percentLoss = ((double)(numReports - reportsReceived)/(double)numReports) * 100;
		logFile.logMessage(Constants.DISPLAY_STR_REPORTS_SENT + numReports + "; " + Constants.DISPLAY_STR_REPORTS_RECEIVED + reportsReceived + "; " + Constants.DISPLAY_STR_PERCENT_LOSS + percentLoss);
		
		double avgReportTimeToSendHistory = Utility.calculateLongAverage(reportTimeToSendHistory);
		if(avgReportTimeToSendHistory > -1)
			logFile.logMessage(Constants.DISPLAY_STR_AVERAGE_TIME_TO_SEND + Double.toString(avgReportTimeToSendHistory));
		
		double avgReportTimeIntervalHistory = Utility.calculateLongAverage(reportTimeIntervalHistory);
		if(avgReportTimeIntervalHistory > -1)
			logFile.logMessage(Constants.DISPLAY_STR_AVERAGE_UPDATE_INTERVAL + Double.toString(avgReportTimeIntervalHistory));
	}
	
	private void logReportReceipt(long currentTime, String reporterWhoOid, long reportedWhen)
	{
		long timeToSend = currentTime - reportedWhen;

		logFile.logMessage("");
		logFile.logMessage(Constants.DISPLAY_STR_SENDER_ID + reporterWhoOid);
		logFile.logMessage(Constants.DISPLAY_STR_TIME_SENT + Long.toString(reportedWhen));
		logFile.logMessage(Constants.DISPLAY_STR_TIME_RECEIVED + Long.toString(currentTime));
		logFile.logMessage(Constants.DISPLAY_STR_TIME_TO_SEND + Long.toString(timeToSend));
		reportTimeToSendHistory.add(timeToSend);
		
		long timeSinceLastReport = findTimeSinceLastReport(currentTime);
		if(timeSinceLastReport != -1)
			logFile.logMessage(Constants.DISPLAY_STR_UPDATE_INTERVAL + Long.toString(timeSinceLastReport));
	}
	
	private synchronized boolean parseReport(String xml)
	{
		boolean success = false;
		
		long currentTime = Calendar.getInstance().getTimeInMillis();
		String reporterWhoOid = parseSenderId(xml);
		String reportedWhen = parseReportedWhen(xml);
		
		logReportReceipt(currentTime, reporterWhoOid, Long.parseLong(reportedWhen));	
		reportsReceived++;
		this.notify();
		success = true;
		return success;
	}
	
	private String parseReportedWhen(String xml)
	{
		String reportedWhen = "";
		
		String elementName = "<ReportingDatetime>";
		int index = xml.indexOf(elementName) + elementName.length();
		int endIndex = xml.indexOf(".000", index);
		if(index != -1)
		{
			reportedWhen = xml.substring(index, endIndex);
		}
		
		return reportedWhen;
	}
	
	private String parseSenderId(String xml)
	{
		String senderId = "";
		int index = xml.indexOf("Sender_");
		int endIndex = xml.indexOf("<", index);
		if(index != -1)
		{
			senderId = xml.substring(index, endIndex);
		}
		
		return senderId;
	}
	
	@Override
	public void receiveBinaryFromCbms(byte[] arg0, String arg1) 
	{
	}

	@Override
	public void receiveMessageFromCbms(String xml) 
	{	
		parseReport(xml);
	}
	
	public synchronized void waitForReports()
	{
		int lastNumReportsReceived;
		do
		{
			try 
			{
				lastNumReportsReceived = reportsReceived;
				this.wait(Constants.MAX_TIME_TO_WAIT);
				if(lastNumReportsReceived == reportsReceived)
					break;
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		} while(numReports > reportsReceived);
		
		logClosingData();
		logFile.close();
		serverInterface.close();
	}
}