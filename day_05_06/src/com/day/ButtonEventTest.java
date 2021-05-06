package com.day;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ButtonEventTest implements ActionListener {
	JTextField input = null;
	String s = "";
	String[] sa = new String[1];
	boolean[] is_op = {};


	public ButtonEventTest(JTextField input) {
		this.input = input;
	}

	public ButtonEventTest(JTextField input, String s) {
		this.input = input;
		this.s = s;

	}

	public ButtonEventTest(JTextField input, String[] s) {
		this.input = input;
		this.sa = s;

	}
	public ButtonEventTest(JTextField input, boolean[] is_op) {
		this.input = input;
		this.is_op = is_op;

	}
	@Override
	public void actionPerformed(ActionEvent e) {

//		System.out.println(e.getActionCommand());
//		System.out.println(is_op[0]);
//		input.setText(e.getActionCommand());
		if (!input.getText().equals("0")) {
			if (is_op[0] == true) {
				input.setText(input.getText() + e.getActionCommand());
			} else {
				is_op[0] = true;
				input.setText(e.getActionCommand());
			}
		} else {
			input.setText(e.getActionCommand());
		}
//			if (!input.getText().equals("0")) {
//			if (sa[0] == null || sa[0].equals("")) {
//				input.setText(input.getText() + d);
//				
//			} else {
//				sa[0] = "";
//				input.setText(d);
//				
//			}
//		} else {
//			input.setText(d);
//		}
//		

	}

}
