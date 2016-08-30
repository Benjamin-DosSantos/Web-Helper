package com.blackpensoftware.webhelper.core;

public class WebHelper {
	
	public static int xPos = 100;
	public static int yPos = 100;
	public static int width = 600;
	public static int height = 600;
	
	public static void main(String[] args){	
		new MainFrame(xPos, yPos, width, height);
	}
}// End of class
