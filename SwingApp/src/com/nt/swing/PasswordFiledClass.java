package com.nt.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordFiledClass  {

	public static void main(String[] args) {
			JFrame jf=new JFrame("Checking Credentials");
			JLabel jl=new JLabel();
			jl.setBounds(20,150, 200,50);
			JPasswordField value=new JPasswordField();
			value.setBounds(100,75,100,30);
			JLabel j1=new JLabel("Username");
			j1.setBounds(20,20, 80,30);
			JLabel j2=new JLabel("Password");
			j2.setBounds(20,75, 80,30);
			JButton b=new JButton("Login");
			b.setBounds(100,120, 80,30);
			JTextField jtx=new JTextField();
			jtx.setBounds(100,20, 100,30);
			jf.add(b);jf.add(j2);jf.add(j1);jf.add(value);jf.add(jl);jf.add(jtx);
			jf.setSize(400, 400);
			jf.setLayout(null);
			jf.setVisible(true);
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String data="uname is"+" "+jtx.getText()+" "+"and Pwd is"+" "+new String(value.getPassword());
					jl.setText(data);
				}
				
			});
			
			
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			

	}

}
