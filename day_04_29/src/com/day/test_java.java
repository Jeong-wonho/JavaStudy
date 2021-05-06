package com.day;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;

public class test_java {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test_java window = new test_java();
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
	public test_java() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 512, 772); //(가로, 세로, 가로크기, 세로크기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(152, 251, 152));
		panel.setBackground(new Color(50, 205, 50));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setRowHeaderView(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		scrollPane.setViewportView(layeredPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(12, 71, 120, 117);
		layeredPane.add(desktopPane);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(12, 224, 120, 117);
		layeredPane.add(desktopPane_1);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBounds(12, 395, 120, 117);
		layeredPane.add(desktopPane_2);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBounds(12, 556, 120, 117);
		layeredPane.add(desktopPane_3);
		
		JDesktopPane desktopPane_4 = new JDesktopPane();
		desktopPane_4.setBounds(322, 71, 120, 117);
		layeredPane.add(desktopPane_4);
		
		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBounds(322, 224, 120, 117);
		layeredPane.add(desktopPane_5);
		
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBounds(322, 395, 120, 117);
		layeredPane.add(desktopPane_6);
		
		JDesktopPane desktopPane_7 = new JDesktopPane();
		desktopPane_7.setBounds(322, 556, 120, 117);
		layeredPane.add(desktopPane_7);
	}
}
