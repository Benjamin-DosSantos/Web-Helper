package com.blackpensoftware.webhelper.core;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.blackpensoftware.webhelper.panels.EmptyPanel;
import com.blackpensoftware.webhelper.panels.MenuPanel;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = -61904350181620376L;
	
	ImageIcon img = new ImageIcon("/Logo.png");
	
	MenuPanel menuPanel = new MenuPanel(this);
	EmptyPanel emptyPanel = new EmptyPanel();
	
	public JPanel currentPanel;
	
	public MainFrame(int xPos, int yPos, int width, int height){
		super("Web Helper");
		setSize(width, height);
		setLocation(xPos, yPos);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setResizable(false);
		add(menuPanel);
		currentPanel = emptyPanel;
		add(emptyPanel);
		setIconImage(img.getImage());
	}
}
