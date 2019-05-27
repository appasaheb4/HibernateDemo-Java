package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import CLASS.CalculatorGUI;
import CLASS.Clock;


import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JDesktopPane;

public class Welcome {
	static JFrame frame;
	public Connection conn;
	public PreparedStatement ps;
	public PreparedStatement ps1;
	public PreparedStatement ps2;
	public ResultSet rs;
	public ResultSet rs1;
	public String path = null;
	public String path1 = null;
	public static JPanel panel_Dashboard;
	public static JPanel panel_Titleshow;
	public static JPanel panel_insideall;
	public static boolean color;
	public static JLabel lblLocation;
	public static JPanel panelDashboardallComp;

	

	/**
	 * Launch the application.ss
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
					panel_Dashboard.requestDefaultFocus();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws InterruptedException
	 */
	public Welcome() throws InterruptedException {
		initialize();
	}

	public static void call() {
		try {
			Welcome window = new Welcome();
			window.frame.setVisible(true);
		} catch (Exception ca) {
			System.out.println(ca.getMessage());
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws InterruptedException
	 */
	private void initialize() throws InterruptedException {
		frame = new JFrame();
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				int x=e.getXOnScreen();
				int y=e.getYOnScreen();
				lblLocation.setText("X:"+x+" "+"Y:"+y );
				
			}
		});
		
		

		frame.setBounds(100, 100, 1378, 740);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);

		JPanel panel_clock = new JPanel();
		panel_clock.setBorder(new LineBorder(new Color(0, 128, 0), 4));
		panel_clock.setBackground(Color.LIGHT_GRAY);
		panel_clock.setBounds(0, 0, 184, 207);
	
		Clock c_clock = new Clock();
		c_clock.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, Color.RED, Color.RED, Color.RED));
		c_clock.setForeground(Color.RED);
		c_clock.setBackground(Color.RED);
		c_clock.setBounds(10, 11, 164, 186);
		c_clock.setPreferredSize(new Dimension(100, 100));
		panel_clock.add(c_clock);
		c_clock.start();
		frame.getContentPane().add(panel_clock);
		panel_clock.setLayout(null);

		panel_Dashboard = new JPanel();
	
		panel_Dashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_Dashboard.setBackground(Color.BLACK);
		panel_Dashboard.setBounds(0, 206, 184, 608);
		frame.getContentPane().add(panel_Dashboard);
		panel_Dashboard.setLayout(null);

		JButton btnExit = new JButton("EXIT");
		btnExit.setIcon(new ImageIcon(Welcome.class.getResource("/ImageButtonIcon/exit44.png")));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setHorizontalAlignment(SwingConstants.LEADING);
		btnExit.setVerticalAlignment(SwingConstants.TOP);
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExit.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnExit.setForeground(Color.WHITE);
				btnExit.setBorderPainted(false);
			}
		});
		btnExit.setOpaque(false);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.setBounds(10, 51, 184, 36);
		btnExit.setMnemonic(KeyEvent.VK_X);
		panel_Dashboard.add(btnExit);

		JButton btnSettin = new JButton("SETTING");
		
		btnSettin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				Settingspage set = new Settingspage();
//				set.getContentPane().add(panel_allpages);
//				set.setUndecorated(true);
//				set.setVisible(true);
				// frame.disable();
			}
		});
		btnSettin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnSettin.setForeground(Color.green);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				btnSettin.setForeground(Color.WHITE);
				btnSettin.setBorderPainted(false);
			}
		});
		btnSettin.setVerticalAlignment(SwingConstants.TOP);
		btnSettin.setOpaque(false);
		btnSettin.setHorizontalAlignment(SwingConstants.LEADING);
		btnSettin.setForeground(Color.WHITE);
		btnSettin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSettin.setContentAreaFilled(false);
		btnSettin.setBorderPainted(false);
		btnSettin.setBounds(10, 21, 184, 25);
		btnSettin.setMnemonic(KeyEvent.VK_T);

		panel_Dashboard.add(btnSettin);

		panel_Titleshow = new JPanel();
		panel_Titleshow.setBounds(182, 0, 1186, 59);
		frame.getContentPane().add(panel_Titleshow);
		panel_Titleshow.setLayout(null);

		JButton btnNewButton = new JButton("X");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(1112, 0, 64, 55);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		panel_Titleshow.add(btnNewButton);

	

		JButton button_2 = new JButton("");
		button_2.setVisible(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalculatorGUI cl = new CalculatorGUI("Bank System");

				cl.setSize(400, 350);
				cl.setFocusable(true);
				cl.setLocation(830, 0);
				cl.setVisible(true);

			}
		});
		
		button_2.setOpaque(false);
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBounds(1040, 0, 64, 55);
		panel_Titleshow.add(button_2);
		
		 lblLocation = new JLabel("");
		lblLocation.setBounds(10, 0, 154, 14);
		panel_Titleshow.add(lblLocation);

		panel_insideall = new JPanel();
		panel_insideall.setLayout(null);
		panel_insideall.setBounds(194, 61, 1174, 668);
		frame.getContentPane().add(panel_insideall);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(112, 310, 1, 1);
		panel_insideall.add(desktopPane_1);
		
		panelDashboardallComp = new JPanel();
		panelDashboardallComp.setBounds(0, 0, 1164, 668);
		panel_insideall.add(panelDashboardallComp);
		panelDashboardallComp.setLayout(null);
		
				JPanel panel = new JPanel();
				panel.setBounds(10, 11, 142, 222);
				panelDashboardallComp.add(panel);
				panel.setLayout(null);
				panel.setBorder(new LineBorder(new Color(0, 0, 0)));
								
										JLabel label = new JLabel("");
										label.setBounds(10, 11, 122, 169);
										panel.add(label);
										label.setIcon(new ImageIcon(Welcome.class.getResource("/imageall/sett.png")));
										
												JButton btnAccount_1 = new JButton("Setting");
												btnAccount_1.setBounds(0, 176, 142, 46);
												panel.add(btnAccount_1);
												btnAccount_1.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
															Setting s=new Setting();
															javax.swing.plaf.InternalFrameUI ifu= s.getUI();
															((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null); 
															 s.setBorder(null);
															 panelDashboardallComp.show(false);
															 panel_insideall.add(s);
															 s.setVisible(true);

													}
												});
												btnAccount_1.setForeground(Color.WHITE);
												btnAccount_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
												btnAccount_1.setBackground(Color.BLUE);

	}
}
