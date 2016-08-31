package com.blackpensoftware.webhelper.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.blackpensoftware.webhelper.core.WebHelper;

public class FileGenPanel extends JPanel {
	private static final long serialVersionUID = 3070890332283490819L;
	
	Color backgroundColor = new Color(217, 215, 175);

	JTextField author = new JTextField();
	JTextPane authorLabel = new JTextPane();
	
	JTextField fileName = new JTextField();
	JTextPane fileNameLabel = new JTextPane();
	
	
	
	public Font masterFont = new Font("Times New Roman", Font.PLAIN, 18);
	
	public FileGenPanel() {
		this.setLocation(0, 0);
		this.setSize(WebHelper.width, 100);
		this.setBackground(backgroundColor);
		this.setVisible(true);
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		fileName();
		authorField();
	}
	
	public void fileName(){
		int fileNameWidth = 500;
		int fileNameHeight = 25;
		
		fileName.setPreferredSize(new Dimension(fileNameWidth, fileNameHeight));
		fileName.setFont(masterFont);
		fileNameLabel.setText("File Name:");
		
		this.add(fileNameLabel);
		this.add(fileName);
	}
	
	public void authorField(){
		int autohrXPos = 0;
		int autohrYPos = 0;
		int autohrWidth = 500;
		int autohrHeight = 25;
		
		author.setPreferredSize(new Dimension(autohrWidth, autohrHeight));
		author.setFont(masterFont);
		authorLabel.setText("Author Name:");
		
		this.add(authorLabel);
		this.add(author);
	}
}
