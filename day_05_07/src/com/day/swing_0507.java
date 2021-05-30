package com.day;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class swing_0507 {

	private JFrame frame;
	private JTextField textField;
	private boolean[] is_op = { true };
	boolean is_active;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing_0507 window = new swing_0507();
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
	public swing_0507() {
		initialize();
	}

	JPanel[] arrayPanel = null;
	JPanel currentPanel = null;
	JPanel panel = null;
	JPanel mainpanel = null;
	JPanel currentmainPanel = null;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(41, 100, 492, 681);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		mainPanel(); //�����г�
		menuPanel(); //�޴��г� => ���� �г� �ڽ����� 3���� �г��� ����
		
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel current = (mainpanel.isVisible())?mainpanel:panel;
				current.setVisible(!current.isVisible());
			}
		});
		btnNewButton.setBounds(26, 621, 91, 23);
		frame.getContentPane().add(btnNewButton);

	}
	
	void menuPanel() {
		mainpanel = new JPanel();
		mainpanel.setBackground(new Color(255, 218, 185));
		mainpanel.setBounds(0, 0, 478, 644);
		frame.getContentPane().add(mainpanel);
		mainpanel.setLayout(null);

		JPanel menu_a = new JPanel();
		menu_a.setBounds(20, 20, 450, 500);
		menu_a.setBackground(Color.GREEN);
		mainpanel.add(menu_a);
		menu_a.setLayout(null);

		JLabel menu_a_label = new JLabel("Menu_A");
		menu_a_label.setFont(new Font("D2Coding", Font.BOLD, 20));
		menu_a_label.setHorizontalAlignment(SwingConstants.CENTER);
		menu_a_label.setBounds(50, 71, 340, 119);
		menu_a.add(menu_a_label);

		JPanel menu_b = new JPanel();
		menu_b.setBounds(20, 20, 450, 500);
		menu_b.setBackground(Color.BLUE);
		mainpanel.add(menu_b);
		menu_b.setLayout(null);

		JLabel menu_b_label = new JLabel("Menu_B");
		menu_b_label.setFont(new Font("D2Coding", Font.BOLD, 20));
		menu_b_label.setHorizontalAlignment(SwingConstants.CENTER);
		menu_b_label.setBounds(50, 71, 340, 119);
		menu_b.add(menu_b_label);

		JPanel menu_c = new JPanel();
		menu_c.setBounds(20, 20, 450, 500);
		menu_c.setBackground(Color.YELLOW);
		mainpanel.add(menu_c);
		menu_c.setLayout(null);

		JLabel menu_c_label = new JLabel("Menu_C");
		menu_c_label.setFont(new Font("D2Coding", Font.BOLD, 20));
		menu_c_label.setHorizontalAlignment(SwingConstants.CENTER);
		menu_c_label.setBounds(50, 71, 340, 119);
		menu_c.add(menu_c_label);

		JButton btn_A = new JButton("btn_A");
		btn_A.setBounds(12, 537, 130, 64);
		mainpanel.add(btn_A);

		JButton btn_B = new JButton("btn_B");
		btn_B.setBounds(170, 537, 130, 64);
		mainpanel.add(btn_B);

		JButton btn_C = new JButton("btn_C");
		btn_C.setBounds(336, 537, 130, 64);
		mainpanel.add(btn_C);

		arrayPanel = new JPanel[] { menu_a, menu_b, menu_c};
		menu_a.setVisible(false);
		currentPanel = menu_b;
//		menu_b.setVisible(false);
		menu_c.setVisible(false);

		btn_A.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				for (int i = 0; i < arrayPanel.length; i++) {
//					if (arrayPanel[i].isVisible()) {
//						arrayPanel[i].setVisible(!arrayPanel[i].isVisible());
//						menu_a.setVisible(!menu_a.isVisible());
//						break;
//					}
//				}
//				currentPanel.isVisible();
				currentPanel.setVisible(!currentPanel.isVisible());
				currentPanel = menu_a;
				menu_a.setVisible(!menu_a.isVisible());
			}
		});

		btn_B.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				for (int i = 0; i < arrayPanel.length; i++) {
//					if (arrayPanel[i].isVisible()) {
//						arrayPanel[i].setVisible(!arrayPanel[i].isVisible());
//						menu_b.setVisible(!menu_b.isVisible());
//						break;
//					}
//				}
				currentPanel.setVisible(!currentPanel.isVisible());
				currentPanel = menu_b;
				menu_b.setVisible(!menu_b.isVisible());
			}
		});

		btn_C.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				for (int i = 0; i < arrayPanel.length; i++) {
//					if (arrayPanel[i].isVisible()) {
//						arrayPanel[i].setVisible(!arrayPanel[i].isVisible());
//						menu_c.setVisible(!menu_c.isVisible());
//						break;
//					}
//				}
				currentPanel.setVisible(!currentPanel.isVisible());
				currentPanel = menu_c;
				menu_c.setVisible(!menu_c.isVisible());
			}
		});

		// �޴��ϳ��� �г��� �ϳ���!

	}
	void mainPanel() {
		frame = new JFrame();
		frame.setBounds(41, 100, 492, 681);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(6, 19, 466, 596);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField("0");
		textField.setFont(new Font("D2Coding ligature", Font.PLAIN, 30));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(6, 6, 454, 76);
		panel.add(textField);
		textField.setColumns(10);

		/*
		 * numButton printing in JPanel
		 */
		createButton(panel);
		createNumOp(panel);

		panel.setVisible(true);
		
	}

	int p = 0;

	public int getP() {// ������ ���޼���
		return p;
	}

	public void setP(int p) { // ������ ����޼���
		this.p = p;
	}

