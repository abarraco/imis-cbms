package org.vmasc.cbms.client.gui;

import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class OutputPanel extends JPanel 
{
	private static final long serialVersionUID = -3995481967548289812L;

	private TextArea outputText;
	
	public OutputPanel()
	{
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createTitledBorder("Output"));
		this.outputText = new TextArea(10, 60);
		this.add(this.outputText, BorderLayout.CENTER);
	}
	
	public void setText(String text)
	{
		this.outputText.setText(text);
	}
	
	public void appendText(String text)
	{
		text += "\n";
		this.outputText.append(text);
	}
	
	public void clearText()
	{
		this.outputText.setText("");
	}
	
}
