package com.nt.swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEg1 {

	public static void main(String[] args) {
		JFrame fr=new JFrame();
		JButton b=new JButton(new ImageIcon("F:\\rabit.jpg"));
		b.setBounds(100, 50, 120, 50);
		fr.add(b);
		fr.setSize(300,300);
		fr.setLayout(null);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
