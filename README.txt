Run IMIS
========

Execute “imis-cbms.jar” found in the “dest” folder. This starts the GUI for entering input values.

	Server: address of the CBMS server (ex: localhost:8080)
	Resource: the name of the database resource created prior to running the tool
	Number of Updates: number of updates sent during a test run
	Number of Senders: number of clients posting messages
	Number of Receivers: number of clients subscribing to messages
	Number of Subscriptions: number of messages a receiver subscribes to
	Update Interval(ms): number of milliseconds between each message post
	Message Size(B): amount of data in a message in Bytes
	Save Updates to DB: flag to indicate if messages should be saved to the database

To enter a range of values to be tested, set the "End" field to the max value to be tested and "Increment" to the increment of values between tests.  To not do a range of values, set "Increment" to 0. For example, the following entries would result in tests of 1KB, 3KB and 5KB message sizes: 

	Message Size(B): 1024  Increment: 2048  End: 5120 

Once the input values are entered, click "Run" to start the tests.  The "Output" field displays the status of the runs.

Output
======

A log file is written to the "dest" folder by every sender and receiver.  These logs contain the test input values and the times recorded.

If a range of variables is used, a summary of the results is written to an Excel file.  Results of the tests are charted for the following variables:

	Average Time To Send(ms): the time in milliseconds for an update to travel from sender to receiver
	Average Update Interval(ms): the time in milliseconds between updates received by the receiver
	Not Received(%): the percent of dropped updates 

	



