package ui.PlayerView.elements;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * H�lt das Label "Team" und dazugeh�rigen Wert
 * @author Katy
 *
 */
public class PlayerteamNamePanel extends JPanel{

	private JLabel teamLabel;
	private JLabel teamNameLabel;

	
	public PlayerteamNamePanel(String teamName) {
		this.setBounds(330,40,250,25);
		initLabels(teamName);
	}

	private void initLabels(String name) {
		
		teamLabel = new JLabel("Team:");
		teamNameLabel = new JLabel(name);
		
		teamNameLabel.setPreferredSize(new Dimension(165,15));
		teamLabel.setPreferredSize(new Dimension(70,15));
		
		this.add(teamLabel);
		this.add(teamNameLabel);
	}

}
