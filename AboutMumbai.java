package MySql;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutMumbai {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMumbai window = new AboutMumbai();
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
	public AboutMumbai() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.setResizable(false);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
//		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 255, 255));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 89, 675, 366);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("GATEWAY OF INDIA");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1.setBackground(new Color(220, 220, 220));
		lblNewLabel_1_1.setBounds(0, 0, 675, 60);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\gateway of india (1).jpg"));
		lblNewLabel_2.setBounds(0, 60, 665, 306);
		panel_1_1.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 454, 1350, 275);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("About Mumbai City");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 35));
		lblNewLabel_3.setBackground(new Color(240, 230, 140));
		lblNewLabel_3.setBounds(0, 0, 1350, 67);
		panel.add(lblNewLabel_3);
		
		JTextArea txtpnTheTajCity = new JTextArea();
		txtpnTheTajCity.setText("Mumbai, city, capital of Maharashtra state, southwestern India. It is the country’s financial and commercial centre and its \r\nprincipal port on the Arabian Sea. Explore Mumbai, the most populouscity and the country's financial and commercial \r\ncenter Explore Mumbai, the most populous city and the country's financia l and commercial center Overview of \r\nMumbai, Maharashtra, India.See all videos for this article Located on Maharashtra’s coast,Mumbai is India’s most-\r\npopulous city,  and  it  is  one  of  the    largest and most densely populated urban areas in the world. It was built on a site\r\n of ancient settlement, and it took its name from the local goddess Mumba—a form of Parvati, the consort of Shiva,one \r\nof the principal deities of Hinduism—whose temple once stood i what is now\r\n the southeastern section of the city. \r\nIt became known as Bombay during the British colonial period, the name possibly an Anglicized corruption of Mumbai or perhaps of Bom Baim (“Good Harbour”), supposedly a Portuguese name for the locale. The name \r\nMumbai was restored officially in 1995, although Bombay remained in common usage.");
		txtpnTheTajCity.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtpnTheTajCity.setEditable(false);
		txtpnTheTajCity.setBounds(0, 67, 1350, 208);
		panel.add(txtpnTheTajCity);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(675, 89, 675, 366);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("FLORA FOUNTAIN");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBackground(new Color(220, 220, 220));
		lblNewLabel_1.setBounds(0, 0, 675, 60);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Project _Image\\FLORA (1).jpg"));
		lblNewLabel_2_1.setBounds(-4, 60, 675, 306);
		panel_1.add(lblNewLabel_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(165, 42, 42));
		panel_2.setBounds(0, 2, 1350, 88);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Mumbai obj=new Mumbai();
				obj.main(null);
			}
		});
		btnNewButton.setBounds(27, 25, 56, 37);
		panel_2.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("D:\\Project _Image\\arro2.JPG"));
		
		JLabel lblNewLabel = new JLabel("CAPITAL OF MAHARASHTRA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(426, 0, 619, 82);
		panel_2.add(lblNewLabel);
	}
}
