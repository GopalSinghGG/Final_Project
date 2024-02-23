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

public class HotelsInMumbai {

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
					HotelsInMumbai window = new HotelsInMumbai();
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
	public HotelsInMumbai() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		//frame.setBounds(100, 100, 790, 1000);
		//frame.setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width,screenSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOTELS IN MUMBAI");
		lblNewLabel.setLocation(0, 0);
		lblNewLabel.setBackground(new Color(0, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
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

		JLabel lblNewLabel_2_1 = new JLabel("IHG Hotel Mumbai");
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
		
		JLabel lblNewLabel_4_1 = new JLabel("Business District");
		lblNewLabel_4_1.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_4_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(371, 39, 123, 33);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("located in business district. It also have 4 dining option");
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
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Project _Image\\ihg_hotel (1).jpg"));
		
		JButton btnNewButton_1 = new JButton("See Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.google.com/travel/search?q=IHG%20Hotel%20Mumbai&g2lb=2502548%2C2503771%2C2503781%2C4258168%2C4284970%2C4291517%2C4308227%2C4597339%2C4757164%2C4814050%2C4874190%2C4893075%2C4924070%2C4965990%2C4990494%2C72277293%2C72298667%2C72302247%2C72317059%2C72385362%2C72402232%2C72406588%2C72412680%2C72414906%2C72421566%2C72422183%2C72427794&hl=en-IN&gl=in&ssta=1&ts=CAESCAoCCAMKAggDGhwSGhIUCgcI5w8QCxgeEgcI5w8QDBgBGAEyAhAAKgsKCToDSU5SQgIIEQ&qs=CAEyE0Nnb0lnSzdva3BmSzU5c3ZFQUU4C0IJCa-A1BQ7Kr0AQgkJABdaclGety9CCQnFTACUCXMACg&ap=aAG6AQhvdmVydmlldw&ictx=1&sa=X&ved=0CAAQ5JsGahcKEwjA1-Oo7dyCAxUAAAAAHQAAAAAQCg"};
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
		
		JLabel lblNewLabel_4_2 = new JLabel(" Rate:-\r\n₹ 21,318  (1 night, 1 adult) ");
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
		
		JLabel lblNewLabel_2_2 = new JLabel("West End Hotel ");
		lblNewLabel_2_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_2.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_2.setBounds(369, 1, 276, 43);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Just 1.9 km  from Mumbai Beach. It is luxurious 5 star hotel");
		lblNewLabel_3_3.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_3.setBounds(376, 76, 284, 33);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("D:\\Project _Image\\westend (1).jpg"));
		lblNewLabel_1_2.setBounds(4, 2, 348, 148);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("It also have 4 dining option and provides free parking");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_2.setBounds(376, 91, 276, 33);
		panel_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("South Mumbai");
		lblNewLabel_4_1_1.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		lblNewLabel_4_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_1.setBounds(374, 34, 112, 33);
		panel_2.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton_2 = new JButton("See Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.google.com/travel/search?q=West%20End%20Hotel%20&g2lb=2502548%2C2503771%2C2503781%2C4258168%2C4284970%2C4291517%2C4308227%2C4597339%2C4757164%2C4814050%2C4874190%2C4893075%2C4924070%2C4965990%2C4990494%2C72277293%2C72298667%2C72302247%2C72317059%2C72385362%2C72402232%2C72406588%2C72412680%2C72414906%2C72421566%2C72422183%2C72427794&hl=en-IN&gl=in&ssta=1&ts=CAESCgoCCAMKAggDEAAaPQofEh06GzI4MjAwNiwgQWdyYSwgVXR0YXIgUHJhZGVzaBIaEhQKBwjnDxALGB4SBwjnDxAMGAEYATICEAAqBwoFOgNJTlI&qs=CAAgACgAMroBQ2dzSXBkaS0tNGJpNmZydUFSQUFHbnBCVUdSbVlsYzBkMWhGWlZFeUxVVjZjWEJrVjNWblQzaDZhVmhGTUhCbFNuSnNiSGg1VFhGSUxUTnRlbGxLYW5SWlJtWXdNVnBWV1RkcVMzTmlhRE42VEVoU2NteHNiVzVTYTJ4T2QwbG5VRWRUZWpRMWJtaFBlbFZNWDNGaVgyUTBOV2xxZDNVeFZVbzViRFJYVmtvNFlrWTFlRUpVZFcxSVp3OA1IAA&ap=KigKEgkwrOAPeLovQBFS76mctO9RQBISCW0PvNch9jVAEVLvqZw4elJAMABoAQ&ictx=1&sa=X&ved=0CAAQ5JsGahgKEwjA1-Oo7dyCAxUAAAAAHQAAAAAQvwE"};
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
		
		JLabel lblNewLabel_4_2_1 = new JLabel(" Rate:-\r\n₹ 5,574  (1 night, 1 adult) ");
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1.setBounds(369, 120, 275, 26);
		panel_2.add(lblNewLabel_4_2_1);
		
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
		
		JLabel lblNewLabel_3_4 = new JLabel("Situated on 4.5 acres of land. Just 12km from centre.");
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
		lblNewLabel_1_3.setIcon(new ImageIcon("D:\\Project _Image\\westin mimbai (1).jpg"));
		lblNewLabel_1_3.setBounds(4, 2, 348, 148);
		panel_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Bandra");
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
		lblNewLabel_3_1_3.setBounds(372, 90, 271, 33);
		panel_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Trident Bandra Kurla");
		lblNewLabel_2_2_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_2_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_2_1.setBounds(370, 1, 241, 43);
		panel_3.add(lblNewLabel_2_2_1);
		
		JButton btnNewButton_3 = new JButton("See Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://res.tridenthotels.com/?adult=2&arrive=2023-12-15&chain=24188&child=0&config=meta&configcode=InitialConfigTrident_tnp&currency=INR&depart=2023-12-16&filter=META&gclid=CjwKCAiAsIGrBhAAEiwAEzMlCxu7fiPdFmYtcepGJmfWAXqt30y4t3uLBeOFdU0O9Aj6muPn3qSEOxoC68QQAvD_BwE&hotel=5278&level=hotel&locale=en-US&rooms=1&theme=InitialThemeTrident&themecode=InitialThemeTrident&utm_campaign=MetaI%2FO&utm_content=IN&utm_medium=LocalUniversal&utm_source=GoogleHPA&wh_token=bedca1db-2b56-4725-abb4-0c07aa71cd0d-204210-pms"};
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
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel(" Rate:-\r\n₹ 11,000  (1 night, 1 adult) ");
		lblNewLabel_4_2_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_1_1.setBounds(368, 115, 275, 26);
		panel_3.add(lblNewLabel_4_2_1_1);
		
		JButton btnNewButton_4 = new JButton("Go Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Mumbai obj=new Mumbai();
				obj.main(null);
				}
		});
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_4.setBackground(new Color(255, 255, 0));
		btnNewButton_4.setBounds(618, 689, 135, 35);
		frame.getContentPane().add(btnNewButton_4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 69, 662, 152);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBackground(new Color(143, 188, 143));
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Juhu Mumbai");
		lblNewLabel_4_1_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_2.setBounds(377, 39, 111, 33);
		panel_1_1.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\Project _Image\\BAWA (1).jpg"));
		lblNewLabel_1_1.setBounds(4, 2, 348, 148);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("See Details");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.booking.com/hotel/in/bawa-continental.html"};
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
		lblNewLabel_3_1.setBounds(379, 76, 259, 33);
		panel_1_1.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JLabel lblNewLabel_3 = new JLabel("Ideally set in mumbai features air conditioned room ");
		lblNewLabel_3.setBounds(378, 92, 268, 33);
		panel_1_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Hotel Bawa Continent");
		lblNewLabel_2_1_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_1.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_1.setBounds(372, 5, 212, 33);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_4 = new JLabel(" Rate:-\r\n₹ 7,676  (1 night, 1 adult) ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4.setBounds(377, 120, 275, 26);
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
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Western Suburbs");
		lblNewLabel_4_1_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_3.setBounds(371, 39, 123, 33);
		panel_1_2.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon("D:\\Project _Image\\ORRITED (1).jpg"));
		lblNewLabel_1_4.setBounds(3, 2, 348, 148);
		panel_1_2.add(lblNewLabel_1_4);
		
		JButton btnNewButton_1_2 = new JButton("See Details");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.makemytrip.com/hotels/hotel_orritel_west-details-mumbai.html"};
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
		
		JLabel lblNewLabel_2 = new JLabel("Hotel Orritel West");
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2.setBounds(369, 2, 293, 43);
		panel_1_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_5 = new JLabel("Offering free WiFi access. It is located Western Suburbs in ");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_5.setBounds(370, 71, 293, 33);
		panel_1_2.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("Mumbai. Just 19km form centre.");
		lblNewLabel_3_1_4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_4.setBounds(371, 88, 172, 33);
		panel_1_2.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_4_2_2 = new JLabel(" Rate:-\r\n₹ 7,852  (1 night, 1 adult) ");
		lblNewLabel_4_2_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_2.setBounds(367, 112, 275, 26);
		panel_1_2.add(lblNewLabel_4_2_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3.setBackground(new Color(143, 188, 143));
		panel_1_3.setBounds(684, 224, 662, 152);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("The Paradise By Tunga");
		lblNewLabel_2_1_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_3.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_3.setBounds(368, 4, 274, 39);
		panel_1_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("The Paradise By Tunga located in Mumbai.");
		lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_2_2.setBounds(370, 78, 293, 33);
		panel_1_3.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Western Suburbs");
		lblNewLabel_4_1_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_4.setBounds(371, 39, 123, 33);
		panel_1_3.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel(" Just 17.7km from centre ");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_1_2.setBounds(371, 91, 271, 33);
		panel_1_3.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon("D:\\Project _Image\\TUNGA (1).jpg"));
		lblNewLabel_1_5.setBounds(3, 2, 348, 148);
		panel_1_3.add(lblNewLabel_1_5);
		
		JButton btnNewButton_1_3 = new JButton("See Details");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.cleartrip.com/hotels/details/the-paradise-by-tunga-41596?c=10122023|11122023&city=Mumbai&state=Maharashtra&country=IN&r=2,0"};
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
		
		JLabel lblNewLabel_4_2_2_1 = new JLabel(" Rate:-\r\n₹ 5,737  (1 night, 1 adult) ");
		lblNewLabel_4_2_2_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_2_1.setBounds(367, 113, 275, 26);
		panel_1_3.add(lblNewLabel_4_2_2_1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_4.setBackground(new Color(143, 188, 143));
		panel_1_4.setBounds(684, 379, 662, 152);
		frame.getContentPane().add(panel_1_4);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Sofitel Mumbai BKC");
		lblNewLabel_2_1_4.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_4.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_4.setBounds(368, 4, 274, 39);
		panel_1_4.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_4_1_5 = new JLabel("Bandra");
		lblNewLabel_4_1_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_5.setBounds(371, 39, 123, 33);
		panel_1_4.add(lblNewLabel_4_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("");
		lblNewLabel_1_6.setIcon(new ImageIcon("D:\\Project _Image\\sofitel (1).jpg"));
		lblNewLabel_1_6.setBounds(3, 2, 348, 148);
		panel_1_4.add(lblNewLabel_1_6);
		
		JButton btnNewButton_1_4 = new JButton("See Details");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://all.accor.com/ssr/app/accor/rates/6451/index.en.shtml?dateIn=2023-12-10&nights=1&compositions=2&stayplus=false&snu=false&accessibleRooms=false&hideWDR=false&hideHotelDetails=false&gclid=CjwKCAiAsIGrBhAAEiwAEzMlC-XzL-Zl38cLTyrNozdE8-cHWUANq5K8vysLxcd1b-Sn46CFjYYGqxoC05EQAvD_BwE&utm_campaign=6451-IN-cpc-desktop-default-0--localuniversal-20595544471-0-0-1&utm_medium=partenariats&hmGUID=2a03fe9a-81a5-4108-182c-f302beb606a2&utm_source=Google%20Hotel%20Ads"};
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
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Located in bandra mumbai 12.2 km from centre. They");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_3_1.setBounds(368, 76, 284, 33);
		panel_1_4.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("charged 12000 rupees per night");
		lblNewLabel_3_1_2_1.setBounds(368, 95, 274, 33);
		panel_1_4.add(lblNewLabel_3_1_2_1);
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JLabel lblNewLabel_4_2_2_1_1 = new JLabel(" Rate:-\r\n₹ 13,300  (1 night, 1 adult) ");
		lblNewLabel_4_2_2_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_2_1_1.setBounds(367, 124, 275, 26);
		panel_1_4.add(lblNewLabel_4_2_2_1_1);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_5.setBackground(new Color(143, 188, 143));
		panel_1_5.setBounds(684, 535, 662, 152);
		frame.getContentPane().add(panel_1_5);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Hotel Metropole Inn");
		lblNewLabel_2_1_5.setForeground(new Color(139, 0, 0));
		lblNewLabel_2_1_5.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel_2_1_5.setBounds(368, 4, 274, 39);
		panel_1_5.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_4_1_6 = new JLabel("Andheri Mumbai");
		lblNewLabel_4_1_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1_6.setBounds(371, 39, 123, 33);
		panel_1_5.add(lblNewLabel_4_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("");
		lblNewLabel_1_7.setIcon(new ImageIcon("D:\\Project _Image\\matropole (1).jpg"));
		lblNewLabel_1_7.setBounds(3, 2, 348, 148);
		panel_1_5.add(lblNewLabel_1_7);
		
		JButton btnNewButton_1_5 = new JButton("See Details");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str[]=new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.google.com/travel/search?q=Hotel%20Metropole%20Inn&g2lb=2502548%2C2503771%2C2503781%2C4258168%2C4284970%2C4291517%2C4308227%2C4597339%2C4757164%2C4814050%2C4874190%2C4893075%2C4924070%2C4965990%2C4990494%2C72277293%2C72298667%2C72302247%2C72317059%2C72385362%2C72402232%2C72406588%2C72412680%2C72414906%2C72421566%2C72422183%2C72427794&hl=en-IN&gl=in&ssta=1&ts=CAEaHhIcEhQKBwjnDxAMGAoSBwjnDxAMGAsYATIECAAQACoHCgU6A0lOUg&qs=CAAgACgA&ap=MAC6AQZwcmljZXM&ictx=1&ved=0CAAQ5JsGahcKEwjIg-CH79yCAxUAAAAAHQAAAAAQbA"};
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
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Metropole Hotel located in mumbai. Offering outdoor pool");
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_4_1.setBounds(368, 78, 284, 33);
		panel_1_5.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_1_3_1 = new JLabel(" and restaurent with free wifi. Just 16.7km from centre");
		lblNewLabel_3_1_3_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3_1_3_1.setBounds(368, 94, 324, 33);
		panel_1_5.add(lblNewLabel_3_1_3_1);
		
		JLabel lblNewLabel_4_2_2_1_1_1 = new JLabel(" Rate:-\r\n₹ 5,241   (1 night, 1 adult) ");
		lblNewLabel_4_2_2_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_4_2_2_1_1_1.setBounds(361, 122, 275, 26);
		panel_1_5.add(lblNewLabel_4_2_2_1_1_1);
	}
}
