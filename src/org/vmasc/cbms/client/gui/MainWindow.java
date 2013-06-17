package org.vmasc.cbms.client.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.vmasc.cbms.client.test.TestVariableManager;

public class MainWindow extends JFrame
{
	private static final long serialVersionUID = 2184056427630594775L;
	private OutputPanel outputPanel;

	public MainWindow(String title)
	{
		super(title);
		this.outputPanel = new OutputPanel();
	}

	public void setupWindow(TestVariableManager testVariableManager)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create components and put them in the frame.
		this.getContentPane().add(new MainMenu(), BorderLayout.NORTH);

		JPanel centerPane = new JPanel();
		centerPane.setLayout(new BorderLayout());
		centerPane.add(new InputPanel(this.outputPanel, testVariableManager), BorderLayout.NORTH);
		centerPane.add(this.outputPanel, BorderLayout.CENTER);
		this.getContentPane().add(centerPane, BorderLayout.CENTER);

		// sizing
		this.setMinimumSize(new Dimension(800, 600));
	}
}
