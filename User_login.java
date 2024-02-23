package MySql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class User_login {
    
    public JFrame frame;
     public JTextField name;
    public JTextField email;
    private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_login window = new User_login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public User_login() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\GOPAL SINGH\\Pictures\\key small icon.png"));
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 800, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(159, 41, 490, 389);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reset\r\n Password");
		lblNewLabel.setBounds(125, 11, 265, 35);
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(105, 48, 285, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(180, 82, 290, 44);
		panel_1.setBackground(new Color(255, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		name = new JTextField();
		name.setForeground(new Color(0, 0, 0));
		name.setBounds(42, 0, 248, 44);
		panel_1.add(name);
		name.setBackground(new Color(255, 255, 255));
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\Download\\Oxygen-Icons.org-Oxygen-Places-user-identity.32.png"));
		lblNewLabel_1.setBounds(7, 0, 40, 44);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(180, 161, 290, 44);
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(255, 255, 255));
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(7, 0, 40, 44);
		panel_1_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(6, 0, 40, 44);
		panel_1_2.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Pictures\\key small icon.png"));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setBounds(6, 0, 40, 44);
		panel_1.add(lblNewLabel_1_1_1);
		
		email = new JTextField();
		email.setForeground(new Color(0, 0, 0));
		email.setColumns(10);
		email.setBackground(new Color(255, 255, 255));
		email.setBounds(42, 0, 248, 44);
		panel_1_2.add(email);
		
		JButton btnNewButton = new JButton("Set");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name1=name.getText();
				String email1=email.getText();
				String password1=password.getText();
				if(name1.equals("")|| email1.equals("") || password1.equals("")) {
					JOptionPane.showMessageDialog(null,"Please Fill All Details..");
				}else {
					
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:33306/minor_project","root","");
					String query="update registration set password =? where  email =? ";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,password1);
					ps.setString(2, email1);
					int i=ps.executeUpdate();
					if(i>0)
				    {
						JOptionPane.showMessageDialog(null," Recored Successfully Changed  !");
						frame.dispose();
						Website_home_page ob=new Website_home_page();
						ob.main(null);
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Admin-Id or Password","Alert",JOptionPane.WARNING_MESSAGE);
						name.setText("");
						password.setText("");
					}
					 
					
					
				}
				
				catch(NumberFormatException ne) {
					JOptionPane.showMessageDialog(null,"Please enter only number", "Alert",JOptionPane.WARNING_MESSAGE);
					
				}
				catch(Exception e1) {
					e1.printStackTrace();
//					JOptionPane.showMessageDialog(null, "Please Fill All Details..");
				}
			}
			}
		});
		btnNewButton.setBounds(111, 327, 88, 44);
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 20));
		panel.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCancel.setBounds(205, 327, 99, 44);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnCancel.setBackground(new Color(128, 128, 128));
		btnCancel.setFont(new Font("Segoe Print", Font.BOLD, 20));
		panel.add(btnCancel);
		
		JLabel lblNewLabel_3 = new JLabel("Name :-");
		lblNewLabel_3.setForeground(new Color(255, 128, 0));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(44, 88, 121, 34);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Email-id :-");
		lblNewLabel_3_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_3_1.setBackground(new Color(255, 128, 0));
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(43, 166, 130, 34);
		panel.add(lblNewLabel_3_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBackground(new Color(255, 255, 255));
		panel_1_2_1.setBounds(180, 237, 290, 44);
		panel.add(panel_1_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("D:\\Download\\Oxygen-Icons.org-Oxygen-Apps-preferences-desktop-user-password.32.png"));
		lblNewLabel_1_2_1.setBounds(7, 0, 40, 44);
		panel_1_2_1.add(lblNewLabel_1_2_1);
		
		password = new JPasswordField();
		password.setBounds(43, 0, 247, 44);
		panel_1_2_1.add(password);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("New Password :-");
		lblNewLabel_3_1_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_3_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBackground(new Color(255, 128, 0));
		lblNewLabel_3_1_1.setBounds(43, 243, 130, 34);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Documents\\Images\\bk3.jpg"));
		lblNewLabel_2.setBounds(0, 0, 790, 460);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		
	}
}
