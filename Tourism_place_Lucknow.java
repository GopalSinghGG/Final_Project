package MySql;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tourism_place_Lucknow {

	private JFrame frame;
	Runtime r =Runtime.getRuntime();
    Thread t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tourism_place_Lucknow window = new Tourism_place_Lucknow();
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
	public Tourism_place_Lucknow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
	    Dimension screen =Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(screen.width,screen.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1350, 88);
		panel.setBackground(new Color(0, 0, 255));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOURISM PLACES IN LUCKOW ");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 38));
		lblNewLabel.setBounds(370, 0, 584, 88);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Lucknow  obj=new  Lucknow();
				obj.main(null);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\Project _Image\\arro2.JPG"));
		btnNewButton.setBounds(10, 25, 62, 39);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("LUCKNOW IS THE CAPITAL OF STATE OF UP \r\n");
		lblNewLabel_1.setBounds(0, 86, 1350, 36);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBackground(new Color(143, 188, 143));
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(34, 132, 302, 321);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\l3.jpg"));
		lblNewLabel_2.setBounds(0, 0, 300, 216);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html><body><p> Bara Imambara\r\n</p></body></html>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(7, 216, 292, 34);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rate - ₹ 15.00  per adult");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(6, 249, 295, 27);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		panel_2.setBackground(new Color(0, 255, 0));
		panel_2.setBounds(19, 282, 263, 34);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("             Book Now");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.thrillophilia.com/attractions/bara-imambara-lucknow"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5.setBackground(new Color(0,64,0));
				lblNewLabel_5.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5.setBackground(new Color(0,255,0));
				lblNewLabel_5.setOpaque(false);
				
			}	
		});
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBackground(new Color(0, 255, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5.setBounds(0, 0, 265, 34);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(35, 456, 302, 271);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Project _Image\\l5.jpg"));
		lblNewLabel_2_1.setBounds(2, 0, 300, 172);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("<html><body><p>\r\nChattar Manzil\r\n</p></body></html>");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(7, 170, 292, 38);
		panel_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("from ₹30.00 per adult");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1.setBounds(6, 202, 295, 28);
		panel_1_1.add(lblNewLabel_4_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.GREEN);
		panel_2_2.setBounds(17, 229, 263, 34);
		panel_1_1.add(panel_2_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("             Book Now");
		lblNewLabel_5_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.thrillophilia.com/attractions/chattar-manzil-lucknow"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_2.setBackground(new Color(0,64,0));
				lblNewLabel_5_2.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_2.setBackground(new Color(0,255,0));
				lblNewLabel_5_2.setOpaque(false);
				
			}	
		});
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_2.setBackground(Color.GREEN);
		lblNewLabel_5_2.setBounds(0, 0, 265, 34);
		panel_2_2.add(lblNewLabel_5_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(358, 133, 302, 321);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("D:\\Project _Image\\ll1.jpg"));
		lblNewLabel_2_2.setBounds(0, 0, 300, 216);
		panel_1_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("<html><body><p> \r\n\r\nChota Imambara</p></body></html>");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_2.setBounds(7, 213, 292, 34);
		panel_1_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Rate - ₹ 25.00  per adult");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_2.setBounds(6, 246, 295, 34);
		panel_1_2.add(lblNewLabel_4_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.GREEN);
		panel_2_1.setBounds(17, 281, 263, 34);
		panel_1_2.add(panel_2_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("             Book Now");
		lblNewLabel_5_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.thrillophilia.com/attractions/chota-imambara-lucknow"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_1.setBackground(new Color(0,64,0));
				lblNewLabel_5_1.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_1.setBackground(new Color(0,255,0));
				lblNewLabel_5_1.setOpaque(false);
				
			}	
		});
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_1.setBackground(Color.GREEN);
		lblNewLabel_5_1.setBounds(2, 0, 261, 34);
		panel_2_1.add(lblNewLabel_5_1);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(684, 133, 302, 321);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\Project _Image\\l2.jpg"));
		lblNewLabel_2_3.setBounds(0, 0, 300, 216);
		panel_1_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("<html><body><p>\r\nRumi Darwaza</p></body></html>");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3.setBounds(7, 219, 292, 38);
		panel_1_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("from ₹30.00 per adult ");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_3.setBounds(6, 255, 255, 21);
		panel_1_3.add(lblNewLabel_4_3);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.GREEN);
		panel_2_1_1.setBounds(20, 282, 263, 34);
		panel_1_3.add(panel_2_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("             Book Now");
		lblNewLabel_5_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.thrillophilia.com/attractions/rumi-darwaza-lucknow"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_1_1.setBackground(new Color(0,64,0));
				lblNewLabel_5_1_1.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_1_1.setBackground(new Color(0,255,0));
				lblNewLabel_5_1_1.setOpaque(false);
				
			}	
		});
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_1_1.setBackground(Color.GREEN);
		lblNewLabel_5_1_1.setBounds(2, 0, 261, 34);
		panel_2_1_1.add(lblNewLabel_5_1_1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(1018, 134, 302, 321);
		frame.getContentPane().add(panel_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setIcon(new ImageIcon("D:\\Project _Image\\l4.jpg"));
		lblNewLabel_2_4.setBounds(0, 0, 300, 216);
		panel_1_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("<html><body><p>\r\nBritish Residency\r\n</p></body></html>");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_4.setBounds(7, 219, 292, 44);
		panel_1_4.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("from ₹20.00 per adult ");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_4.setBounds(6, 252, 295, 35);
		panel_1_4.add(lblNewLabel_4_4);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBackground(Color.GREEN);
		panel_2_1_1_1.setBounds(19, 281, 263, 34);
		panel_1_4.add(panel_2_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("             Book Now");
		lblNewLabel_5_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.thrillophilia.com/attractions/british-residency-lucknow"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_1_1_1.setBackground(new Color(0,64,0));
				lblNewLabel_5_1_1_1.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_1_1_1.setBackground(new Color(0,255,0));
				lblNewLabel_5_1_1_1.setOpaque(false);
				
			}	
		});
		lblNewLabel_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_1_1_1.setBackground(Color.GREEN);
		lblNewLabel_5_1_1_1.setBounds(2, 0, 261, 34);
		panel_2_1_1_1.add(lblNewLabel_5_1_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(358, 456, 302, 271);
		frame.getContentPane().add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("D:\\Project _Image\\l6.jpg"));
		lblNewLabel_2_1_1.setBounds(1, 0, 300, 191);
		panel_1_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("<html><body><p>\r\n\r\nAmbedkar Park</p></body></html>");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1_1.setBounds(7, 187, 292, 35);
		panel_1_1_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("from ₹20.00 per adult");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1_1.setBounds(6, 207, 295, 28);
		panel_1_1_1.add(lblNewLabel_4_1_1);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBackground(Color.GREEN);
		panel_2_2_1.setBounds(17, 233, 263, 34);
		panel_1_1_1.add(panel_2_2_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("             Book Now");
		lblNewLabel_5_2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.thrillophilia.com/attractions/ambedkar-park-lucknow"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_2_1.setBackground(new Color(0,64,0));
				lblNewLabel_5_2_1.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_2_1.setBackground(new Color(0,255,0));
				lblNewLabel_5_2_1.setOpaque(false);
				
			}	
		});
		lblNewLabel_5_2_1.setForeground(Color.WHITE);
		lblNewLabel_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_2_1.setBackground(Color.GREEN);
		lblNewLabel_5_2_1.setBounds(0, 0, 265, 34);
		panel_2_2_1.add(lblNewLabel_5_2_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBounds(684, 457, 302, 271);
		frame.getContentPane().add(panel_1_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.setIcon(new ImageIcon("D:\\Project _Image\\l7.jpg"));
		lblNewLabel_2_1_2.setBounds(-8, 0, 300, 187);
		panel_1_1_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("<html><body><p>\r\nLucknow Zoological Garden</p></body></html>");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1_2.setBounds(2, 180, 292, 28);
		panel_1_1_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("from ₹60.00 per adult ");
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1_2.setBounds(2, 198, 295, 28);
		panel_1_1_2.add(lblNewLabel_4_1_2);
		
		JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setLayout(null);
		panel_2_2_1_1.setBackground(Color.GREEN);
		panel_2_2_1_1.setBounds(16, 236, 263, 34);
		panel_1_1_2.add(panel_2_2_1_1);
		
		JLabel lblNewLabel_5_2_1_1 = new JLabel("             Book Now");
		lblNewLabel_5_2_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.thrillophilia.com/attractions/lucknow-zoological-garden-lucknow"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_2_1_1.setBackground(new Color(0,64,0));
				lblNewLabel_5_2_1_1.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_2_1_1.setBackground(new Color(0,255,0));
				lblNewLabel_5_2_1_1.setOpaque(false);
				
			}	
		});
		lblNewLabel_5_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_2_1_1.setBackground(Color.GREEN);
		lblNewLabel_5_2_1_1.setBounds(0, 0, 265, 34);
		panel_2_2_1_1.add(lblNewLabel_5_2_1_1);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setBounds(1020, 458, 303, 271);
		frame.getContentPane().add(panel_1_1_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("");
		lblNewLabel_2_1_3.setIcon(new ImageIcon("D:\\Project _Image\\l8.jpg"));
		lblNewLabel_2_1_3.setBounds(2, 0, 300, 182);
		panel_1_1_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("<html><body><p>\r\n\r\nRam Manohar Lohiya Park\r\n\r\n</p></body></html>");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1_3.setBounds(7, 178, 292, 34);
		panel_1_1_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("from ₹10.00 per adult (above 5yr) ");
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1_3.setBounds(12, 202, 295, 28);
		panel_1_1_3.add(lblNewLabel_4_1_3);
		
		JPanel panel_2_2_1_1_1 = new JPanel();
		panel_2_2_1_1_1.setLayout(null);
		panel_2_2_1_1_1.setBackground(Color.GREEN);
		panel_2_2_1_1_1.setBounds(17, 233, 263, 34);
		panel_1_1_3.add(panel_2_2_1_1_1);
		
		JLabel lblNewLabel_5_2_1_1_1 = new JLabel("             Book Now");
		lblNewLabel_5_2_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.thrillophilia.com/attractions/ram-manohar-lohiya-park-lucknow"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_2_1_1_1.setBackground(new Color(0,64,0));
				lblNewLabel_5_2_1_1_1.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_2_1_1_1.setBackground(new Color(0,255,0));
				lblNewLabel_5_2_1_1_1.setOpaque(false);
				
			}	
		});
		lblNewLabel_5_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_2_1_1_1.setBackground(Color.GREEN);
		lblNewLabel_5_2_1_1_1.setBounds(0, 0, 265, 34);
		panel_2_2_1_1_1.add(lblNewLabel_5_2_1_1_1);

	}
}
