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
import javax.swing.SwingConstants;
import java.awt.Point;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lucknow {

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
					Lucknow window = new Lucknow();
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
	public Lucknow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
//		frame.setBounds(100, 100, 450, 300);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO LUCKNOW");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setLocation(new Point(0, 2));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 50));
		lblNewLabel.setBackground(new Color(152, 251, 152));
		lblNewLabel.setAlignmentY(5.0f);
		lblNewLabel.setBounds(0, 0, 1350, 78);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HOME");
		lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Lucknow obj=new Lucknow();
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
				lblNewLabel_1.setBackground(new Color(151,251,151));
				lblNewLabel_1.setOpaque(false);
			}	
		});
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(0, 79, 163, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("HOTELS");
		lblNewLabel_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			    new HotelsInLucknow();
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
				lblNewLabel_1_3.setBackground(new Color(151,251,151));
				lblNewLabel_1_3.setOpaque(false);
			}	
		});
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_3.setBackground(new Color(0, 0, 0));
		lblNewLabel_1_3.setBounds(331, 79, 229, 45);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("ATM");
		lblNewLabel_1_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			     new ATM_Lucknow();	
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
				lblNewLabel_1_4.setBackground(new Color(151,251,151));
				lblNewLabel_1_4.setOpaque(false);
			}		
			
			
		});
		lblNewLabel_1_4.setOpaque(true);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_4.setBackground(new Color(0, 0, 0));
		lblNewLabel_1_4.setBounds(162, 79, 171, 45);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("ABOUT");
		lblNewLabel_1_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new AboutLucknow();
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
				lblNewLabel_1_5.setBackground(new Color(151,251,151));
				lblNewLabel_1_5.setOpaque(false);
			}	
		});
		lblNewLabel_1_5.setOpaque(true);
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_5.setBackground(new Color(0, 0, 0));
		lblNewLabel_1_5.setBounds(1100, 79, 250, 45);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_2 = new JLabel("CINEMA");
		lblNewLabel_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaLucknow();
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
				lblNewLabel_1_2.setBackground(new Color(151,251,151));
				lblNewLabel_1_2.setOpaque(false);
			}	
		});
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_1_2.setBounds(557, 79, 242, 45);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setLayout(null);
		panel.setBounds(0, 123, 1350, 606);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Project _Image\\chhota-imabara (1).jpg"));
		lblNewLabel_2_1.setBounds(0, 0, 789, 606);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chhota Imambara :-");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2.setBounds(826, 11, 267, 41);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("<html><body><p> Chota Imambara, also known as Imambara Hussainabad Mubarak is an imposing monument located in the city of Lucknow, Uttar Pradesh, India. It took 54 years to finalize it. Built as an imambara or a congregation hall for Shia Muslims, by Muhammad Ali Shah, the Nawab of Awadh in 1838, it was to serve as a mausoleum for himself and his mother, who is buried beside him.<br>This structure serves as a mausoleum for the grave of Princess Asiya Begum Sahiba, <br>daughter of the Nawab Mohammed Ali Shah and two other graves.This is a small-scale copy of the Taj Mahal.Water supply for the fountains and the water bodies inside the imambara came directly from the Gomti River  </p>\r\n </body></html>");
		lblNewLabel_5.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblNewLabel_5.setBounds(799, 36, 551, 470);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Know More");
		lblNewLabel_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://en.wikipedia.org/wiki/Chota_Imambara"};
					r.exec(str);
					
					
				}catch(Exception e1) {
					e1.printStackTrace();
					
				}
			}
		});
		lblNewLabel_3.setForeground(new Color(0, 100, 0));
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblNewLabel_3.setBounds(1206, 502, 134, 50);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("GO HOME PAGE");
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			   new user_Home_r();
			}
		});
		btnNewButton_1.setForeground(Color.YELLOW);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(946, 555, 147, 40);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TOURISM PLACES");
		lblNewLabel_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Tourism_place_Lucknow obj=new Tourism_place_Lucknow();
				obj.main(null);
				
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
				lblNewLabel_1_1.setBackground(new Color(151,251,151));
				lblNewLabel_1_1.setOpaque(false);
			}	
		});
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1_1.setBounds(799, 79, 305, 45);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
}
