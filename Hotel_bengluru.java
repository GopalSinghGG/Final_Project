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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Hotel_bengluru {

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
					Hotel_bengluru window = new Hotel_bengluru();
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
	public Hotel_bengluru() {
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
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 1350, 65);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("HOTELS IN BENGLURU");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setBounds(428, 0, 510, 65);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("   BACK");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setIcon(new ImageIcon("D:\\Download\\Back image.png"));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Bengluru obj=new Bengluru();
				obj.main(null);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Bengluru();
				}
		});
		btnNewButton.setForeground(new Color(128, 128, 0));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnNewButton.setBounds(33, 20, 117, 34);
		panel.add(btnNewButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBackground(new Color(0, 191, 255));
		panel_1_1.setBounds(0, 67, 662, 152);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Bangalore");
		lblNewLabel_4_1_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_2.setBounds(377, 39, 111, 33);
		panel_1_1.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\Project _Image\\bengluru itc.jpg"));
		lblNewLabel_1_1.setBounds(4, 2, 347, 148);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Book Now");
		btnNewButton_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.itchotels.com/in/en/destinations/bengaluru?utm_source=bing&utm_medium=cpc&utm_campaign=HQ-DTL|CTY|Bengaluru|NA|Search|Conversions|PANIndia|always-on|Owned|AllBrand|Bing|NA|NA|NA|NA|Brand&utm_content=search&msclkid=0fc9ad15f27d177f9b01c8749b4b0901"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
			}
			}
		});
		btnNewButton_1_1.setForeground(Color.BLUE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(0, 255, 64));
		btnNewButton_1_1.setBounds(515, 39, 123, 37);
		panel_1_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("free wifi and free private parking and room services");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1.setBounds(378, 78, 259, 33);
		panel_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Ideally set in Bangalore features air conditioned room ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3.setBounds(378, 99, 268, 33);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("ITC Gardenia");
		lblNewLabel_2_1_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_1.setBounds(372, 5, 212, 33);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_4_4_1_2 = new JLabel(" Rate:-\r\n₹13,806   (1 night, 1 adult) ");
		lblNewLabel_4_4_1_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4_1_2.setBounds(374, 122, 275, 26);
		panel_1_1.add(lblNewLabel_4_4_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(0, 224, 662, 152);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ibis hotel bangluru");
		lblNewLabel_2_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1.setBounds(368, 4, 274, 39);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Offering a outdoor swiming pool, fitness center. It is");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_2.setBounds(370, 73, 293, 33);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Bangalore");
		lblNewLabel_4_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(371, 39, 123, 33);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("located in bangalore. It also have 4 dining option");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_1.setBounds(371, 96, 271, 33);
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
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.bing.com/travel/hotels/detail?q=ibis+Bengaluru+City+Centre&id=YN4070x2868469944309521358&hname=ibis+Bengaluru+City+Centre&loc=Bengaluru%2C+Karnataka%2C+IN&displaytext=Bengaluru%2C+Karnataka%2C+IN&lat=12.967363&lon=77.59387&cin=2024-01-07&cout=2024-01-08&guests=2A0C&age=&hotellistid=YN4070x2868469944309521358&type=hotel&form=HTSEST&entrypoint=HTSEST"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setBounds(517, 39, 123, 37);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel(" Rate:-\r\n₹ 5,665  (1 night, 1 adult) ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4.setBounds(367, 119, 275, 26);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBackground(new Color(0, 191, 255));
		panel_2.setBounds(0, 383, 662, 152);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("The Sulit Whitefield");
		lblNewLabel_2_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_2.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_2.setBounds(369, 1, 276, 43);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Just 12.3 km  from centre. It is luxurious 5 star hotel");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_3.setBounds(369, 74, 284, 33);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("D:\\Project _Image\\sulitwhitefieldhotel_bengluru (1).jpg"));
		lblNewLabel_1_2.setBounds(4, 2, 348, 148);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("It also have 4 dining option and provides free parking");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_2.setBounds(369, 95, 276, 33);
		panel_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Brookefield");
		lblNewLabel_4_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_1.setBounds(374, 34, 112, 33);
		panel_2.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton_2 = new JButton("Book Now");
		btnNewButton_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.bing.com/travel/hotels/detail?q=The+Sulit+Whitefield&id=YN4070x7655651014219751163&hname=The+Sulit+Whitefield&loc=Bangalore%2C+Karnataka%2C+IN&displaytext=Bangalore%2C+Karnataka%2C+IN&lat=12.999214&lon=77.69951&cin=2024-01-07&cout=2024-01-08&guests=2A0C&age=&hotellistid=YN4070x7655651014219751163&type=hotel&form=HTSEST&entrypoint=HTSEST"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.setBounds(515, 35, 124, 37);
		panel_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_4_2 = new JLabel(" Rate:-\r\n₹ 4,218  (1 night, 1 adult) ");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2.setBounds(364, 124, 275, 26);
		panel_2.add(lblNewLabel_4_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.setBackground(new Color(0, 191, 255));
		panel_3.setBounds(0, 541, 662, 152);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Situated on 4.5 acres of land. Just 12km from centre.");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_4.setBounds(371, 79, 287, 33);
		panel_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("D:\\Project _Image\\bloomhotel_bengluru (1).jpg"));
		lblNewLabel_1_3.setBounds(4, 2, 348, 148);
		panel_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Agra");
		lblNewLabel_4_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_3.setBounds(375, 37, 82, 33);
		panel_3.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("a health club with infilty pool and spa, 5 dining option");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_3.setBounds(371, 100, 271, 33);
		panel_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Bloom Hotel");
		lblNewLabel_2_2_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_2_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_2_1.setBounds(370, 1, 241, 43);
		panel_3.add(lblNewLabel_2_2_1);
		
		JButton btnNewButton_3 = new JButton("See Details");
		btnNewButton_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.agoda.com/en-in/pages/agoda/default/DestinationSearchResult.aspx?selectedproperty=1110186&city=4923&hid=1110186&site_id=1914936&tag=c100ed31-552d-498c-a988-d3142a49d3ae&msclkid=b887cfe64ce3180a1c03aa86eaa5718d"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				}	
			}
		});
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBackground(new Color(0, 255, 0));
		btnNewButton_3.setBounds(512, 37, 127, 37);
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_4_2_1 = new JLabel(" Rate:-\r\n₹ 5,700  (1 night, 1 adult) ");
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1.setBounds(366, 124, 275, 26);
		panel_3.add(lblNewLabel_4_2_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.DARK_GRAY);
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(672, 65, 2, 664);
		frame.getContentPane().add(separator);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3.setBackground(new Color(0, 191, 255));
		panel_1_3.setBounds(684, 67, 662, 152);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Park Wood Suites");
		lblNewLabel_2_1_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_3.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_3.setBounds(368, 4, 274, 39);
		panel_1_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Offering free WiFi access. It is located BrookeField in ");
		lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_2_2.setBounds(370, 78, 293, 33);
		panel_1_3.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Brookefield");
		lblNewLabel_4_1_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_4.setBounds(371, 39, 123, 33);
		panel_1_3.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Bangalore. Just 12.6km form centre.");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_1_2.setBounds(371, 97, 271, 33);
		panel_1_3.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon("D:\\Project _Image\\park wood (1).jpg"));
		lblNewLabel_1_5.setBounds(3, 2, 348, 148);
		panel_1_3.add(lblNewLabel_1_5);
		
		JButton btnNewButton_1_3 = new JButton("Book Now");
		btnNewButton_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.bing.com/travel/hotels/detail?q=Parkwood+Suites&id=YN4070x249489625&hname=Parkwood+Suites&loc=Bangalore%2C+Karnataka%2C+IN&displaytext=Bangalore%2C+Karnataka%2C+IN&lat=12.964786&lon=77.71687&cin=2024-01-07&cout=2024-01-08&guests=2A0C&age=&hotellistid=YN4070x249489625&type=rental&form=HTSEST&entrypoint=HTSEST"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_3.setForeground(Color.BLUE);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3.setBackground(new Color(0, 255, 0));
		btnNewButton_1_3.setBounds(517, 39, 123, 37);
		panel_1_3.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_4_4 = new JLabel(" Rate:-\r\n₹ 3,561  (1 night, 1 adult) ");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4.setBounds(366, 121, 275, 26);
		panel_1_3.add(lblNewLabel_4_4);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_4.setBackground(new Color(0, 191, 255));
		panel_1_4.setBounds(684, 224, 662, 152);
		frame.getContentPane().add(panel_1_4);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("The Pride Hotel");
		lblNewLabel_2_1_4.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_4.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_4.setBounds(368, 4, 274, 39);
		panel_1_4.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_4_1_5 = new JLabel("Bangalore");
		lblNewLabel_4_1_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_5.setBounds(371, 39, 123, 33);
		panel_1_4.add(lblNewLabel_4_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("");
		lblNewLabel_1_6.setIcon(new ImageIcon("D:\\Project _Image\\the pride hotel in beng.jpg"));
		lblNewLabel_1_6.setBounds(3, 2, 348, 148);
		panel_1_4.add(lblNewLabel_1_6);
		
		JButton btnNewButton_1_4 = new JButton("Book Now");
		btnNewButton_1_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program files\\Google\\Chrome\\Application\\chrome.exe","https://www.bing.com/travel/hotels/detail?q=The+Pride+Hotel%2C+Bangalore&id=YN4070x10140839128142024200&hname=The+Pride+Hotel%2C+Bangalore&loc=Bengaluru%2C+Karnataka%2C+IN&displaytext=Bengaluru%2C+Karnataka%2C+IN&lat=12.964761&lon=77.599464&cin=2024-01-07&cout=2024-01-08&guests=2A0C&age=&hotellistid=YN4070x10140839128142024200&type=hotel&form=HTSEST&entrypoint=HTSEST"};
				r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_4.setForeground(Color.BLUE);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4.setBackground(new Color(0, 255, 0));
		btnNewButton_1_4.setBounds(517, 39, 123, 37);
		panel_1_4.add(btnNewButton_1_4);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("The Pride hotel located in Bangalore. It is luxirious hotel");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_3_1.setBounds(368, 76, 284, 33);
		panel_1_4.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel(" Just 1.3 km from centre ");
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_2_1.setBounds(368, 97, 274, 33);
		panel_1_4.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_4_4_1 = new JLabel(" Rate:-\r\n₹13,923   (1 night, 1 adult) ");
		lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4_1.setBounds(367, 121, 275, 26);
		panel_1_4.add(lblNewLabel_4_4_1);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_5.setBackground(new Color(0, 191, 255));
		panel_1_5.setBounds(684, 382, 662, 152);
		frame.getContentPane().add(panel_1_5);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Monarch Brigade Road");
		lblNewLabel_2_1_5.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_5.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_5.setBounds(368, 4, 274, 39);
		panel_1_5.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_4_1_6 = new JLabel("Bangalore");
		lblNewLabel_4_1_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_6.setBounds(371, 39, 123, 33);
		panel_1_5.add(lblNewLabel_4_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("");
		lblNewLabel_1_7.setIcon(new ImageIcon("D:\\Project _Image\\Monarch Brigade road beng.jpg"));
		lblNewLabel_1_7.setBounds(3, 2, 348, 148);
		panel_1_5.add(lblNewLabel_1_7);
		
		JButton btnNewButton_1_5 = new JButton("Book Now");
		btnNewButton_1_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.agoda.com/en-in/pages/agoda/default/DestinationSearchResult.aspx?selectedproperty=51351&city=4923&hid=51351&site_id=1914936&tag=c243d642-d8c0-4e7a-a0b4-34a6b1bfa858&msclkid=aa727268a71616f926241709c68bc8bf&ds=FOTfwOClmhejEnCe"};
				r.exec(str);
				} catch(Exception e1) {
				e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_5.setForeground(Color.BLUE);
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_5.setBackground(new Color(0, 255, 0));
		btnNewButton_1_5.setBounds(517, 39, 123, 37);
		panel_1_5.add(btnNewButton_1_5);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Located in mg road Bangalore 0.7 km from centre. They");
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_4_1.setBounds(368, 77, 284, 33);
		panel_1_5.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_1_3_1 = new JLabel("charged 12000 rupees per night");
		lblNewLabel_3_1_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_3_1.setBounds(368, 99, 324, 33);
		panel_1_5.add(lblNewLabel_3_1_3_1);
		
		JLabel lblNewLabel_4_4_1_1 = new JLabel(" Rate:-\r\n₹3,064   (1 night, 1 adult) ");
		lblNewLabel_4_4_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4_1_1.setBounds(366, 123, 275, 26);
		panel_1_5.add(lblNewLabel_4_4_1_1);
		
		JPanel panel_1_5_1 = new JPanel();
		panel_1_5_1.setLayout(null);
		panel_1_5_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_5_1.setBackground(new Color(0, 191, 255));
		panel_1_5_1.setBounds(684, 540, 662, 152);
		frame.getContentPane().add(panel_1_5_1);
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("Radisson Blu Atria");
		lblNewLabel_2_1_5_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_5_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_5_1.setBounds(368, 4, 274, 39);
		panel_1_5_1.add(lblNewLabel_2_1_5_1);
		
		JLabel lblNewLabel_4_1_6_1 = new JLabel("Center City");
		lblNewLabel_4_1_6_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_6_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_6_1.setBounds(371, 39, 123, 33);
		panel_1_5_1.add(lblNewLabel_4_1_6_1);
		
		JLabel lblNewLabel_1_7_1 = new JLabel("");
		lblNewLabel_1_7_1.setIcon(new ImageIcon("D:\\Project _Image\\radission blu (1).jpg"));
		lblNewLabel_1_7_1.setBounds(3, 2, 348, 148);
		panel_1_5_1.add(lblNewLabel_1_7_1);
		
		JButton btnNewButton_1_5_1 = new JButton("See Details");
		btnNewButton_1_5_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]= new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.bing.com/travel/hotels/detail?q=Radisson+Blu+Hotel%2C+Atria+Bengaluru&id=YN4070x13083012153888141808&hname=Radisson+Blu+Hotel%2C+Atria+Bengaluru&loc=Bengaluru%2C+Karnataka%2C+IN&displaytext=Bengaluru%2C+Karnataka%2C+IN&lat=12.980021&lon=77.5862&cin=2024-01-07&cout=2024-01-08&guests=2A0C&age=&hotellistid=YN4070x13083012153888141808&type=hotel&form=HTSEST&entrypoint=HTSEST"};
				r.exec(str);
				} catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_5_1.setForeground(Color.BLUE);
		btnNewButton_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_5_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1_5_1.setBounds(517, 39, 123, 37);
		panel_1_5_1.add(btnNewButton_1_5_1);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("Radisson Blu Hotel located in Bangalore. Offering outdoor");
		lblNewLabel_3_4_1_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_4_1_1.setBounds(381, 77, 284, 33);
		panel_1_5_1.add(lblNewLabel_3_4_1_1);
		
		JLabel lblNewLabel_3_1_3_1_1 = new JLabel(" pool and restaurent with free wifi.");
		lblNewLabel_3_1_3_1_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_3_1_1.setBounds(378, 97, 324, 33);
		panel_1_5_1.add(lblNewLabel_3_1_3_1_1);
		
		JLabel lblNewLabel_4_4_1_1_1 = new JLabel(" Rate:-\r\n₹11,352   (1 night, 1 adult) ");
		lblNewLabel_4_4_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4_1_1_1.setBounds(377, 120, 275, 26);
		panel_1_5_1.add(lblNewLabel_4_4_1_1_1);
	}
}
