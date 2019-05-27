package Pages;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Setting extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setting frame = new Setting();
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
	public Setting() {
		setBounds(0, 0, 1174, 668);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 142, 222);
		getContentPane().add(panel);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 0, 122, 169);
		panel.add(label);
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewUserRegistation s=new NewUserRegistation();
				javax.swing.plaf.InternalFrameUI ifu= s.getUI();
				((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null); 
				 s.setBorder(null);
				 Welcome.panel_insideall.removeAll();
				 Welcome.panel_insideall.add(s);
				 s.setVisible(true);
			}
		});
		btnNewUser.setForeground(Color.WHITE);
		btnNewUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewUser.setBackground(Color.BLUE);
		btnNewUser.setBounds(0, 170, 142, 52);
		panel.add(btnNewUser);

	}
}
