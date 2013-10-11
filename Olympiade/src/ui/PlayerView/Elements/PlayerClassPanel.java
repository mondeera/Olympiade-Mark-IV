package ui.PlayerView.elements;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * H�lt Informationen �ber die Klasse und die Ausrichtung des Spielers
 * @author Katy
 *
 */
public class PlayerClassPanel extends JPanel{
	
	private JLabel alignmentLabel;
	private JLabel classLabel;
	private JLabel alignmentVarLabel;
	private JLabel classVarLabel;
	
	public PlayerClassPanel(){
		this.setBounds(330,650,150,70);
		this.setBorder(new LineBorder(Color.MAGENTA));
		
		initLabels();
		
		this.add(alignmentLabel);
		this.add(alignmentVarLabel);
		this.add(classLabel);
		this.add(classVarLabel);
	}

	private void initLabels() {
		alignmentLabel = new JLabel("Alignment");
		classLabel = new JLabel("Class");
		alignmentLabel.setPreferredSize(new Dimension(80,20));
		classLabel.setPreferredSize(new Dimension(80,20));
		
		//TODO aus Db
		alignmentVarLabel = new JLabel("dummy");
		classVarLabel = new JLabel("dummy");
		
	}

}