package com.nt.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleInterestCalculator extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,lab;
	JTextField tx1,tx2,tx3,tx4,tx5,txt;
	JButton b1;
	
	SimpleInterestCalculator(){
		//frame components
		JLabel label=new JLabel("Welcome To SimpleInterestCalculator");
		label.setBounds(50, 40, 300, 30);
		label.setBackground(Color.GRAY);
		add(label);
		//Principal components
		l1=new JLabel("Principal::");
		add(l1);
		l1.setBounds(50,100, 100,30);
		tx1=new JTextField();
		add(tx1);
		tx1.setBounds(120,100, 150,40);
		// rate components
		l2=new JLabel("Rate::");
		add(l2);
		l2.setBounds(50,160, 100,30);
		tx2=new JTextField();
		add(tx2);
		tx2.setBounds(120,150, 150,40);
		// year components
		l3=new JLabel("Years::");
		add(l3);
		l3.setBounds(50,200, 100,30);
		tx3=new JTextField(20);
		add(tx3);
		tx3.setBounds(120,200,150,40);
		//months components
		 lab=new JLabel("Months::");
		add(lab);
		lab.setBounds(50,250, 100,30);
         txt=new JTextField(20);
		add(txt);
		txt.setBounds(120,250,150,40);
		//buttons
		b1=new JButton("Calculate");
		//b1.setBounds(280, 230, 100,30);
		b1.setBounds(120, 300, 150,40);
		//interest components
		l4=new JLabel("Interest::");
		add(l4);
		l4.setBounds(50,350, 100,30);
		tx4=new JTextField(20);
		add(tx4);
		tx4.setBounds(120,350, 150,40);
		//total components
		l5=new JLabel("Total::");
		add(l5);
		l5.setBounds(50,400, 100,30);
		tx5=new JTextField(20);
		add(tx5);
		tx5.setBounds(120,400, 150,40);
		b1.addActionListener(this);
		add(b1);
		JButton b2=new JButton("Clear");
		add(b2);
		b2.setBounds(120, 450, 150,40);
		b2.addActionListener(this);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SimpleInterestCalculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		float p,r,n1,n2,t;
		String result1=null,interest1=null,interest2=null,result2=null;
		p=Float.parseFloat(tx1.getText());
		r=Float.parseFloat(tx2.getText());
		r=r/100;
		n1=Float.parseFloat(tx3.getText());
		n2=Float.parseFloat(txt.getText());
		
			interest1=String.valueOf((p*r*n1));
			interest1=String.valueOf((p*(r/12)*n2));
		 result1=String.valueOf((p*(1+(r*n1))));
		 result2=String.valueOf((p*(1+(r/12*n2))));
		tx4.setText(interest1);
		tx5.setText(result1);
		tx4.setText(interest2);
		tx5.setText(result2);
	
	}
}

