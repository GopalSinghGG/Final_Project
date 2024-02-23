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
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;

public class CinemaBangluru {

	private JFrame frame;
	CinemaBangluru1 c=new CinemaBangluru1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CinemaBangluru window = new CinemaBangluru();
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
	public CinemaBangluru() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
	//	frame.setBounds(100, 100, 450, 300);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width, screen.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 77, 1350, 52);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("New Releases Movies");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaBangluru r= new CinemaBangluru();
				r.main(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(255,51,51));
				lblNewLabel_1.setBackground(new Color(255,255,0));
				lblNewLabel_1.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.BLUE);
				lblNewLabel_1.setOpaque(false);
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(-1, 0, 267, 52);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Trending Movies");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaBangluru r= new CinemaBangluru();
				r.main(null);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(255,51,51));
				lblNewLabel_1_1.setBackground(new Color(255,255,0));
				lblNewLabel_1_1.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1.setForeground(Color.BLUE);
				lblNewLabel_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(274, 0, 265, 52);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Superhit Movies");
		lblNewLabel_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				CinemaBangluru r= new CinemaBangluru();
				r.main(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_2.setForeground(new Color(255,51,51));
				lblNewLabel_1_2.setBackground(new Color(255,255,0));
				lblNewLabel_1_2.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_2.setForeground(Color.BLUE);
				lblNewLabel_1_2.setOpaque(false);
				}
		});
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(520, 0, 265, 52);
		panel.add(lblNewLabel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT MOVIES", "BRAHAMSTRA", "KGF CHAPTER 2", "HEROPANTI", "90 ML", "RAKSHABANDHAN", "EK VILLAIN RETURNS", "CUTTPUTALLI", ""}));
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Segoe Print", Font.BOLD, 20));
		comboBox.setBounds(1026, 2, 203, 48);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Brahmastra")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					ct.getTextField().setText("Bramhastra Part 1 - Shiva");
				}
				else if(comboBox.getSelectedItem().equals("KGF Chapter 2")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					ct.getTextField().setText("KGF Chapter 2");
				}
				else if(comboBox.getSelectedItem().equals("Cuttputalli")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					ct.getTextField().setText("Cuttputalli");
				}
				else if(comboBox.getSelectedItem().equals("Baahubali 2")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					ct.getTextField().setText("Baahubali 2");
				}
				else if(comboBox.getSelectedItem().equals("Ek Villain Returns")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					
					ct.getTextField().setText("Ek Villain Returns");
					
				}
				else if(comboBox.getSelectedItem().equals("90 ML")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					ct.getTextField().setText("90 ML");
				}
				else if(comboBox.getSelectedItem().equals("Heropanti 2")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					ct.getTextField().setText("Heropanti 2");
				}
				else if(comboBox.getSelectedItem().equals("RRR")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					ct.getTextField().setText("RRR");
				}
				else if(comboBox.getSelectedItem().equals("RakshaBandhan")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					ct.getTextField().setText("RakshaBandhan");
				}
				else if(comboBox.getSelectedItem().equals("Lal Singh Chadda")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					ct.getTextField().setText("Lal Singh Chadda");
				}
				else if(comboBox.getSelectedItem().equals("KGF Chapter 2")) {
					frame.dispose();
					CinemaAgra1 ct = new CinemaAgra1();
					ct.getTextField().setText("KGF Chapter 2");
				}
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(1228, 2, 64, 48);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaBangluru1();
				CinemaBangluru1 ct = new CinemaBangluru1();
				ct.movie.setText("Bramhastra Part 1 - Shiva");
				}
			});
		lblNewLabel_2.setBounds(0, 130, 268, 295);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\bramastra_movie.jpg"));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 frame.dispose();
			 new CinemaBangluru1();
			  CinemaBangluru1 r=new  CinemaBangluru1(); 
			  r.movie.setText("Rakshabandhan");
			}
		});
		
		lblNewLabel_2_1.setBounds(269, 130, 268, 295);
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Project _Image\\raksha_bandan_movie.jpg"));
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaBangluru1();
				CinemaBangluru1 s=new CinemaBangluru1();
				s.movie.setText("Cuttputlli");
			}
		});
		lblNewLabel_2_2.setBounds(538, 130, 268, 295);
		lblNewLabel_2_2.setIcon(new ImageIcon("D:\\Project _Image\\cuttputli_movie.jpg"));
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaBangluru1();
				CinemaBangluru1  a=new CinemaBangluru1();
				a.movie.setText("Heropanti 2 ");
			}
		});
		lblNewLabel_2_3.setBounds(808, 130, 268, 295);
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\Project _Image\\heropantti2_movie.jpg"));
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaBangluru1();
				CinemaBangluru1 w=new CinemaBangluru1();
				w.movie.setText("Lal Singh Chadda");
			}
		});
		lblNewLabel_2_4.setBounds(1079, 130, 268, 295);
		lblNewLabel_2_4.setIcon(new ImageIcon("D:\\Project _Image\\lal_singh.jpg"));
		frame.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("");
		lblNewLabel_2_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaBangluru1();
				CinemaBangluru1 y=new CinemaBangluru1();
				y.movie.setText("90 ML");
			}
		});
		lblNewLabel_2_5.setBounds(0, 425, 268, 302);
		lblNewLabel_2_5.setIcon(new ImageIcon("D:\\Project _Image\\90ml (1).jpg"));
		frame.getContentPane().add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();;
				new CinemaBangluru1();
				CinemaBangluru1 q=new CinemaBangluru1();
				q.movie.setText("  RRR  ");
			}
		});
		lblNewLabel_2_1_1.setBounds(270, 430, 268, 295);
		lblNewLabel_2_1_1.setIcon(new ImageIcon("D:\\Project _Image\\rrr_movie.jpg"));
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaBangluru1();
				CinemaBangluru1 c=new CinemaBangluru1();
				c.movie.setText("KGF Chapter 2");
				}
		});
		lblNewLabel_2_2_1.setBounds(538, 430, 268, 295);
		lblNewLabel_2_2_1.setIcon(new ImageIcon("D:\\Project _Image\\kgf2-movie.jpg"));
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("");
		lblNewLabel_2_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaBangluru1();
				CinemaBangluru1 j=new CinemaBangluru1();
				j.movie.setText("Bahubali 2");
			}
		});
		lblNewLabel_2_3_1.setBounds(808, 429, 268, 295);
		lblNewLabel_2_3_1.setIcon(new ImageIcon("D:\\Project _Image\\bahubali Movie.jpg"));
		frame.getContentPane().add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("");
		lblNewLabel_2_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaBangluru1();
				CinemaBangluru1 t=new CinemaBangluru1();
				t.movie.setText("Ek Villain Returns");
			}
		});
		lblNewLabel_2_4_1.setBounds(1079, 429, 268, 295);
		lblNewLabel_2_4_1.setIcon(new ImageIcon("D:\\Project _Image\\ek-villian-movie.jpg"));
		frame.getContentPane().add(lblNewLabel_2_4_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(0, 0, 1347, 80);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\nCINEMA IN  BANGLURU");
		lblNewLabel.setBounds(187, 0, 989, 80);
		panel_1.add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 60));
		lblNewLabel.setBackground(new Color(0, 255, 255));
		
		JButton back = new JButton("");
		
//		back = new JButton("\uF0E7");
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		back.setBounds(42, 11, 52, 42);
		panel_1.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Bengluru();
			}
		});
		
			back.setFont(new Font("Segoe Script", Font.BOLD, 18));
			back.setIcon(new ImageIcon("D:\\Project _Image\\arro2.JPG"));
	}
}
	
