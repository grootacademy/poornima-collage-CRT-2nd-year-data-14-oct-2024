package com.groot.swingex;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test {
 public static void main(String[] args) {
	 JFrame f=new JFrame();
	 JLabel nameLabel=new JLabel("Name : ");
	 nameLabel.setBounds(100,50,100,30);
	 f.add(nameLabel);
	 JTextField nameField=new JTextField();
	 nameField.setBounds(230, 50, 200, 30);
	 f.add(nameField);
	 f.setLayout(null);
	 f.setVisible(true);
	 f.setSize(500, 500);
}
}
