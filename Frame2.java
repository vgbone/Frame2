package com.caveprogramming.spring.test.testprogress;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;

public class Frame2 {

	private JFrame frame;
	private Label lblMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
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
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnShowMessage = new JButton("Show Message");
		btnShowMessage.setBackground(Color.YELLOW);
		btnShowMessage.setBounds(181, 210, 103, 23);
		btnShowMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null, "Hi sexy, your are mine");
				lblMessage.setText("Hi sexy, your are mine forever!!!");
				
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnShowMessage);
		
		lblMessage = new Label("New label");
		lblMessage.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblMessage.setBackground(Color.RED);
		lblMessage.setBounds(47, 44, 173, 22);
		frame.getContentPane().add(lblMessage);
	}
}
