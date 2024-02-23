package MySql;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

public class Welcome_Page2 {

	private static JFrame frame;
	private static JProgressBar progressBar;
	private JLabel lblNewLabel_1;
	private static JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		           int x;
			
					Welcome_Page2 window = new Welcome_Page2();
					window.frame.setVisible(true);
					
						try {
							for(x=0;x<=100;x++) {
								Welcome_Page2.progressBar.setValue(x);
							    Thread.sleep(50);
							    Welcome_Page2.lblNewLabel_2.setText(Integer.toString(x)+" %");
							    if(x==100) {
							    	frame.dispose();
//							    	 Website_home_page obj=new Website_home_page();
//							    	 obj.main(null);
							    	Website_home_page br =new Website_home_page();
							    	br.main(null);
							    }
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
		
	}

	/**
	 * Create the application.
	 */
	public Welcome_Page2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Project _Image\\Icon_smart_city__1_-removebg-preview.png"));
		frame.getContentPane().setBackground(new Color(255, 128, 0));
		Dimension screen =Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen.width, screen.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\Download\\user-removebg-preview (1).png"));
		lblNewLabel.setBounds(506, 85, 400, 382);
		frame.getContentPane().add(lblNewLabel);
		
		 progressBar = new JProgressBar();
		progressBar.setForeground(new Color(0, 255, 0));
		progressBar.setBounds(348, 596, 728, 14);
		frame.getContentPane().add(progressBar);
		
		lblNewLabel_1 = new JLabel("Initializing.... Please Wait");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblNewLabel_1.setBounds(584, 490, 259, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(689, 555, 69, 36);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
