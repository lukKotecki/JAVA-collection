
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class KlasaGlowna{

	
	KlasaGlowna(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("Moj klawisz");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				//JOptionPane.showMessageDialog(null, "Action occured");
				
				System.out.println("Witaj swiecie");
				
			}
			
		});
		
		
		
		panel.add(button);
		frame.add(panel);
		
	}





	
	public static void main(String [] args){
		
		System.out.println("KlasaGlowna");
		
		KlasaGlowna k = new KlasaGlowna();
	
	}
	
}