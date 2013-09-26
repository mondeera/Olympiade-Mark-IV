package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class MainPanelController implements UiEventListener{
	
	private MainPanel view;
	private NavigationPanel navi;
	private PlayerPanel playerPanel;
	private TeamChoiceBox teamChoice;//Teamauswahlbox
	private TeamNameLabel teamNameLabel;
	private TickerPanel tickerPanel;//Enth�lt News und Transferticker
	private TeamAttributePanel teamAttributePanel;
	
	public MainPanelController(){
		view = new MainPanel();
		navi = new NavigationPanel();
		playerPanel = new PlayerPanel();
		teamChoice = new TeamChoiceBox();
		teamNameLabel = new TeamNameLabel();
		tickerPanel = new TickerPanel();
		teamAttributePanel = new TeamAttributePanel();
		
		teamChoice.addListener(this);
		
		addMainView();

		playerPanel.addListener(this);
	}
	
	
	private void addPlayerView() {
		
	}

	private void addMainView() {
		view.addElement(navi);
		view.addElement(teamChoice);
		view.addElement(teamNameLabel);
		view.addElement(tickerPanel);
	}
	
	private void addTeamView() {
		view.addElement(playerPanel); //HIer dann ne Methode welcher in ner Schleife alle n�tigen Player addet
		view.addElement(teamAttributePanel);
		teamNameLabel.setText(teamChoice.getTeamname());
		
		view.removeElement(tickerPanel);
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

	private void showPlayerView() {
		navi.hide();
		
	}
	

}