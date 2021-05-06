package com.day;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class swing_day_04_30 {

	private JFrame frame;
	private JLabel lblNewLabel = new JLabel("0");
	String num_1;
	String num_2;
	String nInput = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing_day_04_30 window = new swing_day_04_30();
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
	public swing_day_04_30() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 514, 662);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel menu_0 = new JPanel();
		menu_0.setBackground(new Color(51, 255, 204));
		menu_0.setBounds(30, 39, 431, 564);
		frame.getContentPane().add(menu_0);
		menu_0.setLayout(null);
		
//		lblNewLabel = new JLabel("\uBA54\uB274_\uC74C\uB8CC\uC218");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 34));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(12, 10, 385, 87);
		menu_0.add(lblNewLabel);
		
		JButton num_7 = new JButton("7");
		num_7.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("New Button");
				btn_event(num_7.getText());
				System.out.println(lblNewLabel.getText().equals("¸Þ´º_À½·á¼ö"));
			}
		});
		num_7.setBounds(12, 104, 96, 96);
		menu_0.add(num_7);
		
		JButton num_8 = new JButton("8");
		num_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_8.getText());
			}
		});
		num_8.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_8.setBounds(118, 104, 96, 96);
		menu_0.add(num_8);
		
		JButton num_9 = new JButton("9");
		num_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_9.getText());
			}
		});
		num_9.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_9.setBounds(224, 104, 96, 96);
		menu_0.add(num_9);
		
		JButton num_dev = new JButton("/");
		num_dev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_dev.getText());
			}
		});
		num_dev.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_dev.setBounds(330, 104, 96, 96);
		menu_0.add(num_dev);
		
		JButton num_4 = new JButton("4");
		num_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_4.getText());
			}
		});
		num_4.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_4.setBounds(12, 212, 96, 96);
		menu_0.add(num_4);
		
		JButton num_5 = new JButton("5");
		num_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_5.getText());
			}
		});
		num_5.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_5.setBounds(118, 212, 96, 96);
		menu_0.add(num_5);
		
		JButton num_6 = new JButton("6");
		num_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_6.getText());
			}
		});
		num_6.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_6.setBounds(224, 212, 96, 96);
		menu_0.add(num_6);
		
		JButton num_multi = new JButton("*");
		num_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_multi.getText());
			}
		});
		num_multi.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_multi.setBounds(330, 212, 96, 96);
		menu_0.add(num_multi);
		
		JButton num_1 = new JButton("1");
		num_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_1.getText());
				
			}
		});
		num_1.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_1.setBounds(12, 320, 96, 96);
		menu_0.add(num_1);
		
		JButton num_2 = new JButton("2");
		num_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_2.getText());
			}
		});
		num_2.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_2.setBounds(118, 320, 96, 96);
		menu_0.add(num_2);
		
		JButton num_3 = new JButton("3");
		num_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_3.getText());
			}
		});
		num_3.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_3.setBounds(224, 320, 96, 96);
		menu_0.add(num_3);
		
		JButton num_minus = new JButton("-");
		num_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_minus.getText());
			}
		});
		num_minus.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_minus.setBounds(330, 320, 96, 96);
		menu_0.add(num_minus);
		
		JButton num_0 = new JButton("0");
		num_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_0.getText());
			}
		});
		num_0.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_0.setBounds(12, 425, 96, 96);
		menu_0.add(num_0);
		
		JButton num_e = new JButton("=");
		num_e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_caluar(num_e.getText());
			}
		});
		num_e.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_e.setBounds(224, 425, 96, 96);
		menu_0.add(num_e);
		
		JButton num_plus = new JButton("+");
		num_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_event(num_plus.getText());
//				btn_caluar(num_plus.getText());
			}
		});
		num_plus.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 20));
		num_plus.setBounds(330, 425, 96, 96);
		menu_0.add(num_plus);
		
		JButton num_c = new JButton("c");
		num_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				lblNewLabel.setText("0");
				btn_caluar(num_c.getText());
			}
		});
		num_c.setFont(new Font("¸¼Àº °íµñ Semilight", Font.BOLD, 25));
		num_c.setBounds(118, 425, 96, 96);
		menu_0.add(num_c);
		
	}
	void btn_event(String text) {

//		nInput += text;
//		String temp = lblNewLabel.getText();
		if(!lblNewLabel.getText().equals("0")) {
			
			lblNewLabel.setText(lblNewLabel.getText()+text);
//			String num = lblNewLabel.getText();
//			String commaNum = NumberFormat.getInstance().format(Integer.parseInt(num));
			
			
		}else {
			lblNewLabel.setText(text);
		}
//		Long preAmount = Long.parseLong(lblNewLabel.getText()+text);
//		DecimalFormat format = new DecimalFormat("###,###"); //º¯È¯ÇÒ Format ÁöÁ¤
//		String parseAmount = format.format(preAmount);
//		System.out.println(parseAmount);
//		String t  = lblNewLabel.getText().replace(",", "");
//		long number = Long.parseLong(t);
//		String p = String.format("%,d", number);
//		lblNewLabel.setText(p);
//		System.out.println(p);
//		String commaNum = NumberFormat.getInstance().format(lblNewLabel.getText()+text);
//		lblNewLabel.setText(commaNum);
//		System.out.println(p);
//		System.out.println(p);
//		lblNewLabel.setText(lblNewLabel.getText().concat(text));
//		System.out.println(nInput);	
	}
//	String t = "";
	
	void btn_caluar(String text) {
//		System.out.println(text);
		switch (text) {
		case "c": 
//			System.out.println(text);
			lblNewLabel.setText("0");
			break;
		case "=":
			if(lblNewLabel.getText().contains("+")) {
				String[] num = lblNewLabel.getText().split("\\+");
				num_1 = num[0];
				num_2 = num[1];
				int n1 = Integer.parseInt(num_1);
				int n2 = Integer.parseInt(num_2);
				lblNewLabel.setText((n1+n2)+"");
			}
			else if(lblNewLabel.getText().contains("*")) {
				String[] num = lblNewLabel.getText().split("\\*");
				num_1 = num[0];
				num_2 = num[1];
				int n1 = Integer.parseInt(num_1);
				int n2 = Integer.parseInt(num_2);
				lblNewLabel.setText((n1*n2)+"");
			}
			else if(lblNewLabel.getText().contains("/")) {
				String[] num = lblNewLabel.getText().split("*");
				num_1 = num[0];
				num_2 = num[1];
				int n1 = Integer.parseInt(num_1);
				int n2 = Integer.parseInt(num_2);
				lblNewLabel.setText((n1/n2)+"");
			}
			else if(lblNewLabel.getText().contains("-")) {
				String[] num = lblNewLabel.getText().split("-");
				num_1 = num[0];
				num_2 = num[1];
				int n1 = Integer.parseInt(num_1);
				int n2 = Integer.parseInt(num_2);
				lblNewLabel.setText((n1-n2)+"");
			}
			break;
		}
		String t  = lblNewLabel.getText().replace(",", "");
		long number = Long.parseLong(t);
		String p = String.format("%,d", number);
		lblNewLabel.setText(p);
	}
	
}
