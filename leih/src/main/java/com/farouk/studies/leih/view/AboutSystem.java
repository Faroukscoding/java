package main.java.com.farouk.studies.leih.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class AboutSystem extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutSystem frame = new AboutSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutSystem() {
		setTitle("über_uns");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	
		
		TextArea textArea = new TextArea();
		contentPane.add(textArea, BorderLayout.SOUTH);
		textArea.setText("über uns \n\nLeih\n\nHochschule Ostwestfalen-Lippe \nFB 8, Umweltingenieurwesen und Angewandte Informatik\n\nBachelor Angewandte Informatik\nProjekt für Programmiersprachen 2 \n  \nVersion: Leih.1.0 \n  \n\nAutor:\nFarouk Rezgui - 15341020 \n \n\nBetreuer: Prof. Dr.rer.nat. Stefan Wolf\nWinter Semester 2017/2018\n\n\n 2017-2018 System´s GmbH. Alle Rechte vorbehalten.");
		
		JLabel lblLabel = new JLabel("");
		lblLabel.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\logo.png"));
		contentPane.add(lblLabel, BorderLayout.NORTH);
		
	}

}
