import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class MainPanel extends JLayeredPane{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel teamnameLabel;
	private JButton button;
	private JPanel navigationPanel;
	private JButton [] buttons;
	
	public MainPanel(){
		initMainPanel();
		
		teamnameLabel = new JLabel("Teamname");
		initLabel(teamnameLabel);
		this.add(teamnameLabel, new Integer(1), 0);
		
		initNavigationPanel();
		this.add(navigationPanel,  new Integer(1), 0);
	}
	
	public void initNavigationPanel(){
		navigationPanel = new JPanel();
		navigationPanel.setVisible(true);
		
		buttons = initNavigationButtons();
		
		for(int i = 0; i < 12; i++){
			navigationPanel.add(buttons[i]);
		}
		
		
		
		
	}
	
	public JButton[] initNavigationButtons(){
		JButton [] buttons = new JButton[12];
		
		buttons[0] = new JButton("Overview");
		buttons[1] = new JButton("next Round");
		buttons[2] = new JButton("Team");
		buttons[3] = new JButton("Training-Camp");
		buttons[4] = new JButton("Standings");
		buttons[5] = new JButton("Top Players");
		buttons[6] = new JButton("News");
		buttons[7] = new JButton("Transfers");
		buttons[8] = new JButton("Rumors");
		buttons[9] = new JButton("Prize-Money");
		buttons[10] = new JButton("Spellbook");
		buttons[11] = new JButton("Sponsors");

		return buttons;
		
	}
	
	public void initLabel(JLabel teamnameLabel){
		teamnameLabel.setText("Teamname");
		teamnameLabel.setSize(200, 50);	
		teamnameLabel.setBounds(400, 10, 200, 30);
		teamnameLabel.setBorder(new LineBorder(Color.BLACK));
		teamnameLabel.setVisible(true);

	}
	
	public void initMainPanel(){
		this.setBackground(Color.BLACK);
		this.setSize(1000,1000);
		this.setVisible(true);
		this.setBounds(100,100,100,100);

	}

}
