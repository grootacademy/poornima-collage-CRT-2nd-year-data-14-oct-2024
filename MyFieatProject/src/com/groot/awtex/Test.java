package com.groot.awtex;

import java.awt.*;

public class Test {
	public static void main(String[] args) {
		Frame f=new Frame("My First Frame");
		 Label nameLabel=new Label("Name");
		 nameLabel.setBounds( 100, 50, 100, 30);
		 nameLabel.setBackground(Color.red);
		 nameLabel.setForeground(Color.white);
		 f.add(nameLabel);
		 TextField nameTextField=new TextField();
		 nameTextField.setBounds(230, 50, 200, 30);
		 f.add(nameTextField);  
		 Label passwordLabel=new Label("Password");
		 passwordLabel.setBounds(100, 100, 100, 30);
		 f.add(passwordLabel);
		 TextField passwordField=new TextField();
		 passwordField.setBounds(230, 100, 200, 30);
		 f.add(passwordField);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500, 500);
	}
}
