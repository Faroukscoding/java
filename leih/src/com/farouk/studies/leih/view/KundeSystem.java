package com.farouk.studies.leih.view;


import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;


public class KundeSystem extends HauptSystem {

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
					KundeSystem frame = new KundeSystem();
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
	public KundeSystem() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("KundeSystem");
		setBounds(100, 100, 450, 300);
		setSize(800,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 71, 564, 115);
		contentPane.add(scrollPane);

		table = new JTable(5,5);
		scrollPane.setViewportView(table);
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 268, 233, 325);
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(119, 122, 86, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(119, 74, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 33, 86, 20);
		panel.add(textField_2);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVorname.setBounds(10, 36, 74, 14);
		panel.add(lblVorname);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNachname.setBounds(10, 77, 74, 14);
		panel.add(lblNachname);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 125, 60, 14);
		panel.add(lblEmail);
		
		JLabel lblGeburtsdatum = new JLabel("Geburtsdatum");
		lblGeburtsdatum.setBounds(10, 172, 99, 14);
		panel.add(lblGeburtsdatum);
	
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 219, 86, 20);
		panel.add(textField_3);
		
		JLabel lblPersonr = new JLabel("Perso_Nr");
		lblPersonr.setBounds(10, 222, 99, 14);
		panel.add(lblPersonr);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(341, 268, 233, 325);
		contentPane.add(panel_1);
		
		JButton btnEinfgen = new JButton("Einf\u00FCgen");
		btnEinfgen.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\ein.png"));
		btnEinfgen.setBounds(24, 28, 185, 23);
		panel_1.add(btnEinfgen);
		
		JButton button_1 = new JButton("Bearbeiten");
		button_1.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\bear.png"));
		button_1.setBounds(24, 73, 185, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("L\u00F6schen");
		button_2.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\loeschen.png"));
		button_2.setBounds(24, 118, 185, 23);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("leeren");
		button_3.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\leeren.png"));
		button_3.setBounds(24, 161, 185, 23);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("Aktualisieren");
		button_4.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\aktu.png"));
		button_4.setBounds(24, 204, 185, 23);
		panel_1.add(button_4);
		
		JButton btnNewButton = new JButton("Sperren");
		btnNewButton.setBounds(24, 238, 185, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Premium");
		btnNewButton_1.setBounds(24, 272, 185, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblKundedaten = new JLabel("Kunde_Daten");
		lblKundedaten.setForeground(Color.RED);
		lblKundedaten.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKundedaten.setBounds(10, 243, 113, 14);
		contentPane.add(lblKundedaten);
		
		
		
	}
}
