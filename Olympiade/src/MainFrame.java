import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


public class MainFrame extends JFrame{
	
	private static MainPanel mainpanel;
	
	public MainFrame(){
		
		mainpanel = new MainPanel();
		
		this.setBackground(Color.YELLOW);
		
		this.setSize(1280,960);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("Oly");
		
		this.add(mainpanel);
		this.setVisible(true);
		
		
	}

}
