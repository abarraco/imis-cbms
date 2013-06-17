package org.vmasc.cbms.client.test;

public class TestVariable
{
	private int value = -1;
	private int endValue = -1;
	private int increment = -1;
	private String name = "";
	private String displayName = "";
	
	/**
	 * @return the value
	 */
	public int getValue()
	{
		return value;
	}
	/**
	 * @return the endValue
	 */
	public int getEndValue()
	{
		return endValue;
	}
	/**
	 * @return the increment
	 */
	public int getIncrement()
	{
		return increment;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @return the displayName
	 */
	public String getDisplayName()
	{
		return displayName;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value)
	{
		this.value = value;
	}
	/**
	 * @param endValue the endValue to set
	 */
	public void setEndValue(int endValue)
	{
		this.endValue = endValue;
	}
	/**
	 * @param increment the increment to set
	 */
	public void setIncrement(int increment)
	{
		this.increment = increment;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName)
	{
		this.displayName = displayName;
	}
}
