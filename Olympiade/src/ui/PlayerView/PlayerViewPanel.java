package ui.PlayerView;

import java.awt.Dimension;

import javax.swing.JLabel;



//TODO Alle Daten aus DB
/**
 * Stellt die Playerdetailansicht dar
 * @author Katy
 *
 */
public class PlayerViewPanel {
	
	private JLabel playerImage;
	private IconStatPanel iconStatPanel;
	private PlayerDetailPanel playerDetailPanel;
	
	public PlayerViewPanel(){
		
		initPlayerViewComponents();
		
	}

	private void initPlayerViewComponents() {
		playerImage = new JLabel("DummyBild"); 
		playerImage.setPreferredSize(new Dimension(295,295));
		
	}

}