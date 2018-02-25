package com.farouk.studies.leih.view;

import com.farouk.studies.leih.service.Connecter;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class LoginSystem extends JFrame {
  


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUserid;
	private JPasswordField passwordField;
	private JLabel lblUserid;
	private JLabel lblPasswort;
	private JButton btnAbbrechen;
	
     
	Connection conn=null;
	ResultSet RS=null;
	PreparedStatement PST=null;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem frame = new LoginSystem();
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
	public LoginSystem() {
		
		conn = Connecter.ConnecDB();
		
		
		setTitle("LoginSystem");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setSize(405,300);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\logo.png"));
		lblNewLabel.setBounds(10, 0, 414, 54);
		contentPane.add(lblNewLabel);
		
		
		txtUserid = new JTextField();
		txtUserid.setBounds(135, 100, 128, 20);
		contentPane.add(txtUserid);
		txtUserid.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 140, 128, 20);
		contentPane.add(passwordField);
		
		
		lblUserid = new JLabel("User_ID");
		lblUserid.setBounds(24, 100, 46, 14);
		contentPane.add(lblUserid);
		
		lblPasswort = new JLabel("Passwort");
		lblPasswort.setBounds(24, 140, 100, 14);
		contentPane.add(lblPasswort);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					String sql="select * from leih.user where iduser=? and passuser=?";
					PST=conn.prepareStatement(sql);
					PST.setString(1, txtUserid.getText());
					PST.setString(2, passwordField.getText());
					RS=PST.executeQuery();
					if(RS.next()) {
						dispose();
						new HauptSystem().setVisible(true);
						
					}else {
							JOptionPane.showMessageDialog(null, "USER AND PASSWORD IS FALSE");
							}
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		
		
		btnLogin.setBounds(24, 237, 128, 23);
		contentPane.add(btnLogin);
		
		btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnAbbrechen.setBounds(248, 237, 128, 23);
		contentPane.add(btnAbbrechen);
		
		
	
	}
}
