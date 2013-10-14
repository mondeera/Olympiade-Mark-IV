package ui.TeamView.elements;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;


/**
 * H�lt die Spielerdaten
 * @author Katy
 *
 */
public class PlayerPanel extends JPanel{
	
	
	
	private String []  attributeNames= {"Games", "Pps", "Stamina", "Value", "Salary", "Contract"};
	
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	
	/**
	 * Enth�lt alle Infos zu einem Spieler
	 */
	public PlayerPanel(){
		this.setBorder(new LineBorder(Color.LIGHT_GRAY));
		this.setVisible(true);
		this.setPreferredSize(new Dimension(440,170));
	}
	
	
	public void addProfilPanel(JPanel profilPanel){
		this.add(profilPanel);
		profilPanel.setPreferredSize(new Dimension(150,160));
	}

	public void addStatsPanel(JPanel statsPanel) {
		statsPanel.setPreferredSize(new Dimension(270,150));
		this.add(statsPanel);
		
	}
	
}
