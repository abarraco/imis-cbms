package org.vmasc.cbms.client.test;

import java.util.ArrayList;
import java.util.List;

import org.vmasc.cbms.client.gui.OutputPanel;
import org.vmasc.cbms.client.util.Constants;
import org.vmasc.cbms.client.util.Utility;

public class TrialsManager
{
	private TestVariableManager testVariableManager = null;
	private int currentTrialId = 1;
	private int numUpdates = -1;
	
	private int currentNumSenders = -1;
	private int currentNumReceivers = -1;
	private int currentNumSubscriptions = -1;
	private int currentUpdateInterval = -1;
	private int currentUpdateSize = -1;
	
	private List<Integer> numSendersTrialValues = new ArrayList<Integer>();
	private List<Integer> numReceiversTrialValues = new ArrayList<Integer>();
	private List<Integer> numSubscriptionsTrialValues = new ArrayList<Integer>();
	private List<Integer> updateSizeTrialValues = new ArrayList<Integer>();
	private List<Integer> updateIntervalTrialValues = new ArrayList<Integer>();
	
	private List<TestRunValues> testRunValuesList = new ArrayList<TestRunValues>();	//the results from a set of tests
	private ChartResults chartResults = null; 
	
	private OutputPanel outputPanel;

	public TrialsManager(TestVariableManager testVariableManager, OutputPanel outputPanel)
	{
		this.outputPanel = outputPanel;
		this.testVariableManager = testVariableManager;
		numUpdates = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_UPDATES).getValue();
		
