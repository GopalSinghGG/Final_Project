package MySql;


import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

import org.eclipse.core.internal.runtime.RuntimeLog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tourism_place_Bangluru {

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
					Tourism_place_Bangluru window = new Tourism_place_Bangluru();
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
	public Tourism_place_Bangluru() {
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
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width, screen.height);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.setBorder(null);
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Bengluru obj=new Bengluru();
				obj.main(null);
			}
		});
		btnNewButton.setFont(new Font("Wingdings", Font.PLAIN, 30));
		btnNewButton.setBounds(71, 24, 82, 53);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Tourism Places in Bangluru");
		lblNewLabel.setBounds(0, 0, 1350, 88);

		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 50));
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 123, 1350, 606);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(38, 6, 302, 321);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\cubbon_park_bengluru (1).jpg"));
		lblNewLabel_2.setBounds(0, 0, 300, 216);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html><body><p>  Cubbon Park\r\n\r\n\r\n</p></body></html>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(7, 219, 292, 35);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("from ₹2,499 per adult (price varies by group size)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(6, 248, 295, 35);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.GREEN);
		panel_2_2.setBounds(19, 283, 263, 34);
		panel_1.add(panel_2_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("             Book Now");
		lblNewLabel_5_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.bing.com/search?q=cubbon+park+in+bengluru&form=ANSPH1&refig=C5B35F2B75384720B8D31CBF1C0955AD&pc=U531"};
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
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(39, 330, 302, 271);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Project _Image\\shrungagiri temple (1).jpg"));
		lblNewLabel_2_1.setBounds(2, 0, 300, 157);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("<html><body><p>Shrungagiri Sri Shanmukha Temple</p></body></html>");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(7, 156, 292, 43);
		panel_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("from ₹10,760 per group (up to 2)");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1.setBounds(9, 190, 295, 28);
		panel_1_1.add(lblNewLabel_4_1);
		
		JPanel panel_2_2_1_2 = new JPanel();
		panel_2_2_1_2.setLayout(null);
		panel_2_2_1_2.setBackground(Color.GREEN);
		panel_2_2_1_2.setBounds(19, 229, 263, 34);
		panel_1_1.add(panel_2_2_1_2);
		
		JLabel lblNewLabel_5_2_1_2 = new JLabel("             Book Now");
		lblNewLabel_5_2_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://shanmukhatemple.com/"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_2_1_2.setBackground(new Color(0,64,0));
				lblNewLabel_5_2_1_2.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_2_1_2.setBackground(new Color(0,255,0));
				lblNewLabel_5_2_1_2.setOpaque(false);
				
			}	
		});
		lblNewLabel_5_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_5_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_2_1_2.setBackground(Color.GREEN);
		lblNewLabel_5_2_1_2.setBounds(0, 0, 265, 34);
		panel_2_2_1_2.add(lblNewLabel_5_2_1_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(362, 7, 302, 321);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("D:\\Project _Image\\shivoham shiva temple (1).jpg"));
		lblNewLabel_2_2.setBounds(0, 0, 300, 216);
		panel_1_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("<html><body><p>Shivoham shiv temple \r\n</p></body></html>");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_2.setBounds(7, 219, 292, 41);
		panel_1_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("  from ₹12,240 per adult (price varies by group size)");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_2.setBounds(0, 252, 300, 35);
		panel_1_2.add(lblNewLabel_4_2);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBackground(Color.GREEN);
		panel_2_2_1.setBounds(22, 282, 263, 34);
		panel_1_2.add(panel_2_2_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("             Book Now");
		lblNewLabel_5_2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.explorebees.com/Bengaluru/attraction/Shivoham+Shiv+Temple/9415"};
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
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(688, 7, 302, 321);
		panel.add(panel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\Project _Image\\Lumbini garden (1).jpg"));
		lblNewLabel_2_3.setBounds(0, 0, 300, 216);
		panel_1_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("<html><body><p>Lumbini gardens</p></body></html>");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3.setBounds(7, 219, 292, 35);
		panel_1_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("from ₹3,843 per adult ");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_3.setBounds(7, 243, 244, 35);
		panel_1_3.add(lblNewLabel_4_3);
		
		JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setLayout(null);
		panel_2_2_1_1.setBackground(Color.GREEN);
		panel_2_2_1_1.setBounds(17, 282, 263, 34);
		panel_1_3.add(panel_2_2_1_1);
		
		JLabel lblNewLabel_5_2_1_1 = new JLabel("             Book Now");
		lblNewLabel_5_2_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.tripadvisor.com/Attraction_Review-g297628-d1227390-Reviews-Lumbini_Gardens-Bengaluru_Bangalore_District_Karnataka.html"};
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
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(1022, 8, 302, 321);
		panel.add(panel_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setIcon(new ImageIcon("D:\\Project _Image\\shri surya narayan swamy temple..jpg"));
		lblNewLabel_2_4.setBounds(0, 0, 300, 216);
		panel_1_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("<html><body><p> Shree Surya Narayan Swamy Temple</p></body></html>");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_4.setBounds(7, 219, 292, 35);
		panel_1_4.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("from ₹9,394 per adult (price varies by group size)");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_4.setBounds(5, 242, 295, 35);
		panel_1_4.add(lblNewLabel_4_4);
		
		JPanel panel_2_2_1_1_1 = new JPanel();
		panel_2_2_1_1_1.setLayout(null);
		panel_2_2_1_1_1.setBackground(Color.GREEN);
		panel_2_2_1_1_1.setBounds(19, 283, 263, 34);
		panel_1_4.add(panel_2_2_1_1_1);
		
		JLabel lblNewLabel_5_2_1_1_1 = new JLabel("             Book Now");
		lblNewLabel_5_2_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.gosahin.com/places-to-visit/suryanarayana-temple/"};
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
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(362, 330, 302, 271);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("D:\\Project _Image\\park image (1).jpg"));
		lblNewLabel_2_1_1.setBounds(1, 0, 300, 191);
		panel_1_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("<html><body><p>Bugle Rock Park</p></body></html>");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1_1.setBounds(9, 187, 292, 28);
		panel_1_1_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("from ₹4,526 per adult (price varies by group size)");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1_1.setBounds(11, 202, 295, 28);
		panel_1_1_1.add(lblNewLabel_4_1_1);
		
		JPanel panel_2_2_1_2_1 = new JPanel();
		panel_2_2_1_2_1.setLayout(null);
		panel_2_2_1_2_1.setBackground(Color.GREEN);
		panel_2_2_1_2_1.setBounds(22, 232, 263, 34);
		panel_1_1_1.add(panel_2_2_1_2_1);
		
		JLabel lblNewLabel_5_2_1_2_1 = new JLabel("             Book Now");
		lblNewLabel_5_2_1_2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.triphobo.com/places/bangalore-india/bugle-rock-park"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_2_1_2_1.setBackground(new Color(0,64,0));
				lblNewLabel_5_2_1_2_1.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_2_1_2_1.setBackground(new Color(0,255,0));
				lblNewLabel_5_2_1_2_1.setOpaque(false);
				
			}	
		});
		
		lblNewLabel_5_2_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_5_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_2_1_2_1.setBackground(Color.GREEN);
		lblNewLabel_5_2_1_2_1.setBounds(0, 0, 265, 34);
		panel_2_2_1_2_1.add(lblNewLabel_5_2_1_2_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBounds(688, 331, 302, 271);
		panel.add(panel_1_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.setIcon(new ImageIcon("D:\\Project _Image\\srinivash temple (1).jpg"));
		lblNewLabel_2_1_2.setBounds(2, 0, 300, 187);
		panel_1_1_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("<html><body><p>Sri Srinivasa Temple</p></body></html>");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1_2.setBounds(7, 180, 292, 47);
		panel_1_1_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("  from ₹3,333 per adult (price varies by group size)");
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1_2.setBounds(2, 214, 295, 28);
		panel_1_1_2.add(lblNewLabel_4_1_2);
		
		JPanel panel_2_2_1_2_1_1 = new JPanel();
		panel_2_2_1_2_1_1.setLayout(null);
		panel_2_2_1_2_1_1.setBackground(Color.GREEN);
		panel_2_2_1_2_1_1.setBounds(17, 236, 263, 34);
		panel_1_1_2.add(panel_2_2_1_2_1_1);
		
		JLabel lblNewLabel_5_2_1_2_1_1 = new JLabel("             Book Now");
		lblNewLabel_5_2_1_2_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2_1_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://in.worldorgs.com/catalog/bengaluru/hindu-temple/mari-tirupathi-sri-srinivasa-temple"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_2_1_2_1_1.setBackground(new Color(0,64,0));
				lblNewLabel_5_2_1_2_1_1.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_2_1_2_1_1.setBackground(new Color(0,255,0));
				lblNewLabel_5_2_1_2_1_1.setOpaque(false);
				
			}	
		});
		lblNewLabel_5_2_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_2_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_2_1_2_1_1.setBackground(Color.GREEN);
		lblNewLabel_5_2_1_2_1_1.setBounds(1, 0, 264, 34);
		panel_2_2_1_2_1_1.add(lblNewLabel_5_2_1_2_1_1);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setBounds(1019, 332, 302, 271);
		panel.add(panel_1_1_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("");
		lblNewLabel_2_1_3.setIcon(new ImageIcon("D:\\Project _Image\\Sri Jnanakshi Rajarajeshwari Tem.jpg"));
		lblNewLabel_2_1_3.setBounds(2, 0, 300, 182);
		panel_1_1_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("<html><body><p>Shri Jnanakshi\r\n- Rajarajeshwari\r\n- Temple, Bangalore</p></body></html>");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1_3.setBounds(7, 177, 292, 39);
		panel_1_1_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("from ₹3,672 per adult (price varies by group size)");
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_1_3.setBounds(5, 204, 295, 28);
		panel_1_1_3.add(lblNewLabel_4_1_3);
		
		JPanel panel_2_2_1_2_1_1_1 = new JPanel();
		panel_2_2_1_2_1_1_1.setLayout(null);
		panel_2_2_1_2_1_1_1.setBackground(Color.GREEN);
		panel_2_2_1_2_1_1_1.setBounds(21, 233, 263, 34);
		panel_1_1_3.add(panel_2_2_1_2_1_1_1);
		
		JLabel lblNewLabel_5_2_1_2_1_1_1 = new JLabel("             Book Now");
		lblNewLabel_5_2_1_2_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_5_2_1_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.srikailashashrama.org/rajeshwari-temple.html"};
					r.exec(str);
				}catch(Exception e1) {
					e1.printStackTrace();
				
			}
				
			}
			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(0, 0, 128));
				lblNewLabel_5_2_1_2_1_1_1.setBackground(new Color(0,64,0));
				lblNewLabel_5_2_1_2_1_1_1.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
//				lblNewLabel_5.setForeground(new Color(255,255,255));
				lblNewLabel_5_2_1_2_1_1_1.setBackground(new Color(0,255,0));
				lblNewLabel_5_2_1_2_1_1_1.setOpaque(false);
				
			}	
		});
		lblNewLabel_5_2_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_2_1_2_1_1_1.setBackground(Color.GREEN);
		lblNewLabel_5_2_1_2_1_1_1.setBounds(1, 0, 264, 34);
		panel_2_2_1_2_1_1_1.add(lblNewLabel_5_2_1_2_1_1_1);

		JLabel lblNewLabel_1 = new JLabel(
				"Bangalore, officially Bengaluru, is the capital and largest city of the southern Indian state of Karnataka");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.white);
				lblNewLabel_1.setBackground(new Color(139, 0, 0));
			}

			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(139, 0, 0));
				lblNewLabel_1.setBackground(new Color(143, 188, 143));
			}

//			@Override
//			public void mouseClicked(MouseEvent e) {
//				frame.dispose();
//				new TajMahal();
//			}
		});
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(143, 188, 143));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 88, 1350, 36);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
