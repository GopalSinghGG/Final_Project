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

public class TouristInMumbai {

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
					TouristInMumbai window = new TouristInMumbai();
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
	public TouristInMumbai() {
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
				Mumbai obj=new Mumbai();
				obj.main(null);
			}
		});
		btnNewButton.setFont(new Font("Wingdings", Font.PLAIN, 30));
		btnNewButton.setBounds(100, 21, 75, 53);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Tourism Places in Mumbai");
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
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\t1.jpg"));
		lblNewLabel_2.setBounds(0, 0, 300, 216);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html><body><p>  Highlights of Mumbai Private  Sightseeing Tour:Winner of   TRAVELLERS CHOICE AWARD</p></body></html>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(7, 219, 292, 35);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("from ₹2,477 per adult (price varies by group size)");
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
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.viator.com/en-IN/tours/Mumbai/Mumbai-City-Sightseeing-Tour/d953-10200P4"};
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
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Project _Image\\visit.jpg"));
		lblNewLabel_2_1.setBounds(2, 0, 300, 157);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("<html><body><p>  Full Day Visit to City of  Dreams Mumbai in Private Vehicle</p></body></html>");
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
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.viator.com/Mumbai/d953-ttd/p-114230P1?m=28353&supag=118063152139&supsc=dsa-694098303804&supai=660597825057&supdv=c&supnt=g&suplp=9040183&supli=1007785&supti=dsa-694098303804&tsem=true&supci=dsa-694098303804&supap1=&supap2=&gad_source=1&gclid=CjwKCAiAsIGrBhAAEiwAEzMlC24jwEsiSzzGud8RpGH6iPJkKIQiVLH60eyRNYJSgM_MsoJmvlOi2RoC-oAQAvD_BwE"};
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
		lblNewLabel_2_2.setIcon(new ImageIcon("D:\\Project _Image\\t2.jpg"));
		lblNewLabel_2_2.setBounds(0, 0, 300, 216);
		panel_1_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("<html><body><p> Private Elephanta Tour with Mumbai Sightseeing Including AC vehicle</p></body></html>");
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
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.viator.com/tours/Mumbai/Elephanta-Tour-with-Mumbai-Sightseeing-Including-AC-vehicle/d953-85379P9?m=28353&supag=118063152419&supsc=dsa-694098304204&supai=660597825093&supdv=c&supnt=g&suplp=9145158&supli=1007785&supti=dsa-694098304204&tsem=true&supci=dsa-694098304204&supap1=&supap2=&gad_source=1&gclid=CjwKCAiAsIGrBhAAEiwAEzMlC0wvaHG9XMgnw5RCT0r4aFD9DoIo27E97ExVSeTIboI_U3V_xtYoXxoCQpMQAvD_BwE"};
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
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\Project _Image\\bomby_express.jpg"));
		lblNewLabel_2_3.setBounds(0, 0, 300, 216);
		panel_1_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("<html><body><p>Bombay Express Mumbai Food <br>Tour with 15+ Tastings</p></body></html>");
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
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://viator.com/tours/Mumbai/Mumbai-Hidden-Street-Eats-by-Train/d953-69673P7?m=28353&supag=118063152139&supsc=dsa-694098303804&supai=660597825057&supdv=c&supnt=g&suplp=9145158&supli=1007785&supti=dsa-694098303804&tsem=true&supci=dsa-694098303804&supap1=&supap2=&gad_source=1&gclid=CjwKCAiAsIGrBhAAEiwAEzMlC5uQ4GZlO-PNN41EvG1YbGjxHx6gEefYdVCle8Vegu8863i8D8j3DxoCBDkQAvD_BwE"};
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
		lblNewLabel_2_4.setIcon(new ImageIcon("D:\\Project _Image\\full_day.jpg"));
		lblNewLabel_2_4.setBounds(0, 0, 300, 216);
		panel_1_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("<html><body><p> Full Day Private Bollywood Tour with DANCE</p></body></html>");
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
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.viator.com/Mumbai/d953-ttd/p-16387P1?m=28353&supag=118063152219&supsc=dsa-694098304044&supai=660597825048&supdv=c&supnt=g&suplp=9145158&supli=&supti=dsa-694098304044&tsem=true&supci=dsa-694098304044&supap1=&supap2=&gad_source=1&gclid=CjwKCAiAsIGrBhAAEiwAEzMlC8ogLczgAHSkQRPxbGejdS0ri3AjxKx3lX6fRR44o2Z78_j3S2U07xoC8EcQAvD_BwE"};
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
		lblNewLabel_2_1_1.setIcon(new ImageIcon("D:\\Project _Image\\half_day.jpg"));
		lblNewLabel_2_1_1.setBounds(1, 0, 300, 191);
		panel_1_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("<html><body><p>Mumbai City Private Sightseeing Tour</p></body></html>");
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
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.viator.com/en-IN/tours/Mumbai/Private-Mumbai-Sightseeing-Tour/d953-257250P1"};
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
		lblNewLabel_2_1_2.setIcon(new ImageIcon("D:\\Project _Image\\tour.jpg"));
		lblNewLabel_2_1_2.setBounds(2, 0, 300, 187);
		panel_1_1_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("<html><body><p>  Private Mumbai Sightseeing Tour (Traveller's Choice AwardWinner)</p></body></html>");
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
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.viator.com/en-IN/tours/Mumbai/Private-Full-Day-Mumbai-Sightseeing-Tour/d953-34181P6"};
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
		lblNewLabel_2_1_3.setIcon(new ImageIcon("D:\\Project _Image\\elephant.jpg"));
		lblNewLabel_2_1_3.setBounds(2, 0, 300, 182);
		panel_1_1_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("<html><body><p> Elephanta Caves & Island Guided Private Tour</p></body></html>");
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
					String str[] =new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.viator.com/en-IN/tours/Mumbai/Elephanta-Caves-Tour/d953-139993P9"};
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
				"Mumbai is the industrial capital of India. It is the biggest populated city");
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
