package MySql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page3 {

	private JFrame frmTukfsdtgdf;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page3 window = new Page3();
					window.frmTukfsdtgdf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Page3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTukfsdtgdf = new JFrame();
		frmTukfsdtgdf.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frmTukfsdtgdf.getContentPane().setBackground(new Color(218, 165, 32));
		Dimension screen =Toolkit.getDefaultToolkit().getScreenSize();
		frmTukfsdtgdf.setSize(screen.width,screen.height);
		frmTukfsdtgdf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTukfsdtgdf.getContentPane().setLayout(null);
		frmTukfsdtgdf.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(76, 83, 1180, 563);
		frmTukfsdtgdf.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("G:\\Download\\login_logo2 (1).png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(154, 0, 522, 552);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setBounds(748, 0, 432, 563);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Admin Login");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(129, 91, 141, 34);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(112, 128, 144));
		panel_2.setBounds(85, 195, 233, 34);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(44, 0, 189, 34);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 4, 30, 28);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Project _Image\\user_icon.png"));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(112, 128, 144));
		panel_2_1.setBounds(85, 266, 233, 34);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBackground(new Color(119, 136, 153));
		lblNewLabel_3_1.setIcon(new ImageIcon("D:\\Project _Image\\lock_icon.png"));
		lblNewLabel_3_1.setBounds(9, 6, 23, 23);
		panel_2_1.add(lblNewLabel_3_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(44, 0, 189, 34);
		panel_2_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnNewButton.setBounds(69, 373, 106, 39);
		panel_1.add(btnNewButton);
		
		JButton btnCencel = new JButton("Cancel");
		btnCencel.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnCencel.setBackground(new Color(255, 255, 0));
		btnCencel.setBounds(212, 373, 106, 39);
		panel_1.add(btnCencel);
		
		JLabel lblNewLabel_4 = new JLabel("Forget Password?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(206, 311, 115, 23);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME  ADMIN\r\n");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(525, 18, 227, 42);
		frmTukfsdtgdf.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon("D:\\Project _Image\\arro2.JPG"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTukfsdtgdf.dispose();
				new Website_home_page();
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(93, 11, 54, 38);
		frmTukfsdtgdf.getContentPane().add(btnNewButton_1);
	}
}
