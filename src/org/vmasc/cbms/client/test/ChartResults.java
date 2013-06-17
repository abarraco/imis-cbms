package org.vmasc.cbms.client.test;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.vmasc.cbms.client.util.Constants;

import com.smartxls.ChartFormat;
import com.smartxls.ChartShape;
import com.smartxls.WorkBook;

public class ChartResults
{
	private WorkBook workbook = null;
	private int currentSheetRow = 0;
	private String fileName = "";
	
	public ChartResults()
	{
		generateFileName();
		workbook = new WorkBook();
		printSheetHeader();
	}

	private void addChart(String title, String xAxisTitle, String yAxisTitle, List<Integer> xValuesList, List<Double> yValuesList) 
	{
		currentSheetRow++;
		final int CHART_TOP = currentSheetRow;
		final int CHART_BOTTOM = CHART_TOP + Constants.CHART_HEIGHT;

		try
        {
			int size = xValuesList.size();
			for(int i = 0; i < size; i++)
			{
				workbook.setNumber(currentSheetRow, 0, xValuesList.get(i));
				
				double nextYValue = yValuesList.get(i);
				if(nextYValue != -1)
					workbook.setNumber(currentSheetRow, 1, nextYValue);
				
				currentSheetRow++;
			}
			
			//create chart with its location and type
            ChartShape chart = workbook.addChart(Constants.CHART_LEFT, CHART_TOP, Constants.CHART_RIGHT, CHART_BOTTOM);
			chart.setChartType(ChartShape.Line);
			
			//link data source, link each series to columns
            chart.setLinkRange("Sheet1!$A$" + Integer.toString(CHART_TOP) + ":$B$" + Integer.toString(currentSheetRow), false);
            
            //set axis title
            chart.setAxisTitle(ChartShape.XAxis, 0, xAxisTitle);
			chart.setAxisTitle(ChartShape.YAxis, 0, yAxisTitle);
           
			chart.setTitle(title);

            //set plot area's color 
            ChartFormat chartFormat = chart.getPlotFormat();
            chartFormat.setSolid();
            chartFormat.setForeColor(Color.WHITE.getRGB());
            chart.setPlotFormat(chartFormat);

            //set chart title's font property
            ChartFormat titleformat = chart.getTitleFormat();
            titleformat.setFontSize(14*20);
            titleformat.setFontBold(true);
            chart.setTitleFormat(titleformat);
        }
		catch (Exception ex)
        {
            ex.printStackTrace();
        }
		
		currentSheetRow = Math.max(currentSheetRow, CHART_BOTTOM);
	}

	public void addCharts(List<TestRunValues> resultsList, List<Integer> xAxisValues, TestVariable testVariable, int numSenders, int numReceivers, int numSubscriptions, int updateInterval, int updateSize)
	{
		int resultsSize = resultsList.size();
		int xAxisSize = xAxisValues.size();
		
		//there should be results for every x value, if not, there is a bug
		if(resultsSize == xAxisSize)
		{
			//generate a string showing the range of trial id's
			String trialRange = "Trial " + Integer.toString(resultsList.get(0).getTrialId());
			if(resultsSize > 1)
				trialRange += "-" + Integer.toString(resultsList.get(resultsSize - 1).getTrialId());
			
			printChartHeader(testVariable, xAxisValues, trialRange, Integer.toString(numSenders), Integer.toString(numReceivers), Integer.toString(numSubscriptions), Integer.toString(updateInterval), Integer.toString(updateSize));
			
			List<Double> avgUpdateIntervalList = new ArrayList<Double>();
			List<Double> avgTimeToSendList = new ArrayList<Double>();
			List<Double> notReceivedList = new ArrayList<Double>();

			for(TestRunValues nextResult: resultsList)
			{
				avgTimeToSendList.add(nextResult.getAverageTimeToSend());
				avgUpdateIntervalList.add(nextResult.getAverageTimeSinceLastReport());
				notReceivedList.add(nextResult.getPercentLoss());
			}
			
			addChart(trialRange, testVariable.getDisplayName(), Constants.DISPLAY_STR_AVERAGE_TIME_TO_SEND, xAxisValues, avgTimeToSendList);
			addChart(trialRange, testVariable.getDisplayName(), Constants.DISPLAY_STR_AVERAGE_UPDATE_INTERVAL, xAxisValues, avgUpdateIntervalList);
			addChart(trialRange, testVariable.getDisplayName(), Constants.DISPLAY_STR_PERCENT_LOSS, xAxisValues, notReceivedList);
		}
		else
		{
			System.out.println("Could not find a result for every x-axis value.");
		}
	}
	
	private void generateFileName()
	{
		fileName = Constants.DISPLAY_STR_MAIN_TITLE_ABBR;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("_yyyy-MM-dd_hh-mm-ss"); 
		String dateStr = sdf.format(cal.getTime());
		fileName += dateStr + ".xls";
	}
	
	private void printChartHeader(TestVariable testVariable, List<Integer> xAxisValues, String trialRange, String numSenders, String numReceivers, String numSubscriptions, String updateInterval, String updateSize)
	{
		try
		{
			workbook.setText(currentSheetRow, 0, trialRange);
			
			//create a string which shows all the x-axis values to be tested
			String strXAxis = testVariable.getDisplayName();
			for(Integer nextXValue: xAxisValues)
			{
				strXAxis += nextXValue.toString() + " ";
			}
			
			currentSheetRow++;
			workbook.setText(currentSheetRow, 0, strXAxis);
			
			if(!testVariable.getName().equals(Constants.PROP_STR_NUM_SENDERS))
			{
				currentSheetRow++;
				workbook.setText(currentSheetRow, 0, Constants.DISPLAY_STR_NUM_SENDERS + numSenders);
			}
			
			if(!testVariable.getName().equals(Constants.PROP_STR_NUM_RECEIVERS))
			{
				currentSheetRow++;
				workbook.setText(currentSheetRow, 0, Constants.DISPLAY_STR_NUM_RECEIVERS + numReceivers);
			}
			
			if(!testVariable.getName().equals(Constants.PROP_STR_NUM_SUBSCRIPTIONS))
			{
				currentSheetRow++;
				workbook.setText(currentSheetRow, 0, Constants.DISPLAY_STR_NUM_SUBSCRIPTIONS + numSubscriptions);
			}
			
			if(!testVariable.getName().equals(Constants.PROP_STR_UPDATE_INTERVAL))
			{
				currentSheetRow++;
				workbook.setText(currentSheetRow, 0, Constants.DISPLAY_STR_UPDATE_INTERVAL + updateInterval);
			}
			
			if(!testVariable.getName().equals(Constants.PROP_STR_UPDATE_SIZE))
			{
				currentSheetRow++;
				workbook.setText(currentSheetRow, 0, Constants.DISPLAY_STR_UPDATE_SIZE + updateSize);
			}
			
			currentSheetRow++;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void printSheetHeader()
	{
		try
		{
			workbook.setText(currentSheetRow, 0, fileName);
			currentSheetRow += 2;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String writeFile()
	{
		try
		{
			workbook.write(fileName);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return fileName;
	}
}
