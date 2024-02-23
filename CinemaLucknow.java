package MySql;


import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class CinemaLucknow {

	private JFrame frame;
	private JButton back;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CinemaLucknow window = new CinemaLucknow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CinemaLucknow() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.setVisible(true);
		frame.setResizable(false);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width, screen.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		back = new JButton("\uF0E7");
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				Lucknow  obj=new Lucknow();
			    obj.main(null);
			}
		});
		back.setBorder(null);
		back.setOpaque(false);
		back.setForeground(Color.RED);
		back.setBackground(new Color(238,232,170));
		back.setFont(new Font("Wingdings", Font.BOLD, 30));
		back.setBounds(50,20,70,40);
		frame.getContentPane().add(back);
		
		JLabel lblNewLabel = new JLabel("CINEMA IN LUCKNOW");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255,255,204));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 60));
		lblNewLabel.setBounds(0, 0, 1350, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(0, 81, 1350, 52);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New Releases Movies");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaLucknow();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(255,51,51));
				lblNewLabel_1.setBackground(new Color(255,255,0));
				lblNewLabel_1.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.BLUE);
				lblNewLabel_1.setOpaque(false);
			}
		});
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 0, 265, 52);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Trending Movies");
		lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaLucknow();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(255,51,51));
				lblNewLabel_1_1.setBackground(new Color(255,255,0));
				lblNewLabel_1_1.setOpaque(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1.setForeground(Color.BLUE);
				lblNewLabel_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(273, 0, 265, 52);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Superhit Movies");
		lblNewLabel_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaLucknow();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_2.setForeground(new Color(255,51,51));
				lblNewLabel_1_2.setBackground(new Color(255,255,0));
				lblNewLabel_1_2.setOpaque(true);
			}
			
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
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Segoe Print", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Movies", "Brahmastra", "KGF Chapter 2", "90 ML", "RakshaBandhan", "Ek Villain Returns", "Cuttputalli", "Heropanti 2", "RRR", "Baahubali 2", "Lal Singh Chadda"}));
		comboBox.setBounds(1026, 2, 203, 48);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Brahmastra")) {
					frame.dispose();
					Cinemalucknow2 ct = new Cinemalucknow2();
					ct.getTextField().setText("Bramhastra Part 1 - Shiva");
				}
				else if(comboBox.getSelectedItem().equals("KGF Chapter 2")) {
					frame.dispose();
					CinemaDelhi2 ct = new CinemaDelhi2();
					ct.getTextField().setText("KGF Chapter 2");
				}
				else if(comboBox.getSelectedItem().equals("Cuttputalli")) {
					frame.dispose();
					Cinemalucknow2 ct = new Cinemalucknow2();
					ct.getTextField().setText("Cuttputalli");
				}
				else if(comboBox.getSelectedItem().equals("Baahubali 2")) {
					frame.dispose();
					Cinemalucknow2 ct = new Cinemalucknow2();
					ct.getTextField().setText("Baahubali 2");
				}
				else if(comboBox.getSelectedItem().equals("Ek Villain Returns")) {
					frame.dispose();
					Cinemalucknow2 ct = new Cinemalucknow2();
					
					ct.getTextField().setText("Ek Villain Returns");
					
				}
				else if(comboBox.getSelectedItem().equals("90 ML")) {
					frame.dispose();
					Cinemalucknow2 ct = new Cinemalucknow2();
					ct.getTextField().setText("90 ML");
				}
				else if(comboBox.getSelectedItem().equals("Heropanti 2")) {
					frame.dispose();
					Cinemalucknow2 ct = new Cinemalucknow2();
					ct.getTextField().setText("Heropanti 2");
				}
				else if(comboBox.getSelectedItem().equals("RRR")) {
					frame.dispose();
					Cinemalucknow2 ct = new Cinemalucknow2();
					ct.getTextField().setText("RRR");
				}
				else if(comboBox.getSelectedItem().equals("RakshaBandhan")) {
					frame.dispose();
					Cinemalucknow2 ct = new Cinemalucknow2();
					ct.getTextField().setText("RakshaBandhan");
				}
				else if(comboBox.getSelectedItem().equals("Lal Singh Chadda")) {
					frame.dispose();
					Cinemalucknow2 ct = new Cinemalucknow2();
					ct.getTextField().setText("Lal Singh Chadda");
				}
				else if(comboBox.getSelectedItem().equals("KGF Chapter 2")) {
					frame.dispose();
					Cinemalucknow2 ct = new Cinemalucknow2();
					ct.getTextField().setText("KGF Chapter 2");
				}
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(1228, 2, 64, 48);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(2, 134, 268, 295);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new CinemaAgra1();
				Cinemalucknow2 ct = new Cinemalucknow2();
				ct.movie.setText("Bramhastra Part 1 - Shiva");
				
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\bramastra_movie.jpg"));
		lblNewLabel_2.setBounds(-1, 0, 268, 295);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBounds(271, 134, 268, 295);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Cinemalucknow2 ct = new Cinemalucknow2();
				ct.movie.setText("  RakshaBandhan");
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Project _Image\\raksha_bandan_movie.jpg"));
		lblNewLabel_2_1.setBounds(-1, 0, 268, 295);
		panel_1_1.add(lblNewLabel_2_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBounds(540, 134, 268, 295);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Cinemalucknow2 ct = new Cinemalucknow2();
				ct.movie.setText("  CuttPutlli");
			}
		});
		lblNewLabel_2_2.setIcon(new ImageIcon("D:\\Project _Image\\cuttputli_movie.jpg"));
		lblNewLabel_2_2.setBounds(-1, 0, 268, 295);
		panel_1_2.add(lblNewLabel_2_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3.setBounds(810, 134, 268, 295);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Cinemalucknow2 ct = new Cinemalucknow2();
				ct.movie.setText("  Heropanti 2");
			}
		});
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\Project _Image\\heropantti2_movie.jpg"));
		lblNewLabel_2_3.setBounds(-1, 0, 268, 295);
		panel_1_3.add(lblNewLabel_2_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_4.setBounds(1080, 134, 268, 295);
		frame.getContentPane().add(panel_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Cinemalucknow2 ct = new Cinemalucknow2();
				ct.movie.setText(" Lal Singh Chadda");
			}
		});
		lblNewLabel_2_4.setIcon(new ImageIcon("D:\\Project _Image\\lal_singh.jpg"));
		lblNewLabel_2_4.setBounds(0, 0, 268, 295);
		panel_1_4.add(lblNewLabel_2_4);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_5.setBounds(2, 431, 268, 295);
		frame.getContentPane().add(panel_1_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("");
		lblNewLabel_2_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Cinemalucknow2 ct = new Cinemalucknow2();
				ct.movie.setText("   90 ML");
			}
		});
		lblNewLabel_2_5.setIcon(new ImageIcon("D:\\Project _Image\\90ml (1).jpg"));
		lblNewLabel_2_5.setBounds(-1, 0, 268, 295);
		panel_1_5.add(lblNewLabel_2_5);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1_1.setBounds(271, 431, 268, 295);
		frame.getContentPane().add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Cinemalucknow2 ct = new Cinemalucknow2();
				ct.movie.setText("  RRR");
			}
		});
		lblNewLabel_2_1_1.setIcon(new ImageIcon("D:\\Project _Image\\rrr_movie.jpg"));
		lblNewLabel_2_1_1.setBounds(0, 0, 268, 295);
		panel_1_1_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2_1.setBounds(540, 431, 268, 295);
		frame.getContentPane().add(panel_1_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Cinemalucknow2 ct = new Cinemalucknow2();
				ct.movie.setText(" KGF Chapter 2");
			}
		});
		lblNewLabel_2_2_1.setIcon(new ImageIcon("D:\\Project _Image\\kgf2-movie.jpg"));
		lblNewLabel_2_2_1.setBounds(-1, 0, 268, 295);
		panel_1_2_1.add(lblNewLabel_2_2_1);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_3_1.setBounds(809, 431, 268, 295);
		frame.getContentPane().add(panel_1_3_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("");
		lblNewLabel_2_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Cinemalucknow2 ct = new Cinemalucknow2();
				ct.movie.setText(" Baahubali 2");
			}
		});
		lblNewLabel_2_3_1.setIcon(new ImageIcon("D:\\Project _Image\\bahubali Movie.jpg"));
		lblNewLabel_2_3_1.setBounds(0, 0, 268, 295);
		panel_1_3_1.add(lblNewLabel_2_3_1);
		
		JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setLayout(null);
		panel_1_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_4_1.setBounds(1079, 431, 268, 295);
		frame.getContentPane().add(panel_1_4_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("");
		lblNewLabel_2_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Cinemalucknow2 ct = new Cinemalucknow2();
				ct.movie.setText("Ek Villain Returns");
			}
		});
		lblNewLabel_2_4_1.setIcon(new ImageIcon("D:\\Project _Image\\ek-villian-movie.jpg"));
		lblNewLabel_2_4_1.setBounds(0, 0, 268, 295);
		panel_1_4_1.add(lblNewLabel_2_4_1);
	}
}
