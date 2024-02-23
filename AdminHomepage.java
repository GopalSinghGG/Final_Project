package MySql;


import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.BoxLayout;

public class AdminHomepage {

	public  JFrame frame;
	JLabel agra,delhi;
	private JScrollPane scrollPane_1,scrollPane_2;
	private JLayeredPane layeredPane;
	private JPanel  panel_2, panel_3, panel_4, panel_5, panel_6,panel_7;
	Agra a=new Agra();
	private JTextField textField;
	private JTable table,table_1,table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomepage window = new AdminHomepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	   public void switchPanels(JPanel panel) {
	       layeredPane.removeAll();
	       layeredPane.add(panel);
	       layeredPane.repaint();
	       layeredPane.revalidate();
	         
     }

	/**
	 * Create the application.
	 */
	public AdminHomepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setVisible(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 60, 1350, 45);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
//		
			
		
		agra = new JLabel("AGRA");
		agra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				frame.dispose();
				new Agra();
				
		
			}
			public void mouseEntered(MouseEvent e) {
				agra.setForeground(new Color(0,0,225));
				agra.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				agra.setForeground(new Color(139, 0, 0));
				agra.setBackground(new Color(143,188,143));
			}
		});
		agra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		agra.setOpaque(true);
		agra.setBackground(new Color(143, 188, 143));
		agra.setForeground(new Color(139, 0, 0));
		agra.setHorizontalAlignment(SwingConstants.CENTER);
		agra.setFont(new Font("Tahoma", Font.BOLD, 22));
		agra.setBounds(0, 0, 250, 45);
		panel.add(agra);
		
		delhi = new JLabel("DELHI");
		delhi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Delhi d=	new Delhi();
			    d.main(null);
			}
			
			public void mouseEntered(MouseEvent e) {
				delhi.setForeground(new Color(0,0,225));
				delhi.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				delhi.setForeground(new Color(139, 0, 0));
				delhi.setBackground(new Color(143,188,143));
			}
		});
		
		delhi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		delhi.setBackground(new Color(143, 188, 143));
		delhi.setOpaque(true);
		delhi.setHorizontalAlignment(SwingConstants.CENTER);
		delhi.setForeground(new Color(139, 0, 0));
		delhi.setFont(new Font("Tahoma", Font.BOLD, 22));
		delhi.setBounds(1045, 0, 305, 45);
		panel.add(delhi);
		
		JLabel lblNewLabel_1_3 = new JLabel("MUMBAI");
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Mumbai obj=new Mumbai();
				obj.main(null);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(0,0,225));
				lblNewLabel_1_3.setBackground(new Color(139,0,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_3.setForeground(new Color(139, 0, 0));
				lblNewLabel_1_3.setBackground(new Color(143,188,143));
			}
		});
		lblNewLabel_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setBackground(new Color(143, 188, 143));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_3.setBounds(500, 0, 300, 45);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("BANGALORE");
		lblNewLabel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Bengluru();
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_4.setForeground(new Color(0,0,225));
				lblNewLabel_1_4.setBackground(new Color(139,0,0));
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_4.setForeground(new Color(139,0,0));
				lblNewLabel_1_4.setBackground(new Color(143,188,143));
			}
		});
		lblNewLabel_1_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_4.setBackground(new Color(143, 188, 143));
		lblNewLabel_1_4.setOpaque(true);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_4.setBounds(250, 0, 250, 45);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("LUCKNOW");
		lblNewLabel_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Lucknow b=new Lucknow();
			    b.main(null);
			}
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(0,0,225));
				lblNewLabel_1_5.setBackground(new Color(139,0,0));
			}
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1_5.setForeground(new Color(139,0,0));
				lblNewLabel_1_5.setBackground(new Color(143,188,143));
			}
		});
		lblNewLabel_1_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_5.setOpaque(true);
		lblNewLabel_1_5.setBackground(new Color(143, 188, 143));
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setForeground(new Color(139, 0, 0));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_5.setBounds(797, 0, 250, 45);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("USERS");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.show(false);
				panel_3.show(true);
			}
		});
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.setBounds(1108, 22, 73, 28);
		lblNewLabel_1_1.setVisible(true);		
		frame.getContentPane().add(lblNewLabel_1_1);
		
		
		
		JLabel logOut = new JLabel("LOGOUT");
		logOut.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=JOptionPane.showConfirmDialog(null,  "Are you sure You want to logout","Confirmation Box",JOptionPane.YES_NO_OPTION);
				if(i==0) {
				frame.dispose();
				new Website_home_page();
				}
			}
		});
		logOut.setFont(new Font("Tahoma", Font.BOLD, 20));
		logOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logOut.setBounds(1209, 22, 116, 28);
		frame.getContentPane().add(logOut);
		
		
		JLabel lblNewLabel = new JLabel("Welcome Admin");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 40));
		lblNewLabel.setBounds(0, 0, 1350, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(0, 105, 1350, 620);
		frame.getContentPane().add(panel_1);
		 panel_1.setLayout(null);
		
		 layeredPane = new JLayeredPane();
		 layeredPane.setBounds(0, 0, 1350, 620);
		panel_1.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		 panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 0, 0));
		layeredPane.add(panel_2, "name_77710761418200");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Project _Image\\admin (1).jpg"));
		lblNewLabel_3.setBounds(0, 0, 1350, 630);
		panel_2.add(lblNewLabel_3);
		
		 panel_3 = new JPanel();

		 panel_3.setBackground(new Color(255, 255, 255));
		layeredPane.add(panel_3, "name_77744006583900");
		panel_3.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(78, 183, 670, 40);
		panel_3.add(textField);
		
		JLabel usern = new JLabel("Username ");
		usern.setForeground(new Color(107, 142, 35));
		usern.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		usern.setBounds(78, 124, 272, 50);
		panel_3.add(usern);
		
		JButton btn1 = new JButton("Delete Data");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Please Fill Username ");
				}else {
				String userName=textField.getText();
				try {
//					String userName=textField.getText();
					String sql="delete from data where email=?";
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:33306/employee","root","");

					PreparedStatement pr2;
						pr2=con.prepareStatement(sql);
						pr2.setString(1, userName);
						int i=pr2.executeUpdate();
						if(i>0) {
							JOptionPane.showMessageDialog(null, "Record Successfully Deleted");
						}else {
							JOptionPane.showMessageDialog(null, "Data does't match.");
						}
						 
							
						
//						
					
					
							
					
//				
			
			}
			catch(Exception ex) {
				
				ex.printStackTrace();
			}
			}
			}
		});
		btn1.setBackground(new Color(255, 255, 0));
		btn1.setForeground(Color.RED);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(342, 267, 180, 50);
		panel_3.add(btn1);
		
		JButton btnShowQuery = new JButton("Show Queries  Table");
		btnShowQuery.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnShowQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.show(false);
				panel_5.show(true);
