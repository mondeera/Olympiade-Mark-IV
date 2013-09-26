package ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class TeamNameLabel extends JLabel{

	public TeamNameLabel() {
		this.setSize(200, 50);	
		this.setBounds(400, 10, 200, 30);
		this.setBorder(new LineBorder(Color.BLACK));
		this.setFont(new Font("Arial", Font.BOLD, 24));
		this.setVisible(true);
		
		initTeamname();
	}
	
	public void initTeamname(){ // TODO Hier dann zb mit der Datenbankklasse reden
		//this.setText(arg0)
		this.setText("dummyteam");
	}

}