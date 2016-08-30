package com.blackpensoftware.webhelper.panels;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.blackpensoftware.webhelper.core.WebHelper;

public class FileGenPanel extends JPanel {
	private static final long serialVersionUID = 3070890332283490819L;
	
	Color backgroundColor = new Color(217, 215, 175);

	JTextField author = new JTextField();
	
	public FileGenPanel() {
		this.setLocation(0, 0);
		this.setSize(WebHelper.width, 100);
		this.setBackground(backgroundColor);
		this.setVisible(true);
		authorField();
	}
	
	public void authorField(){
		int autohrXPos = 0;
		int autohrYPos = 0;
		int autohrWidth = 100;
		int autohrHeight = 10;
		
		author.setSize(autohrWidth, autohrHeight);
		
		this.add(author);
	}
}
