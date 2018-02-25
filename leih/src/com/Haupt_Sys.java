package com;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;




public class Haupt_Sys extends JFrame implements Runnable{

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private TimerThread timerThread;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Haupt_Sys frame = new Haupt_Sys();
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
	public Haupt_Sys() {

		setTitle("Haupt_Sys");
		setSize(800,600);
		setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JMenuBar menu = new JMenuBar();

		JMenu datei = new JMenu("DATEI     ");
		JMenuItem zu = new JMenuItem("SCHLIESEN");
		datei.add(zu);
		menu.add(datei);

		JMenu benutzer = new JMenu("Benutzer     ");
		menu.add(benutzer);
		JMenuItem list = new JMenuItem("List der Benutzer");
		benutzer.add(list);
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Sys abc = new Admin_Sys();
                contentPane.add(abc);
				abc.setVisible(true);
			}});
	
		
		

		JMenu autos = new JMenu("AUTOS     ");
		
		JMenuItem neua = new JMenuItem("Neu auto");
		autos.add(neua);
		JMenuItem autoa = new JMenuItem("Autos aufrufen");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		autoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Auto_Sys a = new Auto_Sys();
                contentPane.add(a);
				a.setVisible(true);
			}});
		autos.add(autoa);
		menu.add(autos);
		
		

		JMenu vr = new JMenu("Verträge     ");
		menu.add(vr);

		JMenu kn = new JMenu("Kunden     ");
		JMenuItem gk = new JMenuItem("gesperrter Kunde");
		
		gk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kunde_Sys abc= new Kunde_Sys();
				abc.setVisible(true);
			}});
		
		

		kn.add(gk);
		menu.add(kn);

		JMenu hl = new JMenu("Hilfe");
		

		JMenuItem hll = new JMenuItem("Über Leihsoftware Hilfe");
		hll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About_Sys win = new About_Sys();
				win.setVisible(true);
				
				
				
			}
		});
		hl.add(hll);
		menu.add(hl);
		this.setJMenuBar(menu);

		this.setVisible(true);

		JStatusBar statusBar = new JStatusBar();
		statusBar.setBounds(5, 661, 1352, 18);
		JLabel leftLabel = new JLabel("Benutzer : ");
		statusBar.setLeftComponent(leftLabel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setHorizontalAlignment(JLabel.CENTER);
		statusBar.addRightComponent(dateLabel);

		final JLabel timeLabel = new JLabel();
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		statusBar.addRightComponent(timeLabel);
		contentPane.setLayout(null);

		contentPane.add(statusBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Farouk D\\eclipse-workspace\\leih\\src\\com\\auto.png"));
		lblNewLabel.setBounds(691, 11, 666, 639);
		contentPane.add(lblNewLabel);


		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				exitProcedure();
			}
		});

		TimerThread timerThread = new TimerThread(dateLabel, timeLabel);
		timerThread.start();

		this.setVisible(true);
	}

	public void exitProcedure() {
		timerThread = null;
		timerThread.setRunning(false);
		System.exit(0);
	}
	public void JMenuItemActionPerformed() {
		About_Sys a = new About_Sys();
		a.setVisible(true);
	}
		
		
	public class TimerThread extends Thread {

        protected boolean isRunning;

        protected JLabel dateLabel;
        protected JLabel timeLabel;
        Locale locale = new Locale("de" , "DE");
        protected SimpleDateFormat dateFormat = 
                new SimpleDateFormat("EEE, d MMM yyyy",Locale.GERMAN);
        protected SimpleDateFormat timeFormat =
                new SimpleDateFormat("kk:mm ",Locale.GERMAN);
      
       


        public TimerThread(JLabel dateLabel, JLabel timeLabel) {
            this.dateLabel = dateLabel;
            this.timeLabel = timeLabel;
            this.isRunning = true;
        }


        @Override
        public void run() {
            while (isRunning) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        Calendar currentCalendar = Calendar.getInstance();
                        Date currentTime = currentCalendar.getTime();
                        dateLabel.setText(dateFormat.format(currentTime));
                        timeLabel.setText(timeFormat.format(currentTime));
                    }
                });

                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                }
            }
        }

        public void setRunning(boolean isRunning) {
            this.isRunning = isRunning;
        }

    }

	@Override
	public void run() {

	}
		

		
	}


