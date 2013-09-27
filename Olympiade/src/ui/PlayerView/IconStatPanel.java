package ui.PlayerView;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * H�lt Die Stats mit Ihren Bildchen und Werten
 * @author Katy
 *
 */
public class IconStatPanel extends JPanel{
	
	public IconStatPanel(){
		initStats();
		this.setBounds(200,50,320,160);
		this.setBorder(new LineBorder(Color.MAGENTA));
	}

	private void initStats() {
		for(int i = 0; i < 12; i++){
			this.add(new IconStatElement());
		}
		
	}

}
