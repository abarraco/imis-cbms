package org.vmasc.cbms.client.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MainMenu extends JMenuBar implements ActionListener 
{
	private static final long serialVersionUID = 4119761191572704449L;

	private JMenu fileMenu;
	private JMenuItem exitItem;
	
	public MainMenu()
	{
		fileMenu = new JMenu("File");
		exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(this);
		fileMenu.add(exitItem);
		this.add(fileMenu);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// Exit
		if (e.getSource() == exitItem)
		{
			System.exit(0);
		}
	}

}
