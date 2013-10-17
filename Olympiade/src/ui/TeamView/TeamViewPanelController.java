package ui.TeamView;

import gameContent.Player;

import java.util.ArrayList;

import db.Database;

import ui.TeamView.elements.PlayerPanelController;
import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;

public class TeamViewPanelController implements  UiEventDispatcher, UiEventListener{

	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	private TeamViewPanel teamViewPanel;
	private Database db;
	private PlayerPanelController playerPanelController;
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public TeamViewPanelController(Database db){
		this.db = db;
		
		teamViewPanel = new TeamViewPanel();
		initPlayerPanelController();
		teamViewPanel.addPlayerPanel(playerPanelController.getPanel());
		
	}
	
	public void fillFromDB(String teamname) {
		playerPanelController.getPanel().removeAll();
		players = db.getPlayers(teamname);
		playerPanelController.addPlayers(players);
	}

	public TeamViewPanel getView(){
		return teamViewPanel;
		
	}
	
	private void initPlayerPanelController() {
		playerPanelController = new PlayerPanelController();
		playerPanelController.addListener(this);
		
	}
	
	@Override
	public void addListener(UiEventListener listener) {
		listeners.add(listener);
		
	}

	@Override
	public void removeListener(UiEventListener listener) {
		listeners.remove(listener);
		
	}

	@Override
	public void dispatch(UiEvent event) {
		for(UiEventListener lis: listeners){
			System.out.println("dispatch");
			lis.onUiEventFired(event);
			
		}
		
	}

	@Override
	public void onUiEventFired(UiEvent event) {
		dispatch(event);
		
	}

	public void setTeamName(String teamname) {
		fillFromDB(teamname);
	}

}
