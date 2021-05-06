package com.day;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.awt.event.ActionEvent;

public class swing_day0503 {
	String temp = "";
	String last_temp = "";
	String num_1 = "";
	String num_2 = "";
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing_day0503 window = new swing_day0503();
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
	public swing_day0503() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 499, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(12, 10, 473, 643);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("D2Coding", Font.BOLD, 26));
		textField.setText("");
		textField.setBounds(12, 69, 449, 77);
		panel.add(textField);
		textField.setColumns(10);

		JButton btn_7 = new JButton("7");
		btn_7.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_7.setBounds(12, 203, 100, 100);
		panel.add(btn_7);

		JButton btn_8 = new JButton("8");
		btn_8.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_8.setBounds(124, 203, 100, 100);
		panel.add(btn_8);

		JButton btn_9 = new JButton("9");
		btn_9.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_9.setBounds(236, 203, 100, 100);
		panel.add(btn_9);

		JButton btn_m = new JButton("*");
		btn_m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = e.getActionCommand();
				temp = temp.substring(temp.length() - 1);
				num_1 = textField.getText();
//				num_2 = num_1+temp;
//				textField.setText("");
			}
		});
		btn_m.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_m.setBounds(345, 203, 100, 100);
		panel.add(btn_m);

		JButton btn_4 = new JButton("4");
		btn_4.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_4.setBounds(12, 313, 100, 100);
		panel.add(btn_4);

		JButton btn_5 = new JButton("5");
		btn_5.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_5.setBounds(124, 313, 100, 100);
		panel.add(btn_5);

		JButton btn_6 = new JButton("6");
		btn_6.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_6.setBounds(236, 313, 100, 100);
		panel.add(btn_6);

		JButton btn_d = new JButton("/");
		btn_d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			temp = e.getActionCommand();
			temp = temp.substring(temp.length() - 1);
			num_1 = textField.getText();
//			num_2 = num_1+temp;
//			textField.setText("");
			
//			System.out.println(num_2);
					}
		});
		btn_d.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_d.setBounds(345, 313, 100, 100);
		panel.add(btn_d);

		JButton btn_1 = new JButton("1");

		btn_1.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_1.setBounds(12, 423, 100, 100);
		panel.add(btn_1);

		JButton btn_2 = new JButton("2");
		btn_2.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_2.setBounds(124, 423, 100, 100);
		panel.add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_3.setBounds(236, 423, 100, 100);
		panel.add(btn_3);

		JButton btn_s = new JButton("-");
		btn_s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = e.getActionCommand();
				temp = temp.substring(temp.length() - 1);
				num_1 = textField.getText();
				
//				textField.setText("");
			}
		});
		btn_s.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_s.setBounds(345, 423, 100, 100);
		panel.add(btn_s);

		JButton btn_0 = new JButton("0");

		btn_0.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_0.setBounds(12, 533, 100, 100);
		panel.add(btn_0);

		JButton btn_c = new JButton("c");
		btn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btn_c.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_c.setBounds(124, 533, 100, 100);
		panel.add(btn_c);

		JButton btn_e = new JButton("=");
		btn_e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(temp);
				calculator(temp);
				
			}
		});
		btn_e.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_e.setBounds(236, 533, 100, 100);
		panel.add(btn_e);

		JButton btn_p = new JButton("+");
		btn_p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = e.getActionCommand();
				temp = temp.substring(temp.length() - 1);
//				System.out.println(temp);
				num_1 = textField.getText(); //고정시킨다. 근데 잘안된다.

//				System.out.println(num_2);
//				textField.setText("");
				
			}
		});
		btn_p.setFont(new Font("Consolas", Font.PLAIN, 31));
		btn_p.setBounds(345, 533, 100, 100);
		panel.add(btn_p);

//		class ButtonEventTest implements ActionListener{
//			
//			String n = "";
//			public ButtonEventTest(String s) {
//					n = s;	
//			}
//			@Override
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//				// TODO Auto-generated method stub
//				textField.setText(n);
//			}			
//		}

		btn_0.addActionListener(new ButtonEventTest(textField));
		btn_1.addActionListener(new ButtonEventTest(textField));
		btn_2.addActionListener(new ButtonEventTest(textField));
		btn_3.addActionListener(new ButtonEventTest(textField));
		btn_4.addActionListener(new ButtonEventTest(textField));
		btn_5.addActionListener(new ButtonEventTest(textField));
		btn_6.addActionListener(new ButtonEventTest(textField));
		btn_7.addActionListener(new ButtonEventTest(textField));
		btn_8.addActionListener(new ButtonEventTest(textField));
		btn_9.addActionListener(new ButtonEventTest(textField));
		btn_p.addActionListener(new ButtonEventTest(temp, textField));
	}
	void str(String s) {
		System.out.println(s);
	}
	void calculator(String s) {
		switch (s) {
		case "+":
			System.out.println("num_1:" + num_1);
			System.out.println("textField:" + textField.getText());
//			int c = Integer.parseInt(num_1) + Integer.parseInt(textField.getText());
//			textField.setText(c + "");

			break;
		case "-":
//			int c1 = Integer.parseInt(num_1) - Integer.parseInt(textField.getText());
//			textField.setText(c1 + "");
			break;		
		case "*":
//			int c2 = Integer.parseInt(num_1) * Integer.parseInt(textField.getText());
//			textField.setText(c2 + "");
			break;
		case "/":
//			int c3 = Integer.parseInt(num_1) / Integer.parseInt(textField.getText());
//			textField.setText(c3 + "");
			break;

		}

	}

	void num(String s) {
		textField.setText("0");

	}

}

class ButtonEventTest implements ActionListener {
	String n;
	JTextField input = null;
	String temp;
	public ButtonEventTest(String temp ,JTextField input) { // value를 받는지 , 참조 주소값을 받는지 반드시 확인해야합니다.
		this.temp = temp;
//		System.out.println(input.getText());
		this.input = input;
//		System.out.println(temp);

	}
	public ButtonEventTest(JTextField input) { // value를 받는지 , 참조 주소값을 받는지 반드시 확인해야합니다.

//		System.out.println(input.getText());
		this.input = input;

	}
	
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		String d = e.getActionCommand();
//		String d2 = e.getActionCommand();	
		if (d.equals("+")) {
			input.getText();
		
		}
		else if (!input.getText().equals("0")) {
			input.setText(input.getText() + d);
			System.out.println(temp);
			}
		else {
			input.setText(d);
		}
	}
//		if(!n.equals(input.getText())) {
//			input.setText(input.getText()+n);
//		}
//		else {
//			input.setText(n);
//		}

}
