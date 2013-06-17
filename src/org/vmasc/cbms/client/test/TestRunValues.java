/**
 * This class is used as a data container for test results.
 */

package org.vmasc.cbms.client.test;

public class TestRunValues
{
	private int trialId = -1;
	private int clientId = -1;
	private double percentLoss;
	private double averageTimeToSend;
	private double averageTimeSinceLastReport;
	
	/**
	 * @return the id
	 */
	public int getClientId()
	{
		return clientId;
	}
	/**
	 * @return the percentLoss
	 */
	public double getPercentLoss()
	{
		return percentLoss;
	}
	/**
	 * @return the averageTimeToSend
	 */
	public double getAverageTimeToSend()
	{
		return averageTimeToSend;
	}
	/**
	 * @return the averageTimeSinceLastReport
	 */
	public double getAverageTimeSinceLastReport()
	{
		return averageTimeSinceLastReport;
	}
	/**
	 * @param id the id to set
	 */
	public void setClientId(int id)
	{
		this.clientId = id;
	}
	/**
	 * @param percentLoss the percentLoss to set
	 */
	public void setPercentLoss(double percentLoss)
	{
		this.percentLoss = percentLoss;
	}
	/**
	 * @param averageTimeToSend the averageTimeToSend to set
	 */
	public void setAverageTimeToSend(double averageTimeToSend)
	{
		this.averageTimeToSend = averageTimeToSend;
	}
	/**
	 * @param averageTimeSinceLastReport the averageTimeSinceLastReport to set
	 */
	public void setAverageTimeSinceLastReport(double averageTimeSinceLastReport)
	{
		this.averageTimeSinceLastReport = averageTimeSinceLastReport;
	}
	/**
	 * @return the trialId
	 */
	public int getTrialId()
	{
		return trialId;
	}
	/**
	 * @param trialId the trialId to set
	 */
	public void setTrialId(int trialId)
	{
		this.trialId = trialId;
	}
}
