package com;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class StatusBar extends JPanel {
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StatusBar() {
		setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 276, 450, 2);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(104, 276, 27, 24);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(231, 276, 27, 24);
		add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(349, 276, 27, 24);
		add(separator_3);
		
		
	}

}
