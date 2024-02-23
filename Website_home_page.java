package MySql;


import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class Website_home_page {
	

	private JFrame frame;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Website_home_page window = new Website_home_page();
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
	public Website_home_page() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent e) {
			}
		});
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(1423,886);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
//		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(0, 0, 793, 151);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(-3, 187, 1373, 10);
		separator_1.setForeground(new Color(0, 0, 139));
		panel.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(-133, 190, 1503, 10);
		separator_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new About_us();
			}
		});
		separator_1_1.setForeground(new Color(0, 0, 139));
		panel.add(separator_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setBounds(1116, 21, 234, 140);
		lblNewLabel_1_1_2.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Downloads\\smart_cities2.png"));
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_11 = new JLabel(" Home");
		lblNewLabel_11.setBounds(12, 196, 82, 31);
		lblNewLabel_11.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				 new Website_home_page();
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_11.setForeground(new Color(0, 0, 128));
				
				
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_11.setForeground(new Color(0, 0, 0));
				
			}
		});
		lblNewLabel_11.setForeground(new Color(0, 0, 0));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(lblNewLabel_11);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setBounds(246, 196, 137, 31);
		lblRegistration.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblRegistration.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Registration();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblRegistration.setForeground(new Color(0,0,128));
				
			}
			
			public void mouseExited(MouseEvent e) {
				lblRegistration.setForeground(new Color(0, 0, 0));
				
			}
		});
		lblRegistration.setForeground(new Color(0, 0, 0));
		lblRegistration.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(lblRegistration);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setBounds(598, 196, 147, 31);
		lblAdminLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblAdminLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Page4 obj=new Page4();
				obj.main(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblAdminLogin.setForeground(new Color(0,0,128));
				
			}
			
			public void mouseExited(MouseEvent e) {
				lblAdminLogin.setForeground(new Color(0, 0, 0));
				
			}
		});
		lblAdminLogin.setForeground(new Color(0, 0, 0));
		lblAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(lblAdminLogin);
		
		JLabel lblUserLogin = new JLabel("User Login");
		lblUserLogin.setBounds(935, 196, 122, 31);
		lblUserLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblUserLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Page2 obj=new Page2();
				obj.main(null);
			
			}
			public void mouseEntered(MouseEvent e) {
				lblUserLogin.setForeground(new Color(0,0,128));
				
			}
			
			public void mouseExited(MouseEvent e) {
				lblUserLogin.setForeground(new Color(0, 0, 0));
				lblUserLogin.setOpaque(false);
			}
		});
		lblUserLogin.setForeground(new Color(0, 0, 0));
		lblUserLogin.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(lblUserLogin);
		
		JLabel lblNewLabel_6_1 = new JLabel("Contact Us");
		lblNewLabel_6_1.setBounds(1228, 194, 122, 31);
		lblNewLabel_6_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new About_us();
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_6_1.setForeground(new Color(0,0,128));
			
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_6_1.setForeground(new Color(0, 0, 0));
				
			}
		});
		lblNewLabel_6_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(lblNewLabel_6_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(0, 249, 1373, 10);
		separator_1_2.setForeground(new Color(0, 0, 139));
		panel.add(separator_1_2);
		
		 lblNewLabel = new JLabel("WELCOME TO SMART CITIES MISSION");
		 lblNewLabel.setBounds(367, 65, 643, 63);
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("");
		lblNewLabel_1_1_2_1.setBounds(45, 30, 166, 140);
		lblNewLabel_1_1_2_1.setIcon(new ImageIcon("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		panel.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(1, 251, 696, 498);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Project _Image\\smart_city_banner2 (1).jpg"));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(698, 252, 673, 499);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\smart_city_banner (1).jpg"));
		panel.add(lblNewLabel_2);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setBounds(1, 241, 1373, 10);
		separator_1_3.setForeground(new Color(0, 0, 139));
		panel.add(separator_1_3);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Documents\\Images\\bk.jpg"));
		lblNewLabel_3.setBounds(-3, 0, 1370, 750);
		panel.add(lblNewLabel_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(255, 128, 0));
		separator_2.setBounds(353, 126, 642, 3);
		panel.add(separator_2);
		//lblNewLabel.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\OneDrive\\Pictures\\smart-city image.jpg"));
	}
}
