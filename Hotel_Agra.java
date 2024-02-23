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
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Hotel_Agra {
	
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
					Hotel_Agra window = new Hotel_Agra();
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
	public Hotel_Agra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width, screen.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 1, 1350, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOTELS IN AGRA");
		lblNewLabel.setBounds(428, 0, 502, 65);
		panel.add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel.setBackground(new Color(0, 0, 128));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Agra();
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\Project _Image\\arro2.JPG"));
		btnNewButton.setBounds(10, 11, 59, 43);
		panel.add(btnNewButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBackground(new Color(0, 191, 255));
		panel_1_1.setBounds(0, 67, 662, 152);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Taj Ganj Agra");
		lblNewLabel_4_1_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_2.setBounds(377, 39, 111, 33);
		panel_1_1.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\Project _Image\\Hotel_Agra_Image\\marine (1).jpg"));
		lblNewLabel_1_1.setBounds(4, 2, 348, 148);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Book Now");
		
		btnNewButton_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.booking.com/hotel/in/marine-house-agra.en-gb.html"};
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
		lblNewLabel_3_1.setBounds(378, 75, 259, 33);
		panel_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Ideally set in agra features air conditioned room with ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3.setBounds(378, 100, 268, 33);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Hotel Marine House");
		lblNewLabel_2_1_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_1.setBounds(372, 5, 212, 33);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_4 = new JLabel(" Rate:-\r\n₹ 2,280  (1 night, 1 adult) ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4.setBounds(372, 121, 275, 26);
		panel_1_1.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(0, 222, 662, 152);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Courtyard By Marriott Agra");
		lblNewLabel_2_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1.setBounds(368, 4, 274, 39);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Offering a outdoor swiming pool, fitness center. Courtyard ");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_2.setBounds(370, 74, 293, 33);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Taj Ganj Agra");
		lblNewLabel_4_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(371, 39, 123, 33);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Marriott is located in agra. It also have 4 dining option");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_1.setBounds(371, 91, 271, 33);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Project _Image\\Hotel_Agra_Image\\couryard (1).jpg"));
		lblNewLabel_1.setBounds(3, 2, 348, 148);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Book Now");
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.marriott.com/en-us/hotels/agrcy-courtyard-agra/overview/"};
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
		
		JLabel lblNewLabel_4_2 = new JLabel(" Rate:-\r\n₹ 6,298  (1 night, 1 adult) ");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2.setBounds(367, 118, 275, 26);
		panel_1.add(lblNewLabel_4_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(new Color(0, 191, 255));
		panel_2.setBounds(0, 377, 662, 152);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("The Oberoi Amarvilas Agra");
		lblNewLabel_2_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_2.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_2.setBounds(369, 1, 276, 43);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Just 600 meters from TajMahal. It is luxurious 5 star hotel");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_3.setBounds(376, 67, 284, 33);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("D:\\Project _Image\\Hotel_Agra_Image\\oberai (1).jpg"));
		lblNewLabel_1_2.setBounds(4, 2, 348, 148);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("It also have 4 dining option and provides free parking");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_2.setBounds(376, 86, 276, 33);
		panel_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Taj Ganj Agra");
		lblNewLabel_4_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_1.setBounds(374, 34, 112, 33);
		panel_2.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton_2 = new JButton("Book Now");
		btnNewButton_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.booking.com/searchresults.en-gb.html?ss=Agra&ssne=Agra&ssne_untouched=Agra&highlighted_hotels=78801&hp_sbox=1&label=gog235jc-1DCAsobEIZdGhlLW9iZXJvaS1hbWFydmlsYXMtYWdyYUgzWANobIgBAZgBCbgBF8gBDNgBA-gBAYgCAagCA7gCovGGqwbAAgHSAiRiMDRiOGE2NS1jYmQ0LTRiNzQtYTU5Mi1lMzMzNjRkN2Q0YTjYAgTgAgE&sid=9ec20a47050602450d270af3edbfa30d&aid=356980&lang=en-gb&sb=1&src_elem=sb&src=hotel&dest_id=-2088244&dest_type=city&checkin=2023-12-01&checkout=2023-12-02&group_adults=2&no_rooms=1&group_children=1&age=0&sb_travel_purpose=leisure"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
			}
		});
		btnNewButton_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.setBounds(515, 35, 124, 37);
		panel_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_4_2_1 = new JLabel(" Rate:-\r\n₹ 45,000 (1 night, 1 adult) ");
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1.setBounds(370, 111, 275, 26);
		panel_2.add(lblNewLabel_4_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.setBackground(new Color(0, 191, 255));
		panel_3.setBounds(0, 533, 662, 152);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Situated on 4.5 acres of land. Just 1km from Taj. Features ");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_4.setBounds(362, 72, 287, 33);
		panel_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("D:\\Project _Image\\Hotel_Agra_Image\\taj_hotel.jpg"));
		lblNewLabel_1_3.setBounds(4, 2, 348, 148);
		panel_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Agra");
		lblNewLabel_4_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_3.setBounds(375, 37, 82, 33);
		panel_3.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("a health club with infilty pool and spa, 5 dining option");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_3.setBounds(362, 85, 271, 33);
		panel_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Taj Hotel & Convention ");
		lblNewLabel_2_2_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_2_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_2_1.setBounds(370, 1, 241, 43);
		panel_3.add(lblNewLabel_2_2_1);
		
		JButton btnNewButton_3 = new JButton("Book Now");
		btnNewButton_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.tajhotels.com/en-in/taj/taj-hotel-and-convention-centre-agra/"};
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
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel(" Rate:-\r\n₹ 7,198  (1 night, 1 adult) ");
		lblNewLabel_4_2_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_1.setBounds(372, 115, 275, 26);
		panel_3.add(lblNewLabel_4_2_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.DARK_GRAY);
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(672, 65, 2, 618);
		frame.getContentPane().add(separator);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBackground(new Color(0, 191, 255));
		panel_1_2.setBounds(684, 67, 662, 152);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Taj Ganj Agra");
		lblNewLabel_4_1_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_3.setBounds(371, 39, 123, 33);
		panel_1_2.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon("D:\\Project _Image\\Hotel_Agra_Image\\crystal (1).jpg"));
		lblNewLabel_1_4.setBounds(3, 2, 348, 148);
		panel_1_2.add(lblNewLabel_1_4);
		
		JButton btnNewButton_1_2 = new JButton("Book Now");
		btnNewButton_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.google.com/travel/search?q=Crystal%20Sarovar%20Premiere%2C%20Agra&g2lb=2502548%2C2503771%2C2503781%2C4258168%2C4284970%2C4291517%2C4308227%2C4597339%2C4757164%2C4814050%2C4874190%2C4893075%2C4924070%2C4965990%2C4990494%2C72277293%2C72298667%2C72302247%2C72317059%2C72385362%2C72402232%2C72406588%2C72412680%2C72414906%2C72421566%2C72422183%2C72427794&hl=en-IN&gl=in&ssta=1&ts=CAEaRwopEicyJTB4Mzk3NDcxMTNhZWY0MDMwOToweDU0ZGNkOTUyMTY0NmRmNDgSGhIUCgcI5w8QDBgFEgcI5w8QDBgGGAEyAggCKgcKBToDSU5S&qs=CAEyJ0Noa0l5TDZic3FHcXR1NVVHZzB2Wnk4eE1XSjVkamhqWnpnM0VBRTgCQgkJSN9GFlLZ3FRCCQlI30YWUtncVA&ictx=1&ved=0CAcQ35UKahgKEwjYx4C8596CAxUAAAAAHQAAAAAQwwE&ap=ugEGcHJpY2Vz"};
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
		
		JLabel lblNewLabel_2 = new JLabel("Crystal Sarovar Premior Agra");
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2.setBounds(369, 2, 293, 43);
		panel_1_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_5 = new JLabel("Offering free WiFi access. It is located TajGanj District in ");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_5.setBounds(370, 71, 293, 33);
		panel_1_2.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("Agra. Just 1.9km form TajMahal.");
		lblNewLabel_3_1_4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_4.setBounds(371, 87, 172, 33);
		panel_1_2.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_4_2_1_1_1 = new JLabel(" Rate:-\r\n₹ 6,002  (1 night, 1 adult) ");
		lblNewLabel_4_2_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_1_1.setBounds(370, 113, 275, 26);
		panel_1_2.add(lblNewLabel_4_2_1_1_1);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3.setBackground(new Color(0, 191, 255));
		panel_1_3.setBounds(684, 222, 662, 152);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Double Tree By Hilton");
		lblNewLabel_2_1_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_3.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_3.setBounds(368, 4, 274, 39);
		panel_1_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Double Tree By Hilton located in Agra. Just 10km from Agra");
		lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_2_2.setBounds(370, 77, 293, 26);
		panel_1_3.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Taj Ganj Agra");
		lblNewLabel_4_1_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_4.setBounds(371, 39, 123, 33);
		panel_1_3.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Cantt, 15km from airport, 4km from Taj and Red Fort");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_1_2.setBounds(371, 86, 271, 33);
		panel_1_3.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon("D:\\Project _Image\\Hotel_Agra_Image\\Double_tree (1).jpg"));
		lblNewLabel_1_5.setBounds(3, 2, 348, 148);
		panel_1_3.add(lblNewLabel_1_5);
		
		JButton btnNewButton_1_3 = new JButton("Book Now");
		btnNewButton_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.hilton.com/en/hotels/agrdtdi-doubletree-agra/"};
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
		
		JLabel lblNewLabel_4_2_1_1_1_1 = new JLabel(" Rate:-\r\n₹ 5,337  (1 night, 1 adult) ");
		lblNewLabel_4_2_1_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_1_1_1.setBounds(367, 115, 275, 26);
		panel_1_3.add(lblNewLabel_4_2_1_1_1_1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_4.setBackground(new Color(0, 191, 255));
		panel_1_4.setBounds(684, 377, 662, 152);
		frame.getContentPane().add(panel_1_4);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Hotel Moti Palace");
		lblNewLabel_2_1_4.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_4.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_4.setBounds(368, 4, 274, 39);
		panel_1_4.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_4_1_5 = new JLabel("RakabGanj Agra");
		lblNewLabel_4_1_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_5.setBounds(371, 39, 123, 33);
		panel_1_4.add(lblNewLabel_4_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("");
		lblNewLabel_1_6.setIcon(new ImageIcon("D:\\Project _Image\\Hotel_Agra_Image\\moti_place (1).jpg"));
		lblNewLabel_1_6.setBounds(3, 2, 348, 148);
		panel_1_4.add(lblNewLabel_1_6);
		
		JButton btnNewButton_1_4 = new JButton("Book Now");
		btnNewButton_1_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.booking.com/hotel/in/moti-palace-agra.en-gb.html?aid=356980&label=gog235jc-1DCAsobEIQbW90aS1wYWxhY2UtYWdyYUgzWANobIgBAZgBCbgBF8gBDNgBA-gBAYgCAagCA7gC7bqGqwbAAgHSAiRhMWM1YzFkZi02OWIyLTQzMTgtOTExOS1jZDI2YjQ3MDdjYmTYAgTgAgE&sid=9ec20a47050602450d270af3edbfa30d&dist=0&group_adults=2&keep_landing=1&sb_price_type=total&type=total&"};
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
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Located in agra 6km from Taj. Moti Palace accommodation");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_3_1.setBounds(368, 76, 284, 27);
		panel_1_4.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("with resataurent free wifi and private parking");
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_2_1.setBounds(367, 86, 274, 33);
		panel_1_4.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_4_2_1_1_1_1_1 = new JLabel(" Rate:-\r\n₹ 2,395  (1 night, 1 adult) ");
		lblNewLabel_4_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_1_1_1_1.setBounds(367, 114, 275, 26);
		panel_1_4.add(lblNewLabel_4_2_1_1_1_1_1);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_5.setBackground(new Color(0, 191, 255));
		panel_1_5.setBounds(684, 533, 662, 152);
		frame.getContentPane().add(panel_1_5);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Radisson Hotel Agra");
		lblNewLabel_2_1_5.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_5.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_5.setBounds(368, 4, 274, 39);
		panel_1_5.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_4_1_6 = new JLabel(" Agra");
		lblNewLabel_4_1_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_6.setBounds(371, 39, 123, 33);
		panel_1_5.add(lblNewLabel_4_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("");
		lblNewLabel_1_7.setIcon(new ImageIcon("D:\\Project _Image\\Hotel_Agra_Image\\radisson_hotel_agra (1).jpg"));
		lblNewLabel_1_7.setBounds(3, 2, 348, 148);
		panel_1_5.add(lblNewLabel_1_7);
		
		JButton btnNewButton_1_5 = new JButton("Book Now");
		btnNewButton_1_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.google.com/travel/search?q=radisson%20hotel%20agra&g2lb=2502548%2C2503771%2C2503781%2C4258168%2C4284970%2C4291517%2C4308227%2C4597339%2C4757164%2C4814050%2C4874190%2C4893075%2C4924070%2C4965990%2C4990494%2C72277293%2C72298667%2C72302247%2C72317059%2C72385362%2C72402232%2C72406588%2C72412680%2C72414906%2C72421566%2C72422183%2C72427794&hl=en-IN&gl=in&ssta=1&ts=CAEaRwopEicyJTB4Mzk3NDcxMGY5ODY2MTE1MzoweDJlMDJlNTY5NTc1YTNhZGMSGhIUCgcI5w8QDBgFEgcI5w8QDBgGGAEyAggC&qs=CAEyE0Nnb0kzUFhvdXBXdHVZRXVFQUU4AkIJCdw6Wldp5QIuQgkJ3DpaV2nlAi4&ap=ugEGcHJpY2Vz&ictx=1&ved=0CAAQ5JsGahcKEwiAqfOQ6N6CAxUAAAAAHQAAAAAQCw"};
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
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Radisson Hotel located in agra. Offering outdoor pool and ");
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_4_1.setBounds(368, 76, 284, 33);
		panel_1_5.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_1_3_1 = new JLabel("restaurent with free wifi. Just 2km from Taj");
		lblNewLabel_3_1_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_3_1.setBounds(368, 90, 324, 33);
		panel_1_5.add(lblNewLabel_3_1_3_1);
		
		JLabel lblNewLabel_4_2_1_1_1_1_1_1 = new JLabel(" Rate:-\r\n₹ 8,290 (1 night, 1 adult) ");
		lblNewLabel_4_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_1_1_1_1_1.setBounds(367, 120, 275, 26);
		panel_1_5.add(lblNewLabel_4_2_1_1_1_1_1_1);
	}
}
