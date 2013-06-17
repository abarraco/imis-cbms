package org.vmasc.cbms.client.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.vmasc.cbms.client.util.Constants;
import org.vmasc.cbms.client.util.LogFile;
import org.vmasc.cbms.client.util.Params;
import org.vmasc.cbms.client.util.Utility;
import org.vmasc.cbms.client.web.CbmsMessageCallback;
import org.vmasc.cbms.client.web.ServerInterface;


/**
 * 
 * 
 * @author abarraco
 */
public class Sender implements CbmsMessageCallback
{
	private static final String XML_REPROTING_TIME = "00009876543210.000";
	private static final String XML_REPORTER_WHO_OID = "ReporterWho OID";
	private ServerInterface serverInterface;
	
	private int clientId;
	private int numReports;
	private int reportInterval;
	private int saveFile;
	private String report;
	
	private LogFile logFile;
	
	private List<Long> reportTimeHistory = new ArrayList<Long>();
	private List<Long> reportTimeIntervalHistory = new ArrayList<Long>();
	
	public Sender(int trialId, int clientId, int numReports, String updateSize, int reportInterval, int numSubscriptions)
	{
		this.clientId = clientId;
		this.numReports = numReports;
		this.reportInterval = reportInterval;
		this.saveFile = Integer.parseInt(Params.getString(Constants.PROP_STR_SAVE_FILE));
		
		logFile = Utility.initLogFile(trialId, clientId, numReports, updateSize, reportInterval, numSubscriptions);
		serverInterface = new ServerInterface(this, 0);
		
		generateReport(Integer.parseInt(updateSize));
		updateReportOid();
		updateReportSaveFile();
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
	
	private void generateReport(int updateSize)
	{
		StringBuffer baseStrBuffer = new StringBuffer("<CBML xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.sisostds.org/schemas/c-bml/1.0\"><Report><Context xsi:type=\"OtherContext\"><OID>000000000000000001</OID><NameText>MultinationalCompany</NameText><CategoryCode>NOS</CategoryCode></Context><Report xsi:type=\"BinaryPostType\"><ReporterWho><OrganisationRef xsi:type=\"UnitRef\"><OID>ReporterWho OID</OID></OrganisationRef></ReporterWho><ReportedWhen xsi:type=\"ReportedWhenAbsoluteTimingType\"><ReportingDatetime>00009876543210.000</ReportingDatetime></ReportedWhen></Report><F1></F1></Report></CBML>");
		int index = baseStrBuffer.indexOf("</F1>");
		int baseSize = baseStrBuffer.length();
		String xmlToAppend = "<F2></F2>";
		
		while(baseSize < updateSize)
		{
			baseStrBuffer.insert(index, xmlToAppend);
			baseSize = baseStrBuffer.length();;
		} 
		
		report = baseStrBuffer.toString();
	}
	
	private void logClosingData()
	{
		logFile.logMessage("");
		
		double avgReportTimeHistory = Utility.calculateLongAverage(reportTimeIntervalHistory);
		if(avgReportTimeHistory > -1)
			logFile.logMessage("Average time since last report:" + Double.toString(avgReportTimeHistory));
	}
	
	private void logReportSent(long reportedWhen)
	{	
		logFile.logMessage("");
		logFile.logMessage("Time sent:" + Long.toString(reportedWhen));
		long timeSinceLastReport = findTimeSinceLastReport(reportedWhen);
		if(timeSinceLastReport != -1)
			logFile.logMessage("Time since last report:" + Long.toString(timeSinceLastReport));
	}

	@Override
	public void receiveBinaryFromCbms(byte[] arg0, String arg1) 
	{
	}

	@Override
	public void receiveMessageFromCbms(String arg0) 
	{
	}
	
	public void sendReports()
	{
		for(int i = 0; i < numReports; i++)
		{
			long currentTime = Calendar.getInstance().getTimeInMillis();
			String reportToSend = updateReportTime(currentTime);
			serverInterface.postRequest(reportToSend);
			logReportSent(currentTime);
			try 
			{
				Thread.sleep(reportInterval);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
				logFile.logMessage("InterruptedException");
			}
		}
		
		logClosingData();
		logFile.close();
		serverInterface.close();
	}
	
	private void updateReportOid()
	{
		report = report.replaceFirst(XML_REPORTER_WHO_OID, "Sender_" + Integer.toString(clientId));
	}
	
	private String updateReportTime(long currentTime)
	{
		String iso8601 = Utility.convertMsToIso8601(currentTime);
		return report.replaceFirst(XML_REPROTING_TIME, iso8601);
	}
	
	private void updateReportSaveFile()
	{
		if(saveFile == 0)
			report = report.replaceFirst("NOS", "NO_SAVE_FILE");
	}
}