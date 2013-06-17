package org.vmasc.cbms.client.test;

import java.util.ArrayList;
import java.util.List;

public class TestVariableManager
{
	private List<TestVariable> testVariableList = new ArrayList<TestVariable>();

	/**
	 * Add a new test variable object with a range to the list.
	 * @param name: identifying name
	 * @param displayName: name for display to the user
	 * @param startValue: the start value in the range of tests
	 * @param endValue: the end value in the range of tests
	 * @param increment: the increment of test values
	 */
	public void addTestVariable(String name, String displayName, int startValue, int endValue, int increment)
	{
		TestVariable testVariable = new TestVariable();
		testVariable.setName(name);
		testVariable.setDisplayName(displayName);
		testVariable.setValue(startValue);
		testVariable.setEndValue(endValue);
		testVariable.setIncrement(increment);
		testVariableList.add(testVariable);
	}
	
	/**
	 * Add a new test variable with no range of values.
	 * @param name: identifying name
	 * @param displayName: name for display to the user
	 * @param value: the value of the variable
	 */
	public void addTestVariable(String name, String displayName, int value)
	{
		TestVariable testVariable = new TestVariable();
		testVariable.setName(name);
		testVariable.setDisplayName(displayName);
		testVariable.setValue(value);
		testVariable.setEndValue(-1);
		testVariable.setIncrement(-1);
		testVariableList.add(testVariable);
	}
	
	/**
	 * Get the test variable that matches the specified name.
	 * @param name
	 * @return: the matching test variable object; null if not found
	 */
	public TestVariable getTestVariableByName(String name)
	{
		TestVariable retTestVariable = null;
		for(TestVariable testVariable: testVariableList)
		{
			if(testVariable.getName().equals(name))
			{
				retTestVariable = testVariable;
				break;
			}
		}
		
		return retTestVariable;
	}
}
