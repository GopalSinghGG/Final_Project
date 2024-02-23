  package MySql;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delhi {

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
					Delhi window = new Delhi();
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
	public Delhi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(screen.width, screen.height);
//		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 1350, 86);
		frame.getContentPane().add(panel);
		
		JLabel lblWelcomeToDelhi = new JLabel("WELCOME TO DELHI");
		lblWelcomeToDelhi.setForeground(new Color(0, 128, 0));
		lblWelcomeToDelhi.setFont(new Font("Segoe Print", Font.BOLD, 43));
		lblWelcomeToDelhi.setBounds(415, 1, 621, 86);
		panel.add(lblWelcomeToDelhi);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Downloads\\Ministry_of_Housing.png"));
		lblNewLabel_3.setBounds(30, 1, 187, 87);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Downloads\\ek_kadam.png"));
		lblNewLabel_3_1.setBounds(1143, 0, 158, 87);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("  HOME");
		lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				 Delhi obj=new Delhi();
				 obj.main(null);
			
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(255,255,255));
				lblNewLabel_1.setBackground(new Color(0,0,0));
				lblNewLabel_1.setOpaque(false);
			}		
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(0, 0, 128));
				lblNewLabel_1.setBackground(new Color(139,0,0));
				lblNewLabel_1.setOpaque(true);
			}
		});
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1.setBounds(0, 86, 157, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("    ATM");
		lblNewLabel_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				ATM_DELHI obj=new ATM_DELHI();
				obj.main(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(0, 0, 128));
				lblNewLabel_1_1.setBackground(new Color(139,0,0));
				lblNewLabel_1_1.setOpaque(true);
				
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(255,255,255));
				lblNewLabel_1_1.setBackground(new Color(0,0,0));
				lblNewLabel_1_1.setOpaque(false);
				
			}		
		});
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(167, 86, 174, 54);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("   HOTELS");
		lblNewLabel_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			 Hotel_Delhi  obj=new Hotel_Delhi();
			 obj.main(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1_1.setForeground(new Color(0, 0, 128));
				lblNewLabel_1_1_1.setBackground(new Color(139,0,0));
				lblNewLabel_1_1_1.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1_1.setForeground(new Color(255,255,255));
				lblNewLabel_1_1_1.setBackground(new Color(0,0,0));
				lblNewLabel_1_1_1.setOpaque(false);
				
			}		
		});
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(351, 86, 212, 54);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("    CINEMA");
		lblNewLabel_1_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			    CinemaDelhi obj=new CinemaDelhi();
			    obj.main(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1_2.setForeground(new Color(0, 0, 128));
				
				lblNewLabel_1_1_2.setBackground(new Color(139,0,0));
				lblNewLabel_1_1_2.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1_2.setForeground(new Color(255,255,255));
				lblNewLabel_1_1_2.setBackground(new Color(0,0,0));
				lblNewLabel_1_1_2.setOpaque(false);
				
			}	
			
		});
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1_2.setBounds(559, 85, 212, 54);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("   TOURISM PLACES ");
		lblNewLabel_1_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Tourism_place_Delhi obj=new Tourism_place_Delhi();
				obj.main(null);;
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1_3.setForeground(new Color(0, 0, 128));
				lblNewLabel_1_1_3.setBackground(new Color(139,0,0));
				lblNewLabel_1_1_3.setOpaque(true);
				
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1_3.setForeground(new Color(255,255,255));
				lblNewLabel_1_1_3.setBackground(new Color(0,0,0));
				lblNewLabel_1_1_3.setOpaque(false);
				
			}
			
		});
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1_3.setBounds(781, 86, 346, 54);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("    ABOUT");
		lblNewLabel_1_1_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				AboutDelhi obj=new AboutDelhi();
				obj.main(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1_4.setForeground(new Color(0, 0, 128));
				lblNewLabel_1_1_4.setBackground(new Color(139,0,0));
				lblNewLabel_1_1_4.setOpaque(true);
				
				
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1_4.setForeground(new Color(255,255,255));
				lblNewLabel_1_1_4.setBackground(new Color(0,0,0));
				lblNewLabel_1_1_4.setOpaque(false);
				
			}
		});
		lblNewLabel_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_4.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1_4.setBounds(1137, 86, 213, 54);
		frame.getContentPane().add(lblNewLabel_1_1_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 139, 1350, 590);
		frame.getContentPane().add(panel_1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1, 1);
		panel_1.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\Delhi_fort (1).jpg"));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(0, 0, 674, 590);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("RED FORT (Lal Quila)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(704, 33, 244, 33);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("<html><body><p> The Red Fort is a historical fortification in the old Delhi area.<br> Shah Jahan constructed it in the year 1639 as a result of a capital shift from Agra to Delhi.<br> Used as the main residence of the emperors of the Mughal dynasty,<br> this imposing piece of architecture derives its name from its impregnable red sandstone walls.<br> In addition to accommodating the emperors and their households, <br>it was the ceremonial and political centre of the Mughal state and the setting for events critically<br> impacting the region. Today, this monument is home to several museums that have an assortment of precious artefacts on display.<br> Every year, the Indian Prime Minister unfurls the national flag here on the Independence Day.</p>\r\n </body></html>");
		lblNewLabel_5.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblNewLabel_5.setBounds(709, 85, 631, 429);
		panel_1.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("GO HOME PAGE");
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new user_Home_r();
			}
		});
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setForeground(Color.YELLOW);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(1143, 523, 147, 40);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("KNOW MORE...");
		lblNewLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" ,"https://en.wikipedia.org/wiki/Red_Fort"};
					r.exec(str);
			}catch(Exception e1) {
				e1.printStackTrace();
			}
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(new Color(0,128,0));
				lblNewLabel.setOpaque(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(new Color(0,0,160));
				lblNewLabel.setOpaque(true);
			}
		});
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblNewLabel.setBounds(704, 525, 147, 25);
		panel_1.add(lblNewLabel);
	}
}
