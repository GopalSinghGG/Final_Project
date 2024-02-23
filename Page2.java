 package MySql;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Page2 {

	private JFrame frmTukfsdtgdf;
	private JPasswordField passwordField;
	private JTextField txtEnterUsername;
	Connection_class obj=new Connection_class();
//	private static Placeolder PH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2 window = new Page2();
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
	public Page2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTukfsdtgdf = new JFrame();
		frmTukfsdtgdf.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frmTukfsdtgdf.getContentPane().setBackground(new Color(218, 165, 32));
		frmTukfsdtgdf.setBounds(100, 100, 756, 497);
		frmTukfsdtgdf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTukfsdtgdf.getContentPane().setLayout(null);
		frmTukfsdtgdf.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(39, 72, 664, 364);
		frmTukfsdtgdf.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(9, 0, 341, 364);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("G:\\Download\\login_logo2 (1) (1).png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(355, -1, 308, 371);
		panel_1.setBackground(new Color(0, 128, 0));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("User Login");
		lblNewLabel_2.setBounds(89, 19, 141, 34);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(45, 123, 233, 34);
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(112, 128, 144));
		panel_1.add(panel_2);
		
		txtEnterUsername = new JTextField();
		txtEnterUsername.setColumns(10);
		txtEnterUsername.setBounds(44, 0, 189, 34);
		panel_2.add(txtEnterUsername);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Project _Image\\user_icon.png"));
		lblNewLabel_3.setBounds(10, 4, 30, 28);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(45, 210, 233, 34);
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(112, 128, 144));
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
		btnNewButton.setBounds(29, 317, 106, 39);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=txtEnterUsername.getText();
				String password=passwordField.getText();
				if(name.equals("")||password.equals("")) {
					JOptionPane.showMessageDialog(null,"Please Fill All Details");
				}
				else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:33306/minor_project","root","");
						String query="select * from registration where name=? and password=? ";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1, name);
						ps.setString(2, password);
						ResultSet rs=ps.executeQuery();
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null,"Login Successfully..");
							frmTukfsdtgdf.dispose();
							new user_Home_r();
						}
						else {
							JOptionPane.showMessageDialog(null, "Invalid UserId or Password","Alert",JOptionPane.WARNING_MESSAGE);
							txtEnterUsername.setText("");
							passwordField.setText("");
							
						}
					}
					catch(NumberFormatException ne) {
						JOptionPane.showMessageDialog(null,"Please enter only number", "Alert",JOptionPane.WARNING_MESSAGE);
						
					}
					catch(Exception e1) {
						e1.printStackTrace();
//						JOptionPane.showMessageDialog(null, "Please Fill All Details..");
					}
				}
			
			}
		});
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnNewButton.setBackground(Color.YELLOW);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Forget Password?");
		lblNewLabel_4.setBounds(166, 255, 115, 23);
		lblNewLabel_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTukfsdtgdf.dispose();
				User_login br =new User_login();
				br.main(null);
			
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_4.setForeground(new Color(255,255,0));
				lblNewLabel_4.setOpaque(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_4.setForeground(new Color(0,0,0));
				lblNewLabel_4.setBackground(new Color(0,128,0));
				
				lblNewLabel_4.setOpaque(true);
			}
		});
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTukfsdtgdf.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setBounds(141, 317, 106, 39);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("User Name :-");
		lblNewLabel_7.setForeground(new Color(192, 192, 192));
		lblNewLabel_7.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_7.setBounds(46, 98, 100, 18);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Password :-");
		lblNewLabel_7_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_7_1.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblNewLabel_7_1.setBounds(47, 186, 100, 18);
		panel_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME  USER  !\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(247, 14, 200, 42);
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
		lblNewLabel_5.setBounds(647, 15, 30, 34);
		frmTukfsdtgdf.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Documents\\Images\\bk2.jpg"));
		lblNewLabel_6.setBounds(3, 0, 735, 460);
		frmTukfsdtgdf.getContentPane().add(lblNewLabel_6);
	}
}
