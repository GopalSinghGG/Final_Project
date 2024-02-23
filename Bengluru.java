package MySql;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bengluru {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bengluru window = new Bengluru();
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
	public Bengluru() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 157, 674, 572);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\Download\\Bangalore1 (1).jpg"));
		lblNewLabel.setBounds(0, 0, 674, 572);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(545, 48, 46, 14);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(676, 156, 674, 573);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("<html>\r\n<head>\r\n<title>about city</title> \r\n</head>\r\n <body>\r\n \r\n\r\n\r\n\r\n\r\n <p>\r\n     Bengaluru  is the capital and largest city of the southern Indian      state of Karnataka.<br>\r\n The city was captured by the British East India Company after victory in the FourthAnglo-Mysore War (1799), which then returned administrative control of the city, along with the\r\nkingdom, to Maharaja Krishnaraja Wadiyar\r\nKannada theatre is popular in Bangalore and consists mostly of political satire and light\r\ncomedy<br>\r\n Plays are organised mostly by community organisations,\r\n The city has an active English- and foreign-language theatre scene; popular theatres  include Ranga Shankara and Chowdiah Memorial Hall. <br>\r\n\r\n</p>\r\n<body>\r\n</html>");
		lblNewLabel_5.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 48, 674, 491);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("BANGLURU PLACES ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(10, 22, 323, 46);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Go To Back");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			    new user_Home_r();	
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(414, 522, 147, 40);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(0, 86, 1350, 70);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("    HOME");
		lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				 Bengluru obj=new Bengluru();
				 obj.main(null);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(0, 0, 128));
				lblNewLabel_1.setBackground(new Color(139,0,0));
				lblNewLabel_1.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(255,255,255));
				lblNewLabel_1.setBackground(new Color(0,0,0));
				lblNewLabel_1.setOpaque(false);
			}
		});
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(0, 0, 180, 70);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("    ATM");
       lblNewLabel_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						frame.dispose();
						new ATM_bengluru();
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(0, 0, 128));
				lblNewLabel_1_1.setBackground(new Color(139,0,0));
				lblNewLabel_1_1.setOpaque(true);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(255,255,255));
				lblNewLabel_1_1.setBackground(new Color(0,0,0));
				lblNewLabel_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(190, 0, 161, 70);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("   HOTELS");
		lblNewLabel_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		frame.dispose();
		Hotel_bengluru	obj=new Hotel_bengluru();
		obj.main(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_2.setForeground(new Color(0, 0, 128));
				lblNewLabel_1_2.setBackground(new Color(139,0,0));
				lblNewLabel_1_2.setOpaque(true);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblNewLabel_1_2.setForeground(new Color(255,255,255));
				lblNewLabel_1_2.setBackground(new Color(0,0,0));
				lblNewLabel_1_2.setOpaque(false);
			}
		});
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_2.setBounds(375, 0, 161, 70);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("  CINEMA");
		lblNewLabel_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaBangluru obj=new CinemaBangluru();
				obj.main(null);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(0, 0, 128));
				lblNewLabel_1_3.setBackground(new Color(139,0,0));
				lblNewLabel_1_3.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(255,255,255));
				lblNewLabel_1_3.setBackground(new Color(0,0,0));
				lblNewLabel_1_3.setOpaque(false);
			}
		});
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel_1_3.setBackground(Color.WHITE);
		lblNewLabel_1_3.setBounds(578, 0, 157, 70);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("    TOURISM PLACES");
		lblNewLabel_1_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Tourism_place_Bangluru obj=new Tourism_place_Bangluru();
				 obj.main(null);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_4.setForeground(new Color(0, 0, 128));
				lblNewLabel_1_4.setBackground(new Color(139,0,0));
				lblNewLabel_1_4.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_4.setForeground(new Color(255,255,255));
				lblNewLabel_1_4.setBackground(new Color(0,0,0));
				lblNewLabel_1_4.setOpaque(false);
				
			}
		});
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel_1_4.setBackground(Color.WHITE);
		lblNewLabel_1_4.setBounds(778, 0, 324, 70);
		panel_2.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("     ABOUT");
		lblNewLabel_1_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				 Bengluru obj=new Bengluru();
				 obj.main(null);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_1_5.setBackground(new Color(139,0,0));
				lblNewLabel_1_5.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(255,255,255));
				lblNewLabel_1_5.setBackground(new Color(0,0,0));
				lblNewLabel_1_5.setOpaque(false);
			}
		});
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel_1_5.setBackground(Color.WHITE);
		lblNewLabel_1_5.setBounds(1138, 0, 190, 70);
		panel_2.add(lblNewLabel_1_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(175, 238, 238));
		panel_3.setBounds(0, 0, 1350, 85);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Downloads\\Ministry_of_Housing.png"));
		lblNewLabel_2.setBounds(0, 0, 234, 85);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Downloads\\ek_kadam.png"));
		lblNewLabel_3.setBounds(1190, 0, 170, 85);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("WELCOME TO BENGLURU CITY");
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 45));
		lblNewLabel_4.setBounds(341, 11, 728, 63);
		panel_3.add(lblNewLabel_4);
		Dimension screen= Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width, screen.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
