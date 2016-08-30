package com.blackpensoftware.webhelper.panels;

import java.awt.Color;

import javax.swing.JPanel;

import com.blackpensoftware.webhelper.core.WebHelper;

public class EmptyPanel extends JPanel {
	private static final long serialVersionUID = -6912717202927373535L;
	
	Color backgroundColor = new Color(217, 215, 175);

	public EmptyPanel() {
		this.setLocation(0, 0);
		this.setSize(WebHelper.width, 100);
		this.setBackground(backgroundColor);
		this.setVisible(true);
	}
}
