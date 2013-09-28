package ui;


import javax.swing.JTextArea;

import ui.EventHandling.UiEvent;
import ui.EventHandling.UiEventListener;
import ui.MainView.NavigationPanel;
import ui.MainView.TeamChoiceBox;
import ui.MainView.TeamNameLabel;
import ui.MainView.TickerPanel;
import ui.PlayerView.IconStatPanelController;
import ui.PlayerView.PlayerImageLabel;
import ui.PlayerView.PlayerStoryTextArea;
import ui.PlayerView.TeamHistoryPanel;
import ui.TeamView.PlayerPanelController;
import ui.TeamView.TeamAttributePanel;

public class MainPanelController implements UiEventListener{
	
	private MainPanel view;
	private NavigationPanel navi;
	private PlayerPanelController playerPanelController;
	private TeamChoiceBox teamChoice;//Teamauswahlbox
	private TeamNameLabel teamNameLabel;
	private TickerPanel tickerPanel;//Enth�lt News und Transferticker
	private TeamAttributePanel teamAttributePanel;
	private TeamHistoryPanel teamHistoryPanel;
	private IconStatPanelController iconStatPanelController;
	private PlayerStoryTextArea playerStory;
	private PlayerImageLabel playerImageLabel;
	
	public MainPanelController(){
		view = new MainPanel();
		navi = new NavigationPanel();
		playerPanelController = new PlayerPanelController();
		teamChoice = new TeamChoiceBox();
		teamNameLabel = new TeamNameLabel();
		tickerPanel = new TickerPanel();
		
		
		
		addMainView();

		//Der Controller h�rt auf die Teamauswahl und die Playerpanel zum switchen der View
		teamChoice.addListener(this);
		playerPanelController.addListener(this);
		
		//Hier schleife, je nachdem wieviele playe rgebraucht werden
		playerPanelController.addPlayer();
		
	}
	
	
	private void addMainView() {
		view.addElement(navi);
		view.addElement(teamChoice);
		view.addElement(teamNameLabel);
		view.addElement(tickerPanel);
		view.revalidate();
		view.repaint();
	}
	
	private void addTeamView() {
		teamAttributePanel = new TeamAttributePanel();
		teamNameLabel.setText(teamChoice.getTeamname());
		
		view.addElement(playerPanelController.getPanel());
		view.addElement(teamAttributePanel);
		view.removeElement(tickerPanel);
		view.revalidate();
		view.repaint();
	}
	
	private void addPlayerView() {
		teamHistoryPanel = new TeamHistoryPanel();
		iconStatPanelController = new IconStatPanelController();
		playerStory = new PlayerStoryTextArea();
		playerImageLabel = new PlayerImageLabel();
		
		view.removeElement(teamAttributePanel);
		view.removeElement(playerPanelController.getPanel());
		view.removeElement(teamChoice);
		view.removeElement(teamNameLabel);
		
		view.add(playerStory);
		view.add(teamHistoryPanel);
		view.add(iconStatPanelController.getView());
		view.add(playerImageLabel);
		view.revalidate();
		view.repaint();
	}

	public MainPanel getView(){
		return view;
	}

	//TODO nochmal anders l�sen, nicht mit diesen Strings
	@Override
	public void onUiEventFired(UiEvent event) {
		
		if(event.getMessage() == "activateTeamView"){
			addTeamView();
		}else if(event.getMessage() == "activatePlayerView"){
			addPlayerView();
		}
	}
}
