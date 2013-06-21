package org.vmasc.cbms.client.util;

public class Constants
{
	public static final int SENDER_START_ID = 0;
	public static final int RECEIVER_START_ID = 10000;
	
	public static final int MAX_TIME_TO_WAIT = 20000;		//if this amount of time expires without receiving a report, exit (ms)
	public static final int START_PROCESS_PAUSE = 5000; 	//the time to wait before starting sending processes to allow the receivers to fully initialize (ms)
	
	public final static int CHART_HEIGHT = 15;				//height of chart as number of rows
	public final static int CHART_LEFT = 3;				//left start row of the chart
	public final static int CHART_RIGHT = 13;				//right end row of the chart
	
	public final static int MIN_UPDATE_SIZE = 512;			//the minimum allowed number of bytes of an update 
	
	//
	//Display strings
	//
	public static final String DISPLAY_STR_MAIN_TITLE = "Interoperability Middleware Simulator";
	public static final String DISPLAY_STR_MAIN_TITLE_ABBR = "IMIS";
	public static final String DISPLAY_STR_PERCENT_LOSS = "Not Received(%):";
	public static final String DISPLAY_STR_AVERAGE_TIME_TO_SEND = "Avg. Time to Send(ms):";
	public static final String DISPLAY_STR_TIME_TO_SEND = "Time to Send(ms):";
	public static final String DISPLAY_STR_AVERAGE_UPDATE_INTERVAL = "Avg. Update Interval(ms):";
	public static final String DISPLAY_STR_UPDATE_INTERVAL = "Update Interval(ms):";
	public static final String DISPLAY_STR_TRIAL_ID = "Trial ID:";
	public static final String DISPLAY_STR_CLIENT_ID = "Client ID:";
	public static final String DISPLAY_STR_SENDER_ID = "Sender ID:";
	public static final String DISPLAY_STR_RECEIVER_ID = "Receiver ID:";
	public static final String DISPLAY_STR_NUMBER_OF_UPDATES = "Number of Updates:";
	public static final String DISPLAY_STR_UPDATE_SIZE = "Message Size(B):";
	public static final String DISPLAY_STR_SAVE_FILE = "Save File:";
	public static final String DISPLAY_STR_NUM_SUBSCRIPTIONS = "Number of Subscriptions:";
	public static final String DISPLAY_STR_NUM_SENDERS = "Number of Senders:";
	public static final String DISPLAY_STR_NUM_RECEIVERS = "Number of Receivers:";
	public static final String DISPLAY_STR_TIME_SENT = "Time Sent:";
	public static final String DISPLAY_STR_TIME_RECEIVED = "Time Received:";
	public static final String DISPLAY_STR_REPORTS_SENT = "Reports Sent:";
	public static final String DISPLAY_STR_REPORTS_RECEIVED = "Reports Received:";
	public static final String DISPLAY_STR_INCREMENT = "Increment:";
	public static final String DISPLAY_STR_END = "End:";
	public static final String DISPLAY_STR_SERVER = "Server:";
	public static final String DISPLAY_STR_RESOURCE = "Resource:";
	public static final String DISPLAY_STR_SAVE_TO_DB = "Save Updates to DB";
	public static final String DISPLAY_STR_EXITING_SENDER = "Exiting Sender";
	public static final String DISPLAY_STR_EXITING_RECEIVER = "Exiting Receiver";
	
	//
	//Property strings
	//
	public static final String PROP_STR_NUM_UPDATES = "NUM_UPDATES";
	public static final String PROP_STR_UPDATE_INTERVAL = "UPDATE_INTERVAL";
	public static final String PROP_STR_UPDATE_INTERVAL_END = "UPDATE_INTERVAL_END";
	public static final String PROP_STR_UPDATE_INTERVAL_INCREMENT = "UPDATE_INTERVAL_INCREMENT";
	public static final String PROP_STR_NUM_SENDERS = "NUM_SENDERS";
	public static final String PROP_STR_NUM_SENDERS_END = "NUM_SENDERS_END";
	public static final String PROP_STR_NUM_SENDERS_INCREMENT = "NUM_SENDERS_INCREMENT";
	public static final String PROP_STR_NUM_RECEIVERS = "NUM_RECEIVERS";
	public static final String PROP_STR_NUM_RECEIVERS_END = "NUM_RECEIVERS_END";
	public static final String PROP_STR_NUM_RECEIVERS_INCREMENT = "NUM_RECEIVERS_INCREMENT";
	public static final String PROP_STR_UPDATE_SIZE = "UPDATE_SIZE";
	public static final String PROP_STR_UPDATE_SIZE_END = "UPDATE_SIZE_END";
	public static final String PROP_STR_UPDATE_SIZE_INCREMENT = "UPDATE_SIZE_INCREMENT";
	public static final String PROP_STR_NUM_SUBSCRIPTIONS = "NUM_SUBSCRIPTIONS";
	public static final String PROP_STR_NUM_SUBSCRIPTIONS_END = "NUM_SUBSCRIPTIONS_END";
	public static final String PROP_STR_NUM_SUBSCRIPTIONS_INCREMENT = "NUM_SUBSCRIPTIONS_INCREMENT";
	public static final String PROP_STR_SERVER = "SERVER";
	public static final String PROP_STR_RESOURCE = "RESOURCE";
	public static final String PROP_STR_SAVE_FILE = "SAVE_FILE";
	
	
}
