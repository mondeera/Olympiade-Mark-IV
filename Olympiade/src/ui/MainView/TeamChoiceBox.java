package ui.mainView;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;

public class TeamChoiceBox extends JComboBox<String> {
	
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();

	
	public TeamChoiceBox(String[] teamArray){
		super(teamArray);
		this.setSelectedIndex(0);
		this.setBackground(Color.WHITE);
		this.setBounds(1400,100,250,30);
		
		this.setVisible(true);
	}
	
	
	public String getTeamname(){
		return (String) this.getSelectedItem();
	}
	

}
