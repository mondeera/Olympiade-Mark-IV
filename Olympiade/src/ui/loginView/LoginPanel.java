package ui.loginView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;


public class LoginPanel extends JPanel{
	
	private JPasswordField password;
	private JTextArea username;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JButton loginButton;
	

	//TODO eingaben überprüfen
	//TODO mit tab weiter springen
	//TODO Fehlermeldung werfen bei falschem PW oder Namen
	public LoginPanel() {
		
		this.setLayout(null);
		this.setBounds(730,400,150,130);
	
		
		initFields();
		initButton();
		
		this.add(usernameLabel);
		this.add(passwordLabel);
		this.add(username);
		this.add(password);
		this.add(loginButton);
		
		this.setVisible(true);
	}

	private void initButton() {
		loginButton = new JButton("Einloggen");
		loginButton.setBounds(0,100,150,20);
		
		
	}
	
	

	private void initFields() {
	
		usernameLabel = new JLabel("Username: ");
		passwordLabel = new JLabel("Password: ");
		password = new JPasswordField();
		username = new JTextArea();
		
		usernameLabel.setLabelFor(username);
		passwordLabel.setLabelFor(password);
		
		usernameLabel.setBounds(0,0,150,20);
		username.setBounds(0,20,150,20);
		passwordLabel.setBounds(0,50,150,20);
		password.setBounds(0,70,150,20);

	}
	
	public JButton getButton(){
		return loginButton;
	}

	public JPasswordField getPW() {
		return password;
	}

	public void setPassword(JPasswordField password) {
		this.password = password;
	}

	public JTextArea getUsername() {
		return username;
	}

	public void setUsername(JTextArea username) {
		this.username = username;
	}

}
