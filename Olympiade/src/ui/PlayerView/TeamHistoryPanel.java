package ui.PlayerView;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TeamHistoryPanel extends JPanel{
	
	
	private String [] teamHistoryNames = {"team", "season", "assignment", "pps", "value"};
	private JLabel [] teamHistoryLabels;
	private JLabel [] teamHistoryValues;
	
	public TeamHistoryPanel(){
		this.setBounds(600,500,480,60);
		this.setBorder(new LineBorder(Color.RED));
		initPanel();
		
	}

	
	private void initPanel() {
		teamHistoryLabels = new JLabel[5];
		teamHistoryValues = new JLabel[5]; //TODO aus DB
		
		for(int i = 0; i < teamHistoryNames.length; i++){
			teamHistoryLabels[i] = new JLabel(teamHistoryNames[i]);
			teamHistoryValues[i] = new JLabel("dummy"); 
			
			teamHistoryLabels[i].setPreferredSize(new Dimension(90, 20));
			teamHistoryValues[i].setPreferredSize(new Dimension(90, 20));
			
		}
		
		for(int i = 0; i < teamHistoryNames.length; i++){
			this.add(teamHistoryLabels[i]);
		}
		for(int i = 0; i < teamHistoryNames.length; i++){
			this.add(teamHistoryValues[i]);
		}
	}
}
