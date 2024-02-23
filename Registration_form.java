package MySql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import java.sql.*;

public class Registration_form {

	private JFrame frame3;
	private JTextField textfname;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JTextField textemail;
	private JLabel lblNewLabel_4;
	private JPasswordField password;
	private JLabel lblNewLabel_6;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel_7;
	private JTextField textaddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_form window = new Registration_form();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration_form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	void initialize() {
		frame3 = new JFrame();
		frame3.setTitle("Registration Form\r\n");
		frame3.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\GOPAL SINGH\\OneDrive\\Pictures\\login.png"));
		frame3.setBounds(100, 100, 756, 497);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(64, 0, 64));
		panel.setBounds(0, 0, 730, 458);
		frame3.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("NEW REGISTER");
		lblNewLabel.setBounds(249, 25, 161, 14);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		panel.add(lblNewLabel);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Accept Term and Condition");
		chckbxNewCheckBox.setBounds(85, 326, 188, 37);
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(128, 64, 0));
		panel.add(chckbxNewCheckBox);

		JButton rest = new JButton("Reset");
		rest.setBounds(324, 384, 89, 37);
		rest.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textfname.setText(null);
				
				textemail.setText(null);
				textaddress.setText(null);
				password.setText(null);

				chckbxNewCheckBox.setSelected(false);
				buttonGroup.clearSelection();
				

			}
		});
		rest.setBackground(new Color(0, 255, 0));
		panel.add(rest);

		textfname = new JTextField();
		textfname.setBounds(31, 96, 226, 28);
		panel.add(textfname);
		textfname.setColumns(10);

		lblNewLabel_1 = new JLabel("User name :-");
		lblNewLabel_1.setBounds(43, 71, 144, 14);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_1);

		lblNewLabel_3 = new JLabel("Email-id :-");
		lblNewLabel_3.setBounds(449, 71, 144, 14);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_3);

		textemail = new JTextField();
		textemail.setBounds(439, 96, 226, 28);
		textemail.setColumns(10);
		panel.add(textemail);

		lblNewLabel_4 = new JLabel("Password :-");
		lblNewLabel_4.setBounds(46, 152, 144, 14);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_4);

		password = new JPasswordField();
		password.setBounds(31, 177, 229, 28);
		panel.add(password);

		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(160, 8, 57, 52);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\OneDrive\\Pictures\\login icon.png"));
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_5_1 = new JLabel("Gender");
		lblNewLabel_5_1.setBounds(402, 167, 89, 32);
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_5_1);

		JRadioButton rbmale = new JRadioButton("Male");
		rbmale.setBounds(497, 170, 72, 23);
		buttonGroup.add(rbmale);
		panel.add(rbmale);

		JRadioButton rbfemale = new JRadioButton("Female");
		rbfemale.setBounds(575, 170, 89, 23);
		buttonGroup.add(rbfemale);
		panel.add(rbfemale);

		lblNewLabel_7 = new JLabel("Address :-");
		lblNewLabel_7.setBounds(360, 237, 89, 14);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel_7);

		textaddress = new JTextField();
		textaddress.setBounds(459, 226, 226, 67);
		textaddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textaddress.setHorizontalAlignment(SwingConstants.LEFT);
		textaddress.setColumns(10);
		panel.add(textaddress);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Option");
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1_1.setBounds(44, 249, 89, 32);
		panel.add(lblNewLabel_5_1_1);
		
		JRadioButton rbadmin = new JRadioButton("Admin");
		buttonGroup.add(rbadmin);
		rbadmin.setBounds(132, 254, 72, 23);
		panel.add(rbadmin);
		
		JRadioButton rbemployee = new JRadioButton("Employee");
		buttonGroup.add(rbemployee);
		rbemployee.setBounds(216, 254, 89, 23);
		panel.add(rbemployee);

		JButton sub = new JButton("Submit");
		sub.setBounds(163, 384, 89, 37);
		sub.setBackground(new Color(0, 255, 0));
		sub.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {
				
				if( textfname.equals("")||textemail.equals("")||password.equals("") || rbmale.equals(null)||rbfemale.equals(null)) {
					JOptionPane.showMessageDialog(sub, "Please Fill All Details");
					
				}else {
	
					sub.addMouseListener(new MouseAdapter(){
						@Override
						public void mouseClicked(MouseEvent e) {
							if(JOptionPane.showConfirmDialog(null, " Are you sure ?","Confirmation",JOptionPane.YES_NO_OPTION)==0) {
								try {
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33306/employee", "root", "");
									String query = "insert into data values(?,?,?,?,?,?)";
									PreparedStatement ps = con.prepareStatement(query);
									ps.setString(1, textfname.getText());
									
									ps.setString(2, textemail.getText());
									ps.setString(3, password.getText());
									if (rbmale.isSelected()) {
										ps.setString(4, rbmale.getText());

									} else {
										ps.setString(4, rbfemale.getText());
									}
									
									if (rbadmin.isSelected()) {
										ps.setString(5, rbadmin.getText());

									} else {
										ps.setString(5, rbemployee.getText());
									}
									ps.setString(6, textaddress.getText());
									int i = ps.executeUpdate();
									JOptionPane.showMessageDialog(sub, i + " Record Successfully Added..");
									ps.close();
									con.close();
								}

								catch (Exception e1) {
									e1.printStackTrace();
									JOptionPane.showMessageDialog(sub, "Some Error occured Please Try Again..");
								}
							}
			          }
		});
				}
			  }
					});
			
		panel.add(sub);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(10, 8, 85, 31);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				frame3.dispose();
				new user_Home_r();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Downloads\\Back image.png"));
		panel.add(btnNewButton);
		
				
				}
			}
			

//	public JTextField getTextField() {
//		return txtEnterName;
//	
