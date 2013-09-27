package ui;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import ui.EventHandling.UiEvent;
import ui.EventHandling.UiEventListener;
import ui.MainView.NavigationPanel;
import ui.MainView.TeamChoiceBox;
import ui.MainView.TeamNameLabel;
import ui.MainView.TickerPanel;
import ui.PlayerView.TeamHistoryPanel;
import ui.TeamView.PlayerPanel;
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
	
	public MainPanelController(){
		view = new MainPanel();
		navi = new NavigationPanel();
		playerPanelController = new PlayerPanelController();
		teamChoice = new TeamChoiceBox();
		teamNameLabel = new TeamNameLabel();
		tickerPanel = new TickerPanel();
		teamAttributePanel = new TeamAttributePanel();
		teamHistoryPanel = new TeamHistoryPanel();
		
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
	}
	
	private void addTeamView() {
		view.addElement(playerPanelController.getPanel());
		
		view.addElement(teamAttributePanel);
		teamNameLabel.setText(teamChoice.getTeamname());
		
		view.removeElement(tickerPanel);
	}
	
	private void addPlayerView() {
		view.add(teamHistoryPanel);
	}

	public MainPanel getView(){
		return view;
	}

	//TODO nochmal anders l�sen, nicht mit diesen Strings
	@Override
	public void onUiEventFired(UiEvent event) {
		
		if(event.getMessage() == "activateTeamView"){
			addTeamView();
			System.out.println("teamview");
		}else if(event.getMessage() == "activatePlayerView"){
			addPlayerView();
		}
	}
}
