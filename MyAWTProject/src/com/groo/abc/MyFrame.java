package com.groo.abc;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("Event handling");
		Button b=new Button("Click me for Second Frame");
		b.setBounds(100, 100, 200, 30);
		add(b);
		class MyListner implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				new MyFrame2();
			}
			
		}
		b.addActionListener(new MyListner());
		setLayout(null);
		setVisible(true);
		setSize(500,500);
	}
}
