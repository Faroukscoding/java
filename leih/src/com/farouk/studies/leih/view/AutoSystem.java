package com.farouk.studies.leih.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class AutoSystem extends HauptSystem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutoSystem frame = new AutoSystem();
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
	public AutoSystem() {
		super();
	
		setBounds(100, 100, 450, 300);
		setSize(800,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 584, 640);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(10, 219, 233, 279);
		panel.add(panel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(119, 122, 86, 20);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(119, 74, 86, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 33, 86, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 169, 86, 20);
		panel_1.add(textField_3);
		
		JLabel lblAutoid = new JLabel("Auto_ID");
		lblAutoid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAutoid.setBounds(10, 36, 60, 14);
		panel_1.add(lblAutoid);
		
		JLabel label_1 = new JLabel("Passwort");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(10, 77, 74, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Vorname");
		label_2.setBounds(10, 125, 60, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Nachname");
		label_3.setBounds(10, 172, 74, 14);
		panel_1.add(label_3);
		
		JLabel lblVerfgbar = new JLabel("Verf\u00FCgbar");
		lblVerfgbar.setBounds(10, 216, 60, 14);
		panel_1.add(lblVerfgbar);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(119, 213, 86, 20);
		comboBox.addItem("Ja");
		comboBox.addItem("Nein");	
		panel_1.add(comboBox);
		
		JLabel lblAutoDaten = new JLabel("Auto Daten");
		lblAutoDaten.setForeground(Color.RED);
		lblAutoDaten.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAutoDaten.setBounds(10, 194, 124, 14);
		panel.add(lblAutoDaten);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(341, 219, 233, 279);
		panel.add(panel_2);
		
		JButton button = new JButton("Einf\u00FCgen");
		button.setBounds(24, 32, 185, 23);
		panel_2.add(button);
		
		JButton button_1 = new JButton("Bearbeiten");
		button_1.setBounds(24, 73, 185, 23);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("L\u00F6schen");
		button_2.setBounds(24, 121, 185, 23);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("leeren");
		button_3.setBounds(24, 168, 185, 23);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("Aktualisieren");
		button_4.setBounds(24, 212, 185, 23);
		panel_2.add(button_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 67, 564, 115);
		panel.add(scrollPane);
		
		table = new JTable(5,5);
		scrollPane.setViewportView(table);
	}

}
