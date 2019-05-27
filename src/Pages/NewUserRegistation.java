package Pages;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewUserRegistation extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUserRegistation frame = new NewUserRegistation();
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
	public NewUserRegistation() {
		setBounds(0, 0, 1174, 668);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1158, 50);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New User");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(21, 25, 132, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sr. No.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 76, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(67, 75, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDate.setBounds(950, 77, 46, 14);
		getContentPane().add(lblDate);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1007, 76, 141, 20);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Type:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(379, 97, 36, 17);
		getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(520, 97, 206, 20);
		getContentPane().add(comboBox);
		
		JLabel lblUserName = new JLabel("User Name :");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setBounds(379, 126, 75, 17);
		getContentPane().add(lblUserName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(520, 125, 206, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(379, 155, 75, 17);
		getContentPane().add(lblPassword);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(520, 154, 206, 20);
		getContentPane().add(textField_3);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmPassword.setBounds(379, 184, 119, 17);
		getContentPane().add(lblConfirmPassword);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(520, 183, 206, 20);
		getContentPane().add(textField_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Security Access Permission", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(379, 213, 350, 188);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Master");
		chckbxNewCheckBox.setBounds(6, 19, 97, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxOne = new JCheckBox("One");
		chckbxOne.setBounds(6, 61, 97, 23);
		panel_1.add(chckbxOne);
		
		JCheckBox chckbxTwo = new JCheckBox("Two");
		chckbxTwo.setBounds(6, 103, 97, 23);
		panel_1.add(chckbxTwo);
		
		JCheckBox chckbxThree = new JCheckBox("Three");
		chckbxThree.setBounds(6, 145, 97, 23);
		panel_1.add(chckbxThree);
		
		JCheckBox chckbxFour = new JCheckBox("Four");
		chckbxFour.setBounds(116, 19, 97, 23);
		panel_1.add(chckbxFour);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(167, 428, 981, 60);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton button = new JButton("Save");
		button.setIcon(new ImageIcon(NewUserRegistation.class.getResource("/ImageButtonIcon/Save.png")));
		button.setHorizontalAlignment(SwingConstants.LEADING);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(51, 11, 115, 38);
		panel_2.add(button);
		
		JButton button_1 = new JButton("Edit");
		button_1.setIcon(new ImageIcon(NewUserRegistation.class.getResource("/ImageButtonIcon/edit.png")));
		button_1.setToolTipText("");
		button_1.setHorizontalAlignment(SwingConstants.LEADING);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(176, 11, 126, 38);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("Delete");
		button_2.setIcon(new ImageIcon(NewUserRegistation.class.getResource("/ImageButtonIcon/delete.jpg")));
		button_2.setHorizontalAlignment(SwingConstants.LEADING);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(312, 11, 115, 38);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("Reset");
		button_3.setIcon(new ImageIcon(NewUserRegistation.class.getResource("/ImageButtonIcon/Reset5.jpg")));
		button_3.setHorizontalAlignment(SwingConstants.LEADING);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBounds(437, 11, 115, 38);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("Exit");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome.panelDashboardallComp.isShowing();
				dispose();
				 
				
			}
		});
		button_4.setIcon(new ImageIcon(NewUserRegistation.class.getResource("/ImageButtonIcon/Exit.png")));
		button_4.setHorizontalAlignment(SwingConstants.LEADING);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBounds(562, 11, 115, 38);
		panel_2.add(button_4);

	}
}
