////package com.day;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import java.awt.Color;
//import javax.swing.JTextField;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.awt.event.ActionEvent;
//import java.awt.Font;
//import javax.swing.SwingConstants;
//
//public class swing_day_0504 {
//
//	private JFrame frame;
//	private JTextField textField;
//	private String o = "";
////	private String p = "0";
//	private String[] p = new String[1];
//	private String[] oa = new String[1];
//	private String[] p2 = {" "};
//	private String[] p3 = new String[1];
//	
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					swing_day_0504 window = new swing_day_0504();
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
//	public swing_day_0504() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 516, 699);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//
//		JPanel panel = new JPanel();
//		panel.setBackground(new Color(0, 0, 255));
//		panel.setForeground(new Color(0, 0, 205));
//		panel.setBounds(12, 21, 478, 631);
//		frame.getContentPane().add(panel);
//		panel.setLayout(null);
//
//		textField = new JTextField();
//		textField.setHorizontalAlignment(SwingConstants.RIGHT);
//		textField.setFont(new Font("D2Coding", Font.BOLD, 33));
//		textField.setBounds(38, 22, 414, 89);
//		panel.add(textField);
//		textField.setColumns(10);
//
//		JButton btn_7 = new JButton("7");
//		btn_7.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_7.setBounds(12, 146, 100, 100);
//		panel.add(btn_7);
//
//		JButton btn_8 = new JButton("8");
//		btn_8.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_8.setBounds(124, 146, 100, 100);
//		panel.add(btn_8);
//
//		JButton btn_9 = new JButton("9");
//		btn_9.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_9.setBounds(236, 146, 100, 100);
//		panel.add(btn_9);
//
//		JButton btn_m = new JButton("*");
//		btn_m.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
////				oa[0] = btn_m.getText();
////				o = btn_m.getText();
////				System.out.println("oa:"+oa[0]);
////				p = textField.getText();
////				System.out.println(p);
//				operationTest("*");
//			}
//		});
//		btn_m.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_m.setBounds(352, 146, 100, 100);
//		panel.add(btn_m);
//
//		JButton btn_4 = new JButton("4");
//		btn_4.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_4.setBounds(12, 256, 100, 100);
//		panel.add(btn_4);
//
//		JButton btn_5 = new JButton("5");
//		btn_5.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_5.setBounds(124, 256, 100, 100);
//		panel.add(btn_5);
//
//		JButton btn_6 = new JButton("6");
//		btn_6.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_6.setBounds(236, 256, 100, 100);
//		panel.add(btn_6);
//
//		JButton btn_d = new JButton("/");
//		btn_d.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
////				oa[0] = btn_d.getText();
////				o = btn_d.getText();
////				System.out.println("oa:"+oa[0]);
////				p = textField.getText();
////				System.out.println(p);
//				operationTest("/");
//			}
//		});
//		btn_d.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_d.setBounds(352, 256, 100, 100);
//		panel.add(btn_d);
//
//		JButton btn_1 = new JButton("1");
//		btn_1.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_1.setBounds(12, 366, 100, 100);
//		panel.add(btn_1);
//
//		JButton btn_2 = new JButton("2");
//		btn_2.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_2.setBounds(124, 366, 100, 100);
//		panel.add(btn_2);
//
//		JButton btn_3 = new JButton("3");
//		btn_3.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_3.setBounds(236, 366, 100, 100);
//		panel.add(btn_3);
//
//		JButton btn_s = new JButton("-");
//		btn_s.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
////				oa[0] = btn_s.getText();
////				o = btn_s.getText();
////				System.out.println("oa:"+oa[0]);
////				p = textField.getText();
////				System.out.println(p);
//				operationTest("-");
//			}
//		});
//		btn_s.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_s.setBounds(352, 366, 100, 100);
//		panel.add(btn_s);
//
//		JButton btn_0 = new JButton("0");
//		btn_0.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_0.setBounds(12, 476, 100, 100);
//		panel.add(btn_0);
//
//		JButton btn_c = new JButton("c");
//		btn_c.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				textField.setText("0");
////				oa[0] = null;
//			}
//		});
//		
//		btn_c.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_c.setBounds(124, 476, 100, 100);
//		panel.add(btn_c);
//
//		JButton btn_e = new JButton("=");
//		btn_e.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(textField.getText().equals("0")) {
//					return;
//				}
//				p2[0] = textField.getText();
//				calculator();
//			}
//		});
//		btn_e.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_e.setBounds(236, 476, 100, 100);
//		panel.add(btn_e);
//
//		JButton btn_p = new JButton("+");
//		btn_p.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
////				oa[0] = "+";
////				o = "+";
////				p = textField.getText();
//				operationTest("+");
//				System.out.println("p��:" + p[0]);
//				System.out.println("p2��:" + p2[0]);
//				if(!p2[0].isBlank())
//					calculator();
//				
//				
//
////				t = "count";
////				test(t);
////				System.out.println(t);
////				System.out.println("===========");
////				textField.setText("count");
////				test(textField);
////				System.out.println(textField.getText());
////				System.out.println("======");
////				String[] array = new String[1];
////				array[0] = "count";
////				test(array);
////				System.out.println(array[0]);
//				
//				
//			}
//		});
//		btn_p.setFont(new Font("Consolas", Font.PLAIN, 26));
//		btn_p.setBounds(352, 476, 100, 100);
//		panel.add(btn_p);
//
////		ButtonEventTest event2 = new ButtonEventTest(textField, oa[0]);
//		ButtonEventTest event = new ButtonEventTest(textField, p2);
//		
//		btn_0.addActionListener(event);
//		btn_1.addActionListener(event);
//		btn_2.addActionListener(event);
//		btn_3.addActionListener(event);
//		btn_4.addActionListener(event);
//		btn_5.addActionListener(event);
//		btn_6.addActionListener(event);
//		btn_7.addActionListener(event);
//		btn_8.addActionListener(event);
//		btn_9.addActionListener(event);
//
//	}
////	void test(String s) {
////		System.out.println(s);
////		s="test";
////		System.out.println(s);
////	} //valueŸ���� ����Ÿ������ �ٲ�����.!
////	
////	void test(String[] s) {
////		System.out.println(s[0]);
////		s[0]="test";
////		System.out.println(s[0]);
////	}
////	
////	void test(JTextField s) {
////		System.out.println(s.getText());
////		s.setText("test");
////		System.out.println(s.getText());
////	}
//	void operationTest(String os) {
//		oa[0] = os;
//		o = os;
////		System.out.println(oa[0]);
//		p[0] = textField.getText();
//
//	}
//	void calculator() {
//		
//		switch (o) {
//		case "+":
//			int n = Integer.parseInt(p[0]) + Integer.parseInt(p2[0]);
//			p3[0] = n+"";
//			textField.setText(p3[0]);
////			System.out.println(n);
//			break;
//			
//		case "-":
//			int n1 = Integer.parseInt(p[0]) - Integer.parseInt(p2[0]);
//			p3[0] = n1+"";
//			textField.setText(p3[0]);
////			System.out.println(n);
//			break;
//			
//			
//		case "*":
////			System.out.println(textField.getText());
//			int n2 = Integer.parseInt(p[0]) * Integer.parseInt(p2[0]);
//			p3[0] = n2+"";
//			textField.setText(p3[0]);
////			System.out.println(n);
//			
//			break;
//			
//		case "/":
//			int n3 = Integer.parseInt(p[0]) / Integer.parseInt(p2[0]);
//			p3[0] = n3+"";
//			textField.setText(p3[0]);
////			System.out.println(n);
//			break;
//			
//		}
//	}
//}
