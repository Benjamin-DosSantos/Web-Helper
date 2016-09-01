package com.blackpensoftware.webhelper.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.blackpensoftware.webhelper.core.MainFrame;
import com.blackpensoftware.webhelper.core.WebHelper;

public class FileGenPanel extends JPanel {
	private static final long serialVersionUID = 3070890332283490819L;

	Color backgroundColor = new Color(217, 215, 175);

	JTextField author = new JTextField();
	JTextPane authorLabel = new JTextPane();

	JTextField fileName = new JTextField();
	JTextPane fileNameLabel = new JTextPane();

	JButton generate = new JButton("Create File");

	final JFileChooser fc = new JFileChooser();

	public Font masterFont = new Font("Times New Roman", Font.PLAIN, 18);

	public FileGenPanel(MainFrame masterPanel) {
		this.setLocation(0, 0);
		this.setSize(WebHelper.width, 100);
		this.setBackground(backgroundColor);
		this.setVisible(true);
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		fileName();
		authorField();
		generateButton(masterPanel);
	}

	public void fileName() {
		int fileNameWidth = 500;
		int fileNameHeight = 25;

		fileName.setPreferredSize(new Dimension(fileNameWidth, fileNameHeight));
		fileName.setFont(masterFont);
		fileNameLabel.setText("File Name:");

		this.add(fileNameLabel);
		this.add(fileName);
	}

	public void authorField() {
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

	public void generateButton(JFrame frame) {
		int generateWidth = 100;
		int generateHeight = 75;

		generate.setPreferredSize(new Dimension(generateWidth, generateHeight));

		generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnVal = fc.showSaveDialog(generate);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					// This is where a real application would open the file.

					System.out.println("Will Save File to " + file.getPath());
					
					File newFile = new File(file.getPath() + "/" + file.getName());

					try {
						if (newFile.createNewFile()) {
							System.out.println("File is created!");
						} else {
							System.out.println("File already exists.");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} else {
					System.out.println("Open command cancelled by user.");
				}
			}
		});

		this.add(generate);
	}
}
