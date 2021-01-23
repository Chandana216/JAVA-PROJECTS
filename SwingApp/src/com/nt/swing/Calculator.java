package com.nt.swing;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;


public class Calculator {

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("CALCULATOR");
		frame.setIconImage(new ImageIcon("f:\\calculator.png").getImage());
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 266, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String enterButton=textField.getText()+btn7.getText();
				num2.setText(num2.getText()+7);
			}
		});
		
		num2 = new JTextField();
		num2.setHorizontalAlignment(SwingConstants.CENTER);
		num2.setBounds(10, 33, 238, 31);
		frame.getContentPane().add(num2);
		num2.setColumns(10);
		
		num1 = new JTextField();
		num1.setHorizontalAlignment(SwingConstants.CENTER);
		num1.setBounds(10, 9, 238, 25);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		btn7.setBackground(SystemColor.controlDkShadow);
		btn7.setForeground(SystemColor.text);
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btn7.setBounds(10, 64, 40, 40);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String enterButton=textField.getText()+btn8.getText();
				num2.setText(num2.getText()+8);
			}
		});
		btn8.setForeground(SystemColor.text);
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btn8.setBackground(SystemColor.controlDkShadow);
		btn8.setBounds(60, 64, 40, 40);
		frame.getContentPane().add(btn8);
		
		JButton bt9 = new JButton("9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String enterButton=textField.getText()+bt9.getText();
				num2.setText(num2.getText()+9);
			}
		});
		bt9.setFont(new Font("Times New Roman", Font.BOLD, 11));
		bt9.setBackground(SystemColor.controlDkShadow);
		bt9.setForeground(SystemColor.text);
		bt9.setBounds(108, 64, 40, 40);
		frame.getContentPane().add(bt9);
		
		JButton btn3 = new JButton("4");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String enterButton=textField.getText()+btn3.getText();
				num2.setText(num2.getText()+4);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btn3.setForeground(SystemColor.text);
		btn3.setBackground(SystemColor.controlDkShadow);
		btn3.setBounds(9, 115, 40, 40);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("5");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String enterButton=textField.getText()+btn4.getText();
				num2.setText(num2.getText()+5);
			}
		});
		btn4.setBackground(SystemColor.controlDkShadow);
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btn4.setForeground(SystemColor.text);
		btn4.setBounds(60, 115, 40, 40);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("6");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String enterButton=textField.getText()+btn5.getText();
				num2.setText(num2.getText()+6);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btn5.setForeground(SystemColor.text);
		btn5.setBackground(SystemColor.controlDkShadow);
		btn5.setBounds(108, 115, 40, 40);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("1");
		btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//String enterButton=textField.getText()+btn6.getText();
					num2.setText(num2.getText()+1);
				}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btn6.setBackground(SystemColor.controlDkShadow);
		btn6.setForeground(SystemColor.text);
		btn6.setBounds(10, 166, 40, 40);
		frame.getContentPane().add(btn6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	String enterButton=textField.getText()+btnNewButton_7.getText();
				num2.setText(num2.getText()+2);
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_7.setBackground(SystemColor.controlDkShadow);
		btnNewButton_7.setForeground(SystemColor.text);
		btnNewButton_7.setBounds(60, 166, 40, 40);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String enterButton=textField.getText()+btnNewButton_8.getText();
				num2.setText(num2.getText()+3);
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_8.setBackground(SystemColor.controlDkShadow);
		btnNewButton_8.setForeground(SystemColor.text);
		btnNewButton_8.setBounds(108, 166, 40, 40);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String enterButton=textField.getText()+btnNewButton_9.getText();
				num2.setText(num2.getText()+0);
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_9.setForeground(SystemColor.text);
		btnNewButton_9.setBackground(SystemColor.controlDkShadow);
		btnNewButton_9.setBounds(9, 217, 40, 40);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterButton=num2.getText()+btnNewButton_10.getText();
				num2.setText(enterButton);
			}
		});
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_10.setForeground(SystemColor.text);
		btnNewButton_10.setBackground(SystemColor.controlDkShadow);
		btnNewButton_10.setBounds(60, 217, 40, 40);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double one=Double.parseDouble(num1.getText());
				double two=Double.parseDouble(num2.getText());
				if(actionReceived.getText().equals("Addition")) {
					String result=String.valueOf(one+two);
					num1.setText(null);
					num2.setText(result);
				}
				
				else if(actionReceived.getText().equals("subtraction")) {
					String result=String.valueOf(one-two);
					num1.setText(null);
					num2.setText(result);
				}
				else if(actionReceived.getText().equals("multiplication")) {
					String result=String.valueOf(one*two);
					num1.setText(null);
					num2.setText(result);
				}
				else if(actionReceived.getText().equals("division")) {
					String result=String.valueOf(one/two);
					num1.setText(null);
					num2.setText(result);
				}
			}
		});
		btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnNewButton_11.setBackground(SystemColor.controlDkShadow);
		btnNewButton_11.setForeground(SystemColor.text);
		btnNewButton_11.setBounds(109, 217, 40, 40);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btn12 = new JButton("+");
		btn12.setVisible(true);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1.setText(num2.getText());
				num2.setText(" ");
				actionReceived.setText("Addition");
				
			}
		});
		btn12.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btn12.setBackground(SystemColor.controlDkShadow);
		btn12.setForeground(SystemColor.text);
		btn12.setBounds(158, 64, 40, 40);
		frame.getContentPane().add(btn12);
		
		JButton btn13 = new JButton("b");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(num2.getText().length()>0) {
					StringBuilder sb=new StringBuilder(num2.getText());
					sb.deleteCharAt(num2.getText().length()-1);
					backspace=sb.toString();
					num2.setText(backspace);
				}
			}
		});
		btn13.setToolTipText("BackSpace");
		btn13.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn13.setBackground(SystemColor.controlDkShadow);
		btn13.setForeground(SystemColor.text);
		btn13.setBounds(203, 66, 40, 40);
		frame.getContentPane().add(btn13);
		
		JButton btn14 = new JButton("-");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(num2.getText());
				num2.setText(" ");
				actionReceived.setText("subtraction");
			}
		});
		btn14.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn14.setBackground(SystemColor.controlDkShadow);
		btn14.setForeground(SystemColor.text);
		btn14.setBounds(157, 115, 40, 40);
		frame.getContentPane().add(btn14);
		
		JButton btn15 = new JButton("/");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(num2.getText());
				num2.setText(" ");
				actionReceived.setText("division");
			}
		});
		btn15.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn15.setBackground(SystemColor.controlDkShadow);
		btn15.setForeground(SystemColor.text);
		btn15.setBounds(208, 115, 40, 40);
		frame.getContentPane().add(btn15);
		
		JButton btn16 = new JButton("x");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(num2.getText());
				num2.setText(" ");
				actionReceived.setText("multiplication");
			}
		});
		btn16.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn16.setBackground(SystemColor.controlDkShadow);
		btn16.setForeground(SystemColor.text);
		btn16.setBounds(158, 166, 40, 40);
		frame.getContentPane().add(btn16);
		
		JButton btn17 = new JButton("c");
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(null);
			}
		});
		btn17.setToolTipText("Clear");
		btn17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn17.setBackground(SystemColor.controlDkShadow);
		btn17.setForeground(SystemColor.text);
		btn17.setBounds(208, 166, 40, 40);
		frame.getContentPane().add(btn17);
		
		JEditorPane num = new JEditorPane();
		num.setBounds(10, 11, 238, 52);
		frame.getContentPane().add(num);
		
		 actionReceived = new JLabel("");
		actionReceived.setFont(new Font("Tahoma", Font.PLAIN, 12));
		actionReceived.setForeground(SystemColor.window);
		actionReceived.setBackground(SystemColor.window);
		actionReceived.setBounds(159, 217, 89, 40);
		frame.getContentPane().add(actionReceived);
		
		
	}
	JLabel actionReceived;
}
