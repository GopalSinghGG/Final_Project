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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agra {

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
					Agra window = new Agra();
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
	public Agra() {
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
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		Dimension screen= Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width, screen.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 1350, 86);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TAJ CITY AGRA ");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 43));
		lblNewLabel.setBounds(378, 1, 621, 86);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Downloads\\Ministry_of_Housing.png"));
		lblNewLabel_3.setBounds(10, 0, 187, 87);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Downloads\\ek_kadam.png"));
		lblNewLabel_3_1.setBounds(1143, 0, 158, 87);
		panel.add(lblNewLabel_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 139, 1350, 590);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1, 1);
		panel_1.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		layeredPane.add(panel_2, "name_46376172017800");
		
		JPanel panel_3 = new JPanel();
		layeredPane.add(panel_3, "name_46379843726200");
		
		JPanel panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_46383003990400");
		
		JPanel panel_5 = new JPanel();
		layeredPane.add(panel_5, "name_46389869807100");
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 674, 590);
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\taj.jpg"));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("TAJ MAHAL");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(704, 25, 169, 33);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("<html><body><p> The Taj Mahal is an invory-white marble mausoleum on the <br> south bank of Yamuna river in the indian city of Agra.<br> It was commissioned in 1632 by the Mughal emperor, Shah Jahan (reigned from 1628 ton 1658)<br> The tomb is the centrepiece of a 16 hectare (42-acre) complex, which includes  a mosque and a guest house<br> and is set in formal garden bounded on three sides by a crenellated wall.\r\nThe Taj Mahal was commissioned by Shah Jahan in 1631, <br>to be built in the memory of his wife Mumtaz Mahal, who died on 17 June that year, while giving birth to their 14th child, Gauhara Begum.[14][15]<br> Construction started in 1632,[16] and the mausoleum was completed in 1648</p>\r\n </body></html>");
		lblNewLabel_5.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblNewLabel_5.setBounds(684, 69, 656, 471);
		panel_1.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("GO HOME PAGE");
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new user_Home_r();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(1193, 539, 147, 40);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("KNOW MORE...");
		lblNewLabel_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" ,"https://en.wikipedia.org/wiki/Taj_Mahal"};
					r.exec(str);
			}catch(Exception e1) {
				e1.printStackTrace();
			}
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_6.setForeground(new Color(0,128,0));
				lblNewLabel_6.setOpaque(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_6.setForeground(new Color(0,0,160));
				lblNewLabel_6.setOpaque(true);
			}
		});
		lblNewLabel_6.setForeground(new Color(0, 0, 160));
		lblNewLabel_6.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblNewLabel_6.setBounds(772, 493, 147, 25);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("  HOME");
		lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				 Agra obj=new Agra();
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
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 85, 147, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(" ATM");
		lblNewLabel_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new ATM();
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
		lblNewLabel_1_1.setBounds(215, 85, 110, 54);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("  HOTELS");
		lblNewLabel_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			 Hotel_Agra  obj=new Hotel_Agra();
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
		lblNewLabel_1_1_1.setBounds(379, 85, 184, 54);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("  CINEMA");
		lblNewLabel_1_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			    CinemaAgra obj=new CinemaAgra();
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
		lblNewLabel_1_1_2.setBounds(597, 85, 174, 54);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel(" TOURISM PLACES ");
		lblNewLabel_1_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Tourism_place_Agra obj=new Tourism_place_Agra();
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
		lblNewLabel_1_1_3.setBounds(817, 85, 310, 54);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("  ABOUT");
		lblNewLabel_1_1_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				AboutAgra obj=new AboutAgra();
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
		lblNewLabel_1_1_4.setBounds(1184, 85, 147, 54);
		frame.getContentPane().add(lblNewLabel_1_1_4);
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
