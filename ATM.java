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
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class ATM {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM window = new ATM();
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
	public ATM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.getContentPane().setForeground(new Color(255, 69, 0));
		frame.setVisible(true);
		frame.setResizable(false);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(screen.width,screen.height);
	    	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 1350, 77);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" ATM IN TAJ CITY ");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(475, 11, 462, 55);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("BACK");
		lblNewLabel_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Agra obj=new Agra();
				obj.main(null);
			}
		});
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Download\\Back image.png"));
		lblNewLabel_2.setBounds(36, 11, 93, 39);
		panel.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(0, 79, 1353, 2);
		frame.getContentPane().add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 128));
		panel_1.setBounds(0, 81, 1350, 38);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(65, 105, 225));
		panel_2.setBounds(3, 122, 431, 260);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField("");
		textField.setForeground(new Color(0, 0, 255));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(10, 11, 415, 46);
		panel_2.add(textField);
		
		JLabel lblNewLabel_3 = new JLabel(" Area:");
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3.setBounds(10, 94, 88, 40);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel(" Address:");
		lblNewLabel_3_1.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_1.setBounds(3, 151, 119, 40);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Available:");
		lblNewLabel_3_2.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(10, 209, 119, 40);
		panel_2.add(lblNewLabel_3_2);
		
		 textArea = new JTextArea();
		 textArea.setEditable(false);
		 textArea.setForeground(new Color(0, 0, 255));
		 textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea.setBounds(132, 98, 289, 36);
		panel_2.add(textArea);
		
		 textArea_1 = new JTextArea();
		 textArea_1.setEditable(false);
		 textArea_1.setForeground(new Color(0, 0, 255));
		 textArea_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_1.setBounds(132, 154, 289, 36);
		panel_2.add(textArea_1);
		
		 textArea_2 = new JTextArea();
		 textArea_2.setEditable(false);
		 textArea_2.setForeground(new Color(0, 0, 255));
		 textArea_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_2.setBounds(132, 208, 289, 36);
		panel_2.add(textArea_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(65, 105, 225));
		panel_2_1.setBounds(3, 387, 431, 260);
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JTextArea textArea_2_3 = new JTextArea();
		textArea_2_3.setEditable(false);
		textArea_2_3.setForeground(new Color(0, 0, 255));
		textArea_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_2_3.setBounds(129, 208, 289, 36);
		panel_2_1.add(textArea_2_3);
		
		JTextArea textArea_1_3 = new JTextArea();
		textArea_1_3.setEditable(false);
		textArea_1_3.setForeground(new Color(0, 0, 255));
		textArea_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_1_3.setBounds(129, 154, 289, 36);
		panel_2_1.add(textArea_1_3);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setEditable(false);
		textArea_5.setForeground(new Color(0, 0, 255));
		textArea_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_5.setBounds(129, 98, 289, 36);
		panel_2_1.add(textArea_5);
		
		JLabel lblNewLabel_3_5 = new JLabel(" Area:");
		lblNewLabel_3_5.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_5.setBounds(7, 94, 88, 40);
		panel_2_1.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_1_3 = new JLabel(" Address:");
		lblNewLabel_3_1_3.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_1_3.setBounds(0, 151, 119, 40);
		panel_2_1.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("Available:");
		lblNewLabel_3_2_3.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_2_3.setBounds(7, 209, 119, 40);
		panel_2_1.add(lblNewLabel_3_2_3);
		
		textField_3 = new JTextField("");
		textField_3.setForeground(new Color(0, 0, 255));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(7, 11, 415, 46);
		panel_2_1.add(textField_3);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(65, 105, 225));
		panel_2_2.setBounds(454, 123, 433, 260);
		frame.getContentPane().add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JTextArea textArea_2_1 = new JTextArea();
		textArea_2_1.setEditable(false);
		textArea_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_2_1.setForeground(new Color(0, 0, 255));
		textArea_2_1.setBounds(137, 204, 289, 36);
		panel_2_2.add(textArea_2_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setEditable(false);
		textArea_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_1_1.setForeground(new Color(0, 0, 255));
		textArea_1_1.setBounds(137, 150, 289, 36);
		panel_2_2.add(textArea_1_1);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		textArea_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_3.setForeground(new Color(0, 0, 255));
		textArea_3.setBounds(137, 94, 289, 36);
		panel_2_2.add(textArea_3);
		
		JLabel lblNewLabel_3_3 = new JLabel(" Area:");
		lblNewLabel_3_3.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_3.setBounds(15, 90, 88, 40);
		panel_2_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel(" Address:");
		lblNewLabel_3_1_1.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_1_1.setBounds(8, 147, 119, 40);
		panel_2_2.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Available:");
		lblNewLabel_3_2_1.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_2_1.setBounds(15, 205, 119, 40);
		panel_2_2.add(lblNewLabel_3_2_1);
		
		textField_1 = new JTextField("");
		textField_1.setForeground(new Color(0, 0, 255));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(15, 7, 415, 46);
		panel_2_2.add(textField_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(new Color(65, 105, 225));
		panel_2_1_1.setBounds(454, 388, 433, 260);
		frame.getContentPane().add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JTextArea textArea_2_4 = new JTextArea();
		textArea_2_4.setEditable(false);
		textArea_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_2_4.setForeground(new Color(0, 0, 255));
		textArea_2_4.setBounds(129, 208, 289, 36);
		panel_2_1_1.add(textArea_2_4);
		
		JTextArea textArea_1_4 = new JTextArea();
		textArea_1_4.setEditable(false);
		textArea_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_1_4.setForeground(new Color(0, 0, 255));
		textArea_1_4.setBounds(129, 154, 289, 36);
		panel_2_1_1.add(textArea_1_4);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setEditable(false);
		textArea_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_6.setForeground(new Color(0, 0, 255));
		textArea_6.setBounds(129, 98, 289, 36);
		panel_2_1_1.add(textArea_6);
		
		JLabel lblNewLabel_3_6 = new JLabel(" Area:");
		lblNewLabel_3_6.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_6.setBounds(7, 94, 88, 40);
		panel_2_1_1.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_1_4 = new JLabel(" Address:");
		lblNewLabel_3_1_4.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_1_4.setBounds(0, 151, 119, 40);
		panel_2_1_1.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("Available:");
		lblNewLabel_3_2_4.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_2_4.setBounds(7, 209, 119, 40);
		panel_2_1_1.add(lblNewLabel_3_2_4);
		
		textField_4 = new JTextField("");
		textField_4.setForeground(new Color(0, 0, 255));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(7, 11, 415, 46);
		panel_2_1_1.add(textField_4);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(65, 105, 225));
		panel_2_3.setBounds(903, 122, 426, 260);
		frame.getContentPane().add(panel_2_3);
		panel_2_3.setLayout(null);
		
		JTextArea textArea_2_2 = new JTextArea();
		textArea_2_2.setEditable(false);
		textArea_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_2_2.setForeground(new Color(0, 0, 255));
		textArea_2_2.setBounds(129, 208, 289, 36);
		panel_2_3.add(textArea_2_2);
		
		JTextArea textArea_1_2 = new JTextArea();
		textArea_1_2.setEditable(false);
		textArea_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_1_2.setForeground(new Color(0, 0, 255));
		textArea_1_2.setBounds(129, 154, 289, 36);
		panel_2_3.add(textArea_1_2);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setEditable(false);
		textArea_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_4.setForeground(new Color(0, 0, 255));
		textArea_4.setBounds(129, 98, 289, 36);
		panel_2_3.add(textArea_4);
		
		JLabel lblNewLabel_3_4 = new JLabel(" Area:");
		lblNewLabel_3_4.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_4.setBounds(7, 94, 88, 40);
		panel_2_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_1_2 = new JLabel(" Address:");
		lblNewLabel_3_1_2.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_1_2.setBounds(0, 151, 119, 40);
		panel_2_3.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Available:");
		lblNewLabel_3_2_2.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_2_2.setBounds(7, 209, 119, 40);
		panel_2_3.add(lblNewLabel_3_2_2);
		
		textField_2 = new JTextField("");
		textField_2.setForeground(new Color(0, 0, 255));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(7, 11, 415, 46);
		panel_2_3.add(textField_2);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBackground(new Color(65, 105, 225));
		panel_2_1_2.setBounds(903, 387, 426, 260);
		frame.getContentPane().add(panel_2_1_2);
		panel_2_1_2.setLayout(null);
		
		JTextArea textArea_2_5 = new JTextArea();
		textArea_2_5.setEditable(false);
		textArea_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_2_5.setForeground(new Color(0, 0, 255));
		textArea_2_5.setBounds(129, 208, 289, 36);
		panel_2_1_2.add(textArea_2_5);
		
		JTextArea textArea_1_5 = new JTextArea();
		textArea_1_5.setEditable(false);
		textArea_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_1_5.setForeground(new Color(0, 0, 255));
		textArea_1_5.setBounds(129, 154, 289, 36);
		panel_2_1_2.add(textArea_1_5);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setEditable(false);
		textArea_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea_7.setForeground(new Color(0, 0, 255));
		textArea_7.setBounds(129, 98, 289, 36);
		panel_2_1_2.add(textArea_7);
		
		JLabel lblNewLabel_3_7 = new JLabel(" Area:");
		lblNewLabel_3_7.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_7.setBounds(7, 94, 88, 40);
		panel_2_1_2.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_1_5 = new JLabel(" Address:");
		lblNewLabel_3_1_5.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_1_5.setBounds(0, 151, 119, 40);
		panel_2_1_2.add(lblNewLabel_3_1_5);
		
		JLabel lblNewLabel_3_2_5 = new JLabel("Available:");
		lblNewLabel_3_2_5.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3_2_5.setBounds(7, 209, 119, 40);
		panel_2_1_2.add(lblNewLabel_3_2_5);
		
		textField_5 = new JTextField("");
		textField_5.setForeground(new Color(0, 0, 255));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(7, 11, 415, 46);
		panel_2_1_2.add(textField_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(0, 677, 1350, 52);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("CALL:");
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_4.setBounds(502, 0, 98, 41);
		panel_3.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setOpaque(false);
		textField_6.setForeground(Color.RED);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBounds(609, 7, 652, 33);
		panel_3.add(textField_6);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(0, 669, 1350, 10);
		frame.getContentPane().add(separator_1);

		JLabel lblNewLabel_1 = new JLabel(" SBI");
		lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_6.setText("9223766666 , 9223866666 , 18001234");
				textField.setText("State Bank Of India ATM Agra");
				textArea.setText("Agra");
				textArea_1.setText("Seo ka bazar, Agra");
				textArea_2.setText("24 hours");
				
				textField_1.setText("State Bank Of India ATM Agra");
				textArea_3.setText("HeeraBagh");
				textArea_1_1.setText("Heera bagh agra");
				textArea_2_1.setText("24 hours");
				
				textField_2.setText("State Bank Of India ATM Agra");
				textArea_4.setText("Fatehabad road");
				textArea_1_2.setText("528P+VMX, fatehabad road");
				textArea_2_2.setText("24 hours");
				
				textField_3.setText("State Bank Of India ATM Agra");
				textArea_5.setText("Bhanga Bazar");
				textArea_1_3.setText("Karimganj agra");
				textArea_2_3.setText("24 hours");
				
				textField_4.setText("State Bank Of India ATM Agra");
				textArea_6.setText("Agra");
				textArea_1_4.setText("9, Mahatma gandhi road");
				textArea_2_4.setText("24 hours");
				
				textField_5.setText("State Bank Of India ATM Agra");
				textArea_7.setText("Agra");
				textArea_1_5.setText("52H5+55H");
				textArea_2_5.setText("24 hours");
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
		lblNewLabel_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 0, 83, 38);
		panel_1.add(lblNewLabel_1);
		JLabel lblNewLabel_1_1 = new JLabel(" CANARA ");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        textField_6.setText("09015734734 , 09015613613 , 18004250018");
				textField.setText("Canara Bank ATM Agra");
				textArea.setText("Trans Yamuna Colony");
				textArea_1.setText("TYC Rambagh bridge 282006");
				textArea_2.setText("24 hours");
				
						textField_1.setText("Canara Bank ATM Agra");
							textArea_3.setText("Rambagh");
					textArea_1_1.setText("6343+Q38, Firozabad road");
					textArea_2_1.setText("24 hours");
				
					textField_2.setText("Canara Bank ATM Agra");
							textArea_4.setText("Belanganj");
					textArea_1_2.setText("Bhairon bazar complex");
					textArea_2_2.setText("24 hours");
				
						textField_3.setText("Canara Bank ATM Agra");
							textArea_5.setText("Kacherighat");
				textArea_1_3.setText("S.O, 4/129,kacherighat");
					textArea_2_3.setText("24 hours");
				
						textField_4.setText("Canara Bank ATM Agra");
							textArea_6.setText("Vibhav Nagar");
					textArea_1_4.setText("H.O, vibhav nagar TajGanj");
					textArea_2_4.setText("24 hours");
				
						textField_5.setText("Canara Bank ATM Agra");
							textArea_7.setText("Kamala Nagar");
					textArea_1_5.setText("D-516, Kamala nagar");
					textArea_2_5.setText("24 hours");
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
		lblNewLabel_1_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(102, 0, 165, 38);
		panel_1.add(lblNewLabel_1_1);
		JLabel lblNewLabel_1_1_1 = new JLabel(" HDFC");
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		textField_6.setText("07573919585 , 02268461208 , 18002026161 ");
						textField.setText("HDFC Bank ATM Agra");
							textArea.setText("Aram Bagh");
					textArea_1.setText("kn, 228, firozabad road");
					textArea_2.setText("24 hours");
				
				textField_1.setText("HDFC Bank ATM Agra");
					textArea_3.setText("Trans Yamuna");
			textArea_1_1.setText("No 4, ground floor Amarkunjk");
			textArea_2_1.setText("24 hours");
				
				textField_2.setText("HDFC Bank ATM Agra");
						textArea_4.setText("Taj nagari Phase 1");
				textArea_1_2.setText("MIG No 37, Shilpgram road");
				textArea_2_2.setText("24 hours");
				
				textField_3.setText("HDFC Bank ATM Agra");
						textArea_5.setText("Raj pur chungi");
				textArea_1_3.setText("No 38/1/12, Raja ram ki");
				textArea_2_3.setText("24 hours");
				
					textField_4.setText("HDFC Bank ATM Agra");
						textArea_6.setText("Madhu Nagar");
				textArea_1_4.setText("No 26, Phase 1, Agra cantt");
				textArea_2_4.setText("24 hours");
				
					textField_5.setText("HDFC Bank ATM Agra");
						textArea_7.setText("Kamla Nagar");
				textArea_1_5.setText("No C2, 50, Geeta nagar");
				textArea_2_5.setText("24 hours");
			
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1_1.setForeground(new Color(0,0,255));
				lblNewLabel_1_1_1.setBackground(new Color(0,139,139));
				lblNewLabel_1_1_1.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1_1.setForeground(new Color(255,69,0));
				lblNewLabel_1_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_1_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(310, 0, 123, 38);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("AXIS BANK");
		lblNewLabel_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		textField_6.setText("0562-4000294 , 0562-4000295 , 18605505555");
						textField.setText("Axis Bank ATM Agra");
							textArea.setText("Trans Yamuna Colony");
					textArea_1.setText("Shop C,200,beside Laxmi Auto");
					textArea_2.setText("24 hours");
				
				textField_1.setText("Axis Bank ATM Agra");
					textArea_3.setText("Kamla Nagar");
			textArea_1_1.setText("No C 2/49, Ground floor");
			textArea_2_1.setText("24 hours");
				
				textField_2.setText("Axis Bank ATM Agra");
						textArea_4.setText("Ram Bagh");
				textArea_1_2.setText("No 11,32,Sita Nagar");
				textArea_2_2.setText("24 hours");
				
					textField_3.setText("Axis Bank ATM Agra");
						textArea_5.setText("Ram Bagh");
				textArea_1_3.setText("No B, 53, Ram Bagh");
				textArea_2_3.setText("24 hours");
				
					textField_4.setText("Axis Bank ATM Agra");
						textArea_6.setText("Rawatpara");
				textArea_1_4.setText("No 53,1, Idgah Colony");
				textArea_2_4.setText("24 hours");
				
					textField_5.setText("Axis Bank ATM Agra");
						textArea_7.setText("TajGanj");
				textArea_1_5.setText("No 18, 204,Purani Mandi");
				textArea_2_5.setText("24 hours");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1_1_1.setForeground(new Color(0,0,255));
				lblNewLabel_1_1_1_1.setBackground(new Color(0,139,139));
				lblNewLabel_1_1_1_1.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1_1_1.setForeground(new Color(255,69,0));
				lblNewLabel_1_1_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1_1_1.setBounds(461, 0, 186, 38);
		panel_1.add(lblNewLabel_1_1_1_1);
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("YES BANK");
		lblNewLabel_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		textField_6.setText("+91(22)50919800 , 2249350000 , 18001031212");
						textField.setText("Yes Bank ATM Agra");
							textArea.setText("Heera Bagh Colony");
					textArea_1.setText("No 48/A, Dayal Bagh rd");
					textArea_2.setText("24 hours");
				
				textField_1.setText("Yes Bank ATM Agra");
					textArea_3.setText("Sadar Bazar");
			textArea_1_1.setText("No 20/20 A,GF,Taj rd");
			textArea_2_1.setText("24 hours");
				
				textField_2.setText("Yes Bank ATM Agra");
						textArea_4.setText("Kamla Nagar");
				textArea_1_2.setText("Unit No 6, CB Park");
				textArea_2_2.setText("24 hours");
				
					textField_3.setText("Yes Bank ATM Agra");
						textArea_5.setText("Indrapuram");
				textArea_1_3.setText("Shop No , 100 feet rd");
				textArea_2_3.setText("24 hours");
				
					textField_4.setText("Yes Bank ATM Agra");
						textArea_6.setText("Sadar bazar");
				textArea_1_4.setText("Plot No 20 & 20A");
				textArea_2_4.setText("24 hours");
				
					textField_5.setText("Yes Bank ATM Agra");
						textArea_7.setText("Sanjay Palace");
				textArea_1_5.setText("No 116,8, SultanGanj");
				textArea_2_5.setText("24 hours");

			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1_1_1_1.setForeground(new Color(0,0,255));
				lblNewLabel_1_1_1_1_1.setBackground(new Color(0,139,139));
				lblNewLabel_1_1_1_1_1.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1_1_1_1.setForeground(new Color(255,69,0));
				lblNewLabel_1_1_1_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1_1_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1_1_1_1.setBounds(691, 0, 186, 38);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("BANK OF INDIA");
		lblNewLabel_1_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		textField_6.setText("(022) 40919191 , 18001031906 , 1800220229");
						textField.setText("Bank of India ATM Agra");
							textArea.setText("Khandari");
					textArea_1.setText("6X4V+R3M, Khandari rd");
					textArea_2.setText("24 hours");
				
				textField_1.setText("Bank of India ATM Agra");
					textArea_3.setText("Trans Yamuna Colony");
			textArea_1_1.setText("624X+8FP, near om kids club");
			textArea_2_1.setText("24 hours");
				
				textField_2.setText("Bank of India ATM Agra");
						textArea_4.setText("Sanjay Palace");
				textArea_1_2.setText("F33/2 Wazirpura rd");
				textArea_2_2.setText("24 hours");
				
					textField_3.setText("Bank of India ATM Agra");
						textArea_5.setText("Agra");
				textArea_1_3.setText("Seo ka bazar, Agra");
				textArea_2_3.setText("24 hours");
				
					textField_4.setText("Bank of India ATM Agra");
						textArea_6.setText("52XG+76X Jeoni mandi");
				textArea_1_4.setText("Seo ka bazar, Agra");
				textArea_2_4.setText("24 hours");
				
					textField_5.setText("Bank of India ATM Agra");
						textArea_7.setText("Agra Cantt");
				textArea_1_5.setText("5256+J7M, Chaat Gali");
				textArea_2_5.setText("24 hours");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1_1_1_1_1.setForeground(new Color(0,0,255));
				lblNewLabel_1_1_1_1_1_1.setBackground(new Color(0,139,139));
				lblNewLabel_1_1_1_1_1_1.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1_1_1_1_1.setForeground(new Color(255,69,0));
				lblNewLabel_1_1_1_1_1_1.setOpaque(false);
			}
		});
		lblNewLabel_1_1_1_1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1_1_1_1_1.setBounds(911, 0, 251, 38);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("ICICI");
		lblNewLabel_1_1_1_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		textField_6.setText("18001080 , 18001038181 , 18601206699");
						textField.setText("ICICI ATM Agra");
							textArea.setText("Bhagwan Talkies");
					textArea_1.setText("6262+96V, Shree Talkies");
					textArea_2.setText("24 hours");
				
				textField_1.setText("ICICI ATM Agra");
					textArea_3.setText("Sadar Bazar");
			textArea_1_1.setText("50-A,Taj rd Cantoment");
			textArea_2_1.setText("24 hours");
				
				textField_2.setText("ICICI ATM Agra");
						textArea_4.setText("RakabGanj");
				textArea_1_2.setText("3/281A MG rd Panchkuian");
				textArea_2_2.setText("24 hours");
				
					textField_3.setText("ICICI ATM Agra");
						textArea_5.setText("Sai ki takiya");
				textArea_1_3.setText("45 mg rd Anand bazar");
				textArea_2_3.setText("24 hours");
				
					textField_4.setText("ICICI ATM Agra");
						textArea_6.setText("Trans Yamuna Colony");
				textArea_1_4.setText("A 2 TYC");
				textArea_2_4.setText("24 hours");
				
					textField_5.setText("ICICI ATM Agra");
						textArea_7.setText("Agra");
				textArea_1_5.setText("Shop No 4, Adjoining of rd");
				textArea_2_5.setText("24 hours");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_1_1_1_1_2.setForeground(new Color(0,0,255));
				lblNewLabel_1_1_1_1_1_2.setBackground(new Color(0,139,139));
				lblNewLabel_1_1_1_1_1_2.setOpaque(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_1_1_1_1_2.setForeground(new Color(255,69,0));
				lblNewLabel_1_1_1_1_1_2.setOpaque(false);
			}
		});
		lblNewLabel_1_1_1_1_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1_1_1_2.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Segoe Print", Font.BOLD, 30));
		lblNewLabel_1_1_1_1_1_2.setBounds(1217, 0, 91, 38);
		panel_1.add(lblNewLabel_1_1_1_1_1_2);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("G:\\Download\\atm.jpg"));
		lblNewLabel_5.setBounds(0, 79, 1350, 597);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
