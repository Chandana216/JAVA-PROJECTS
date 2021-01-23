package com.nt.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DeliveryItems extends JFrame implements ActionListener{
JLabel label;
JButton button;
JCheckBox b1,b2,b3;
	DeliveryItems(){
		label=new JLabel("Food Items Ordering");
		label.setBounds(50,50,300,20);
		b1=new JCheckBox("pizza @120");
		b1.setBounds(100,100,150,20);
		b2=new JCheckBox("Burger @180");
		b2.setBounds(100,150,150,20);
		b3=new JCheckBox("SpringRolls@80");
		b3.setBounds(100,200,150,20);
		button=new JButton("Order");
		button.setBounds(100,250,80,30);
		button.addActionListener(this);
		add(label);add(button);add(b1);add(b2);add(b3);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new  DeliveryItems();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int amount=0;
		String msg="";
		if(b1.isSelected()) {
			amount+=120;
			msg+="Pizza::120 \n";
		}
		 if(b2.isSelected()) {
			amount+=180;
			msg+="Burger::180 \n";
		}
		if(b3.isSelected()) {
			amount+=80;
			msg+="SpringRolls::80 \n";
		}
		msg+="-----------\n";
		JOptionPane.showMessageDialog(this,msg+"Total::"+amount);
		
		
	}

}
