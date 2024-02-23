package MySql;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hotel_Delhi {

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
					Hotel_Delhi window = new Hotel_Delhi();
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
	public Hotel_Delhi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(screen.width, screen.height);
//		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOTELS IN DELHI");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setBounds(0, 0, 1350, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(new Color(143, 188, 143));
		panel_1.setBounds(0, 222, 662, 152);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ibis Hotel Delhi");
		lblNewLabel_2_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1.setBounds(368, 4, 274, 39);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Offering a outdoor swiming pool, fitness center. It is");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_2.setBounds(370, 74, 293, 33);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Gurgaon");
		lblNewLabel_4_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(371, 39, 123, 33);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("located in gurgaon golf course road.");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_1.setBounds(371, 90, 271, 33);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Project _Image\\ibis (1).jpg"));
		lblNewLabel_1.setBounds(3, 2, 348, 148);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Book Now");
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			try {
				String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.guestreservations.com/ibis-delhi-airport/booking?msclkid=9890aa4327d0148c35b4cf175ae7cb45"};
				r.exec(str);
			}catch(Exception e1) {
				e1.printStackTrace();
			
		}
			
		}
		
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setBounds(517, 39, 123, 37);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4_2 = new JLabel(" Rate:-\r\n₹ 6,996  (1 night, 1 adult) ");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2.setBounds(368, 118, 275, 26);
		panel_1.add(lblNewLabel_4_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBackground(new Color(143, 188, 143));
		panel_1_1.setBounds(0, 67, 662, 152);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("MahiPal Pur");
		lblNewLabel_4_1_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_2.setBounds(377, 39, 111, 33);
		panel_1_1.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\Project _Image\\airlift (1).jpg"));
		lblNewLabel_1_1.setBounds(4, 2, 348, 148);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Book Now");
		btnNewButton_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.booking.com/hotel/in/aero-line-delhi-airport.en-gb.html?aid=357028&label=bin859jc-1DCAsobEIXYWVyby1saW5lLWRlbGhpLWFpcnBvcnRIM1gDaGyIAQGYAQm4ARfIAQzYAQPoAQGIAgGoAgO4AornhqsGwAIB0gIkYjRmNjY5NmQtMDUxNi00MTAwLWIwNTQtZmEzYmUwMDFlNzFm2AIE4AIB&sid=241adaf642ac8d7ea6c0ea096b3940e7&dist=0&group_adults=2&group_children=0&keep_landing=1&no_rooms=1&sb_price_type=total&type=total&"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			
		});
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1_1.setBounds(515, 39, 123, 37);
		panel_1_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("free wifi and free private parking and room services");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1.setBounds(378, 72, 259, 25);
		panel_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Ideally set in Delhi features air conditioned room ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3.setBounds(378, 82, 268, 33);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Hotel Airlift INN");
		lblNewLabel_2_1_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_1.setBounds(377, 2, 212, 33);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_4 = new JLabel(" Rate:-\r\n₹ 1,369  (1 night, 1 adult) ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4.setBounds(374, 109, 275, 26);
		panel_1_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(new Color(143, 188, 143));
		panel_2.setBounds(0, 377, 662, 152);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Hotel Bricks");
		lblNewLabel_2_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_2.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_2.setBounds(369, 1, 276, 43);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Just 2.7 km  from centre. It is luxurious 5 star hotel");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_3.setBounds(376, 68, 284, 33);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("D:\\Project _Image\\brack_delhi (1).jpg"));
		lblNewLabel_1_2.setBounds(4, 2, 348, 148);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("It also have 4 dining option and provides free parking");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_2.setBounds(376, 83, 276, 33);
		panel_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Karol bagh");
		lblNewLabel_4_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_1.setBounds(374, 34, 112, 33);
		panel_2.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton_2 = new JButton("Book Now");
		btnNewButton_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String[] str=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.goibibo.com/hotels/bricks-karol-bagh-new-delhi-hotel-in-delhi-2042866077652314421/"};
					r.exec(str);
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.setBounds(515, 35, 124, 37);
		panel_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_4_2_1 = new JLabel(" Rate:-\r\n₹ 3,073  (1 night, 1 adult) ");
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1.setBounds(370, 112, 275, 26);
		panel_2.add(lblNewLabel_4_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.setBackground(new Color(143, 188, 143));
		panel_3.setBounds(0, 533, 662, 152);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Situated on 4.5 acres of land. Just 14.8km from centre.");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_4.setBounds(371, 74, 287, 33);
		panel_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("D:\\Project _Image\\plaze (1).jpg"));
		lblNewLabel_1_3.setBounds(4, 2, 348, 148);
		panel_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("New Delhi");
		lblNewLabel_4_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_3.setBounds(375, 37, 82, 33);
		panel_3.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("a health club with infilty pool and spa, 5 dining option");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_3.setBounds(372, 88, 271, 33);
		panel_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Hotel Smart Plaza");
		lblNewLabel_2_2_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_2_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_2_1.setBounds(370, 1, 241, 43);
		panel_3.add(lblNewLabel_2_2_1);
		
		JButton btnNewButton_3 = new JButton("Book Now");
		btnNewButton_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String [] str=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.tripadvisor.in/Hotel_Review-g304551-d17407545-Reviews-Hotel_Smart_Plaza-New_Delhi_National_Capital_Territory_of_Delhi.html"};
			        r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBackground(new Color(0, 255, 0));
		btnNewButton_3.setBounds(512, 37, 127, 37);
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel(" Rate:-\r\n₹ 1,485  (1 night, 1 adult) ");
		lblNewLabel_4_2_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_1.setBounds(371, 118, 275, 26);
		panel_3.add(lblNewLabel_4_2_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBackground(new Color(143, 188, 143));
		panel_1_2.setBounds(684, 67, 662, 152);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("MahiPal Pur");
		lblNewLabel_4_1_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_3.setBounds(371, 39, 123, 33);
		panel_1_2.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon("D:\\Project _Image\\Ananda-Lawn (1).jpg"));
		lblNewLabel_1_4.setBounds(3, 2, 348, 148);
		panel_1_2.add(lblNewLabel_1_4);
		
		JButton btnNewButton_1_2 = new JButton("Book Now");
		btnNewButton_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String [] str=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.booking.com/hotel/in/anand-international-new-delhi1.en-gb.html"};
					r.exec(str);
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_2.setForeground(new Color(0, 0, 0));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2.setBackground(new Color(0, 255, 0));
		btnNewButton_1_2.setBounds(517, 39, 123, 37);
		panel_1_2.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("Hotel Anand International");
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2.setBounds(369, 2, 293, 43);
		panel_1_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_5 = new JLabel("Offering free WiFi access. It is located in New Delhi.");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_5.setBounds(370, 71, 293, 33);
		panel_1_2.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("Just 13.2 km form centre.");
		lblNewLabel_3_1_4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_4.setBounds(371, 83, 172, 33);
		panel_1_2.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_4_2_1_2 = new JLabel(" Rate:-\r\n₹ 4,536  (1 night, 1 adult) ");
		lblNewLabel_4_2_1_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_2.setBounds(365, 115, 275, 26);
		panel_1_2.add(lblNewLabel_4_2_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3.setBackground(new Color(143, 188, 143));
		panel_1_3.setBounds(684, 222, 662, 152);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Hotel Airport city palace");
		lblNewLabel_2_1_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_3.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_3.setBounds(368, 4, 274, 39);
		panel_1_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Airport city palace located in MahiPal Pur New Delhi.");
		lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_2_2.setBounds(370, 77, 293, 33);
		panel_1_3.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("MahiPal Pur");
		lblNewLabel_4_1_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_4.setBounds(371, 39, 123, 33);
		panel_1_3.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel(" Just 13.6km from centre ");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_1_2.setBounds(371, 90, 271, 33);
		panel_1_3.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon("D:\\Project _Image\\airport (1).jpg"));
		lblNewLabel_1_5.setBounds(3, 2, 348, 148);
		panel_1_3.add(lblNewLabel_1_5);
		
		JButton btnNewButton_1_3 = new JButton("Book Now");
		btnNewButton_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String [] str=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.makemytrip.com/hotels/hotel_airport_city-details-delhi.html"};
					r.exec(str);
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_3.setForeground(new Color(0, 0, 0));
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3.setBackground(new Color(0, 255, 0));
		btnNewButton_1_3.setBounds(517, 39, 123, 37);
		panel_1_3.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_4_2_1_2_1 = new JLabel(" Rate:-\r\n₹ 931  (1 night, 1 adult) ");
		lblNewLabel_4_2_1_2_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_2_1.setBounds(366, 116, 275, 26);
		panel_1_3.add(lblNewLabel_4_2_1_2_1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_4.setBackground(new Color(143, 188, 143));
		panel_1_4.setBounds(684, 377, 662, 152);
		frame.getContentPane().add(panel_1_4);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Sumedha Premier");
		lblNewLabel_2_1_4.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_4.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_4.setBounds(368, 4, 274, 39);
		panel_1_4.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_4_1_5 = new JLabel("South Delhi");
		lblNewLabel_4_1_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_5.setBounds(371, 39, 123, 33);
		panel_1_4.add(lblNewLabel_4_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("");
		lblNewLabel_1_6.setIcon(new ImageIcon("D:\\Project _Image\\Sumedha (1).jpg"));
		lblNewLabel_1_6.setBounds(3, 2, 348, 148);
		panel_1_4.add(lblNewLabel_1_6);
		
		JButton btnNewButton_1_4 = new JButton("Book Now");
		btnNewButton_1_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String [] str=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.makemytrip.com/hotels/hotel_sumedha_premium-details-delhi.html"};
					r.exec(str);
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_4.setForeground(new Color(0, 0, 0));
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4.setBackground(new Color(0, 255, 0));
		btnNewButton_1_4.setBounds(517, 39, 123, 37);
		panel_1_4.add(btnNewButton_1_4);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Located in New Delhi. Just 10.5 km from centre. They");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_3_1.setBounds(368, 75, 284, 27);
		panel_1_4.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("charged 12000 rupees per night");
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_2_1.setBounds(368, 87, 274, 33);
		panel_1_4.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_4_2_1_2_1_1 = new JLabel(" Rate:-\r\n₹ 2,395  (1 night, 1 adult) ");
		lblNewLabel_4_2_1_2_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_2_1_1.setBounds(368, 113, 275, 26);
		panel_1_4.add(lblNewLabel_4_2_1_2_1_1);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_5.setBackground(new Color(143, 188, 143));
		panel_1_5.setBounds(684, 533, 662, 152);
		frame.getContentPane().add(panel_1_5);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Hotel Decent Suites");
		lblNewLabel_2_1_5.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_5.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_5.setBounds(368, 4, 274, 39);
		panel_1_5.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_4_1_6 = new JLabel("New Delhi");
		lblNewLabel_4_1_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_6.setBounds(371, 39, 123, 33);
		panel_1_5.add(lblNewLabel_4_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("");
		lblNewLabel_1_7.setIcon(new ImageIcon("D:\\Project _Image\\delhi_hotel (1).jpg"));
		lblNewLabel_1_7.setBounds(3, 2, 348, 148);
		panel_1_5.add(lblNewLabel_1_7);
		
		JButton btnNewButton_1_5 = new JButton("Book Now");
		btnNewButton_1_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			try {
				String [] str=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.booking.com/hotel/in/sagar-prasadam.en-gb.html?aid=356980&label=gog235jc-1DCAsobEIOc2FnYXItcHJhc2FkYW1IM1gDaGyIAQGYAQm4ARfIAQzYAQPoAQGIAgGoAgO4Aq3thqsGwAIB0gIkZmFlNDllNDMtYTljMi00MzI2LTliM2QtN2U5MjFhMWVhZDky2AIE4AIB&sid=9ec20a47050602450d270af3edbfa30d&dist=0&group_adults=2&keep_landing=1&sb_price_type=total&type=total&"};
				r.exec(str);
				
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_1_5.setForeground(new Color(0, 0, 0));
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_5.setBackground(new Color(0, 255, 0));
		btnNewButton_1_5.setBounds(517, 39, 123, 37);
		panel_1_5.add(btnNewButton_1_5);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Decent Hotel located in New Delhi. Offering outdoor pool");
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_4_1.setBounds(368, 75, 284, 33);
		panel_1_5.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_1_3_1 = new JLabel(" and restaurent with free wifi. Just 14.8km from centre");
		lblNewLabel_3_1_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_3_1.setBounds(368, 91, 324, 33);
		panel_1_5.add(lblNewLabel_3_1_3_1);
		
		JLabel lblNewLabel_4_2_1_2_1_1_1 = new JLabel(" Rate:-\r\n₹ 2,170  (1 night, 1 adult) ");
		lblNewLabel_4_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_2_1_1_1.setBounds(367, 119, 275, 26);
		panel_1_5.add(lblNewLabel_4_2_1_2_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.DARK_GRAY);
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(672, 68, 2, 618);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton_4 = new JButton("Go Back");
		btnNewButton_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			   Delhi obj=new Delhi();
			   obj.main(null);
			}
		});
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_4.setBackground(new Color(255, 255, 0));
		btnNewButton_4.setBounds(603, 691, 135, 35);
		frame.getContentPane().add(btnNewButton_4);
	}
}
