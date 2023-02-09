package com.jdbc.executableFile;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SelectingImageUsingSwing extends JFrame {

	private JPanel contentPane;
	private JLabel txtChooseTheImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectingImageUsingSwing frame = new SelectingImageUsingSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//need to learn swing with eclipse
	
	/**
	 * Create the frame.
	 */
	public SelectingImageUsingSwing() {
		setBackground(new Color(0, 255, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,400,400,400);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		txtChooseTheImage = new JLabel();
		txtChooseTheImage.setVerticalAlignment(SwingConstants.TOP);
		txtChooseTheImage.setHorizontalAlignment(SwingConstants.LEFT);
		txtChooseTheImage.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		txtChooseTheImage.setText("Choose the image");
		contentPane.add(txtChooseTheImage);
		
		JButton btnNewButton = new JButton("Select File");
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
	}

}
