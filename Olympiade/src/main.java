import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


public class main {

	
	private static JFrame mainframe;
	private static MainPanel mainpanel;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		mainpanel = new MainPanel();
		
		mainframe = new JFrame();
		mainframe.setVisible(true);
		mainframe.setBackground(Color.YELLOW);
		mainframe.setSize(1280,960);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setTitle("Oly");
		mainframe.setLayout(new BorderLayout());
		mainframe.setVisible(true);
		
		mainframe.add(mainpanel, BorderLayout.CENTER);
		

	}

}
