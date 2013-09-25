import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;


public class TickerPanel extends JPanel{
	
	private JTextArea newsticker;
	private JTextArea transferticker;
	
	public TickerPanel(){
		
		initTransferticker();
		initNewsticker();
		
		this.add(newsticker);
		this.add(transferticker);
		
	}
	
	private void initTransferticker() {
		transferticker = new JTextArea("Transferticker (Anzeige der letzten Transfer)");
		transferticker.setPreferredSize(new Dimension(250, 100));
		
		
	}
	
	private void initNewsticker() {
		newsticker = new JTextArea("Newsticker (Anzeige der letzten News)");
		newsticker.setPreferredSize(new Dimension(250, 100));
		
	}


}
