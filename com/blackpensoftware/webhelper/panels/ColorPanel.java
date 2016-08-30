package com.blackpensoftware.webhelper.panels;

import java.awt.Color;

import javax.swing.JPanel;

import com.blackpensoftware.webhelper.core.WebHelper;

public class ColorPanel extends JPanel {
	private static final long serialVersionUID = 3070890332283490819L;
	
	Color backgroundColor = new Color(217, 215, 175);
	
	public ColorPanel() {
		this.setLocation(0, 0);
		this.setSize(WebHelper.width, 100);
		this.setBackground(backgroundColor);
		this.setVisible(true);
	}
}