//	String p = "";
//	
//	public String getP() {
//		return p;
//	}
//
//	public void setP(String p) {
//		this.p = p;
//	}	

	String op = ""; // ��Ģ������ ���� ����

	String getOp() { // +-*/ ������ ��� �޼���
		return op;
	}

	void setOp(String op) {// +, -, /, * �� �����ϴ� �޼���
//		System.out.println("getP:"+getP());
//		if(!getP().isBlank()) {
//			calculator();
//		}
//		setP(textField.getText());	

//		if (getP() != 0 && getOp()!=null) {
//			
//			calculator();
//			setP(0);
////		setP(Integer.parseInt(textField.getText()));
//		} else {
//			setP(Integer.parseInt(textField.getText()));
//		}

//		setP(Integer.parseInt(textField.getText()));
//		calculator();
//		setP(0);

//		System.out.println("op:" + op);

//		System.out.println("getP:" + getP());

		this.op = op; // �̰� ���� �ΰ� ������.?!

		calculator();
		setP(Integer.parseInt(textField.getText()));

		is_op[0] = false;

	}

	void calculator() { // = ������ Ŭ���� ��Ģ�����ڿ� �°� �ʵ尪�� �������� ������ ����� �ʵ忡 ����.
		switch (getOp()) {
		case "*":
			if (getP() == 0) {
				textField.setText(Integer.parseInt(textField.getText()) + "");
			} else {
//			textField.setText(Integer.parseInt(getP())*Integer.parseInt(textField.getText())+"");
				textField.setText(getP() * Integer.parseInt(textField.getText()) + "");
			}
			break;

		case "/":
			if (getP() == 0) {
				textField.setText(Integer.parseInt(textField.getText()) + "");
			} else {
//			textField.setText(Integer.parseInt(getP())/ Integer.parseInt(textField.getText())+"");
				textField.setText(getP() / Integer.parseInt(textField.getText()) + "");
			}
			break;

		case "+":
//			textField.setText(Integer.parseInt(getP())+ Integer.parseInt(textField.getText())+"");
			textField.setText(getP() + Integer.parseInt(textField.getText()) + "");

			break;

		case "-":
//			textField.setText(Integer.parseInt(getP())-Integer.parseInt(textField.getText())+"");
			textField.setText(getP() - Integer.parseInt(textField.getText()) + "");
			break;
		}
	}

	void createNumOp(JPanel panel) {

		String[] op = { "*", "/", "+", "-", "=", "c" };
		for (int i = 0; i < 6; i++) {
			JButton btn7 = new JButton(op[i]);
			btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
			if (i == 4) { // = ��ư �̺�Ʈ����!
				btn7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub

//						setOp("");
						calculator(); // ��Ģ���� �޼���
						setP(0);
						setOp("");

					}
				});
				btn7.setBounds(245, 450, 100, 100);
			} else if (i == 5) { // c��ư Ŭ���� ȣ��

				btn7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub

						setOp(""); // ��Ģ�����ʱ�ȭ
						setP(0); // ������ �ʱ�ȭ
						textField.setText("0");

					}
				});
				btn7.setBounds(135, 450, 100, 100);
			} else {
//				+ - * / ��ư �̺�Ʈ ����

				btn7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						setOp(e.getActionCommand()); // ��Ģ���� ������ ����

					}
				});
				btn7.setBounds(355, 120 + (110 * i), 100, 100);
			}
			btn7.setBackground(Color.WHITE);
			panel.add(btn7);
		}
	}

	void createButton(JPanel panel) {

		int[] nums = { 7, 8, 9, 4, 5, 6, 1, 2, 3, 0 };
		ButtonEventTest button = new ButtonEventTest(textField, is_op);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				JButton btn7 = new JButton(nums[i + (j * 3)] + "");
				btn7.addActionListener(button);
				btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
				btn7.setBackground(Color.WHITE);
				btn7.setBounds(25 + (110 * i), 120 + (110 * j), 100, 100);
				panel.add(btn7);
			}
		}
		JButton btn0 = new JButton(nums[9] + "");
		btn0.addActionListener(button);
		btn0.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(25 + (110 * 0), 120 + (110 * 3), 100, 100);
		panel.add(btn0);
	}
}
