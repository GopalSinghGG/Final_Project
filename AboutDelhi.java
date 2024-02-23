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

public class AboutDelhi {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutDelhi window = new AboutDelhi();
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
	public AboutDelhi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width,screen.height);
//		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 89, 675, 366);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("AKSHARDHAM TEMPLE");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1.setBackground(new Color(220, 220, 220));
		lblNewLabel_1_1.setBounds(0, 0, 675, 60);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project _Image\\ak (1).jpg"));
		lblNewLabel_2.setBounds(0, 60, 675, 306);
		panel_1_1.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 454, 1350, 275);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("About Delhi City");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 35));
		lblNewLabel_3.setBackground(new Color(240, 230, 140));
		lblNewLabel_3.setBounds(0, 0, 1350, 67);
		panel.add(lblNewLabel_3);
		
		JTextArea txtpnTheTajCity = new JTextArea();
		txtpnTheTajCity.setText("Delhi, India's capital territory, is a massive metropolitan area in the country's north. In old delhi,a neighborhood dateing to the\r\n1600s, stands the immposing Mughal-era Red Fort, a symbol of India, and the sprawling Jama Masjid mosque, whose court-\r\nyard accommodates 25,000 people. Nearby is Chandni chowk, a vibrant bazaar filled with foodcarts, sweets shops and spice \r\nstalls. Delhi is of great historical significance as an importantcommercial, transport, and cultural hub, as well as the political \r\ncentre of India. According to legend, the city was named for Raja Dhilu, a king who reigned in the region in the 1st century.\r\nThe names by which the city has been known-including Delhi, Dehli, Dilli, and Dhilli among otherslikely are corruptions of his \r\nname. Delhi has been the centre of a succession of mighty empires and powerful kingdoms.");
		txtpnTheTajCity.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtpnTheTajCity.setEditable(false);
		txtpnTheTajCity.setBounds(0, 67, 1350, 208);
		panel.add(txtpnTheTajCity);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(675, 89, 675, 366);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("LOTUS TEMPLE");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBackground(new Color(220, 220, 220));
		lblNewLabel_1.setBounds(0, 0, 675, 60);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Project _Image\\lotus_temple (1).png"));
		lblNewLabel_2_1.setBounds(0, 60, 675, 306);
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
				Delhi obj=new Delhi();
				obj.main(null);
			}
		});
		btnNewButton.setBounds(27, 25, 56, 37);
		panel_2.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("D:\\Project _Image\\arro2.JPG"));
		
		JLabel lblNewLabel = new JLabel("CAPITAL OF INDIA DELHI");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(426, 0, 619, 82);
		panel_2.add(lblNewLabel);
	}
}