		initLists();
		chartResults = new ChartResults();
	}
	
	/**
	 * Determine the type of variable by checking the type of list.
	 * @param targetList: the list for which to check its check
	 * @param currentValue: the value to be assigned once the type is determined
	 */
	private void assignCurrentVariables(List<Integer> targetList, int currentValue)
	{
		if(targetList == numSendersTrialValues)
		{
			currentNumSenders = currentValue;
		}
		else if(targetList == numReceiversTrialValues)
		{
			currentNumReceivers = currentValue;
		}
		else if(targetList == numSubscriptionsTrialValues)
		{
			currentNumSubscriptions = currentValue;
		}
		else if(targetList == updateIntervalTrialValues)
		{
			currentUpdateInterval = currentValue;
		}
		else if(targetList == updateSizeTrialValues)
		{
			currentUpdateSize = currentValue;
		}
	}
	
	/**
	 * Initialize a list of variables to be tested.  
	 * @param nextList: the list to be initialized
	 * @param testVariable: holds the range of variables from which to determine the list
	 */
	private void initList(List<Integer> nextList, TestVariable testVariable)
	{
		int startValue = testVariable.getValue();
		int endValue = testVariable.getEndValue();
		int incValue = testVariable.getIncrement();
		
		//if the user would like to test a range of values, determine thos values and add to list
		if((endValue > startValue) && (incValue > 0))
		{
			int currentValue = startValue;
			while(currentValue < endValue)
			{
				nextList.add(currentValue);
				currentValue += incValue;
			}
			nextList.add(endValue);
		}
		//else, only test a single value
		else
			nextList.add(startValue);
	}
	
	/**
	 * Initialize the structures that will hold the list of the variables to be tested.
	 */
	private void initLists()
	{
		initList(numSendersTrialValues, testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_SENDERS));
		initList(numReceiversTrialValues, testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_RECEIVERS));
		initList(numSubscriptionsTrialValues, testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_SUBSCRIPTIONS));
		initList(updateSizeTrialValues, testVariableManager.getTestVariableByName(Constants.PROP_STR_UPDATE_SIZE));
		initList(updateIntervalTrialValues, testVariableManager.getTestVariableByName(Constants.PROP_STR_UPDATE_INTERVAL));
	}
	
	/**
	 * Run the next test.
	 */
	private void runTrial()
	{
		Trial trial = new Trial(currentTrialId, Constants.SENDER_START_ID, Constants.RECEIVER_START_ID, currentNumSenders, currentNumReceivers, numUpdates, currentUpdateInterval, currentUpdateSize, currentNumSubscriptions, outputPanel);
		trial.runTrial();
		TestRunValues testRunValues = trial.getTestRunValues();
		testRunValuesList.add(testRunValues);
		currentTrialId++;
	}
	
	/**
	 * Check which variable is to be tested and run the tests.
	 */
	public void runTrials()
	{
		List<Integer> outerLoop1List = null;
		List<Integer> outerLoop2List = null;
		List<Integer> outerLoop3List = null;
		List<Integer> outerLoop4List = null;
		List<Integer> innerLoopList = null;
		TestVariable testVariable = null; //the variable to be tested by the range of tests
		
		if(updateSizeTrialValues.size() > 1)
		{
			outerLoop1List = numSendersTrialValues;
			outerLoop2List = numReceiversTrialValues;
			outerLoop3List = numSubscriptionsTrialValues;
			outerLoop4List = updateIntervalTrialValues;
			innerLoopList = updateSizeTrialValues;
			testVariable = testVariableManager.getTestVariableByName(Constants.PROP_STR_UPDATE_SIZE);
		}
		else if(updateIntervalTrialValues.size() > 1)
		{
			outerLoop1List = numSendersTrialValues;
			outerLoop2List = numReceiversTrialValues;
			outerLoop3List = numSubscriptionsTrialValues;
			outerLoop4List = updateSizeTrialValues;
			innerLoopList = updateIntervalTrialValues;
			testVariable = testVariableManager.getTestVariableByName(Constants.PROP_STR_UPDATE_INTERVAL);
		}
		else if(numSubscriptionsTrialValues.size() > 1)
		{
			outerLoop1List = numSendersTrialValues;
			outerLoop2List = numReceiversTrialValues;
			outerLoop3List = updateIntervalTrialValues;
			outerLoop4List = updateSizeTrialValues;
			innerLoopList = numSubscriptionsTrialValues;
			testVariable = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_SUBSCRIPTIONS);
		}
		else if(numReceiversTrialValues.size() > 1)
		{
			outerLoop1List = numSendersTrialValues;
			outerLoop2List = updateSizeTrialValues;
			outerLoop3List = numSubscriptionsTrialValues;
			outerLoop4List = updateIntervalTrialValues;
			innerLoopList = numReceiversTrialValues;
			testVariable = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_RECEIVERS);
		}
		else if(numSendersTrialValues.size() > 1)
		{
			outerLoop1List = updateSizeTrialValues;
			outerLoop2List = numReceiversTrialValues;
			outerLoop3List = numSubscriptionsTrialValues;
			outerLoop4List = updateIntervalTrialValues;
			innerLoopList = numSendersTrialValues;
			testVariable = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_SENDERS);
		}
		
		//if no test variable is set, we are not testing a range of variables
		if(testVariable == null)
		{
			runTrialsForSingleSet();
		}
		else
		{
			runTrialsForMutliSet(outerLoop1List, outerLoop2List, outerLoop3List, outerLoop4List, innerLoopList, testVariable);
		}
	}
	
	/**
	 * Iterate through the lists of variables and run the tests.
	 */
	private void runTrialsForMutliSet(List<Integer> outerLoop1List, List<Integer> outerLoop2List, List<Integer> outerLoop3List, List<Integer> outerLoop4List, List<Integer> innerLoopList, TestVariable testVariable)
	{	
		for(Integer nextOuterLoop1: outerLoop1List)
		{
			assignCurrentVariables(outerLoop1List, nextOuterLoop1.intValue());
			for(Integer nextOuterLoop2: outerLoop2List)
			{
				assignCurrentVariables(outerLoop2List, nextOuterLoop2.intValue());
				for(Integer nextOuterLoop3: outerLoop3List)
				{
					assignCurrentVariables(outerLoop3List, nextOuterLoop3.intValue());
					for(Integer nextOuterLoop4: outerLoop4List)
					{
						assignCurrentVariables(outerLoop4List, nextOuterLoop4.intValue());
						for(Integer nextInnerLoop: innerLoopList)
						{
							assignCurrentVariables(innerLoopList, nextInnerLoop.intValue());
							runTrial();
						}
						
						Utility.printTestRunValuesList(outputPanel, testRunValuesList);
						chartResults.addCharts(testRunValuesList, innerLoopList, testVariable, currentNumSenders, currentNumReceivers, currentNumSubscriptions, currentUpdateInterval, currentUpdateSize);
						testRunValuesList.clear();
					}
				}
			}
		}
		
		String fileName = chartResults.writeFile();
		outputPanel.appendText("Tests complete.");
		outputPanel.appendText(fileName + " generated.");
	}
	
	/**
	 * No range of variables was found so run a single test.
	 */
	private void runTrialsForSingleSet()
	{
		currentNumSenders = numSendersTrialValues.get(0);
		currentNumReceivers = numReceiversTrialValues.get(0);
		currentNumSubscriptions = numSubscriptionsTrialValues.get(0);
		currentUpdateInterval = updateIntervalTrialValues.get(0);
		currentUpdateSize = updateSizeTrialValues.get(0);
		runTrial();
		outputPanel.appendText("Tests complete.");
	}
}
