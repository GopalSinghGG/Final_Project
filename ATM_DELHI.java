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

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ATM_DELHI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_DELHI window = new ATM_DELHI();
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
	public ATM_DELHI() {
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
		
		JLabel lblNewLabel = new JLabel(" ATM IN DELHI\r\n");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(475, 11, 462, 55);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Delhi obj=new Delhi();
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
				textField_6.setText("9223766666 , 9223866666 , 18001234");
				textField.setText("State Bank Of India ATM Delhi");
				textField_1.setText("New Delhi");
				textField_2.setText("94, Lodhi rd");
				textField_3.setText("24 hours");
				textField_4.setText("State Bank Of India ATM Delhi");
				textField_5.setText("Connaught Place");
				textField_7.setText("P4/90, Connaught Cir");
				textField_8.setText("24 hours");
				textField_9.setText("State Bank Of India ATM Delhi");
				textField_10.setText("Rajouri garden");
				textField_11.setText("528P+VMX, Shivaji Marg");
				textField_12.setText("24 hours");
				
				textField_13.setText("State Bank Of India ATM Delhi");
				textField_14.setText("Cannaught Place");
				textField_15.setText("25, Middle Cir, Block C");
				textField_16.setText("24 hours");
				textField_17.setText("State Bank Of India ATM Delhi");
				textField_18.setText("Malviya Nagar");
				textField_19.setText("C-30, Block C");
				textField_20.setText("24 hours");
				
				textField_21.setText("State Bank Of India ATM Delhi");
				textField_22.setText("Connaught Place");
				textField_23.setText("11, Sansad Marg");
				textField_24.setText("24 hours");
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
				textField_6.setText("09015734734 , 09015613613 , 18004250018");
				textField.setText("Canara Bank ATM Delhi");
				textField_1.setText("Karol Bagh");
				textField_2.setText("Desh bandhu Gupta rd,Block 57");
				textField_3.setText("24 hours");
				
				textField_4.setText("Canara Bank ATM Delhi");
				textField_5.setText("Pitam Pura");
				textField_7.setText("M$R2+PX9, G Block");
				textField_8.setText("24 hours");
				
				textField_9.setText("Canara Bank ATM Delhi");
				textField_10.setText("Belanganj");
				textField_11.setText("Bhairon bazar complex");
				textField_12.setText("24 hours");
				
				textField_13.setText("Canara Bank ATM Delhi");
				textField_14.setText("Kacherighat");
				textField_15.setText("S.O, 4/129,kacherighat");
				textField_16.setText("24 hours");
				
				textField_17.setText("Canara Bank ATM Delhi");
				textField_18.setText("Vibhav Nagar");
				textField_19.setText("H.O, vibhav nagar");
				textField_20.setText("24 hours");
				
				textField_21.setText("Canara Bank ATM Delhi");
				textField_22.setText("Connaught Place");
				textField_23.setText("F 19 ,Connaught Cir");
				textField_24.setText("24 hours");
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
				textField_6.setText("07573919585 , 02268461208 , 18002026161 ");
				textField.setText("HDFC Bank ATM Delhi");
				textField_1.setText("Connaught Place");
				textField_2.setText("H 69, Connaught Cir");
				textField_3.setText("24 hours");
				
				textField_4.setText("HDFC Bank ATM Delhi");
				textField_5.setText("New Delhi");
				textField_7.setText("No 4, ground floor Amarkunjk");
				textField_8.setText("24 hours");
				
				textField_9.setText("HDFC Bank ATM Delhi");
				textField_10.setText("New Delhi");
				textField_11.setText("72, Ved Mansion");
				textField_12.setText("24 hours");
				
				textField_13.setText("HDFC Bank ATM Delhi");
				textField_14.setText("Karol Bagh");
				textField_15.setText("No 38/1/12, Gurudwara rd");
				textField_16.setText("24 hours");
				
				textField_17.setText("HDFC Bank ATM Delhi");
				textField_18.setText("Pahar Ganj");
				textField_19.setText("AG 1to 8 & AG20");
				textField_20.setText("24 hours");
				
				textField_21.setText("HDFC Bank ATM Delhi");
				textField_22.setText("Vaibhav Nagar");
				textField_23.setText("No C2, 50, Geeta nagar");
				textField_24.setText("24 hours");
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
				textField_6.setText("0562-4000294 , 0562-4000295 , 18605505555");
				textField.setText("Axis Bank ATM Delhi");
				textField_1.setText("South Extension II");
				textField_2.setText("Shop C,200,beside Laxmi Auto");
				textField_3.setText("24 hours");
				
				textField_4.setText("Axis Bank ATM Delhi");
				textField_5.setText("Connaught Place");
				textField_7.setText("No C 2/49, Ground floor");
				textField_8.setText("24 hours");
				
				textField_9.setText("Axis Bank ATM Delhi");
				textField_10.setText("Sita Nagar");
				textField_11.setText("No 11,32,Sita Nagar");
				textField_12.setText("24 hours");
				
				textField_13.setText("Axis Bank ATM Delhi");
				textField_14.setText("Mubarak Pur");
				textField_15.setText("No F, 50/1 Shiv Nagar");
				textField_16.setText("24 hours");
				
				textField_17.setText("Axis Bank ATM Delhi");
				textField_18.setText("Kashmere gate");
				textField_19.setText("3/3432/3435, ground Fl.");
				textField_20.setText("24 hours");
				
				textField_21.setText("Axis Bank ATM Delhi");
				textField_22.setText("Mahipal Pur");
				textField_23.setText("Desu Wali gali Block A");
				textField_24.setText("24 hours");
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
				textField_6.setText("+91(22)50919800 , 2249350000 , 18001031212");
				textField.setText("Yes Bank ATM Delhi");
				textField_1.setText("Janakpuri New Delhi");
				textField_2.setText("54B shop No G9 to 12");
				textField_3.setText("24 hours");
				
				textField_4.setText("Yes Bank ATM Delhi");
				textField_5.setText("Sadar Bazar");
				textField_7.setText("No 20/20 A,GF,Taj rd");
				textField_8.setText("24 hours");
				
				textField_9.setText("Yes Bank ATM Delhi");
				textField_10.setText("Mahatta Towers community");
				textField_11.setText("Unit No 6, CB Park");
				textField_12.setText("24 hours");
				
				textField_13.setText("Yes Bank ATM Delhi");
				textField_14.setText("Indrapuram");
				textField_15.setText("Shop No , 100 feet rd");
				textField_16.setText("24 hours");
				
				textField_17.setText("Yes Bank ATM Delhi");
				textField_18.setText("Connaught Place");
				textField_19.setText("Plot No 20 & 20A");
				textField_20.setText("24 hours");
				
				textField_21.setText("Yes Bank ATM Delhi");
				textField_22.setText("Karol Bagh");
				textField_23.setText("No 116,8, karol bagh");
				textField_24.setText("24 hours");
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
				textField_6.setText("(022) 40919191 , 18001031906 , 1800220229");
				textField.setText("Bank of India ATM Delhi");
				textField_1.setText("Karol Bahg");
				textField_2.setText("6X4V+R3M, Karol bagh");
				textField_3.setText("24 hours");
				
				textField_4.setText("Bank of India ATM Delhi");
				textField_5.setText("Prem nagar");
				textField_7.setText("624X+8FP, near om kids club");
				textField_8.setText("24 hours");
				
				textField_9.setText("Bank of India ATM Delhi");
				textField_10.setText("Dharam Enclave");
				textField_11.setText("Kh. No.1/14 Block U");
				textField_12.setText("24 hours");
				
				textField_13.setText("Bank of India ATM Delhi");
				textField_14.setText("New Delhi");
				textField_15.setText("Som ka bazar Prem Nagar");
				textField_16.setText("24 hours");
				
				textField_17.setText("Bank of India ATM Delhi");
				textField_18.setText("Nehru Place New Delhi");
				textField_19.setText("G7W2+VM5,Paras Cinema");
				textField_20.setText("24 hours");
				
				textField_21.setText("Bank of India ATM Delhi");
				textField_22.setText("Karol Bagh");
				textField_23.setText("5256+J7M, Chaat Gali");
				textField_24.setText("24 hours");
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
				textField.setText("022-44066666 , 022-42207777 , 18602677777");
				textField_1.setText("Indusind ATM Delhi");
				textField_2.setText("Gagan Vihar");
				textField_3.setText("F-17/2 Jagat Puri");
				textField_4.setText("24 hours");
				
				textField_5.setText("Indusind ATM Delhi");
				textField_6.setText("Sector 5, Palam");
				textField_7.setText("P 58/294b/3 Milan vatika");
				textField_8.setText("24 hours");
				
				textField_9.setText("Indusind ATM Delhi");
				textField_10.setText("Shreya Nagar");
				textField_11.setText("Block No 48/6, G Floor");
				textField_12.setText("24 hours");
				
				textField_13.setText("Indusind ATM Delhi");
				textField_14.setText("Pitampura");
				textField_15.setText("Ground Floor No.A-4");
				textField_16.setText("24 hours");
				
				textField_17.setText("Indusind ATM Delhi");
				textField_18.setText("Delhi");
				textField_19.setText("G-26, South Ex Part 1");
				textField_20.setText("24 hours");
				
				textField_21.setText("Indusind ATM Delhi");
				textField_22.setText("Lok Vihar");
				textField_23.setText("Shop No-32a/C-59 Ram chauk");
				textField_24.setText("24 hours");
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
				textField_6.setText("18001080 , 18001038181 , 18601206699");
				textField.setText("ICICI ATM Delhi");
				textField_1.setText("Connaught Place");
				textField_2.setText("45, Shankar Market");
				textField_3.setText("24 hours");
				
				textField_4.setText("ICICI ATM Delhi");
				textField_5.setText("Connaught Place");
				textField_7.setText("82,Janpath rd Atul Grove");
				textField_8.setText("24 hours");
				
				textField_9.setText("ICICI ATM Delhi");
				textField_10.setText("Mukharji Nagar");
				textField_11.setText("3/281A MG rd Panchkuian");
				textField_12.setText("24 hours");
				
				textField_13.setText("ICICI ATM Delhi");
				textField_14.setText("Janakpuri New Delhi");
				textField_15.setText("45 mg rd B1 bazar");
				textField_16.setText("24 hours");
				
				textField_17.setText("ICICI ATM Delhi");
				textField_18.setText("RK Ashram Metro Station");
				textField_19.setText("J6R5+5Gp, Main Bazar");
				textField_20.setText("24 hours");
				
				textField_21.setText("ICICI ATM Delhi");
				textField_22.setText("Delhi");
				textField_23.setText("Shop No 4, Adjoining of rd");
				textField_24.setText("24 hours");
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
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 128));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(10, 11, 415, 46);
		panel_3_1.add(textField);
		
		JLabel lblNewLabel_3 = new JLabel("Area:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 85, 98, 30);
		panel_3_1.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 128));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(139, 85, 286, 29);
		panel_3_1.add(textField_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Address:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(11, 154, 97, 30);
		panel_3_1.add(lblNewLabel_4_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 0, 128));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(139, 154, 286, 30);
		panel_3_1.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("Available:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 222, 119, 30);
		panel_3_1.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(0, 0, 128));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(139, 222, 286, 29);
		panel_3_1.add(textField_3);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_1_1.setBounds(4, 285, 436, 273);
		panel_2.add(panel_3_1_1);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(0, 0, 128));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(10, 11, 415, 46);
		panel_3_1_1.add(textField_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Area:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(10, 85, 108, 30);
		panel_3_1_1.add(lblNewLabel_3_1);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(0, 0, 128));
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(128, 85, 297, 29);
		panel_3_1_1.add(textField_5);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Address:");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1_1.setBounds(11, 154, 107, 30);
		panel_3_1_1.add(lblNewLabel_4_1_1);
		
		textField_7 = new JTextField();
		textField_7.setForeground(new Color(0, 0, 128));
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(128, 154, 297, 30);
		panel_3_1_1.add(textField_7);
		
		JLabel lblNewLabel_5_1 = new JLabel("Available:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(10, 222, 108, 30);
		panel_3_1_1.add(lblNewLabel_5_1);
		
		textField_8 = new JTextField();
		textField_8.setForeground(new Color(0, 0, 128));
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(128, 222, 297, 29);
		panel_3_1_1.add(textField_8);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_2.setBounds(455, 5, 436, 273);
		panel_2.add(panel_3_2);
		
		textField_9 = new JTextField();
		textField_9.setForeground(new Color(0, 0, 128));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(10, 11, 415, 46);
		panel_3_2.add(textField_9);
		
		JLabel lblNewLabel_3_2 = new JLabel("Area:");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(10, 85, 108, 30);
		panel_3_2.add(lblNewLabel_3_2);
		
		textField_10 = new JTextField();
		textField_10.setForeground(new Color(0, 0, 128));
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(128, 85, 297, 29);
		panel_3_2.add(textField_10);
		
		JLabel lblNewLabel_4_2 = new JLabel("Address:");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_2.setBounds(11, 154, 107, 30);
		panel_3_2.add(lblNewLabel_4_2);
		
		textField_11 = new JTextField();
		textField_11.setForeground(new Color(0, 0, 128));
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(128, 154, 297, 30);
		panel_3_2.add(textField_11);
		
		JLabel lblNewLabel_5_2 = new JLabel("Available:");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_2.setBounds(10, 222, 108, 30);
		panel_3_2.add(lblNewLabel_5_2);
		
		textField_12 = new JTextField();
		textField_12.setForeground(new Color(0, 0, 128));
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(128, 222, 297, 29);
		panel_3_2.add(textField_12);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_3.setBounds(908, 5, 436, 273);
		panel_2.add(panel_3_3);
		
		textField_13 = new JTextField();
		textField_13.setForeground(new Color(0, 0, 128));
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(10, 11, 415, 46);
		panel_3_3.add(textField_13);
		
		JLabel lblNewLabel_3_3 = new JLabel("Area:");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_3.setBounds(10, 85, 108, 30);
		panel_3_3.add(lblNewLabel_3_3);
		
		textField_14 = new JTextField();
		textField_14.setForeground(new Color(0, 0, 128));
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(128, 85, 297, 29);
		panel_3_3.add(textField_14);
		
		JLabel lblNewLabel_4_3 = new JLabel("Address:");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_3.setBounds(11, 154, 107, 30);
		panel_3_3.add(lblNewLabel_4_3);
		
		textField_15 = new JTextField();
		textField_15.setForeground(new Color(0, 0, 128));
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(128, 154, 297, 30);
		panel_3_3.add(textField_15);
		
		JLabel lblNewLabel_5_3 = new JLabel("Available:");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_3.setBounds(10, 223, 108, 30);
		panel_3_3.add(lblNewLabel_5_3);
		
		textField_16 = new JTextField();
		textField_16.setForeground(new Color(0, 0, 128));
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(128, 222, 297, 29);
		panel_3_3.add(textField_16);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setLayout(null);
		panel_3_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_4.setBounds(455, 285, 436, 273);
		panel_2.add(panel_3_4);
		
		textField_17 = new JTextField();
		textField_17.setForeground(new Color(0, 0, 128));
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(10, 11, 415, 46);
		panel_3_4.add(textField_17);
		
		JLabel lblNewLabel_3_4 = new JLabel("Area:");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_4.setBounds(10, 85, 108, 30);
		panel_3_4.add(lblNewLabel_3_4);
		
		textField_18 = new JTextField();
		textField_18.setForeground(new Color(0, 0, 128));
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(128, 85, 297, 29);
		panel_3_4.add(textField_18);
		
		JLabel lblNewLabel_4_4 = new JLabel("Address:");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_4.setBounds(11, 154, 107, 30);
		panel_3_4.add(lblNewLabel_4_4);
		
		textField_19 = new JTextField();
		textField_19.setForeground(new Color(0, 0, 128));
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(128, 154, 297, 30);
		panel_3_4.add(textField_19);
		
		JLabel lblNewLabel_5_4 = new JLabel("Available:");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_4.setBounds(10, 222, 108, 30);
		panel_3_4.add(lblNewLabel_5_4);
		
		textField_20 = new JTextField();
		textField_20.setForeground(new Color(0, 0, 128));
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(128, 222, 297, 29);
		panel_3_4.add(textField_20);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setLayout(null);
		panel_3_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3_5.setBounds(908, 285, 436, 273);
		panel_2.add(panel_3_5);
		
		textField_21 = new JTextField();
		textField_21.setForeground(new Color(0, 0, 128));
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(10, 11, 415, 46);
		panel_3_5.add(textField_21);
		
		JLabel lblNewLabel_3_5 = new JLabel("Area:");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_5.setBounds(10, 85, 108, 30);
		panel_3_5.add(lblNewLabel_3_5);
		
		textField_22 = new JTextField();
		textField_22.setForeground(new Color(0, 0, 128));
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(128, 85, 297, 29);
		panel_3_5.add(textField_22);
		
		JLabel lblNewLabel_4_5 = new JLabel("Address:");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_5.setBounds(11, 154, 107, 30);
		panel_3_5.add(lblNewLabel_4_5);
		
		textField_23 = new JTextField();
		textField_23.setForeground(new Color(0, 0, 128));
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(128, 154, 297, 30);
		panel_3_5.add(textField_23);
		
		JLabel lblNewLabel_5_5 = new JLabel("Available:");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_5.setBounds(10, 222, 108, 30);
		panel_3_5.add(lblNewLabel_5_5);
		
		textField_24 = new JTextField();
		textField_24.setForeground(new Color(0, 0, 128));
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(128, 222, 297, 29);
		panel_3_5.add(textField_24);
		
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
		
		textField_6 = new JTextField();
		textField_6.setOpaque(false);
		textField_6.setForeground(Color.RED);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBounds(589, 7, 652, 33);
		panel_1_1.add(textField_6);
	}
}
