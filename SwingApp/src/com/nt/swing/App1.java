package com.nt.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App1 extends JFrame implements ActionListener {
	JButton calc,sicalc,calendar;
	JLabel label;
	 static JFrame frame;
	//creating components inside a constructor
	App1(){
		//label component
		label=new JLabel("JAVA APPLICATIONS");
		label.setFont(new Font("Verdana", Font.BOLD, 15));
		label.setBackground(Color.PINK);
		label.setForeground(Color.BLUE);
		label.setBounds(120, 200, 250, 65);
		frame.add(label);
		//calculator button component
		calc=new JButton("CALCULATOR");
		calc.setFont(new Font("Verdana", Font.BOLD, 15));
		calc.setBackground(Color.PINK);
		calc.setForeground(Color.BLUE);
		calc.setBounds(80, 150, 150, 50);
		frame.add(calc);
		calc.addActionListener(this);
		//si calculator button component
		sicalc=new JButton("SIMPLE INTEREST CALCULATOR");
		sicalc.setFont(new Font("Verdana", Font.BOLD, 15));
		sicalc.setBackground(Color.PINK);
		sicalc.setForeground(Color.BLUE);
		sicalc.setBounds(80, 200, 330, 50);
		frame.add(sicalc);
		sicalc.addActionListener(this);		
		//calender button component
		calendar=new JButton("CALENDAR");
		calendar.setFont(new Font("Verdana", Font.BOLD, 15));
		calendar.setBackground(Color.PINK);
		calendar.setForeground(Color.BLUE);
		calendar.setBounds(80, 250, 150, 50);
		frame.add(calendar);
		calendar.addActionListener(this);				
	}
	public static void main(String[] args) {
		//creating frame......
		 frame=new JFrame("JAVA APPLICATIONS");
		// Get the container and set the background
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setSize(600,400);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		new App1();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
