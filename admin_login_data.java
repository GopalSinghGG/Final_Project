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
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class admin_login_data {

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
					admin_login_data window = new admin_login_data();
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
	public admin_login_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTukfsdtgdf = new JFrame();
		frmTukfsdtgdf.getContentPane().setBackground(new Color(218, 165, 32));
		frmTukfsdtgdf.setBounds(100, 100, 756, 497);
		frmTukfsdtgdf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTukfsdtgdf.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(39, 72, 664, 364);
		frmTukfsdtgdf.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("G:\\Download\\login_logo2 (1) (1).png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(9, 0, 341, 364);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setBounds(355, -1, 308, 371);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Admin Login");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(88, 22, 141, 34);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(112, 128, 144));
		panel_2.setBounds(45, 123, 233, 34);
		panel_1.add(panel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(44, 0, 189, 34);
		panel_2.add(textField);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Project _Image\\user_icon.png"));
		lblNewLabel_3.setBounds(10, 4, 30, 28);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(112, 128, 144));
		panel_2_1.setBounds(45, 194, 233, 34);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("D:\\Project _Image\\lock_icon.png"));
		lblNewLabel_3_1.setBackground(new Color(119, 136, 153));
		lblNewLabel_3_1.setBounds(9, 6, 23, 23);
		panel_2_1.add(lblNewLabel_3_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(44, 0, 189, 34);
		panel_2_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(29, 301, 106, 39);
		panel_1.add(btnNewButton);
		
		JButton btnCencel = new JButton("Cancel");
		btnCencel.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnCencel.setBackground(Color.YELLOW);
		btnCencel.setBounds(172, 301, 106, 39);
		panel_1.add(btnCencel);
		
		JLabel lblNewLabel_4 = new JLabel("Forget Password?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(166, 239, 115, 23);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME  ADMIN  !");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(247, 14, 227, 42);
		frmTukfsdtgdf.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTukfsdtgdf.dispose();
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon("D:\\Project _Image\\cross_sign (1)s.png"));
		lblNewLabel_5.setBounds(658, 14, 30, 34);
		frmTukfsdtgdf.getContentPane().add(lblNewLabel_5);
	}
}
