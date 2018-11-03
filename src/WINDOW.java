import javax.swing.*;

public class WINDOW {
	
	private JFrame mainfenster;
	private JLabel aktwllabel;
	
	
	public WINDOW() {
		
		
		
		mainfenster = new JFrame("alpha");
		mainfenster.setVisible(true);
		mainfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainfenster.setBounds(100,100,600,800);
		
		aktwllabel = new JLabel("Aktuell");
		aktwllabel.setLocation(50,50); //issue
		mainfenster.add(aktwllabel);
		
		
		
	}
	
}