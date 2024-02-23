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
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ATM_Lucknow {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t13;
	private JTextField t14;
	private JTextField t15;
	private JTextField t16;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JTextField t11;
	private JTextField t12;
	private JTextField t17;
	private JTextField t18;
	private JTextField t19;
	private JTextField t20;
	private JTextField t21;
	private JTextField t22;
	private JTextField t23;
	private JTextField t24;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_Lucknow window = new ATM_Lucknow();
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
	public ATM_Lucknow() {
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
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(screen.width, screen.height);
//		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 1350, 71);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel(" ATM IN LUCKNOW");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(446, 11, 462, 55);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Lucknow obj=new Lucknow();
				obj.main(null);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\Project _Image\\arro2.JPG"));
		btnNewButton.setBounds(22, 17, 53, 36);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(1, 71, 1350, 49);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("SBI");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			   phone.setText("9223766666 , 9223866666 , 18001234");
				t1.setText("State Bank Of India ATM Lucknow");
				t2.setText("Aliganj,Lucknow");
				t3.setText("C-20,Sector Q rd");
				t4.setText("24 hours");
				
				t5.setText("State Bank Of India ATM Lucknow");
				t6.setText("Aminabad Lucknow");
				t7.setText("Dr BN varma rd Kesar Bagh");
				t8.setText("24 hours");
				
				t9.setText("State Bank Of India ATM Lucknow");
				t10.setText("Gomti Nagar Lucknow");
				t11.setText("528P+VMX, Gomti Nagar");
				t12.setText("24 hours");
				
				t13.setText("State Bank Of India ATM Lucknow");
				t14.setText("Mirtaki marg");
				t15.setText("VW58+QVW New galla mandi");
				t16.setText("24 hours");
				
				t17.setText("State Bank Of India ATM Lucknow");
				t18.setText("Lucknow");
				t19.setText("9, Mahatma gandhi road");
				t20.setText("24 hours");
				
				t21.setText("State Bank Of India ATM Lucknow");
				t22.setText("Lucknow");
				t23.setText("Vaibhav Nagar");
				t24.setText("24 hours");
				
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(0,0,225));
				lblNewLabel_1.setBackground(new Color(0,139,139));
				lblNewLabel_1.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(184, 134, 11));
				lblNewLabel_1.setOpaque(false);
			}
		});
		lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(184, 134, 11));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 0, 105, 49);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CANARA");
		lblNewLabel_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				phone.setText("09015734734 , 09015613613 , 18004250018");
				t1.setText("Canara Bank ATM Lucknow");
				t2.setText("Hasanganj Lucknow");
				t3.setText("474/14-KHA,Nh-24 Iradat Nagar");
				t4.setText("24 hours");
				
				t5.setText("Canara Bank ATM Lucknow");
				t6.setText("Indira Nagar Lucknow");
				t7.setText("Lekhraj Khazana, Faizabad rd");
				t8.setText("24 hours");
				
				t9.setText("Canara Bank ATM Lucknow");
				t10.setText("Gomti Nagar");
				t11.setText("Bhairon bazar complex");
				t12.setText("24 hours");
				
				t13.setText("Canara Bank ATM Lucknow");
				t14.setText("Kacherighat");
				t15.setText("S.O, 4/129,kacherighat");
				t16.setText("24 hours");
				
				t17.setText("Canara Bank ATM Lucknow");
				t18.setText("Vibhav Nagar");
				t19.setText("H.O, vibhav nagar lucknow");
				t20.setText("24 hours");
				
				t21.setText("Canara Bank ATM Lucknow");
				t22.setText("Shreya Nagar Lucknow");
				t23.setText("D-516, shreya nagar");
				t24.setText("24 hours");
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(0,0,225));
				lblNewLabel_1_1.setBackground(new Color(0,139,139));
				lblNewLabel_1_1.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(121, 0, 105, 49);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("HDFC");
		lblNewLabel_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				phone.setText("07573919585 , 02268461208 , 18002026161 ");
				t1.setText("HDFC Bank ATM Lucknow");
				t2.setText("Rana Pratap Marg");
				t3.setText("Ground floor No 29/4/Old/16");
				t4.setText("24 hours");
				
				t5.setText("HDFC Bank ATM Lucknow");
				t6.setText("Amarkunj Lucknow");
				t7.setText("No 4, ground floor Amarkunjk");
				t8.setText("24 hours");
				
				t9.setText("HDFC Bank ATM Lucknow");
				t10.setText("Azad nagar Chowk Lucknow");
				t11.setText("No544/AB/301,Compbell rd");
				t12.setText("24 hours");
				
				t13.setText("HDFC Bank ATM Lucknow");
				t14.setText("Hewlett rd Lucknow");
				t15.setText("102/25A,old No 8,Shivaji marg");
				t16.setText("24 hours");
				
				t17.setText("HDFC Bank ATM Lucknow");
				t18.setText("Kalyanpur West Lucknow");
				t19.setText("Upper ground floor Tedhi puliya");
				t20.setText("24 hours");
				
				t21.setText("HDFC Bank ATM Lucknow");
				t22.setText("Gomti Nagar Lucknow");
				t23.setText("Local body research,Raj Bhawan");
				t24.setText("24 hours");
			}
			
			
		public void mouseEntered(MouseEvent e) {
			lblNewLabel_1_2.setForeground(new Color(0,0,225));
			lblNewLabel_1_2.setBackground(new Color(0,139,139));
			lblNewLabel_1_2.setOpaque(true);
		}
		public void mouseExited(MouseEvent e) {
			lblNewLabel_1_2.setForeground(new Color(184, 134, 11));
			lblNewLabel_1_2.setOpaque(false);
	     	}
		
		});
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(252, 0, 105, 49);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("AXIS BANK");
		lblNewLabel_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				phone.setText("0562-4000294 , 0562-4000295 , 18605505555");
				t1.setText("Axis Bank ATM Lucknow");
				t2.setText("Mt Gandhi marg Hazaratganj");
				t3.setText("Shop C,200,beside Laxmi Auto");
				t4.setText("24 hours");
				
				t5.setText("Axis Bank ATM Lucknow");
				t6.setText("IIM road lucknow");
				t7.setText("Khasra No 97 to 99");
				t8.setText("24 hours");
				
				t9.setText("Axis Bank ATM Lucknow");
				t10.setText("Utrathiya Lucknow");
				t11.setText("No 591,1A,below Amar Saheed");
				t12.setText("24 hours");
				
				t13.setText("Axis Bank ATM Lucknow");
				t14.setText("Aliganj Lucknow");
				t15.setText("30L,1st floor Pragati kendra");
				t16.setText("24 hours");
				
				t17.setText("Axis Bank ATM Lucknow");
				t18.setText("Alam Bagh Lucknow");
				t19.setText("Khasra No 826/2 5A");
				t20.setText("24 hours");
				
				t21.setText("Axis Bank ATM Lucknow");
				t22.setText("Naka Hindola Lucknow");
				t23.setText("No 102,44,shivaji marg");
				t24.setText("24 hours");
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(0,0,225));
				lblNewLabel_1_3.setBackground(new Color(0,139,139));
				lblNewLabel_1_3.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_3.setOpaque(false);
			}
		});
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(377, 0, 147, 49);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_5 = new JLabel("YES BANK");
		lblNewLabel_1_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				phone.setText("+91(22)50919800 , 2249350000 , 18001031212");
				t1.setText("Yes Bank ATM Lucknow");
				t2.setText("Mt.Gandhi Marg Lucknow");
				t3.setText("No 202, Mahomed Bagh club");
				t4.setText("24 hours");
				
				t5.setText("Yes Bank ATM Lucknow");
				t6.setText("Utathia Lucknow");
				t7.setText("Patel college chaudary vihar");
				t8.setText("24 hours");
				
				t9.setText("Yes Bank ATM Lucknow");
				t10.setText("Hewitt rd Lucknow");
				t11.setText("Unit No 6, CB Park");
				t12.setText("24 hours");
				
				t13.setText("Yes Bank ATM Lucknow");
				t14.setText("Shivaji Marg Lucknow");
				t15.setText("Shop No , 100 feet rd");
				t16.setText("24 hours");
				
				t17.setText("Yes Bank ATM Lucknow");
				t18.setText("Sadar bazar");
				t19.setText("Plot No 20 & 20A");
				t20.setText("24 hours");
				
				t21.setText("Yes Bank ATM Lucknow");
				t22.setText("Ahmamau Lucknow");
				t23.setText("Q2X6+577 ahmamau lucknow");
				t24.setText("24 hours");
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(0,0,225));
				lblNewLabel_1_5.setBackground(new Color(0,139,139));
				lblNewLabel_1_5.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_5.setOpaque(false);
			}
		});
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(565, 0, 137, 49);
		panel_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("BANK OF INDIA");
		lblNewLabel_1_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				phone.setText("(022) 40919191 , 18001031906 , 1800220229");
				t1.setText("Bank of India ATM Lucknow");
				t2.setText("Ram Nagar, Alambagh");
				t3.setText("551,Kanpur Lucknow rd");
				t4.setText("24 hours");
				
				t5.setText("Bank of India ATM Lucknow");
				t6.setText("Harihar Prasad Nagar Luck.");
				t7.setText("Alambagh lucknow 226005");
				t8.setText("24 hours");
				
				t9.setText("Bank of India ATM Lucknow");
				t10.setText("Khurram Nagar Lucknow");
				t11.setText("VXRG+C2W, khurram nagar");
				t12.setText("24 hours");
				
				t13.setText("Bank of India ATM Lucknow");
				t14.setText("Chandralok Lucknow");
				t15.setText("LDA shopping complex");
				t16.setText("24 hours");
				
				t17.setText("Bank of India ATM Lucknow");
				t18.setText("Hazratganj Lucknow");
				t19.setText("RWXV+W8V,Shahnajaf rd");
				t20.setText("24 hours");
				
				t21.setText("Bank of India ATM Lucknow");
				t22.setText("Sadar Bazar Contoment");
				t23.setText("325 sadar bazar lucknow");
				t24.setText("24 hours");
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_6.setForeground(new Color(0,0,225));
				lblNewLabel_1_6.setBackground(new Color(0,139,139));
				lblNewLabel_1_6.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_6.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_6.setOpaque(false);
			}
		});
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(728, 0, 214, 49);
		panel_1.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_9 = new JLabel("INDUSIND BANK");
		lblNewLabel_1_9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				phone.setText("022-44066666 , 022-42207777 , 18602677777");
				t1.setText("Indusind ATM Lucknow");
				t2.setText("Bhopal House Lucknow");
				t3.setText("337,TN rd,Lal Bagh");
				t4.setText("24 hours");
				
				t5.setText("Indusind ATM Lucknow");
				t6.setText("Indira Nagar Lucknow");
				t7.setText("Upper ground floor,regal plaza");
				t8.setText("24 hours");
				
				t9.setText("Indusind ATM Lucknow");
				t10.setText("Aliganj Lucknow");
				t11.setText("Block No 48/6, G Floor");
				t12.setText("24 hours");
				
				t13.setText("Indusind ATM Lucknow");
				t14.setText("Rajajipuram Near Mini stadium");
				t15.setText("e-3454, lucknow");
				t16.setText("24 hours");
				
				t17.setText("Indusind ATM Lucknow");
				t18.setText("Aliganj Lucknow");
				t19.setText("B-2/355,Shiv Vihar rd");
				t20.setText("24 hours");
				
				t21.setText("Indusind ATM Lucknow");
				t22.setText("Gomti Nagar Lucknow");
				t23.setText("Shop No-32a/C-59 gomti ng.");
				t24.setText("24 hours");
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_9.setForeground(new Color(0,0,225));
				lblNewLabel_1_9.setBackground(new Color(0,139,139));
				lblNewLabel_1_9.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_9.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_9.setOpaque(false);
			}
		});
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_9.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_9.setBounds(969, 0, 206, 49);
		panel_1.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_11 = new JLabel("ICICI");
		lblNewLabel_1_11.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				phone.setText("18001080 , 18001038181 , 18601206699");
				t1.setText("ICICI ATM Lucknow");
				t2.setText("Rajajipuram");
				t3.setText("Jyoti filling station E6/501");
				t4.setText("24 hours");
				
				t5.setText("ICICI ATM Lucknow");
				t6.setText("Gomti Nagar");
				t7.setText("50-A,Shah rd Cantoment");
				t8.setText("24 hours");
				
				t9.setText("ICICI ATM Lucknow");
				t10.setText("Machchhi Bawan Lucknow");
				t11.setText("VW86+59P,Kamala Nagar");
				t12.setText("24 hours");
				
				t13.setText("ICICI ATM Lucknow");
				t14.setText("Maurya bazar Lucknow");
				t15.setText("45 mg rd Maurya bazar");
				t16.setText("24 hours");
				
				t17.setText("ICICI ATM Lucknow");
				t18.setText("Sadar Bazar Cantoment");
				t19.setText("Krishna Bhawan,119 sadar bz.");
				t20.setText("24 hours");
				
				t21.setText("ICICI ATM Lucknow");
				t22.setText("Indira Nagar,Lucknow");
				t23.setText("CP 102, inside sushma hospital");
				t24.setText("24 hours");
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_11.setForeground(new Color(0,0,225));
				lblNewLabel_1_11.setBackground(new Color(0,139,139));
				lblNewLabel_1_11.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_11.setForeground(new Color(184, 134, 11));
				lblNewLabel_1_11.setOpaque(false);
			}
		});
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_11.setForeground(new Color(184, 134, 11));
		lblNewLabel_1_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_11.setBounds(1193, 0, 150, 49);
		panel_1.add(lblNewLabel_1_11);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setLayout(null);
		panel_2.setBounds(0, 121, 1350, 568);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_1.setBounds(4, 5, 436, 273);
		panel_2.add(panel_3_1);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 128));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("Tahoma", Font.BOLD, 22));
		t1.setEditable(false);
		t1.setColumns(10);
		t1.setBounds(10, 11, 415, 46);
		panel_3_1.add(t1);
		
		JLabel lblNewLabel_3 = new JLabel("Area:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 85, 98, 30);
		panel_3_1.add(lblNewLabel_3);
		
		t2 = new JTextField();
		t2.setForeground(new Color(0, 0, 128));
		t2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t2.setEditable(false);
		t2.setColumns(10);
		t2.setBounds(139, 85, 286, 29);
		panel_3_1.add(t2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Address:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(11, 154, 97, 30);
		panel_3_1.add(lblNewLabel_4_1);
		
		t3 = new JTextField();
		t3.setForeground(new Color(0, 0, 128));
		t3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t3.setEditable(false);
		t3.setColumns(10);
		t3.setBounds(139, 154, 286, 30);
		panel_3_1.add(t3);
		
		JLabel lblNewLabel_5 = new JLabel("Available:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 222, 119, 30);
		panel_3_1.add(lblNewLabel_5);
		
		t4 = new JTextField();
		t4.setForeground(new Color(0, 0, 128));
		t4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t4.setEditable(false);
		t4.setColumns(10);
		t4.setBounds(139, 222, 286, 29);
		panel_3_1.add(t4);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_1_1.setBounds(4, 285, 436, 273);
		panel_2.add(panel_3_1_1);
		
		t13 = new JTextField();
		t13.setForeground(new Color(0, 0, 128));
		t13.setHorizontalAlignment(SwingConstants.CENTER);
		t13.setFont(new Font("Tahoma", Font.BOLD, 22));
		t13.setEditable(false);
		t13.setColumns(10);
		t13.setBounds(10, 11, 415, 46);
		panel_3_1_1.add(t13);
		
		JLabel lblNewLabel_3_1 = new JLabel("Area:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(10, 85, 108, 30);
		panel_3_1_1.add(lblNewLabel_3_1);
		
		t14 = new JTextField();
		t14.setForeground(new Color(0, 0, 128));
		t14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t14.setEditable(false);
		t14.setColumns(10);
		t14.setBounds(128, 85, 297, 29);
		panel_3_1_1.add(t14);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Address:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1_1.setBounds(11, 154, 107, 30);
		panel_3_1_1.add(lblNewLabel_4_1_1);
		
		t15 = new JTextField();
		t15.setForeground(new Color(0, 0, 128));
		t15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t15.setEditable(false);
		t15.setColumns(10);
		t15.setBounds(128, 154, 297, 30);
		panel_3_1_1.add(t15);
		
		JLabel lblNewLabel_5_1 = new JLabel("Available:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(10, 222, 108, 30);
		panel_3_1_1.add(lblNewLabel_5_1);
		
		t16 = new JTextField();
		t16.setForeground(new Color(0, 0, 128));
		t16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t16.setEditable(false);
		t16.setColumns(10);
		t16.setBounds(128, 222, 297, 29);
		panel_3_1_1.add(t16);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_2.setBounds(455, 5, 436, 273);
		panel_2.add(panel_3_2);
		
		t5 = new JTextField();
		t5.setForeground(new Color(0, 0, 128));
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setFont(new Font("Tahoma", Font.BOLD, 22));
		t5.setEditable(false);
		t5.setColumns(10);
		t5.setBounds(10, 11, 415, 46);
		panel_3_2.add(t5);
		
		JLabel lblNewLabel_3_2 = new JLabel("Area:");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(10, 85, 108, 30);
		panel_3_2.add(lblNewLabel_3_2);
		
		t6 = new JTextField();
		t6.setForeground(new Color(0, 0, 128));
		t6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t6.setEditable(false);
		t6.setColumns(10);
		t6.setBounds(128, 85, 297, 29);
		panel_3_2.add(t6);
		
		JLabel lblNewLabel_4_2 = new JLabel("Address:");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_2.setBounds(11, 154, 107, 30);
		panel_3_2.add(lblNewLabel_4_2);
		
		t7 = new JTextField();
		t7.setForeground(new Color(0, 0, 128));
		t7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t7.setEditable(false);
		t7.setColumns(10);
		t7.setBounds(128, 154, 297, 30);
		panel_3_2.add(t7);
		
		JLabel lblNewLabel_5_2 = new JLabel("Available:");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_2.setBounds(10, 222, 108, 30);
		panel_3_2.add(lblNewLabel_5_2);
		
		t8 = new JTextField();
		t8.setForeground(new Color(0, 0, 128));
		t8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t8.setEditable(false);
		t8.setColumns(10);
		t8.setBounds(128, 222, 297, 29);
		panel_3_2.add(t8);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_3.setBounds(908, 5, 436, 273);
		panel_2.add(panel_3_3);
		
		t9 = new JTextField();
		t9.setForeground(new Color(0, 0, 128));
		t9.setHorizontalAlignment(SwingConstants.CENTER);
		t9.setFont(new Font("Tahoma", Font.BOLD, 22));
		t9.setEditable(false);
		t9.setColumns(10);
		t9.setBounds(10, 11, 415, 46);
		panel_3_3.add(t9);
		
		JLabel lblNewLabel_3_3 = new JLabel("Area:");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_3.setBounds(10, 85, 108, 30);
		panel_3_3.add(lblNewLabel_3_3);
		
		t10 = new JTextField();
		t10.setForeground(new Color(0, 0, 128));
		t10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t10.setEditable(false);
		t10.setColumns(10);
		t10.setBounds(128, 85, 297, 29);
		panel_3_3.add(t10);
		
		JLabel lblNewLabel_4_3 = new JLabel("Address:");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_3.setBounds(11, 154, 107, 30);
		panel_3_3.add(lblNewLabel_4_3);
		
		t11 = new JTextField();
		t11.setForeground(new Color(0, 0, 128));
		t11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t11.setEditable(false);
		t11.setColumns(10);
		t11.setBounds(128, 154, 297, 30);
		panel_3_3.add(t11);
		
		JLabel lblNewLabel_5_3 = new JLabel("Available:");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_3.setBounds(10, 223, 108, 30);
		panel_3_3.add(lblNewLabel_5_3);
		
		t12 = new JTextField();
		t12.setForeground(new Color(0, 0, 128));
		t12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t12.setEditable(false);
		t12.setColumns(10);
		t12.setBounds(128, 222, 297, 29);
		panel_3_3.add(t12);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setLayout(null);
		panel_3_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_4.setBounds(455, 285, 436, 273);
		panel_2.add(panel_3_4);
		
		t17 = new JTextField();
		t17.setForeground(new Color(0, 0, 128));
		t17.setHorizontalAlignment(SwingConstants.CENTER);
		t17.setFont(new Font("Tahoma", Font.BOLD, 22));
		t17.setEditable(false);
		t17.setColumns(10);
		t17.setBounds(10, 11, 415, 46);
		panel_3_4.add(t17);
		
		JLabel lblNewLabel_3_4 = new JLabel("Area:");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_4.setBounds(10, 85, 108, 30);
		panel_3_4.add(lblNewLabel_3_4);
		
		t18 = new JTextField();
		t18.setForeground(new Color(0, 0, 128));
		t18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t18.setEditable(false);
		t18.setColumns(10);
		t18.setBounds(128, 85, 297, 29);
		panel_3_4.add(t18);
		
		JLabel lblNewLabel_4_4 = new JLabel("Address:");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_4.setBounds(11, 154, 107, 30);
		panel_3_4.add(lblNewLabel_4_4);
		
		t19 = new JTextField();
		t19.setForeground(new Color(0, 0, 128));
		t19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t19.setEditable(false);
		t19.setColumns(10);
		t19.setBounds(128, 154, 297, 30);
		panel_3_4.add(t19);
		
		JLabel lblNewLabel_5_4 = new JLabel("Available:");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_4.setBounds(10, 222, 108, 30);
		panel_3_4.add(lblNewLabel_5_4);
		
		t20 = new JTextField();
		t20.setForeground(new Color(0, 0, 128));
		t20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t20.setEditable(false);
		t20.setColumns(10);
		t20.setBounds(128, 222, 297, 29);
		panel_3_4.add(t20);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setLayout(null);
		panel_3_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_5.setBounds(908, 285, 436, 273);
		panel_2.add(panel_3_5);
		
		t21 = new JTextField();
		t21.setForeground(new Color(0, 0, 128));
		t21.setHorizontalAlignment(SwingConstants.CENTER);
		t21.setFont(new Font("Tahoma", Font.BOLD, 22));
		t21.setEditable(false);
		t21.setColumns(10);
		t21.setBounds(10, 11, 415, 46);
		panel_3_5.add(t21);
		
		JLabel lblNewLabel_3_5 = new JLabel("Area:");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_5.setBounds(10, 85, 108, 30);
		panel_3_5.add(lblNewLabel_3_5);
		
		t22 = new JTextField();
		t22.setForeground(new Color(0, 0, 128));
		t22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t22.setEditable(false);
		t22.setColumns(10);
		t22.setBounds(128, 85, 297, 29);
		panel_3_5.add(t22);
		
		JLabel lblNewLabel_4_5 = new JLabel("Address:");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_5.setBounds(11, 154, 107, 30);
		panel_3_5.add(lblNewLabel_4_5);
		
		t23 = new JTextField();
		t23.setForeground(new Color(0, 0, 128));
		t23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t23.setEditable(false);
		t23.setColumns(10);
		t23.setBounds(128, 154, 297, 30);
		panel_3_5.add(t23);
		
		JLabel lblNewLabel_5_5 = new JLabel("Available:");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_5.setBounds(10, 222, 108, 30);
		panel_3_5.add(lblNewLabel_5_5);
		
		t24 = new JTextField();
		t24.setForeground(new Color(0, 0, 128));
		t24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t24.setEditable(false);
		t24.setColumns(10);
		t24.setBounds(128, 222, 297, 29);
		panel_3_5.add(t24);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(250, 250, 210));
		panel_1_1.setBounds(-1, 686, 1350, 44);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("CALL ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(452, 0, 142, 44);
		panel_1_1.add(lblNewLabel_2);
		
		phone = new JTextField();
		phone.setOpaque(false);
		phone.setForeground(Color.RED);
		phone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		phone.setEditable(false);
		phone.setColumns(10);
		phone.setBorder(null);
		phone.setBounds(589, 7, 652, 33);
		panel_1_1.add(phone);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("G:\\Download\\atm.jpg"));
		lblNewLabel_4.setBounds(0, 121, 1351, 568);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
