package ui.PlayerView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JLabel;

import ui.PlayerView.elements.IconStatPanelController;
import ui.PlayerView.elements.PlayerClassPanel;
import ui.PlayerView.elements.PlayerImageLabel;
import ui.PlayerView.elements.PlayerPointPanel;
import ui.PlayerView.elements.PlayerRelationshipPanel;
import ui.PlayerView.elements.PlayerStoryTextArea;
import ui.PlayerView.elements.PlayerTrophiesPanel;
import ui.PlayerView.elements.PlayerValue;
import ui.PlayerView.elements.PlayerteamNamePanel;
import ui.PlayerView.elements.StaminaPanel;
import ui.PlayerView.elements.TeamHistoryPanel;

import gameContent.Player;
import db.Database;


public class PlayerViewPanelController {
	
	private PlayerViewPanel playerViewPanel;
	private Database db;
	private TeamHistoryPanel teamHistoryPanel;
	private IconStatPanelController iconStatPanelController;
	private PlayerStoryTextArea playerStory;
	private PlayerImageLabel playerImageLabel;
	private JLabel nameLabel;
	private PlayerteamNamePanel playerteamNamePanel;
	private PlayerValue playerValue;
	private PlayerPointPanel playerPointPanel;
	private PlayerTrophiesPanel playerTrophiesPanel;
	private PlayerRelationshipPanel playerRelationshipPanelFriends;
	private PlayerClassPanel playerClassPanel;
	private JLabel injuredLabel;
	private StaminaPanel staminaPanel;
	private Player player;
	
	public PlayerViewPanelController(Database db, Player player){
		this.db = db;
		this.player = player;
		playerViewPanel = new PlayerViewPanel();
		
		initElements();
	}

	public JComponent getView() {
		return playerViewPanel;
	}
	
	private void initElements() {
		teamHistoryPanel = new TeamHistoryPanel();
		iconStatPanelController = new IconStatPanelController();
		playerStory = new PlayerStoryTextArea();
		playerImageLabel = new PlayerImageLabel();
		nameLabel = new JLabel();
		playerteamNamePanel = new PlayerteamNamePanel();
		playerValue = new PlayerValue();
		playerPointPanel = new PlayerPointPanel();
		playerTrophiesPanel = new PlayerTrophiesPanel();
		playerRelationshipPanelFriends =  new PlayerRelationshipPanel();
		playerClassPanel = new PlayerClassPanel();
		injuredLabel = new JLabel("Injured");
		staminaPanel = new StaminaPanel();
		
		//nur wenn wirklich verletzt
		initInjuredLabel();
		initStatPanel();
		initName();
		
		playerViewPanel.add(playerStory);
		playerViewPanel.add(teamHistoryPanel);
		playerViewPanel.add(iconStatPanelController.getView());
		playerViewPanel.add(playerImageLabel);
		playerViewPanel.add(nameLabel);
		playerViewPanel.add(playerteamNamePanel);
		playerViewPanel.add(playerValue);
		playerViewPanel.add(playerPointPanel);
		playerViewPanel.add(playerTrophiesPanel);
		playerViewPanel.add(playerRelationshipPanelFriends);
		playerViewPanel.add(playerClassPanel);
		playerViewPanel.add(injuredLabel);
		playerViewPanel.add(staminaPanel);
	}

	private void initStatPanel() {
		iconStatPanelController.setStatsFromDB(db.getPlayerStats());
		
	}

	private void initInjuredLabel() {
		injuredLabel.setForeground(Color.RED);
		injuredLabel.setBounds(30,600,80,20);
		injuredLabel.setFont(new Font("Arial", Font.BOLD, 18));
		
	}

	private void initName() {
		//nameLabel.setText(); aus Db
		nameLabel.setBounds(350,0,150,30);
		nameLabel.setBackground(Color.GREEN);
		nameLabel.setFont(new Font("Arial", Font.BOLD, 18));
		nameLabel.setText(player.getName());
	}

}
