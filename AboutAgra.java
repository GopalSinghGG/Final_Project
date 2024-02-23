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
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AboutAgra {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutAgra window = new AboutAgra();
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
	public AboutAgra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		Dimension screen =Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 1350, 86);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THE TAJ CITY");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setBounds(409, 11, 543, 64);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				 Agra obj=new Agra();
				 obj.main(null);
			}
		});
		lblNewLabel_2.setBackground(new Color(0, 0, 128));
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\arro.JPG"));
		lblNewLabel_2.setBounds(0, 11, 129, 64);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 85, 675, 366);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TAJ MAHAL");
		lblNewLabel_1_1_1.setOpaque(true);
		lblNewLabel_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1_1.setBackground(new Color(240, 230, 140));
		lblNewLabel_1_1_1.setBounds(0, 0, 675, 60);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Project _Image\\taj2.jpg"));
		lblNewLabel_1.setBounds(0, 58, 675, 308);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(675, 85, 675, 366);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("RED FORT");
		lblNewLabel_1_1_1_1.setOpaque(true);
		lblNewLabel_1_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1_1_1.setBackground(new Color(240, 230, 140));
		lblNewLabel_1_1_1_1.setBounds(0, 0, 675, 60);
		panel_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\Project _Image\\red_fort (2).jpg"));
		lblNewLabel_1_1.setBounds(0, 58, 675, 308);
		panel_1_1.add(lblNewLabel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 450, 1350, 279);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 230, 140));
		panel_3.setBounds(0, 0, 1350, 50);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("About the City of Taj");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 32));
		lblNewLabel_3.setBackground(new Color(240, 230, 140));
		lblNewLabel_3.setBounds(0, 0, 1350, 50);
		panel_3.add(lblNewLabel_3);
		
		JTextPane txtpnTheTajCity = new JTextPane();
		txtpnTheTajCity.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtpnTheTajCity.setEditable(false);
		txtpnTheTajCity.setText("The Taj City Agra is located on banks of the yamuna river in the Indian state of Utter Pradesh. Agra's notable historical period began during Sikandar Lodi's reign, but the golden age of the foremost city of the Indian subcontinent and the capital of the Mughal Empire under Mughal emperors Babur, Humayun, Akbar, Jahangir and Shah Jahan. Under Mughal rule, Agra became a centre for learning, arts, commerce, and religion, and saw the construction of the Agra Fort, Sikandra and Agra's most prized monument, the Taj Mahal, built by Shah Jahan as a mausoleum for his favourite empress. With the decline of the Mughal empire in the late 18th century, the city fell successively first to Marathas and late to the East India Company.");
		txtpnTheTajCity.setBounds(0, 52, 1350, 227);
		panel_2.add(txtpnTheTajCity);
		
	}
}
