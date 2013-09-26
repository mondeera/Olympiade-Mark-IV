package ui.TeamView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ui.EventHandling.UiEvent;
import ui.EventHandling.UiEventDispatcher;
import ui.EventHandling.UiEventListener;

//TODO nochmal sch�n machen
/**
 * 
 * @author Katy
 *Baut eine Playerview zusammen
 */
public class PlayerPanelController implements UiEventDispatcher{
	
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	private ArrayList <PlayerPanel> playerList;
	private JPanel allPlayers = new JPanel();
	
	public PlayerPanelController(){
		playerList = new ArrayList<PlayerPanel>();
		allPlayers.setBounds(310,50,700,1500);
		allPlayers.setBorder(new LineBorder(Color.BLUE));
	}
	
	public void addPlayer(){
		JPanel statsPanel = new JPanel();	//Enth�lt die Attribute und Werte
		JPanel profilPanel = new JPanel();
		profilPanel = initProfilPanel(profilPanel); //Enth�lt Profilname und Foto
		
		
		PlayerPanel view = new PlayerPanel();
		JLabel playerName = new JLabel("dummyspieler"); //TODO Aus DB
		playerName.setPreferredSize(new Dimension(100,20));
		
		JLabel playerImage = new JLabel("dummyimage"); //TODO Aus DB
		playerImage = initPlayerImage(playerImage);
		profilPanel = initProfilPanel(profilPanel);
		statsPanel = initStatsPanel(statsPanel);
		
		profilPanel.add(playerName);
		profilPanel.add(playerImage);
		
		view.addElement(profilPanel);
		view.addElement(statsPanel);
		
		playerList.add(view);
		allPlayers.add(view);
	}
	
	private JPanel initProfilPanel(JPanel profilPanel) {
		profilPanel.setPreferredSize(new Dimension(100,150));
		return profilPanel;
	}

	private JLabel initPlayerImage(JLabel playerImage) {
		playerImage.setPreferredSize(new Dimension(100,100));
		playerImage.addMouseListener( new MouseListener() {
			
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
				dispatch();
				System.out.println("clicked");
			}
		});
		return playerImage;
	}

	public ArrayList<PlayerPanel> getViewList(){
		return playerList;
	}
	
	public JPanel getPanel(){
		return allPlayers;
	}
	
	private JPanel initStatsPanel(JPanel statsPanel) {
		JLabel [] attributes = new JLabel[6];//Attribut Namen
		JLabel [] attributesVars = new JLabel[6];;//Platzhalter f�r die Werte der Attribute
		String []  attributeNames= {"games", "pps", "stamina", "value", "salary", "contract"};
		
		
		for(int i = 0; i < attributeNames.length; i++){
			attributes[i] = new JLabel(attributeNames[i]); 
			attributesVars[i] = new JLabel("dummy"); //TODO aus der DB
			
			attributes[i].setPreferredSize(new Dimension(50,30));
			attributesVars[i].setPreferredSize(new Dimension(50,30));
		}
		
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
		return statsPanel;
	}

	
	//F�gt alle Interessanten an Events zu einer Liste hinzu
		@Override
		public void addListener(UiEventListener listener){
			listeners.add(listener);
		}

		
		//Informmiert alle Interessenten
		@Override
		public void dispatch() {
			System.out.println("dispatcht");
			for(UiEventListener lis: listeners){
				lis.onUiEventFired(new UiEvent("activatePlayerView"));
				
			}
			
		}

		//L�scht aus der Interessentenliste
		@Override
		public void removeListener(UiEventListener listener) {
			listeners.remove(listener);
			
			
		}

}