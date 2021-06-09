//package com.day;
//
//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import javax.swing.SwingConstants;
//
//public class Swing_0506 {
//
//	private JFrame frame;
//	private JTextField textField;
//	private boolean[] is_op = { true };
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Swing_0506 window = new Swing_0506();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public Swing_0506() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(41, 100, 492, 681);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.YELLOW);
//		panel.setBounds(6, 19, 466, 596);
//		frame.getContentPane().add(panel);
//		panel.setLayout(null);
//
//		textField = new JTextField("0");
//		textField.setFont(new Font("D2Coding ligature", Font.PLAIN, 30));
//		textField.setHorizontalAlignment(SwingConstants.RIGHT);
//		textField.setBounds(6, 6, 454, 76);
//		panel.add(textField);
//		textField.setColumns(10);
//
//		/*
//		 * numButton printing in JPanel
//		 */
//		createButton(panel);
//		createNumOp(panel);
//		
//		
//
//	}
//
////	int p = 0;
////
////	public int getP() {
////		return p;
////	}
////
////	public void setP(int p) {
////		this.p = p;
////	}
//
//	String p = "";
//	
//	public String getP() {
//		return p;
//	}
//
//	public void setP(String p) {
//		this.p = p;
//	}	
//	String op = "";
//
//	String getOp() {
//		return op;
//	}
//
//	void setOp(String op) {
//		System.out.println("getP:"+getP());
//		if(!getP().isBlank()) {
//			calculator();
//		}
//		setP(textField.getText());	
//		
////		if (getP() != 0 && getOp()!=null) {
////			
////			calculator();
//////			setP(Integer.parseInt(textField.getText()));
////		} else {
////			setP(Integer.parseInt(textField.getText()));
////		}
////	
////		setP(Integer.parseInt(textField.getText()));
//		is_op[0] = false;
//		this.op = op; //�̰� ���� �ΰ� ������.?!
//		
//	}
//
//	void calculator() {
//		switch (getOp()) {
//		case "*":
//			textField.setText(Integer.parseInt(getP())*Integer.parseInt(textField.getText())+"");
////			textField.setText(getP() * Integer.parseInt(textField.getText()) + "");
//			break;
//
//		case "/":
//			textField.setText(Integer.parseInt(getP())/ Integer.parseInt(textField.getText())+"");
////			textField.setText(getP() / Integer.parseInt(textField.getText()) + "");
//			break;
//
//		case "+":
//			textField.setText(Integer.parseInt(getP())+ Integer.parseInt(textField.getText())+"");
////			textField.setText(getP() + Integer.parseInt(textField.getText()) + "");
//
//			break;
//
//		case "-":
//			textField.setText(Integer.parseInt(getP())-Integer.parseInt(textField.getText())+"");
////			textField.setText(getP() - Integer.parseInt(textField.getText()) + "");
//			break;
//		}
//	}
//
//	void createNumOp(JPanel panel) {
//
//		String[] op = { "*", "/", "+", "-", "=", "c" };
//		for (int i = 0; i < 6; i++) {
//			JButton btn7 = new JButton(op[i]);
//			btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
//			if (i == 4) {
//				btn7.addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						// TODO Auto-generated method stub
////						setP("");
//						calculator();
////						setOp("");
//						
//
//					}
//				});
//				btn7.setBounds(245, 450, 100, 100);
//			} else if (i == 5) {
//				btn7.addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						// TODO Auto-generated method stub
//						
//						textField.setText("0");
////						setP(0);
//						
//					}
//				});
//				btn7.setBounds(135, 450, 100, 100);
//			} else {
//				btn7.addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						setOp(e.getActionCommand());
//
//					}
//				});
//				btn7.setBounds(355, 120 + (110 * i), 100, 100);
//			}
//			btn7.setBackground(Color.WHITE);
//			panel.add(btn7);
//		}
//	}
//
//	void createButton(JPanel panel) {
//
//		int[] nums = { 7, 8, 9, 4, 5, 6, 1, 2, 3, 0 };
//		ButtonEventTest button = new ButtonEventTest(textField, is_op);
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				JButton btn7 = new JButton(nums[i + (j * 3)] + "");
//				btn7.addActionListener(button);
//				btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
//				btn7.setBackground(Color.WHITE);
//				btn7.setBounds(25 + (110 * i), 120 + (110 * j), 100, 100);
//				panel.add(btn7);
//			}
//		}
//		JButton btn0 = new JButton(nums[9] + "");
//		btn0.addActionListener(button);
//		btn0.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
//		btn0.setBackground(Color.WHITE);
//		btn0.setBounds(25 + (110 * 0), 120 + (110 * 3), 100, 100);
//		panel.add(btn0);
//	}
//
//}
