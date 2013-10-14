package ui.mainView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;

/**
 * Enth�lt das Men�
 * @author Katy
 *
 */
public class NavigationPanel extends JPanel {
	
	private JButton [] buttons;
	private String [] buttonNames = {"Overview", "Next Round", "Team", "Trainings-Camp", "Standings", "Top Players", "News", "Transfer", "Rumors", "Prize Money"}; 
	
	public NavigationPanel(){
		buttons = new JButton[buttonNames.length];
		
		this.setVisible(true);
		this.setBounds(0,100,150,800);
		
		createNavigation();
	}
	
	/**
	 * Initialisiert die Navigationsleiste 
	 */
	public void createNavigation(){

		for(int i = 0; i < buttonNames.length; i++){
			buttons[i] = new JButton(buttonNames[i]);	
			buttons[i].setPreferredSize(new Dimension(140,30));
			this.add(buttons[i]);
		}
	}
	
	public JButton getOverviewButton(){
		return buttons[0];
	}
	
	public JButton getTeamButton(){
		return buttons[2];
	}
}
