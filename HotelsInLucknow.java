package MySql;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

public class HotelsInLucknow {

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
					HotelsInLucknow window = new HotelsInLucknow();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HotelsInLucknow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		//frame.setBounds(100, 100, 790, 1000);
		//frame.setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width,screenSize.height);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOTELS IN LUCKNOW");
		lblNewLabel.setLocation(0, 0);
		lblNewLabel.setBackground(new Color(0, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setSize(1350,65);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		panel_1.setBackground(new Color(143, 188, 143));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 224, 662, 152);
		frame.getContentPane().add(panel_1);

		JLabel lblNewLabel_2_1 = new JLabel("Fairfield by Marriott");
		lblNewLabel_2_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1.setBounds(368, 4, 274, 39);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Offering a outdoor swiming pool, fitness center. It is");
		lblNewLabel_3_2.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_2.setBounds(370, 78, 293, 33);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Gomti Nagar");
		lblNewLabel_4_1.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_4_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(371, 39, 123, 33);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("located in Gomti nagar. It also have 4 dining option");
		lblNewLabel_3_1_1.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_1.setBounds(371, 91, 271, 33);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(3, 2, 348, 148);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Project _Image\\fairfield_lucknow (1).jpg"));
		
		JButton btnNewButton_1 = new JButton("Book Now ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.google.com/travel/search?g2lb=2502548,2503771,2503781,4258168,4284970,4291517,4308227,4597339,4757164,4814050,4874190,4893075,4924070,4965990,4990494,72277293,72298667,72302247,72317059,72385362,72402232,72406588,72412680,72414906,72421566,72422183,72427794&hl=en-IN&gl=in&ssta=1&q=Fairfield+by+Marriott+Agra&ts=CAEaRwopEicyJTB4Mzk3NDc3M2U0ZjkzYWYyNToweDQwNzNhZWE0YTQwMWMxODcSGhIUCgcI5w8QDBgFEgcI5w8QDBgGGAEyAggC&qs=CAEyE0Nnb0loNE9Ib01yVTY3bEFFQUU4AkIJCYfBAaSkrnNAQgkJh8EBpKSuc0A&ap=ugEGcHJpY2Vz&ictx=1"};
					r.exec(str);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setBounds(517, 39, 123, 37);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4_2 = new JLabel(" Rate:-\r\n₹ 7,786  (1 night, 1 adult) ");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2.setBounds(367, 115, 275, 26);
		panel_1.add(lblNewLabel_4_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		panel_2.setBackground(new Color(143, 188, 143));
		panel_2.setLayout(null);
		panel_2.setBounds(0, 379, 662, 152);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Hotel S S Grand");
		lblNewLabel_2_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_2.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_2.setBounds(369, 1, 276, 43);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Just 12.3 km  from centre. It is luxurious 5 star hotel");
		lblNewLabel_3_3.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_3.setBounds(376, 76, 284, 33);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("D:\\Project _Image\\hotel_ss_lucknow (1).jpg"));
		lblNewLabel_1_2.setBounds(4, 2, 348, 148);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("It also have 4 dining option and provides free parking");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_2.setBounds(376, 93, 276, 33);
		panel_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Lucknow");
		lblNewLabel_4_1_1.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_4_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_1.setBounds(374, 34, 112, 33);
		panel_2.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton_2 = new JButton("Book Now ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.google.com/travel/search?q=Hotel%20S%20S%20Grand&g2lb=2502548%2C2503771%2C2503781%2C4258168%2C4284970%2C4291517%2C4308227%2C4597339%2C4757164%2C4814050%2C4874190%2C4893075%2C4924070%2C4965990%2C4990494%2C72277293%2C72298667%2C72302247%2C72317059%2C72385362%2C72402232%2C72406588%2C72412680%2C72414906%2C72421566%2C72422183%2C72427794&hl=en-IN&gl=in&ssta=1&ts=CAEaRwopEicyJTB4Mzk5OTU3Nzg1NjI3NzFhMzoweGZhMGM1YmU1ZDdmYTk0ZGUSGhIUCgcI5w8QDBgFEgcI5w8QDBgGGAEyAggC&qs=CAEyFENnc0kzcW5xdjkzOGxvYjZBUkFCOAJCCQnelPrX5VsM-kIJCd6U-tflWwz6&ap=ugEGcHJpY2Vz&ictx=1&ved=0CAAQ5JsGahcKEwjQ_si77eCCAxUAAAAAHQAAAAAQBQ"};
					r.exec(str);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(255, 255, 0));
		btnNewButton_2.setBounds(515, 35, 124, 37);
		panel_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_4_4 = new JLabel(" Rate:-\r\n₹ 6,993 (1 night, 1 adult) ");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4.setBounds(370, 113, 275, 26);
		panel_2.add(lblNewLabel_4_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		panel_3.setBackground(new Color(143, 188, 143));
		panel_3.setLayout(null);
		panel_3.setBounds(0, 535, 662, 152);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Situated on 4.5 acres of land. Just 6.7km from centre.");
		lblNewLabel_3_4.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_4.setBounds(371, 74, 287, 33);
		panel_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_1_3.setIcon(new ImageIcon("D:\\Project _Image\\lucknow_hotel (1).jpg"));
		lblNewLabel_1_3.setBounds(4, 2, 348, 148);
		panel_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Lucknow");
		lblNewLabel_4_3.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_4_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_3.setBounds(375, 37, 82, 33);
		panel_3.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("a health club with infilty pool and spa, 5 dining option");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_3.setBounds(372, 89, 271, 33);
		panel_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Lucknow Condominium");
		lblNewLabel_2_2_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_2_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_2_1.setBounds(370, 1, 241, 43);
		panel_3.add(lblNewLabel_2_2_1);
		
		JButton btnNewButton_3 = new JButton("Book Now ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.goibibo.com/hotels/lucknow-condominium-rooms-in-an-apartment-hotel-in-lucknow-3827999702793693718/?hquery={%22ci%22:%2220231228%22,%22co%22:%2220231229%22,%22r%22:%221-2-0%22,%22ibp%22:%22%22}&cc=IN&vcid=9114123290289445387&"};
					r.exec(str);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBackground(new Color(255, 255, 0));
		btnNewButton_3.setBounds(512, 37, 127, 37);
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_4_4_1 = new JLabel(" Rate:-\r\n₹ 3,403 (1 night, 1 adult) ");
		lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4_1.setBounds(368, 118, 275, 26);
		panel_3.add(lblNewLabel_4_4_1);
		
		JButton btnNewButton_4 = new JButton("Go Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Lucknow obj=new Lucknow();
				obj.main(null);
			}
		});
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_4.setBackground(new Color(255, 255, 128));
		btnNewButton_4.setBounds(618, 692, 135, 35);
		frame.getContentPane().add(btnNewButton_4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 69, 662, 152);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBackground(new Color(143, 188, 143));
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Lucknow");
		lblNewLabel_4_1_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_2.setBounds(377, 39, 111, 33);
		panel_1_1.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\Project _Image\\fortune_park (1).jpg"));
		lblNewLabel_1_1.setBounds(4, 2, 348, 148);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Book Now ");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.itchotels.com/in/en/fortunepark-bbd-lucknow"};
					r.exec(str);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1_1.setBounds(515, 39, 123, 37);
		panel_1_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("free wifi and free private parking and room services");
		lblNewLabel_3_1.setBounds(378, 75, 259, 33);
		panel_1_1.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JLabel lblNewLabel_3 = new JLabel("Ideally set in Lucknow features air conditioned room ");
		lblNewLabel_3.setBounds(378, 90, 268, 33);
		panel_1_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Fortune Park BBD");
		lblNewLabel_2_1_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_1.setBounds(372, 5, 212, 33);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_4 = new JLabel(" Rate:-\r\n₹ 16,999  (1 night, 1 adult) ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4.setBounds(377, 117, 275, 26);
		panel_1_1.add(lblNewLabel_4);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.DARK_GRAY);
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(672, 67, 2, 618);
		frame.getContentPane().add(separator);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBackground(new Color(143, 188, 143));
		panel_1_2.setBounds(684, 69, 662, 152);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Lucknow");
		lblNewLabel_4_1_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_3.setBounds(371, 39, 123, 33);
		panel_1_2.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon("D:\\Project _Image\\silver (1).jpg"));
		lblNewLabel_1_4.setBounds(3, 2, 348, 148);
		panel_1_2.add(lblNewLabel_1_4);
		
		JButton btnNewButton_1_2 = new JButton("Book Now ");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.booking.com/searchresults.en-gb.html?ssne=Lucknow&ssne_untouched=Lucknow&highlighted_hotels=10594919&ss=Lucknow&dest_id=-2102835&dest_type=city&hp_avform=1&origin=hp&do_availability_check=1&label=gog235jc-1DCAsobEIXc2lsdmVyLWdyYW5kLWJ5LXNoZWx0ZXJICVgDaGyIAQGYAQm4ARfIAQzYAQPoAQH4AQKIAgGoAgO4AqKci6sGwAIB0gIkYTdjYjIwNDItNzY2YS00NzlhLWExZTAtMzI4OTUyYjBjYmNh2AIE4AIB&aid=356980&lang=en-gb&sb=1&src_elem=sb&src=hotel&checkin=2023-11-29&checkout=2023-11-30&group_adults=2&no_rooms=1&group_children=0"};
					r.exec(str);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1_2.setForeground(new Color(0, 0, 0));
		btnNewButton_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2.setBackground(new Color(255, 255, 0));
		btnNewButton_1_2.setBounds(517, 39, 123, 37);
		panel_1_2.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("Silver Grand By Shelter");
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2.setBounds(369, 2, 293, 43);
		panel_1_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_5 = new JLabel("Offering free WiFi access. It is located Lucknow. Just 14 km");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_5.setBounds(370, 71, 293, 33);
		panel_1_2.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("form centre.");
		lblNewLabel_3_1_4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_4.setBounds(371, 88, 172, 33);
		panel_1_2.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_4_4_1_1 = new JLabel(" Rate:-\r\n₹ 2,691 (1 night, 1 adult) ");
		lblNewLabel_4_4_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4_1_1.setBounds(365, 115, 275, 26);
		panel_1_2.add(lblNewLabel_4_4_1_1);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3.setBackground(new Color(143, 188, 143));
		panel_1_3.setBounds(684, 224, 662, 152);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Hotel Sarvin");
		lblNewLabel_2_1_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_3.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_3.setBounds(368, 4, 274, 39);
		panel_1_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Hotel Sarvin located in Viraj Khand Gamti Nagar Lucknow.");
		lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_2_2.setBounds(370, 74, 293, 33);
		panel_1_3.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Gomti Nagar");
		lblNewLabel_4_1_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_4.setBounds(371, 39, 123, 33);
		panel_1_3.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel(" Just 13 km from Lucknow University. ");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_1_2.setBounds(371, 90, 271, 33);
		panel_1_3.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon("D:\\Project _Image\\sarvin (1).jpg"));
		lblNewLabel_1_5.setBounds(3, 2, 348, 148);
		panel_1_3.add(lblNewLabel_1_5);
		
		JButton btnNewButton_1_3 = new JButton("Book Now ");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.booking.com/searchresults.en-gb.html?ss=Lucknow&ssne=Lucknow&ssne_untouched=Lucknow&highlighted_hotels=6136262&hp_sbox=1&label=gog235jc-1DCAsobEIPc2FydmluLWx1Y2tub3cxSDNYA2hsiAEBmAEJuAEXyAEM2AED6AEBiAIBqAIDuAKKnYurBsACAdICJDk0OTU1NmRiLTIzMmYtNDI2Mi05YmMxLTFkNzgzMzFhYmRlONgCBOACAQ&sid=9ec20a47050602450d270af3edbfa30d&aid=356980&lang=en-gb&sb=1&src_elem=sb&src=hotel&dest_id=-2102835&dest_type=city&checkin=2023-11-29&checkout=2023-11-30&group_adults=2&no_rooms=1&group_children=1&age=0&sb_travel_purpose=leisure"};
					r.exec(str);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1_3.setForeground(new Color(0, 0, 0));
		btnNewButton_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_3.setBackground(new Color(255, 255, 0));
		btnNewButton_1_3.setBounds(517, 39, 123, 37);
		panel_1_3.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_4_4_1_1_1 = new JLabel(" Rate:-\r\n₹ 2,655 (1 night, 1 adult) ");
		lblNewLabel_4_4_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4_1_1_1.setBounds(367, 115, 275, 26);
		panel_1_3.add(lblNewLabel_4_4_1_1_1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_4.setBackground(new Color(143, 188, 143));
		panel_1_4.setBounds(684, 379, 662, 152);
		frame.getContentPane().add(panel_1_4);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("The Elite Lucknow");
		lblNewLabel_2_1_4.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_4.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_4.setBounds(368, 4, 274, 39);
		panel_1_4.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_4_1_5 = new JLabel("Lucknow");
		lblNewLabel_4_1_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_5.setBounds(371, 39, 123, 33);
		panel_1_4.add(lblNewLabel_4_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("");
		lblNewLabel_1_6.setIcon(new ImageIcon("D:\\Project _Image\\elite_hotel (1).jpg"));
		lblNewLabel_1_6.setBounds(3, 2, 348, 148);
		panel_1_4.add(lblNewLabel_1_6);
		
		JButton btnNewButton_1_4 = new JButton("Book Now ");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.booking.com/searchresults.en-gb.html?ss=Lucknow&ssne=Lucknow&ssne_untouched=Lucknow&highlighted_hotels=7498261&hp_sbox=1"};
					r.exec(str);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1_4.setForeground(new Color(0, 0, 0));
		btnNewButton_1_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_4.setBackground(new Color(255, 255, 0));
		btnNewButton_1_4.setBounds(517, 39, 123, 37);
		panel_1_4.add(btnNewButton_1_4);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Located in Lucknow 7.8 km from centre. They");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_3_1.setBounds(368, 74, 284, 33);
		panel_1_4.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("charged 12000 rupees per night");
		lblNewLabel_3_1_2_1.setBounds(368, 90, 274, 33);
		panel_1_4.add(lblNewLabel_3_1_2_1);
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JLabel lblNewLabel_4_4_1_1_1_1 = new JLabel(" Rate:-\r\n₹ 8,000 (1 night, 1 adult) ");
		lblNewLabel_4_4_1_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4_1_1_1_1.setBounds(367, 118, 275, 26);
		panel_1_4.add(lblNewLabel_4_4_1_1_1_1);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_5.setBackground(new Color(143, 188, 143));
		panel_1_5.setBounds(684, 535, 662, 152);
		frame.getContentPane().add(panel_1_5);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("The Centrum");
		lblNewLabel_2_1_5.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_5.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_5.setBounds(368, 4, 274, 39);
		panel_1_5.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_4_1_6 = new JLabel("Lucknow");
		lblNewLabel_4_1_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_6.setBounds(371, 39, 123, 33);
		panel_1_5.add(lblNewLabel_4_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("");
		lblNewLabel_1_7.setIcon(new ImageIcon("D:\\Project _Image\\centram (1).jpg"));
		lblNewLabel_1_7.setBounds(3, 2, 348, 148);
		panel_1_5.add(lblNewLabel_1_7);
		
		JButton btnNewButton_1_5 = new JButton("Book Now ");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.e", "https://www.booking.com/searchresults.en-gb.html?ss=Lucknow&ssne=Lucknow&ssne_untouched=Lucknow&highlighted_hotels=7205058&hp_sbox=1"};
					r.exec(str);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1_5.setForeground(new Color(0, 0, 0));
		btnNewButton_1_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_5.setBackground(new Color(255, 255, 0));
		btnNewButton_1_5.setBounds(517, 39, 123, 37);
		panel_1_5.add(btnNewButton_1_5);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Centrum Hotel located in Lucknow. Offering outdoor pool");
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_4_1.setBounds(368, 78, 284, 33);
		panel_1_5.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_1_3_1 = new JLabel(" and restaurent with free wifi. Just 16.7km from centre");
		lblNewLabel_3_1_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_3_1.setBounds(368, 92, 324, 33);
		panel_1_5.add(lblNewLabel_3_1_3_1);
		
		JLabel lblNewLabel_4_4_1_1_1_1_1 = new JLabel(" Rate:-\r\n₹ 16,200  (1 night, 1 adult) ");
		lblNewLabel_4_4_1_1_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_4_1_1_1_1_1.setBounds(368, 114, 275, 26);
		panel_1_5.add(lblNewLabel_4_4_1_1_1_1_1);
	}
}
