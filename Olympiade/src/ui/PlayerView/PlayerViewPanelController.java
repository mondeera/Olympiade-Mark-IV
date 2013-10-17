package ui.PlayerView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

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
	private String teamname;
	
	public PlayerViewPanelController(Database db, Player player, String teamname){
		this.teamname = teamname;
		this.db = db;
		this.player = player;
		playerViewPanel = new PlayerViewPanel();
		
		player = db.getPlayerStats(player);
		
		initElements();
	}

	public JComponent getView() {
		return playerViewPanel;
	}
	
	private void initElements() {
		teamHistoryPanel = new TeamHistoryPanel();
		iconStatPanelController = new IconStatPanelController(player.getPlayerStats());
		playerStory = new PlayerStoryTextArea(player.getStory());
		playerImageLabel = new PlayerImageLabel(player.getIcon());
		nameLabel = new JLabel();
		playerteamNamePanel = new PlayerteamNamePanel(teamname);
		playerValue = new PlayerValue(player.getValues());
		playerPointPanel = new PlayerPointPanel(player.getPlayerpoints(), player.getSkillpoints());
		playerTrophiesPanel = new PlayerTrophiesPanel();
		playerRelationshipPanelFriends =  new PlayerRelationshipPanel();
		playerClassPanel = new PlayerClassPanel(player.getAlignment(), player.getHeroClass());
		injuredLabel = new JLabel("Injured");
		staminaPanel = new StaminaPanel();
		
		//nur wenn wirklich verletzt
		initInjuredLabel();
		
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

	private void initInjuredLabel() {
		injuredLabel.setForeground(Color.RED);
		injuredLabel.setBounds(30,600,80,20);
		injuredLabel.setFont(new Font("Arial", Font.BOLD, 18));
		
	}

	private void initName() {
		nameLabel.setBounds(330,0,200,30);
		nameLabel.setFont(new Font("VERDANA", Font.BOLD, 18));
		nameLabel.setText(player.getName());
		nameLabel.setHorizontalAlignment(JLabel.LEFT);
	}

}
