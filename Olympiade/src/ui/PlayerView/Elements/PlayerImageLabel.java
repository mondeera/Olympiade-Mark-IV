package ui.PlayerView.elements;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;



//TODO Alle Daten aus DB
/**
 * Stellt die Playerdetailansicht dar
 * @author Katy
 *
 */
public class PlayerImageLabel extends JLabel{

	public PlayerImageLabel(ImageIcon imageIcon){
		imageIcon.setImage(imageIcon.getImage().getScaledInstance(295, 295, Image.SCALE_DEFAULT));
		this.setIcon(imageIcon);
		this.setBounds(0,0,295,295);
		
	}
}
