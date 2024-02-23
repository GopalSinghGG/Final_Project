package MySql;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ATM_bengluru {

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
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_6;
	private void initialize1() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.getContentPane().setForeground(new Color(255, 69, 0));
		frame.setVisible(true);
		frame.setResizable(false);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(screen.width,screen.height);
	    	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_bengluru window = new ATM_bengluru();
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
	public ATM_bengluru() {
		initialize1();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.getContentPane().setForeground(new Color(255, 69, 0));
		frame.setVisible(true);
		frame.setResizable(false);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(screen.width,screen.height);
	    	
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(0, 0, 1350, 67);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ATM IN BANGLURU CITY");
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(436, 11, 477, 53);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					Bengluru obj=new Bengluru();
					obj.main(null);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\Project _Image\\arro2.JPG"));
		btnNewButton.setForeground(new Color(128, 128, 0));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnNewButton.setBounds(70, 14, 62, 42);
		panel.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-1, 66, 1351, 4);
		frame.getContentPane().add(separator);
		separator.setBackground(new Color(0, 0, 128));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 128));
		panel_1.setBounds(0, 70, 1350, 40);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("  SBI");
		lblNewLabel_1.setBackground(new Color(255, 128, 0));
		lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField_6.setText("9223766666 , 9223866666 , 18001234");
			
			    textField.setText("State Bank Of India ATM Agra");
				textField_10.setText("Agra");
				textField_8.setText("Seo ka bazar, Agra");
				textField_7.setText("24 hours");
				
				textField_2.setText("State Bank Of India ATM Agra");
				textField_16.setText("HeeraBagh");
				textField_17.setText("Heera bagh agra");
				textField_18.setText("24 hours");
				
				textField_4.setText("State Bank Of India ATM Agra");
				textField_22.setText("Fatehabad road");
				textField_23.setText("528P+VMX, fatehabad road");
				textField_24.setText("24 hours");
				
				textField_1.setText("State Bank Of India ATM Agra");
				textField_13.setText("Bhanga Bazar");
				textField_14.setText("Karimganj agra");
				textField_15.setText("24 hours");
				
				textField_3.setText("State Bank Of India ATM Agra");
				textField_19.setText("Agra");
				textField_20.setText("9, Mahatma gandhi road");
				textField_21.setText("24 hours");

		        textField_5.setText("State Bank Of India ATM Agra");
				textField_25.setText("Agra");
				textField_26.setText("52H5+55H");
				textField_27.setText("24 hours");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(0,0,255));
				lblNewLabel_1.setBackground(new Color(0,139,139));
				lblNewLabel_1.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(255,69,0));
				lblNewLabel_1.setOpaque(false);
			}
		});
		lblNewLabel_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD, 32));
		lblNewLabel_1.setBounds(10, 0, 119, 40);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(" CANARA");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        textField_6.setText("09015734734 , 09015613613 , 18004250018");
						textField.setText("Canara Bank ATM Agra");
						textField_10.setText("Trans Yamuna Colony");
						textField_8.setText("TYC Rambagh bridge 282006");
						textField_7.setText("24 hours");
						
								textField_1.setText("Canara Bank ATM Agra");
									textField_13.setText("Rambagh");
							textField_14.setText("6343+Q38, Firozabad road");
							textField_15.setText("24 hours");
						
							textField_2.setText("Canara Bank ATM Agra");
									textField_16.setText("Belanganj");
							textField_17.setText("Bhairon bazar complex");
							textField_18.setText("24 hours");
						
								textField_3.setText("Canara Bank ATM Agra");
									textField_19.setText("Kacherighat");
						textField_20.setText("S.O, 4/129,kacherighat");
							textField_21.setText("24 hours");
						
								textField_4.setText("Canara Bank ATM Agra");
									textField_22.setText("Vibhav Nagar");
							textField_23.setText("H.O, vibhav nagar TajGanj");
							textField_24.setText("24 hours");
						
								textField_5.setText("Canara Bank ATM Agra");
									textField_25.setText("Kamala Nagar");
							textField_26.setText("D-516, Kamala nagar");
							textField_27.setText("24 hours");
							
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(0,0,255));
				lblNewLabel_1_1.setBackground(new Color(0,139,139));
				lblNewLabel_1_1.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1.setForeground(new Color(255,69,0));
				lblNewLabel_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
            lblNewLabel_1_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_1_1.setFont(new Font("Segoe Script", Font.BOLD, 32));
		lblNewLabel_1_1.setBounds(149, 0, 197, 40);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("  HDFC");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					textField_6.setText("07573919585 , 02268461208 , 18002026161 ");
									textField.setText("HDFC Bank ATM Agra");
										textField_10.setText("Aram Bagh");
								textField_8.setText("kn, 228, firozabad road");
								textField_7.setText("24 hours");
							
							textField_1.setText("HDFC Bank ATM Agra");
								textField_13.setText("Trans Yamuna");
						textField_14.setText("No 4, ground floor Amarkunjk");
						textField_15.setText("24 hours");
							
							textField_2.setText("HDFC Bank ATM Agra");
									textField_16.setText("Taj nagari Phase 1");
							textField_17.setText("MIG No 37, Shilpgram road");
							textField_18.setText("24 hours");
							
							textField_3.setText("HDFC Bank ATM Agra");
									textField_19.setText("Raj pur chungi");
							textField_20.setText("No 38/1/12, Raja ram ki");
							textField_21.setText("24 hours");
							
								textField_4.setText("HDFC Bank ATM Agra");
									textField_22.setText("Madhu Nagar");
							textField_23.setText("No 26, Phase 1, Agra cantt");
							textField_24.setText("24 hours");
							
								textField_5.setText("HDFC Bank ATM Agra");
									textField_25.setText("Kamla Nagar");
							textField_26.setText("No C2, 50, Geeta nagar");
							textField_27.setText("24 hours");
						
						}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_2.setForeground(new Color(0,0,255));
				lblNewLabel_1_2.setBackground(new Color(0,139,139));
				lblNewLabel_1_2.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
					lblNewLabel_1_2.setForeground(new Color(255,69,0));
					lblNewLabel_1_2.setOpaque(false);
				}
			});
		lblNewLabel_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_1_2.setFont(new Font("Segoe Script", Font.BOLD, 32));
		lblNewLabel_1_2.setBounds(367, 0, 150, 40);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("  AXIS BANK");
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_6.setText("0562-4000294 , 0562-4000295 , 18605505555");
				textField.setText("Axis Bank ATM Agra");
					textField_10.setText("Trans Yamuna Colony");
			textField_8.setText("Shop C,200,beside Laxmi Auto");
			textField_7.setText("24 hours");
		
		textField_1.setText("Axis Bank ATM Agra");
			textField_13.setText("Kamla Nagar");
	textField_14.setText("No C 2/49, Ground floor");
	textField_15.setText("24 hours");
		
		textField_2.setText("Axis Bank ATM Agra");
				textField_16.setText("Ram Bagh");
		textField_17.setText("No 11,32,Sita Nagar");
		textField_18.setText("24 hours");
		
			textField_3.setText("Axis Bank ATM Agra");
				textField_19.setText("Ram Bagh");
		textField_20.setText("No B, 53, Ram Bagh");
		textField_21.setText("24 hours");
		
			textField_4.setText("Axis Bank ATM Agra");
				textField_22.setText("Rawatpara");
		textField_23.setText("No 53,1, Idgah Colony");
		textField_24.setText("24 hours");
		
			textField_5.setText("Axis Bank ATM Agra");
				textField_25.setText("TajGanj");
		textField_26.setText("No 18, 204,Purani Mandi");
		textField_27.setText("24 hours");
	}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(0,0,255));
				lblNewLabel_1_3.setBackground(new Color(0,139,139));
				lblNewLabel_1_3.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(255,69,0));
				lblNewLabel_1_3.setOpaque(false);
			}
		});
		lblNewLabel_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_3.setForeground(new Color(255, 128, 0));
		lblNewLabel_1_3.setFont(new Font("Segoe Script", Font.BOLD, 32));
		lblNewLabel_1_3.setBounds(561, 0, 246, 40);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel(" BANK OF INDIA");
		lblNewLabel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_6.setText("(022) 40919191 , 18001031906 , 1800220229");
				textField.setText("Bank of India ATM Agra");
					textField_10.setText("Khandari");
			textField_8.setText("6X4V+R3M, Khandari rd");
			textField_7.setText("24 hours");
		
		textField_1.setText("Bank of India ATM Agra");
			textField_13.setText("Trans Yamuna Colony");
	textField_14.setText("624X+8FP, near om kids club");
	textField_15.setText("24 hours");
		
		textField_2.setText("Bank of India ATM Agra");
				textField_16.setText("Sanjay Palace");
		textField_17.setText("F33/2 Wazirpura rd");
		textField_18.setText("24 hours");
		
			textField_3.setText("Bank of India ATM Agra");
				textField_19.setText("Agra");
		textField_20.setText("Seo ka bazar, Agra");
		textField_21.setText("24 hours");
		
			textField_4.setText("Bank of India ATM Agra");
				textField_22.setText("52XG+76X Jeoni mandi");
		textField_23.setText("Seo ka bazar, Agra");
		textField_24.setText("24 hours");
		
			textField_5.setText("Bank of India ATM Agra");
				textField_25.setText("Agra Cantt");
		textField_26.setText("5256+J7M, Chaat Gali");
		textField_27.setText("24 hours");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_4.setForeground(new Color(0,0,255));
				lblNewLabel_1_4.setBackground(new Color(0,139,139));
				lblNewLabel_1_4.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_4.setForeground(new Color(255,69,0));
				lblNewLabel_1_4.setOpaque(false);
			}
		});
		lblNewLabel_1_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_4.setForeground(new Color(255, 128, 0));
		lblNewLabel_1_4.setFont(new Font("Segoe Script", Font.BOLD, 32));
		lblNewLabel_1_4.setBounds(855, 0, 305, 40);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("  ICICI");
		lblNewLabel_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_6.setText("18001080 , 18001038181 , 18601206699");
				textField.setText("ICICI ATM Agra");
					textField_10.setText("Bhagwan Talkies");
			textField_8.setText("6262+96V, Shree Talkies");
			textField_7.setText("24 hours");
		
		textField_1.setText("ICICI ATM Agra");
			textField_13.setText("Sadar Bazar");
	textField_14.setText("50-A,Taj rd Cantoment");
	textField_15.setText("24 hours");
		
		textField_2.setText("ICICI ATM Agra");
				textField_16.setText("RakabGanj");
		textField_17.setText("3/281A MG rd Panchkuian");
		textField_18.setText("24 hours");
		
			textField_3.setText("ICICI ATM Agra");
				textField_19.setText("Sai ki takiya");
		textField_20.setText("45 mg rd Anand bazar");
		textField_21.setText("24 hours");
		
			textField_4.setText("ICICI ATM Agra");
				textField_22.setText("Trans Yamuna Colony");
		textField_23.setText("A 2 TYC");
		textField_24.setText("24 hours");
		
			textField_5.setText("ICICI ATM Agra");
				textField_25.setText("Agra");
		textField_26.setText("Shop No 4, Adjoining of rd");
		textField_27.setText("24 hours");
	}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(0,0,255));
				lblNewLabel_1_5.setBackground(new Color(0,139,139));
				lblNewLabel_1_5.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(255,69,0));
				lblNewLabel_1_5.setOpaque(false);
			}
		});
		lblNewLabel_1_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_5.setForeground(new Color(255, 128, 0));
		lblNewLabel_1_5.setFont(new Font("Segoe Script", Font.BOLD, 32));
		lblNewLabel_1_5.setBounds(1184, 0, 150, 40);
		panel_1.add(lblNewLabel_1_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(8, 121, 429, 264);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(128, 0, 255));
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBackground(new Color(220, 220, 220));
		textField.setEditable(false);
		textField.setBounds(20, 11, 394, 42);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Area:");
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2.setBounds(20, 110, 87, 28);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address:");
		lblNewLabel_2_1.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(19, 164, 108, 28);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Available:");
		lblNewLabel_2_1_1.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_1.setBounds(17, 215, 121, 28);
		panel_2.add(lblNewLabel_2_1_1);
		
		textField_7 = new JTextField();
		textField_7.setForeground(new Color(128, 0, 255));
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(140, 212, 279, 38);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setForeground(new Color(128, 0, 255));
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(139, 161, 280, 38);
		panel_2.add(textField_8);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBackground(new Color(70, 130, 180));
		panel_2_3.setBounds(0, 0, 429, 264);
		panel_2.add(panel_2_3);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(220, 220, 220));
		textField_9.setBounds(20, 11, 394, 42);
		panel_2_3.add(textField_9);
		
		JLabel lblNewLabel_2_2 = new JLabel("Area:");
		lblNewLabel_2_2.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_2.setBounds(20, 110, 87, 28);
		panel_2_3.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Address:");
		lblNewLabel_2_1_2.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_2.setBounds(19, 164, 108, 28);
		panel_2_3.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Available:");
		lblNewLabel_2_1_1_1.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_1_1.setBounds(17, 215, 121, 28);
		panel_2_3.add(lblNewLabel_2_1_1_1);
		
		textField_10 = new JTextField();
		textField_10.setForeground(new Color(128, 0, 255));
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(140, 110, 279, 36);
		panel_2_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(140, 212, 279, 38);
		panel_2_3.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(139, 161, 280, 38);
		panel_2_3.add(textField_12);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(70, 130, 180));
		panel_2_1.setBounds(451, 119, 439, 266);
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(128, 0, 255));
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(22, 14, 400, 42);
		panel_2_1.add(textField_2);
		
		textField_16 = new JTextField();
		textField_16.setForeground(new Color(128, 0, 255));
		textField_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_16.setColumns(10);
		textField_16.setBounds(150, 103, 279, 36);
		panel_2_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setForeground(new Color(128, 0, 255));
		textField_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_17.setColumns(10);
		textField_17.setBounds(149, 154, 280, 38);
		panel_2_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setForeground(new Color(128, 0, 255));
		textField_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_18.setColumns(10);
		textField_18.setBounds(150, 205, 279, 38);
		panel_2_1.add(textField_18);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Available:");
		lblNewLabel_2_1_1_3.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_1_3.setBounds(27, 208, 121, 28);
		panel_2_1.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Address:");
		lblNewLabel_2_1_4.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_4.setBounds(29, 157, 108, 28);
		panel_2_1.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Area:");
		lblNewLabel_2_4.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_4.setBounds(30, 103, 87, 28);
		panel_2_1.add(lblNewLabel_2_4);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(new Color(70, 130, 180));
		panel_2_1_1.setBounds(906, 119, 431, 266);
		frame.getContentPane().add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(128, 0, 255));
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setBackground(new Color(220, 220, 220));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(20, 9, 393, 42);
		panel_2_1_1.add(textField_4);
		
		textField_22 = new JTextField();
		textField_22.setForeground(new Color(128, 0, 255));
		textField_22.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_22.setColumns(10);
		textField_22.setBounds(138, 103, 286, 36);
		panel_2_1_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setForeground(new Color(128, 0, 255));
		textField_23.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_23.setColumns(10);
		textField_23.setBounds(137, 154, 289, 38);
		panel_2_1_1.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setForeground(new Color(128, 0, 255));
		textField_24.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_24.setColumns(10);
		textField_24.setBounds(140, 205, 283, 38);
		panel_2_1_1.add(textField_24);
		
		JLabel lblNewLabel_2_1_1_5 = new JLabel("Available:");
		lblNewLabel_2_1_1_5.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_1_5.setBounds(20, 208, 121, 28);
		panel_2_1_1.add(lblNewLabel_2_1_1_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("Address:");
		lblNewLabel_2_1_6.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_6.setBounds(22, 157, 108, 28);
		panel_2_1_1.add(lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("Area:");
		lblNewLabel_2_6.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_6.setBounds(23, 103, 87, 28);
		panel_2_1_1.add(lblNewLabel_2_6);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(70, 130, 180));
		panel_2_2.setBounds(6, 409, 432, 251);
		frame.getContentPane().add(panel_2_2);
		panel_2_2.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(128, 0, 255));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(18, 12, 398, 42);
		panel_2_2.add(textField_1);
		
		textField_13 = new JTextField();
		textField_13.setForeground(new Color(128, 0, 255));
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(144, 101, 279, 36);
		panel_2_2.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setForeground(new Color(128, 0, 255));
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_14.setColumns(10);
		textField_14.setBounds(144, 148, 280, 38);
		panel_2_2.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setForeground(new Color(128, 0, 255));
		textField_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_15.setColumns(10);
		textField_15.setBounds(143, 200, 280, 38);
		panel_2_2.add(textField_15);
		
		JLabel lblNewLabel_2_3 = new JLabel("Area:");
		lblNewLabel_2_3.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_3.setBounds(18, 101, 87, 28);
		panel_2_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Address:");
		lblNewLabel_2_1_3.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_3.setBounds(18, 148, 108, 28);
		panel_2_2.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Available:");
		lblNewLabel_2_1_1_2.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_1_2.setBounds(18, 200, 121, 28);
		panel_2_2.add(lblNewLabel_2_1_1_2);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBackground(new Color(70, 130, 180));
		panel_2_1_2.setBounds(452, 409, 438, 251);
		frame.getContentPane().add(panel_2_1_2);
		panel_2_1_2.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(128, 0, 255));
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(20, 14, 401, 42);
		panel_2_1_2.add(textField_3);
		
		textField_19 = new JTextField();
		textField_19.setForeground(new Color(128, 0, 255));
		textField_19.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_19.setColumns(10);
		textField_19.setBounds(149, 100, 279, 36);
		panel_2_1_2.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setForeground(new Color(128, 0, 255));
		textField_20.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_20.setColumns(10);
		textField_20.setBounds(148, 151, 280, 38);
		panel_2_1_2.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setForeground(new Color(128, 0, 255));
		textField_21.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_21.setColumns(10);
		textField_21.setBounds(149, 202, 279, 38);
		panel_2_1_2.add(textField_21);
		
		JLabel lblNewLabel_2_1_1_4 = new JLabel("Available:");
		lblNewLabel_2_1_1_4.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_1_4.setBounds(26, 205, 121, 28);
		panel_2_1_2.add(lblNewLabel_2_1_1_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Address:");
		lblNewLabel_2_1_5.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_5.setBounds(28, 154, 108, 28);
		panel_2_1_2.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("Area:");
		lblNewLabel_2_5.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_5.setBounds(29, 100, 87, 28);
		panel_2_1_2.add(lblNewLabel_2_5);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBackground(new Color(70, 130, 180));
		panel_2_1_1_1.setBounds(908, 409, 431, 251);
		frame.getContentPane().add(panel_2_1_1_1);
		panel_2_1_1_1.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(128, 0, 255));
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setBackground(new Color(220, 220, 220));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(19, 16, 395, 42);
		panel_2_1_1_1.add(textField_5);
		
		textField_25 = new JTextField();
		textField_25.setForeground(new Color(128, 0, 255));
		textField_25.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_25.setColumns(10);
		textField_25.setBounds(142, 100, 279, 36);
		panel_2_1_1_1.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setForeground(new Color(128, 0, 255));
		textField_26.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_26.setColumns(10);
		textField_26.setBounds(141, 151, 280, 38);
		panel_2_1_1_1.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setForeground(new Color(128, 0, 255));
		textField_27.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_27.setColumns(10);
		textField_27.setBounds(142, 202, 279, 38);
		panel_2_1_1_1.add(textField_27);
		
		JLabel lblNewLabel_2_1_1_6 = new JLabel("Available:");
		lblNewLabel_2_1_1_6.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_1_6.setBounds(19, 205, 121, 28);
		panel_2_1_1_1.add(lblNewLabel_2_1_1_6);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("Address:");
		lblNewLabel_2_1_7.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_1_7.setBounds(21, 154, 108, 28);
		panel_2_1_1_1.add(lblNewLabel_2_1_7);
		
		JLabel lblNewLabel_2_7 = new JLabel("Area:");
		lblNewLabel_2_7.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lblNewLabel_2_7.setBounds(22, 100, 87, 28);
		panel_2_1_1_1.add(lblNewLabel_2_7);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(0, 671, 1350, 13);
		frame.getContentPane().add(separator_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 671, 1350, 52);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CALL:");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_4.setBounds(502, 0, 98, 41);
		panel_3.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setOpaque(false);
		textField_6.setForeground(new Color(128, 0, 255));
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBounds(618, 8, 652, 33);
		panel_3.add(textField_6);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("G:\\Download\\atm.jpg"));
		lblNewLabel_3.setBounds(16, 66, 1350, 607);
		frame.getContentPane().add(lblNewLabel_3);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
	}
}
