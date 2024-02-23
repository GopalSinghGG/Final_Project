package MySql;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class About_us {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField name;
	private JTextField mobile;
	private JTextField textField_9;
	private JComboBox nation;
	private JTextArea query1;
	private JTextArea yquery;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_us window = new About_us();
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
	public About_us() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		frame.setResizable(false);
//		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What's Your Issuse");
		lblNewLabel.setBounds(481, 25, 427, 56);
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 42));
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 93, 1350, 2);
		separator.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 665, 1350, 2);
		separator_1.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(577, 92, 11, 575);
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(separator_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(598, 167, 742, 500);
		panel.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 63, 742, 2);
		panel.add(separator_2);
		
		JLabel lblNewLabel_3 = new JLabel("Helpline Numeber");
		lblNewLabel_3.setForeground(new Color(0, 128, 0));
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD, 32));
		lblNewLabel_3.setBounds(230, 11, 344, 44);
		panel.add(lblNewLabel_3);
		
		JLabel lblDistrictMigistrate = new JLabel("District Migistrate :-");
		lblDistrictMigistrate.setForeground(new Color(100, 149, 237));
		lblDistrictMigistrate.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblDistrictMigistrate.setBounds(23, 105, 272, 34);
		panel.add(lblDistrictMigistrate);
		
		JLabel lblDistrictMigistrate_2 = new JLabel("District Migistrate :-");
		lblDistrictMigistrate_2.setForeground(new Color(100, 149, 237));
		lblDistrictMigistrate_2.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblDistrictMigistrate_2.setBounds(23, 177, 272, 34);
		panel.add(lblDistrictMigistrate_2);
		
		JLabel lblDistrictMigistrate_1_1 = new JLabel("ADM :-");
		lblDistrictMigistrate_1_1.setForeground(new Color(100, 149, 237));
		lblDistrictMigistrate_1_1.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblDistrictMigistrate_1_1.setBounds(38, 249, 105, 34);
		panel.add(lblDistrictMigistrate_1_1);
		
		JLabel lblDistrictMigistrate_1_2 = new JLabel("SSP :-");
		lblDistrictMigistrate_1_2.setForeground(new Color(100, 149, 237));
		lblDistrictMigistrate_1_2.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblDistrictMigistrate_1_2.setBounds(38, 389, 91, 34);
		panel.add(lblDistrictMigistrate_1_2);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 255));
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(315, 110, 350, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 255));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(315, 177, 350, 34);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 0, 255));
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(315, 249, 350, 34);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(0, 0, 255));
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(315, 389, 350, 34);
		panel.add(textField_3);
		
		JLabel lblNewLabel_6 = new JLabel("If you have any issues than you call given above numbers");
		lblNewLabel_6.setForeground(new Color(0, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(29, 453, 602, 36);
		panel.add(lblNewLabel_6);
		
		textField_9 = new JTextField();
		textField_9.setForeground(new Color(0, 0, 255));
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(315, 323, 350, 34);
		panel.add(textField_9);
		
		JLabel lblDistrictMigistrate_1_1_1 = new JLabel("ADM :-");
		lblDistrictMigistrate_1_1_1.setForeground(new Color(100, 149, 237));
		lblDistrictMigistrate_1_1_1.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblDistrictMigistrate_1_1_1.setBounds(38, 323, 105, 34);
		panel.add(lblDistrictMigistrate_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("In which city are you present");
		lblNewLabel_1.setBounds(640, 111, 395, 34);
		lblNewLabel_1.setForeground(new Color(0, 64, 0));
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 24));
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(1037, 111, 133, 34);
		comboBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				comboBox.setForeground(new Color(255, 215, 0));
				//comboBox.setBackground(new Color(192,192,192));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				comboBox.setForeground(new Color(0,0,128));
				comboBox.setOpaque(false);

			}
		});
		comboBox.setForeground(new Color(0, 0, 128));
		comboBox.setFont(new Font("Segoe Print", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Agra", "Bengluru", "Delhi", "Lucknow ", "Mumbai"}));
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Go to Home Page");
		btnNewButton.setBounds(995, 668, 192, 34);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setForeground(new Color(0,0,0));
				btnNewButton.setBackground(new Color(192,192,192));
				btnNewButton.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(0, 128, 0));
				btnNewButton.setForeground(new Color(0, 0, 255));
				btnNewButton.setOpaque(false);
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Website_home_page();
			}
		});
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(123, 106, 256, 41);
		panel_1.setForeground(new Color(135, 206, 250));
		panel_1.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Post Your Query");
		lblNewLabel_4.setForeground(new Color(255, 255, 0));
		lblNewLabel_4.setBounds(19, 0, 218, 41);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Segoe Print", Font.BOLD, 25));
		
		JLabel lblNewLabel_5 = new JLabel("Name :-");
		lblNewLabel_5.setForeground(new Color(128, 128, 192));
		lblNewLabel_5.setBounds(55, 199, 99, 34);
		lblNewLabel_5.setFont(new Font("Segoe Print", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Mobile No. :-");
		lblNewLabel_5_1.setForeground(new Color(128, 128, 192));
		lblNewLabel_5_1.setBounds(55, 259, 173, 34);
		lblNewLabel_5_1.setFont(new Font("Segoe Print", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Nationality :-");
		lblNewLabel_5_2.setForeground(new Color(128, 128, 192));
		lblNewLabel_5_2.setBounds(55, 322, 152, 34);
		lblNewLabel_5_2.setFont(new Font("Segoe Print", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Query :-");
		lblNewLabel_5_3.setForeground(new Color(128, 128, 192));
		lblNewLabel_5_3.setBounds(57, 386, 99, 34);
		lblNewLabel_5_3.setFont(new Font("Segoe Print", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel_5_3);
		
		name = new JTextField();
		name.setBounds(236, 199, 256, 34);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		mobile = new JTextField();
		mobile.setBounds(236, 259, 256, 34);
		mobile.setColumns(10);
		frame.getContentPane().add(mobile);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("Your Query :-");
		lblNewLabel_5_3_1.setForeground(new Color(128, 128, 192));
		lblNewLabel_5_3_1.setBounds(52, 525, 273, 34);
		lblNewLabel_5_3_1.setFont(new Font("Segoe Print", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel_5_3_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(365, 668, 114, 34);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText(null);
				mobile.setText(null);
				nation.setSelectedItem(null);
				query1.setText(null);
				yquery.setText(null);
			}
		});
		btnReset.setForeground(new Color(255, 255, 0));
		btnReset.setFont(new Font("Segoe Print", Font.BOLD, 18));
		btnReset.setBackground(new Color(0, 128, 0));
		frame.getContentPane().add(btnReset);
		
		JButton btnNewButton_1_1 = new JButton("Submit");
		btnNewButton_1_1.setBounds(209, 668, 114, 34);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:33306/minor_project","root","");
					String query="insert into query values(?,?,?,?,?)";
					PreparedStatement ps=conn.prepareStatement(query);
					ps.setString(1, name.getText());
					ps.setString(2, mobile.getText());
					ps.setString(3, nation.getSelectedItem().toString());
					ps.setString(4, query1.getText());
					ps.setString(5, yquery.getText());
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, " Your Query is Submitted..");
					name.setText(null);
					mobile.setText(null);
					nation.setSelectedItem(null);
					query1.setText(null);
					yquery.setText(null);
				}catch(Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, " error occured.. Please Try Again");
				}
			}
		});
		btnNewButton_1_1.setForeground(new Color(255, 255, 0));
		btnNewButton_1_1.setFont(new Font("Segoe Print", Font.BOLD, 18));
		btnNewButton_1_1.setBackground(new Color(0, 128, 0));
		frame.getContentPane().add(btnNewButton_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 107, 41);
		panel_2.setBackground(new Color(0, 100, 0));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel(" Back ");
		lblNewLabel_7.setForeground(new Color(255, 255, 0));
		lblNewLabel_7.setBounds(0, 0, 107, 40);
		panel_2.add(lblNewLabel_7);
		lblNewLabel_7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			  new Website_home_page();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_7.setForeground(new Color(255, 215, 0));
				lblNewLabel_7.setBackground(new Color(192,192,192));
				
				lblNewLabel_7.setOpaque(true);
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_7.setForeground(new Color(0,0,0));
				lblNewLabel_7.setOpaque(false);
			}
		});
		lblNewLabel_7.setFont(new Font("Segoe Print", Font.BOLD, 22));
		lblNewLabel_7.setIcon(new ImageIcon("D:\\Download\\Custom-Icon-Design-Flatastic-8-Go-back.24.png"));
		
		JButton btnNewButton_1 = new JButton("GO");
		btnNewButton_1.setBounds(1180, 110, 78, 34);
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Agra")) {
					textField.setText("9454417509 , 9454417491");
					textField_1.setText("commagr@nic.in");
					textField_2.setText("9454417580 , 9454417659");
					textField_3.setText("9454417682 , 9454417656");
					textField_9.setText("9454413027 , 9454417666");
				}
				else if(comboBox.getSelectedItem().equals("Bangluru")) {
					textField.setText("080 - 22211292 , 080 - 22214553");
					textField_1.setText("dcurban@nic.in , deo.bangaloreu@gmail.com");
					textField_2.setText("080 - 22214370");
					textField_3.setText("080 - 22211106");
					textField_9.setText("080 - 22211372 , 080 - 22211352");
				}
				else if(comboBox.getSelectedItem().equals("Delhi")) {
					textField.setText("9873745563 , 9717778491");
					textField_1.setText("dccentral@nic.in , dcsouth@nic.in");
					textField_2.setText("011-23071144");
					textField_3.setText("011-23382990 , 011-22336228");
					textField_9.setText("9818099041 , 9818099061");
				}
				else if(comboBox.getSelectedItem().equals("Lucknow")) {
					textField.setText("9415005000 , 0522-2623024");
					textField_1.setText("dmluc@nic.in");
					textField_2.setText("9415005002 , 9415005004");
					textField_3.setText("9454416490 , 9454416492");
					textField_9.setText("9454403838 , 9454403839");
				}
				else if(comboBox.getSelectedItem().equals("Mumbai")) {
					textField.setText("022-22662440");
					textField_1.setText("addcollmumbaicity@gmail.com");
					textField_2.setText("022-22670656");
					textField_3.setText("022-22662234");
					textField_9.setText("02227562288 , 02227576287");
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Segoe Print", Font.BOLD, 25));
		frame.getContentPane().add(btnNewButton_1);
		
	     nation = new JComboBox();
	     nation.setBounds(236, 322, 256, 34);
		nation.setBackground(new Color(224, 255, 255));
		nation.setForeground(new Color(139, 0, 0));
		nation.setFont(new Font("Tahoma", Font.BOLD, 20));
		nation.setModel(new DefaultComboBoxModel(new String[] {"Select ", "Indian"}));
		frame.getContentPane().add(nation);
		
		 query1 = new JTextArea();
		 query1.setBounds(236, 395, 256, 119);
		query1.setFont(new Font("Segoe Print", Font.BOLD, 22));
		frame.getContentPane().add(query1);
		
		 yquery = new JTextArea();
		 yquery.setBounds(236, 534, 256, 119);
		yquery.setFont(new Font("Segoe Print", Font.BOLD, 22));
		frame.getContentPane().add(yquery);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\GOPAL SINGH\\Documents\\Images\\bk.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1359, 738);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
