import javax.swing.*;

public class WINDOW {
	
	private JFrame mainfenster;
	private String aktuelleWL = "Aktuelle Weekend League";
	
	public WINDOW() {
		
		
		
		mainfenster = new JFrame("FIFA Ultimate Tool (Alpha)");
		mainfenster.setVisible(true);
		mainfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainfenster.setBounds(100,100,600,800);
		
		JLabel aktuelleWLlabel = new JLabel(aktuelleWL);
		aktuelleWLlabel.setLocation(100,100); //issue
		mainfenster.add(aktuelleWLlabel);
		
	}
	
}