package ui.PlayerView;

import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * H�lt Die Stats mit Ihren Bildchen und Werten
 * @author Katy
 *
 */
public class IconStatPanel extends JPanel{
	
	public IconStatPanel(){
		this.setBounds(200,50,400,160);
		this.setBorder(new LineBorder(Color.MAGENTA));
	}

	
	public void addElement(JComponent comp){
		this.add(comp);
	}

}
