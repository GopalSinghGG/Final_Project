package MySql;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class user_Home_r {

	private JFrame frame;
	Runtime r=Runtime.getRuntime();
	Thread t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user_Home_r window = new user_Home_r();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//	CardLayout cardlayout;
	/**
	 * Create the application.
	 */
	public user_Home_r() {
		
		
		initialize();
//		cardlayout =(CardLayout)(frame.getLayout())
		
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		
//		frame.getContentPane().setBackground(new Color(255, 255, 255));
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 206, 209));
		panel.setBounds(0, 0, 1366, 48);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("DIGITAL INDIA");
		lblNewLabel_5.setBounds(36, -11, 321, 70);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(new Color(255, 0, 51));
		lblNewLabel_5.setFont(new Font("Segoe Print", Font.BOLD, 40));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(730, 4, 197, 37);
		comboBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setForeground(new Color(0, 0, 255));
		comboBox.setFont(new Font("Segoe Print", Font.BOLD, 24));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" Select", "AGRA", "BANGLURU", "DELHI", "LUCKNOW", "MUMBAI"}));
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(936, 4, 115, 35);
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("AGRA")) {
					frame.dispose();
					new Agra();
				
				}
				else if(comboBox.getSelectedItem().equals("MUMBAI")) {
					frame.dispose();
					Mumbai obj= new Mumbai();
					obj.main(null);
				}
				else if(comboBox.getSelectedItem().equals("BANGLURU")) {
					frame.dispose();
					new Bengluru();
				}
				else if(comboBox.getSelectedItem().equals("DELHI")) {
					frame.dispose();
					Delhi obj=new Delhi();
					obj.main(null);
				}
				else if(comboBox.getSelectedItem().equals("LUCKNOW")) {
					frame.dispose();
					Lucknow obj=new Lucknow();
					obj.main(null);
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 20));
		panel.add(btnNewButton);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(1206, 6, 130, 35);
		btnLogout.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Documents\\Images\\logout.png"));
		btnLogout.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res=JOptionPane.showConfirmDialog(null,"Please Confirm ", "Select Option",JOptionPane.YES_NO_CANCEL_OPTION);
				if(res==JOptionPane.YES_OPTION){
					frame.dispose();
					new Website_home_page();
				}
				
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnLogout.setBackground(Color.BLACK);
		panel.add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("SELECT YOUR CITY \r\n");
		lblNewLabel.setBounds(442, 6, 263, 33);
		lblNewLabel.setForeground(new Color(199, 21, 133));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(1310, 0, 376, 573);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(1002, 55, 350, 573);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("THE SMART CITY");
		lblNewLabel_3_1.setBounds(348, 76, 243, 36);
		lblNewLabel_3_1.setForeground(new Color(0, 0, 200));
		lblNewLabel_3_1.setFont(new Font("Segoe Print", Font.BOLD, 22));
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("<html>The Smart City have many smart<br>cities with more information and<br>technologies. This Information and<br>Technologies are helps the new <br>user in many fields. We provides <br>proper guidance, way, and help to<br>many other fields.</html>");
		lblNewLabel_4.setBounds(310, 116, 330, 291);
		lblNewLabel_4.setFont(new Font("Segoe Print", Font.BOLD, 19));
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(461, 447, 113, 29);
		panel_2.setBackground(new Color(0, 0, 139));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Know More ");
		lblNewLabel_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String str[] =new String[] {"C:\\\\Program Files\\\\Google\\\\Chrome\\\\Application\\\\chrome.exe",  "https://smartcities.gov.in/"};
		            r.exec(str);
		          
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_6.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(10, 0, 105, 29);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Downloads\\home.jpg"));
		lblNewLabel_1.setBounds(0, 30, 1350, 707);
		panel_1.add(lblNewLabel_1);
	}
}
