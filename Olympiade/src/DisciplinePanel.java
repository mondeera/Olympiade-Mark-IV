import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * H�lt die Disziplin Informationen eines Teams
 * @author Katy
 *
 */
public class DisciplinePanel extends JPanel{
	
	private String [] attributesNames = {"Tennis:","Mini DM", "Battlefield","Time Trial:", "Bastketball:", "Spurt:", "TDM:", "Showcase:", "Football:", "Staffel:"};
	private JLabel [] attributes;
	private JLabel [] attributesVars;
	
	
	public DisciplinePanel(){
		this.setBackground(Color.GRAY);
		this.setPreferredSize(new Dimension(150,250));
		initDisciplinePanel();
	}

	private void initDisciplinePanel() {
		
		attributes = new JLabel [10];
		attributesVars = new JLabel [10];
		
		for(int i = 0; i < attributes.length; i++){
			attributes[i] = new JLabel(attributesNames[i]);
			attributesVars[i] = new JLabel("dummy"); //TODO aus DB
			attributes[i].setPreferredSize(new Dimension(80,20));
			this.add(attributes[i]);
			this.add(attributesVars[i]);
			
		}
		
	}

}
