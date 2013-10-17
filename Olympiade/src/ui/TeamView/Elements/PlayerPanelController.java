package ui.TeamView.elements;

import gameContent.Player;
import helper.IconCreator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import ui.eventHandling.ShowPlayerEvent;
import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;

//TODO nochmal sch�n machen
/**
 * 
 * @author Katy
 *Baut eine Playerview zusammen
 */
public class PlayerPanelController implements UiEventDispatcher{
	
	
	private JPanel allPlayers = new JPanel();
	private ArrayList<Player> players = new ArrayList<Player>();

	private JLabel actPlayerImage; 
	private JLabel actPlayerName;
	private JPanel actProfilPanel;

	
	public PlayerPanelController(){
		allPlayers.setBounds(250,0,900,800);
	}
	
	/**
	 * Initialisiert die verschiebenen Panel und Label f�r die Spieleransicht
	 * und addet diese auf ein gesamt Panel
	 * @param players2 
	 */
	public void addPlayers(ArrayList<Player> players){
		this.players = players;
	
		for(Player p: players){
		
			PlayerPanel view = new PlayerPanel();
		
			JPanel statsPanel = initStatsPanel(p);	//Enth�lt die Attribute und Werte
			initPlayerNameLabel(p);
			initPlayerImage(p);
			initProfilPanel(actPlayerImage, actPlayerName); //Enth�lt Profilname und Foto
	
			view.addProfilPanel(actProfilPanel);
			view.addStatsPanel(statsPanel);
			
			
			//H�lt alle Player
			allPlayers.add(view);
		}

	}
	
	/**
	 * Erstellt Spielernamen und Image und packt es auf ein "Profil"Panel
	 * @param playerImage Spielerbild
	 * @param playerName Spielername
	 * @return profilPanel
	 */
	public void initProfilPanel(JLabel playerImage, JLabel playerName) {
		actProfilPanel = new JPanel();
		playerName.setPreferredSize(new Dimension(100,20));
		actProfilPanel.add(playerName);
		actProfilPanel.add(playerImage);
		
	}

	/**
	 * Setzt das Spielerbild
	 * @return
	 */
	public void initPlayerImage(Player player) {
		String stripName = player.getName().replace(".", "").replaceAll(" ", "");
		ImageIcon icon = IconCreator.createImageIcon("../../../res/img/"+stripName+".jpg","");
		icon.setImage(icon.getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
		actPlayerImage = new JLabel(icon);
		player.setIcon(icon);
	}
	

	/**
	 * Initialisiert den Spielernamen und addet einen MouseListener der auf Klicken achtet
	 * @return
	 */
	public void initPlayerNameLabel(final Player player) {
		actPlayerName = new JLabel(player.getName());
		actPlayerName.setHorizontalAlignment(JLabel.CENTER);
		actPlayerName.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				dispatch(new ShowPlayerEvent("activatePlayerView",player));
			}
		});
	}
	
	/**
	 * F�gt die Attribute eines Players in das StatPanel
	 */
	public JPanel initStatsPanel(Player player) {
		JPanel statsPanel = new JPanel();
		JLabel [] attributes = new JLabel[6];//Attribut Namen
		JLabel [] attributesVars = new JLabel[6];;//Platzhalter f�r die Werte der Attribute
		String [] values = player.getStatArray();
		String [] attributeNames= {"Games", "Pps", "Endurance", "Value", "Salary", "Contract"};
		
		
		for(int i = 0; i < attributeNames.length; i++){
			attributes[i] = new JLabel(attributeNames[i]); 
			attributesVars[i] = new JLabel(values[i]); //TODO aus der DB
			attributes[i].setHorizontalAlignment(JLabel.CENTER);
			
			attributes[i].setPreferredSize(new Dimension(80,25));
			attributesVars[i].setPreferredSize(new Dimension(80,35));
			attributesVars[i].setHorizontalAlignment(JLabel.CENTER);
		}
		
		
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
		return statsPanel;
	}

	public JPanel getPanel(){
		return allPlayers;
	}
	
	//F�gt alle Interessanten an Events zu einer Liste hinzu
	@Override
	public void addListener(UiEventListener listener){
		listeners.add(listener);
	}

	
	//Informmiert alle Interessenten
	@Override
	public void dispatch(UiEvent event) {
		for(UiEventListener lis: listeners){
			lis.onUiEventFired(event);
			
		}
		
	}

	//L�scht aus der Interessentenliste
	@Override
	public void removeListener(UiEventListener listener) {
		listeners.remove(listener);
		
		
	}

}
