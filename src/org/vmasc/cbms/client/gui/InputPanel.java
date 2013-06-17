package org.vmasc.cbms.client.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.vmasc.cbms.client.test.TestVariable;
import org.vmasc.cbms.client.test.TestVariableManager;
import org.vmasc.cbms.client.test.TrialsManager;
import org.vmasc.cbms.client.util.Constants;
import org.vmasc.cbms.client.util.Params;


public class InputPanel extends JPanel implements ActionListener 
{
	private static final long serialVersionUID = 8993778411941960466L;
	
	private OutputPanel outputPanel;
	private JButton btnRun = new JButton("Run");
	private JTextField txtNumUpdates = new JTextField();;
	private JTextField txtNumSenders = new JTextField();
	private JTextField txtNumSendersInc = new JTextField();
	private JTextField txtNumSendersEnd = new JTextField();
	private JTextField txtNumReceivers = new JTextField();
	private JTextField txtNumReceiversInc = new JTextField();
	private JTextField txtNumReceiversEnd = new JTextField();
	private JTextField txtNumSubscribers = new JTextField();
	private JTextField txtNumSubscribersInc = new JTextField();
	private JTextField txtNumSubscribersEnd = new JTextField();
	private JTextField txtUpdateIntervalEnd = new JTextField();
	private JTextField txtUpdateIntervalInc = new JTextField();
	private JTextField txtUpdateInterval = new JTextField();
	private JTextField txtUpdateSize = new JTextField();
	private JTextField txtUpdateSizeInc = new JTextField();
	private JTextField txtUpdateSizeEnd = new JTextField();
	private JTextField txtServer = new JTextField();
	private JTextField txtResource = new JTextField();
	private JCheckBox chSaveToDb = new JCheckBox(Constants.DISPLAY_STR_SAVE_TO_DB);
	
	private TestVariableManager testVariableManager = null;
	
