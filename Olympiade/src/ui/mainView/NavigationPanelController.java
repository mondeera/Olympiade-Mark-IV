package ui.mainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;

public class NavigationPanelController implements UiEventDispatcher{
	
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	private NavigationPanel navPanel;
	
	public NavigationPanelController(){
		navPanel = new NavigationPanel();
		setButtonListeners();
	}
	
	public NavigationPanel getView(){
		return navPanel;
	}

	private void setButtonListeners() {
		navPanel.getOverviewButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispatch(new UiEvent("activateMainView"));
				
			}
		});
		
		navPanel.getTeamButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispatch(new UiEvent("activateTeamView"));
				
			}
		});
		
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
			lis.onUiEventFired(event);
		}
		
	}

}
