package com.blackpensoftware.webhelper.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.blackpensoftware.webhelper.core.MainFrame;
import com.blackpensoftware.webhelper.core.WebHelper;

public class MenuPanel extends JPanel {
	private static final long serialVersionUID = 6890522624499543730L;

	Color foregroundColor = new Color(17, 68, 51);

	JButton colors = new JButton("Approved Colors");
	JButton fileGen = new JButton("Generate New File");
	JButton colorPicker = new JButton("Color Picker");

	ColorPanel colorPanel = new ColorPanel();
	FileGenPanel fileGenPanel = new FileGenPanel();
	ColorPickerPanel colorPickerPanel = new ColorPickerPanel();
	
	public MenuPanel(MainFrame panel) {
		this.setLocation(0, 0);
		this.setMaximumSize(new Dimension(WebHelper.width, 300));
		this.setBackground(foregroundColor);
		this.setVisible(true);

		setupColorButton();
		setupFileGenButton();
		setupColorPickerButton();
		addButtons();
		addListener(panel);
	}

	public void addButtons() {
		this.add(colors);
		this.add(fileGen);
		this.add(colorPicker);
	}

	public void setupColorButton() {
		colors.setPreferredSize(new Dimension(150, 35));
		colors.setToolTipText("This button displays the colors that are approved for design work");
		colors.setVisible(true);
	}

	public void setupFileGenButton() {
		fileGen.setPreferredSize(new Dimension(150, 35));
		fileGen.setToolTipText("This button allows for the creation of a new file that is a copy of the master file");
		fileGen.setVisible(true);
	}

	public void setupColorPickerButton() {
		colorPicker.setPreferredSize(new Dimension(150, 35));
		colorPicker.setToolTipText("This button displays a color picker to assist with design");
		colorPicker.setVisible(true);
	}

	public void addListener(MainFrame frame) {
		colors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.remove(frame.currentPanel);
				frame.add(colorPanel);
				frame.currentPanel = colorPanel;
				frame.validate();
				frame.repaint();
			}
		});
		
		fileGen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.remove(frame.currentPanel);
				frame.add(fileGenPanel);
				frame.currentPanel = fileGenPanel;
				frame.validate();
				frame.repaint();
			}
		});
		
		colorPicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.remove(frame.currentPanel);
				frame.add(colorPickerPanel);
				frame.currentPanel = colorPickerPanel;
				frame.validate();
				frame.repaint();
			}
		});
	}
}// End of class