	public InputPanel(OutputPanel panel, TestVariableManager testVariableManager)
	{
		this.testVariableManager = testVariableManager;
		setTextFields();
		
		this.outputPanel = panel;
		this.setLayout(new BorderLayout());
		
		JPanel topPane = new JPanel();
		topPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		topPane.setLayout(new GridBagLayout());
		
		addLabel(topPane, Constants.DISPLAY_STR_SERVER, 0, 0);
		addTextField(topPane, txtServer, 1, 0);

		addLabel(topPane, Constants.DISPLAY_STR_RESOURCE, 2, 0);
		addTextField(topPane, txtResource, 3, 0);
		
		addLabel(topPane, Constants.DISPLAY_STR_NUMBER_OF_UPDATES, 0, 1);
		addTextField(topPane, txtNumUpdates, 1, 1);
		
		addLabel(topPane, Constants.DISPLAY_STR_NUM_SENDERS, 0, 2);
		addTextField(topPane, txtNumSenders, 1, 2);

		addLabel(topPane, Constants.DISPLAY_STR_INCREMENT, 2, 2);
		addTextField(topPane, txtNumSendersInc, 3, 2);
		
		addLabel(topPane, Constants.DISPLAY_STR_END, 4, 2);
		addTextField(topPane, txtNumSendersEnd, 5, 2);
		
		addLabel(topPane, Constants.DISPLAY_STR_NUM_RECEIVERS, 0, 3);
		addTextField(topPane, txtNumReceivers, 1, 3);

		addLabel(topPane, Constants.DISPLAY_STR_INCREMENT, 2, 3);
		addTextField(topPane, txtNumReceiversInc, 3, 3);
		
		addLabel(topPane, Constants.DISPLAY_STR_END, 4, 3);
		addTextField(topPane, txtNumReceiversEnd, 5, 3);
		
		addLabel(topPane, Constants.DISPLAY_STR_NUM_SUBSCRIPTIONS, 0, 4);
		addTextField(topPane, txtNumSubscribers, 1, 4);

		addLabel(topPane, Constants.DISPLAY_STR_INCREMENT, 2, 4);
		addTextField(topPane, txtNumSubscribersInc, 3, 4);
		
		addLabel(topPane, Constants.DISPLAY_STR_END, 4, 4);
		addTextField(topPane, txtNumSubscribersEnd, 5, 4);
		
		addLabel(topPane, Constants.DISPLAY_STR_UPDATE_INTERVAL, 0, 5);
		addTextField(topPane, txtUpdateInterval, 1, 5);

		addLabel(topPane, Constants.DISPLAY_STR_INCREMENT, 2, 5);
		addTextField(topPane, txtUpdateIntervalInc, 3, 5);
		
		addLabel(topPane, Constants.DISPLAY_STR_END, 4, 5);
		addTextField(topPane, txtUpdateIntervalEnd, 5, 5);
		
		addLabel(topPane, Constants.DISPLAY_STR_UPDATE_SIZE, 0, 6);
		addTextField(topPane, txtUpdateSize, 1, 6);

		addLabel(topPane, Constants.DISPLAY_STR_INCREMENT, 2, 6);
		addTextField(topPane, txtUpdateSizeInc, 3, 6);
		
		addLabel(topPane, Constants.DISPLAY_STR_END, 4, 6);
		addTextField(topPane, txtUpdateSizeEnd, 5, 6);
		
		addTextField(topPane, chSaveToDb, 1, 7);
		
		this.add(topPane, BorderLayout.NORTH);
		
		JPanel bottomPane = new JPanel();
		bottomPane.setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 6));
		bottomPane.setLayout(new BorderLayout());
		
		btnRun.addActionListener(this);
		bottomPane.add(btnRun, BorderLayout.EAST);
		
		this.add(bottomPane, BorderLayout.SOUTH);
	}
	
	/**
	 * User pressed the Run button
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == btnRun)
		{
			if(validateInput())
			{
				getTextFields();
				updatePropertiesFile();
				TrialsManager trialsManager = new TrialsManager(testVariableManager, outputPanel);
				trialsManager.runTrials();
			}
		}
	}
	
	private void addLabel(JPanel panel, String text, int gridX, int gridY)
	{
		JLabel lbl = new JLabel(text);
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(1, 0, 1, 3);
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 0.3;
		constraints.gridx = gridX;
		constraints.gridy = gridY;
		panel.add(lbl, constraints);
	}
	
	private void addTextField(JPanel panel, Component component, int gridX, int gridY)
	{
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(1, 0, 1, 3);
		constraints.anchor = GridBagConstraints.WEST;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1.0;
		constraints.gridx = gridX;
		constraints.gridy = gridY;
		panel.add(component, constraints);
	}
	
	private void getTextFields()
	{
		TestVariable numUpdatesTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_UPDATES);
		numUpdatesTestVar.setValue(Integer.parseInt(txtNumUpdates.getText()));
		
		TestVariable numSendersTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_SENDERS);
		numSendersTestVar.setValue(Integer.parseInt(txtNumSenders.getText()));
		numSendersTestVar.setIncrement(Integer.parseInt(txtNumSendersInc.getText()));
		numSendersTestVar.setEndValue(Integer.parseInt(txtNumSendersEnd.getText()));
		
		TestVariable numReceiversTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_RECEIVERS);
		numReceiversTestVar.setValue(Integer.parseInt(txtNumReceivers.getText()));
		numReceiversTestVar.setIncrement(Integer.parseInt(txtNumReceiversInc.getText()));
		numReceiversTestVar.setEndValue(Integer.parseInt(txtNumReceiversEnd.getText()));
		
		TestVariable numSubscriptionsTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_SUBSCRIPTIONS);
		numSubscriptionsTestVar.setValue(Integer.parseInt(txtNumSubscribers.getText()));
		numSubscriptionsTestVar.setIncrement(Integer.parseInt(txtNumSubscribersInc.getText()));
		numSubscriptionsTestVar.setEndValue(Integer.parseInt(txtNumSubscribersEnd.getText()));
		
		TestVariable updateIntervalTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_UPDATE_INTERVAL);
		updateIntervalTestVar.setValue(Integer.parseInt(txtUpdateInterval.getText()));
		updateIntervalTestVar.setIncrement(Integer.parseInt(txtUpdateIntervalInc.getText()));
		updateIntervalTestVar.setEndValue(Integer.parseInt(txtUpdateIntervalEnd.getText()));
		
		TestVariable updateSizeTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_UPDATE_SIZE);
		updateSizeTestVar.setValue(Integer.parseInt(txtUpdateSize.getText()));
		updateSizeTestVar.setIncrement(Integer.parseInt(txtUpdateSizeInc.getText()));
		updateSizeTestVar.setEndValue(Integer.parseInt(txtUpdateSizeEnd.getText()));
	}
	
	private boolean isInteger(String str)
	{
		boolean isInteger = false;
		try 
		{
		    Integer.parseInt(str);
		    isInteger = true;
		}
		catch (NumberFormatException e) 
		{
		}
		
		return isInteger;
	}
	
	private void setTextFields()
	{
		TestVariable numUpdatesTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_UPDATES);
		txtNumUpdates.setText(Integer.toString(numUpdatesTestVar.getValue()));
		
		TestVariable numSendersTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_SENDERS);
		txtNumSenders.setText(Integer.toString(numSendersTestVar.getValue()));
		txtNumSendersInc.setText(Integer.toString(numSendersTestVar.getIncrement()));
		txtNumSendersEnd.setText(Integer.toString(numSendersTestVar.getEndValue()));
		
		TestVariable numReceiversTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_RECEIVERS);
		txtNumReceivers.setText(Integer.toString(numReceiversTestVar.getValue()));
		txtNumReceiversInc.setText(Integer.toString(numReceiversTestVar.getIncrement()));
		txtNumReceiversEnd.setText(Integer.toString(numReceiversTestVar.getEndValue()));
		
		TestVariable numSubscriptionsTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_NUM_SUBSCRIPTIONS);
		txtNumSubscribers.setText(Integer.toString(numSubscriptionsTestVar.getValue()));
		txtNumSubscribersInc.setText(Integer.toString(numSubscriptionsTestVar.getIncrement()));
		txtNumSubscribersEnd.setText(Integer.toString(numSubscriptionsTestVar.getEndValue()));
		
		TestVariable updateIntervalTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_UPDATE_INTERVAL);
		txtUpdateInterval.setText(Integer.toString(updateIntervalTestVar.getValue()));
		txtUpdateIntervalInc.setText(Integer.toString(updateIntervalTestVar.getIncrement()));
		txtUpdateIntervalEnd.setText(Integer.toString(updateIntervalTestVar.getEndValue()));
		
		TestVariable updateSizeTestVar = testVariableManager.getTestVariableByName(Constants.PROP_STR_UPDATE_SIZE);
		txtUpdateSize.setText(Integer.toString(updateSizeTestVar.getValue()));
		txtUpdateSizeInc.setText(Integer.toString(updateSizeTestVar.getIncrement()));
		txtUpdateSizeEnd.setText(Integer.toString(updateSizeTestVar.getEndValue()));
		
		txtServer.setText(Params.getString(Constants.PROP_STR_SERVER));
		txtResource.setText(Params.getString(Constants.PROP_STR_RESOURCE));
		chSaveToDb.setSelected(Params.getString(Constants.PROP_STR_SAVE_FILE).equals("1"));
	}
	
	private void updatePropertiesFile()
	{
		Params.setString(Constants.PROP_STR_NUM_UPDATES, txtNumUpdates.getText());
		Params.setString(Constants.PROP_STR_NUM_SENDERS, txtNumSenders.getText());
		Params.setString(Constants.PROP_STR_NUM_SENDERS_INCREMENT, txtNumSendersInc.getText());
		Params.setString(Constants.PROP_STR_NUM_SENDERS_END, txtNumSendersEnd.getText());
		Params.setString(Constants.PROP_STR_NUM_RECEIVERS, txtNumReceivers.getText());
		Params.setString(Constants.PROP_STR_NUM_RECEIVERS_INCREMENT, txtNumReceiversInc.getText());
		Params.setString(Constants.PROP_STR_NUM_RECEIVERS_END, txtNumReceiversEnd.getText());
		Params.setString(Constants.PROP_STR_NUM_SUBSCRIPTIONS, txtNumSubscribers.getText());
		Params.setString(Constants.PROP_STR_NUM_SUBSCRIPTIONS_INCREMENT, txtNumSubscribersInc.getText());
		Params.setString(Constants.PROP_STR_NUM_SUBSCRIPTIONS_END, txtNumSubscribersEnd.getText());
		Params.setString(Constants.PROP_STR_UPDATE_INTERVAL, txtUpdateInterval.getText());
		Params.setString(Constants.PROP_STR_UPDATE_INTERVAL_INCREMENT, txtUpdateIntervalInc.getText());
		Params.setString(Constants.PROP_STR_UPDATE_INTERVAL_END, txtUpdateIntervalEnd.getText());
		Params.setString(Constants.PROP_STR_UPDATE_SIZE, txtUpdateSize.getText());
		Params.setString(Constants.PROP_STR_UPDATE_SIZE_INCREMENT, txtUpdateSizeInc.getText());
		Params.setString(Constants.PROP_STR_UPDATE_SIZE_END, txtUpdateSizeEnd.getText());
		Params.setString(Constants.PROP_STR_SERVER, txtServer.getText());
		Params.setString(Constants.PROP_STR_RESOURCE, txtResource.getText());
		Params.setString(Constants.PROP_STR_SAVE_FILE, chSaveToDb.isSelected() ? "1" : "0");
		Params.writeProperties();
		
	}

	private boolean validateInput()
	{
		boolean isValid = true;
		if(!isInteger(txtNumUpdates.getText()) ||
			!isInteger(txtNumSenders.getText()) ||
			!isInteger(txtNumSendersInc.getText()) ||
			!isInteger(txtNumSendersEnd.getText()) ||
			!isInteger(txtNumReceivers.getText()) ||
			!isInteger(txtNumReceiversInc.getText()) ||
			!isInteger(txtNumReceiversEnd.getText()) ||
			!isInteger(txtNumSubscribers.getText()) ||
			!isInteger(txtNumSubscribersInc.getText()) ||
			!isInteger(txtNumSubscribersEnd.getText()) ||
			!isInteger(txtUpdateInterval.getText()) ||
			!isInteger(txtUpdateIntervalInc.getText()) ||
			!isInteger(txtUpdateIntervalEnd.getText()) ||
			!isInteger(txtUpdateSize.getText()) ||
			!isInteger(txtUpdateSizeInc.getText()) ||
			!isInteger(txtUpdateSizeEnd.getText()))	
		{
			this.outputPanel.setText("Test variables must contain an integer.");
			isValid = false;
		}
		else if(Integer.parseInt(txtUpdateSize.getText()) < Constants.MIN_UPDATE_SIZE)
		{
			this.outputPanel.setText(Constants.DISPLAY_STR_UPDATE_SIZE + " must be at least " + Integer.toString(Constants.MIN_UPDATE_SIZE) + "B.");
			isValid = false;
		}
		else if(txtServer.getText().isEmpty() || txtResource.getText().isEmpty())
		{
			this.outputPanel.setText("All fields must contain a value.");
			isValid = false;
		}
		
		return isValid;
	}
}
