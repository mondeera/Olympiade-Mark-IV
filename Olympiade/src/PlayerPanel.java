import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class PlayerPanel extends JPanel{
	
	private JLabel playerName;
	private JLabel playerImage;
	private JPanel statsPanel;
	private JPanel profilPanel;
	private JLabel [] attributes;
	private JLabel [] attributesVars;
	
	private String []  attributeNames= {"games", "pps", "stamina", "value", "salary", "contract"};
	

	public PlayerPanel(){
		
		initPlayerPanel();
		
		initStatsPanel();
		initProfilPanel();
		
		this.add(profilPanel);
		this.add(statsPanel);
		
		this.setPreferredSize(new Dimension(0,0));
		
		
		this.setBorder(new LineBorder(Color.BLACK));
		
	}


	private void initProfilPanel() {
		profilPanel = new JPanel();
		
		playerImage = new JLabel("dummybild");
		playerImage.setPreferredSize(new Dimension(100,100));
		
		playerName = new JLabel("dummyspieler");
		playerName.setPreferredSize(new Dimension(100,20));
		
		profilPanel.add(playerName);
		profilPanel.add(playerImage);
		profilPanel.setPreferredSize(new Dimension(100,150));
	}


	private void initStatsPanel() {
		statsPanel = new JPanel();
		statsPanel.setPreferredSize(new Dimension(200,150));
		
		int j = 0;
		for(int i = 0; i < attributeNames.length; i++){
			statsPanel.add(attributes[i]);
			if(i == 2){
				for(; j < attributeNames.length; j++){
					statsPanel.add(attributesVars[j]);
					if(j == 3){
						break;
					}
				}
				
			}
			
		}
		for(; j < attributeNames.length; j++){
			statsPanel.add(attributesVars[j]);
		}
		
	}


	private void initPlayerPanel() {
		attributes = new JLabel[6];
		attributesVars = new JLabel[6];
		
		
		for(int i = 0; i < attributeNames.length; i++){
			attributes[i] = new JLabel(attributeNames[i]); 
			attributesVars[i] = new JLabel("dummy"); //TODO aus der DB
			
			attributes[i].setPreferredSize(new Dimension(50,30));
			attributesVars[i].setPreferredSize(new Dimension(50,30));
		}
		
	}

}
