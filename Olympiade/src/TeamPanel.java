import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class TeamPanel extends JPanel{
	
	private String [] attributesNames = {"Budget:", "Income:", "Salaries:", "Transfers:", "Bonus:", "Prize Money:", "Forecast:"};
	private JLabel [] attributes;
	private JLabel [] attributesVars;
	
	public TeamPanel(){
		this.setBackground(Color.GRAY);

		this.setPreferredSize(new Dimension(150,250));
		
		initAttributePanels();
	}

	private void initAttributePanels() {
		attributes = new JLabel [7];
		attributesVars = new JLabel [7];
		
		for(int i = 0; i < attributes.length; i++){
			attributes[i] = new JLabel(attributesNames[i]);
			attributesVars[i] = new JLabel("dummy"); //TODO aus DB
			attributes[i].setPreferredSize(new Dimension(80,30));
			this.add(attributes[i]);
			this.add(attributesVars[i]);
			
		}
		
	}
	

}
