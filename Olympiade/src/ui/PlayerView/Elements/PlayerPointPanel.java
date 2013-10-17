package ui.PlayerView.elements;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PlayerPointPanel extends JPanel{

	private JLabel [] pointLabels;
	private String [] pointLabelText;
	private int playerPoints;
	private int skillPoints;
	
	public PlayerPointPanel(int playerpoints, int skillPoints) {
		this.playerPoints = playerpoints;
		this.skillPoints = skillPoints;
		this.setBounds(330,170,290,60);
		
		initPointLabelText();
		initPointLabel();
	}

	private void initPointLabelText() {
		pointLabelText = new String [5];
		
		pointLabelText[0] = "PlayerPoints:";
		pointLabelText[1] = playerPoints+ "";
		pointLabelText[2] = "var";//TODO aus DB
		pointLabelText[3] = "Skill Points:";
		pointLabelText[4] = skillPoints+"";
		
		
	}

	private void initPointLabel() {
		pointLabels = new JLabel [5];
		
		for(int i = 0; i < pointLabels.length; i++){
			pointLabels[i] = new JLabel(pointLabelText[i]);
			pointLabels[i].setPreferredSize(new Dimension(90,20));
			
			this.add(pointLabels[i]);
		}
		
		pointLabels[1].setToolTipText("Season");
		pointLabels[2].setToolTipText("All Time");
		pointLabels[4].setPreferredSize(new Dimension(185,20));
		
	}

}