//				String userName=textField.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:33306/minor_project","root","");
					java.sql.Statement st=con.createStatement();
					String sql="select * from query";
					  
	
						ResultSet rs=st.executeQuery(sql);
						ResultSetMetaData rsmd = rs.getMetaData();
//						
						DefaultTableModel dtm=(DefaultTableModel)table_1.getModel();
						int col=rsmd.getColumnCount();
						String[] colname=new String[col];
						for(int i=0;i<col;i++) {
						       colname[i]=rsmd.getColumnName(i+1);	
						dtm.setColumnIdentifiers(colname);
					     String Name,Mob,Nation, Query,Your_Query;
					     while(rs.next()) {
//					    	 Vector v=new Vector();
					    	 Name=rs.getString(1);
					    	 Mob=rs.getString(2);
					    	 Nation=rs.getString(3);
					    	 Query=rs.getString(4);
					    	 Your_Query=rs.getString(5);

					    	 String[] row= {Name,Mob,Nation, Query,Your_Query};
					    	 dtm.addRow(row);
					     }
					    	 
					     }
						st.close();
				    	 con.close();
						
						}
						
						
					 catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		btnShowQuery.setBackground(new Color(255, 255, 0));
		btnShowQuery.setForeground(new Color(0, 128, 0));
		btnShowQuery.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShowQuery.setBounds(885, 267, 374, 50);
		panel_3.add(btnShowQuery);
		
		JButton btnShowAllUsers = new JButton("Show All Users");
		btnShowAllUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.show(false);
				panel_4.show(true);
//				String userName=textField.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:33306/employee","root","");
					java.sql.Statement st=con.createStatement();
					String sql="select * from data";
					  
	
						ResultSet rs=st.executeQuery(sql);
						ResultSetMetaData rsmd = rs.getMetaData();
//						
						DefaultTableModel dtm=(DefaultTableModel)table.getModel();
						int col=rsmd.getColumnCount();
						String[] colname=new String[col];
						for(int i=0;i<col;i++) {
						       colname[i]=rsmd.getColumnName(i+1);	
						dtm.setColumnIdentifiers(colname);
					     String user,email,pass,gen,option,address;
					     while(rs.next()) {
//					    	 Vector v=new Vector();
					    	 user=rs.getString(1);
					    	 email=rs.getString(2);
					    	 pass=rs.getString(3);
					    	 gen=rs.getString(4);
					    	 option=rs.getString(5);
					    	 address=rs.getString(6);
					    	 String[] row= {user,email,pass,gen,option,address};
					    	 dtm.addRow(row);
					     }
					    	 
					     }
						st.close();
				    	 con.close();
						
						}
						
						
					 catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		btnShowAllUsers.setBackground(new Color(255, 255, 0));
		btnShowAllUsers.setForeground(new Color(0, 128, 0));
		btnShowAllUsers.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShowAllUsers.setBounds(885, 137, 374, 50);
		panel_3.add(btnShowAllUsers);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\welcome (2).jpg"));
		lblNewLabel_2.setBounds(0, 0, 1350, 630);
		panel_3.add(lblNewLabel_2);
		
		 panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_77746290581400");
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(206, 61, 828, 435);
		panel_4.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(new Color(128, 128, 128));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 350, 630);
		panel_4.add(lblNewLabel_1);
		
	     panel_5 = new JPanel();
		layeredPane.add(panel_5, "name_77749424510700");
		panel_5.setLayout(null);
		
		 scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(206, 61, 828, 435);
		panel_5.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setBackground(new Color(128, 128, 128));
		
		 panel_6 = new JPanel();
		layeredPane.add(panel_6, "name_77751848199400");
		panel_6.setLayout(null);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(206, 61, 800,180);
		panel_6.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		table_2.setBackground(new Color(128, 128, 128));
		
		 panel_7 = new JPanel();
		layeredPane.add(panel_7, "name_77754687037300");
	}
}
