package ui.PlayerView;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Packt Skillicon, skillwert, und skillupm�glichkeit zusammen
 * @author Katy
 *
 */
public class IconStatElement extends JPanel{
	
	private JLabel iconLabel;
	private JLabel statLabel;
	private JLabel skillPointLabel;
	
	public IconStatElement(){
		initIconStatElement();
	}

	private void initIconStatElement() {
		iconLabel = new JLabel();
		statLabel = new JLabel();
		skillPointLabel = new JLabel();
		
		//�ber Controller aufrufen, mit db infos f�ttern
		setIconLabel(null);
		setstatLabels(42);
		skillPointsLabel(null,true);
		//
		
		this.add(iconLabel);
		this.add(statLabel);
		this.add(skillPointLabel);
		this.setPreferredSize(new Dimension(150,20));
		this.setBorder(new LineBorder(Color.ORANGE));
		
	}
	
	//Wei� nich ob der Typ ImageIcon f�r uns funktioniert, dann mal testen
	private void setIconLabel(ImageIcon icon){
		iconLabel.setText("icon");
		iconLabel.setPreferredSize(new Dimension(40,15));
	}
	
	private void setstatLabels(int value){
		statLabel.setText(Integer.toString(value));
		statLabel.setPreferredSize(new Dimension(40,15));
	}

	private void skillPointsLabel(ImageIcon icon, boolean bool){
		skillPointLabel.setText("lvl up");
		skillPointLabel.setVisible(bool);
		skillPointLabel.setPreferredSize(new Dimension(40,15));
	}

}
