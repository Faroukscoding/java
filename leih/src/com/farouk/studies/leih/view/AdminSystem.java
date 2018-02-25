package com.farouk.studies.leih.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;


public class AdminSystem extends HauptSystem {

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JComboBox<String> comboBox;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSystem frame = new AdminSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	String Titel[]= new String[] {
			"User_ID","Passwort","Vorname","Nachname","Funktion"
	};

	/**
	 * Create the frame.
	 */
	public AdminSystem() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("AdminSystem");
		setBounds(100, 100, 450, 300);
		setSize(800,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 219, 233, 279);
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(119, 122, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 74, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 33, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 169, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_1 = new JLabel("User_ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 36, 60, 14);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Passwort");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 77, 74, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Vorname");
		lblNewLabel_3.setBounds(10, 125, 60, 14);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Nachname");
		lblNewLabel_4.setBounds(10, 172, 74, 14);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Funktion");
		lblNewLabel_5.setBounds(10, 216, 60, 14);
		panel.add(lblNewLabel_5);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(119, 213, 86, 20);
		comboBox.addItem("Admin");
		comboBox.addItem("User");
		panel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Benutzer Daten");
		lblNewLabel.setBounds(10, 194, 124, 14);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(341, 219, 233, 279);
		panel_1.setLayout(null);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel_1);
		
		btnNewButton = new JButton("Einf\u00FCgen");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\ein.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(24, 32, 185, 23);
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Bearbeiten");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\bear.png"));
		btnNewButton_1.setBounds(24, 73, 185, 23);
		panel_1.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("L\u00F6schen");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\loeschen.png"));
		btnNewButton_2.setBounds(24, 121, 185, 23);
		panel_1.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("leeren");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\leeren.png"));
		btnNewButton_3.setBounds(24, 168, 185, 23);
		panel_1.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Aktualisieren");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\aktu.png"));
		btnNewButton_4.setBounds(24, 212, 185, 23);
		panel_1.add(btnNewButton_4);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 67, 564, 115);
		contentPane.add(scrollPane);
		
		
		
		table = new JTable(5,5);
		scrollPane.setViewportView(table);
		
		
		
		
	}
}
