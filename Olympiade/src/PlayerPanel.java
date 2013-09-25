import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


/**
 * H�lt die Spielerdaten
 * @author Katy
 *
 */
public class PlayerPanel extends JPanel{
	
	private JLabel playerName;
	private JLabel playerImage;
	private JPanel statsPanel;	//Enth�lt die Attribute und Werte
	private JPanel profilPanel; //Enth�lt Profilname und Foto
	private JLabel [] attributes; //Attribut Namen
	private JLabel [] attributesVars;//Platzhalter f�r die Werte der Attribute
	
	private String []  attributeNames= {"games", "pps", "stamina", "value", "salary", "contract"};
	
	/**
	 * Enth�lt alle Infos zu einem Spieler
	 */
	public PlayerPanel(){
		initPlayerPanel();
		initStatsPanel();
		initProfilPanel();
		
		this.add(profilPanel);
		this.add(statsPanel);
		
		this.setPreferredSize(new Dimension(0,0));
	}

	/**
	 * Initialisiert das ProfilPanel
	 */
	private void initProfilPanel() {
		profilPanel = new JPanel();
		
		playerImage = new JLabel("dummybild"); //TODO Aus DB
		playerImage.setPreferredSize(new Dimension(100,100));
		
		playerName = new JLabel("dummyspieler"); //TODO Aus DB
		playerName.setPreferredSize(new Dimension(100,20));
		
		profilPanel.add(playerName);
		profilPanel.add(playerImage);
		profilPanel.setPreferredSize(new Dimension(100,150));
	}


	/**
	 * Erstellt das StatsPanel mit den Spielerattributen
	 */
	private void initStatsPanel() {
		statsPanel = new JPanel();
		statsPanel.setPreferredSize(new Dimension(200,150));
		
		
		/*Um jeweils erst 3 Werte aus der einen Liste zu bekommen
		*dann 3 aus der zweiten Liste, dann wieder 3 aus der ersten 
		*und zum Schluss 3 aus der zweiten, dienen diese 3 Schleifen
		*/
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

	/**
	 * Erstellt alle Labels f�r die Stats des Players und setzt sie auf die richtige Gr��e
	 */
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
