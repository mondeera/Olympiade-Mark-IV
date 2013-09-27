package ui.TeamView;
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

import ui.EventHandling.UiEvent;
import ui.EventHandling.UiEventDispatcher;
import ui.EventHandling.UiEventListener;


/**
 * H�lt die Spielerdaten
 * @author Katy
 *
 */
public class PlayerPanel extends JPanel{
	
	
	
	private String []  attributeNames= {"games", "pps", "stamina", "value", "salary", "contract"};
	
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	
	/**
	 * Enth�lt alle Infos zu einem Spieler
	 */
	public PlayerPanel(){
		this.setBackground(Color.blue);
		this.setVisible(true);
		this.setPreferredSize(new Dimension(320,160));
	}
	
	
	public void addProfilPanel(JPanel profilPanel){
		this.add(profilPanel);
		profilPanel.setBackground(Color.MAGENTA);
		profilPanel.setPreferredSize(new Dimension(100,150));
	}

	public void addStatsPanel(JPanel statsPanel) {
		statsPanel.setPreferredSize(new Dimension(200,150));
		this.add(statsPanel);
		
	}
	
}
