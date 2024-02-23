package MySql;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.SwingConstants;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Registration {

	private JFrame frame;
	private JTextField name;
	private JTextField email;
	private JPasswordField pass;
	private JTextField mobile;
	private JComboBox city;
	private JPasswordField cpass;
	private JComboBox country;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 192));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(333, 13, 1021, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(111, 53, 1141, 630);
		panel.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(579, 9, 552, 613);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name ");
		lblNewLabel_1.setBounds(27, 123, 91, 27);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(27, 160, 185, 27);
		panel_1.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email-id");
		lblNewLabel_1_1.setBounds(320, 123, 91, 27);
		lblNewLabel_1_1.setFont(new Font("Segoe Print", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1_1);
		
		email = new JTextField();
		email.setBounds(320, 160, 185, 27);
		email.setColumns(10);
		panel_1.add(email);
		
		JLabel lblNewLabel_1_2 = new JLabel("Passward");
		lblNewLabel_1_2.setBounds(27, 201, 91, 27);
		lblNewLabel_1_2.setFont(new Font("Segoe Print", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1_2);
		
		pass = new JPasswordField();
		pass.setBounds(27, 239, 185, 27);
		panel_1.add(pass);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Confirm Password");
		lblNewLabel_1_2_1.setBounds(320, 198, 169, 27);
		lblNewLabel_1_2_1.setFont(new Font("Segoe Print", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Country");
		lblNewLabel_1_2_2.setBounds(27, 277, 91, 27);
		lblNewLabel_1_2_2.setFont(new Font("Segoe Print", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Gender");
		lblNewLabel_1_2_1_1.setBounds(320, 285, 91, 27);
		lblNewLabel_1_2_1_1.setFont(new Font("Segoe Print", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JRadioButton rbmale = new JRadioButton("Male");
		buttonGroup.add(rbmale);
		rbmale.setBounds(320, 315, 76, 27);
		rbmale.setFont(new Font("Segoe Print", Font.BOLD, 14));
		panel_1.add(rbmale);
		
		JRadioButton rbfemale = new JRadioButton("Female");
		buttonGroup.add(rbfemale);
		rbfemale.setBounds(429, 317, 76, 27);
		rbfemale.setFont(new Font("Segoe Print", Font.BOLD, 14));
		panel_1.add(rbfemale);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("City");
		lblNewLabel_1_2_2_1.setBounds(27, 362, 91, 27);
		lblNewLabel_1_2_2_1.setFont(new Font("Segoe Print", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Mobile No.");
		lblNewLabel_1_2_2_1_1.setBounds(320, 362, 91, 27);
		lblNewLabel_1_2_2_1_1.setFont(new Font("Segoe Print", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1_2_2_1_1);
		
		mobile = new JTextField();
		mobile.setBounds(320, 400, 185, 27);
		mobile.setColumns(10);
		panel_1.add(mobile);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Accept Terms and Conditions");
		chckbxNewCheckBox.setBounds(110, 459, 301, 27);
		chckbxNewCheckBox.setFont(new Font("Segoe Print", Font.BOLD, 15));
		panel_1.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(name.getText().equals(null) || email.getText().equals(null)|| email.getText().equals(null)|| pass.getText().equals(null)|| cpass.getText().equals(null)|| country.getSelectedItem().equals(null)|| buttonGroup.isSelected(null)|| city.getSelectedItem().equals(null)|| email.getText().equals(null)|| pass.getText().equals(null)|| cpass.getText().equals(null) || mobile.getText().equals(null)|| email.getText().equals(null)|| pass.getText().equals(null)|| cpass.getText().equals(null)) {
					JOptionPane.showMessageDialog(null, "Please Fill All Details.. ");
				}
				else {
					
				
				if(pass.getText().equals(cpass.getText())) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:33306/minor_project","root","");
					String query="insert into registration values(?,?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,name.getText());
					ps.setString(2,email.getText());
					ps.setString(3,pass.getText());
					ps.setString(4,cpass.getText());
					ps.setString(5, country.getSelectedItem().toString());
					if(rbmale.isSelected()) {
						ps.setString(6,rbmale.getText());
					}else {
						ps.setString(6, rbfemale.getText());
					}
					ps.setString(7,city.getSelectedItem().toString());
					ps.setString(8, mobile.getText());
					 int i=ps.executeUpdate();
					 if(i>0) {
						 JOptionPane.showMessageDialog(null,"Registration Successfull..");
							frame.dispose();
							Website_home_page ob=new Website_home_page();
							ob.main(null);
					 }
					
						 
					 
//					name.setText(null);
//					email.setText(null);
//					pass.setText(null);
//					cpass.setText(null);
//					country.setSelectedItem(null);
//					buttonGroup.clearSelection();
//					city.setSelectedItem(null);
//					mobile.setText(null);
					
				   
				}
				
				catch(Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"Error Occured.. Please Try Again");
					
				}
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Password doesn't match","Alert",JOptionPane.WARNING_MESSAGE);
					pass.setText("");
					cpass.setText("");
				}
				}
				
				
				}
		});
		btnNewButton.setBounds(133, 548, 102, 34);
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText(null);
				email.setText(null);
				pass.setText(null);
				cpass.setText(null);
				country.setSelectedItem(null);
				buttonGroup.clearSelection();
				city.setSelectedItem(null);
				mobile.setText(null);
				chckbxNewCheckBox.setSelected(false);
			}
		});
		btnReset.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnReset.setBounds(299, 548, 102, 34);
		btnReset.setBackground(new Color(255, 0, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(btnReset);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(149, 22, 206, 45);
		panel_2.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    Registration");
		lblNewLabel.setBounds(10, 0, 189, 45);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 20));
		
		 city = new JComboBox();
		 city.setForeground(new Color(139, 0, 0));
		 city.setBackground(new Color(224, 255, 255));
		city.setBounds(27, 402, 185, 25);
		city.setFont(new Font("Segoe Print", Font.BOLD, 20));
		city.setModel(new DefaultComboBoxModel(new String[] {"Select", "Agra", "Bangluru", "Delhi", "Kanpur", "Mumbai"}));
		panel_1.add(city);
		
		cpass = new JPasswordField();
		cpass.setBounds(320, 242, 185, 27);
		panel_1.add(cpass);
		
	     country = new JComboBox();
		country.setBackground(new Color(224, 255, 255));
		country.setForeground(new Color(139, 0, 0));
		country.setModel(new DefaultComboBoxModel(new String[] {"Select", "India"}));
		country.setFont(new Font("Segoe Print", Font.BOLD, 20));
		country.setBounds(27, 320, 185, 25);
		panel_1.add(country);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1.setBounds(10, 9, 570, 613);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(-13, 47, 565, 445);
		panel_1_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Pictures\\registration form.JPG"));
		lblNewLabel_2.setBackground(new Color(0, 0, 160));
		
		JLabel lblNewLabel_3 = new JLabel(" Back");
		lblNewLabel_3.setBounds(25, 11, 98, 25);
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblNewLabel_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Website_home_page obj=new Website_home_page();
				obj.main(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_3.setForeground(new Color(255, 215, 0));
				lblNewLabel_3.setBackground(new Color(192, 192, 192));
				lblNewLabel_3.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_3.setForeground(new Color(0, 0, 128));
				lblNewLabel_3.setOpaque(false);
			}
			
		});
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Download\\Custom-Icon-Design-Flatastic-8-Go-back.24.png"));
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Documents\\Images\\bk.jpg"));
		lblNewLabel_4.setBounds(0, 0, 1370, 740);
		frame.getContentPane().add(lblNewLabel_4);
		
	}
}
