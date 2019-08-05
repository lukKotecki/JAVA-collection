import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;

public class WindowTest{
	
	JFileChooser fileChooser;
	JFrame window;
	JLabel label;
	BufferedImage inputImage=null;
	File inputFile = null;
	Image image = null;
	
	
	WindowTest(){
		
		fileChooser = new JFileChooser();
		window = new JFrame("Window for tests");
		label = new JLabel("Empty label fot test");
		label.setBounds(20,20, 500,500);
		
		
		
		
		
		// PHOTO VIEVER 
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(600,100, 300,300);
		tabbedPane.add("photo 1",p1);
		tabbedPane.add("photo 2",p2);
		tabbedPane.add("photo 3",p3);
		window.add(tabbedPane);
		
		//PHOTO UPDATE BUTTONS
		JLabel uploadButtonLabel = new JLabel("Upload:");
		uploadButtonLabel.setBounds(600,405, 100,25);
		JButton buttonUpload_1 = new JButton("photo 1");
		JButton buttonUpload_2 = new JButton("photo 2");
		JButton buttonUpload_3 = new JButton("photo 3");
		buttonUpload_1.setBounds(600,430, 80,20);
		buttonUpload_2.setBounds(690,430, 80,20);
		buttonUpload_3.setBounds(780,430, 80,20);
		window.add(buttonUpload_1);
		window.add(buttonUpload_2);
		window.add(buttonUpload_3);
		window.add(uploadButtonLabel);
		
		buttonUpload_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == buttonUpload_1){
					
					int i=fileChooser.showOpenDialog(buttonUpload_1);    
					if(i==JFileChooser.APPROVE_OPTION){    
						inputFile=fileChooser.getSelectedFile(); 
						try{
							image = ImageIO.read(inputFile);
							
							//label.setText(inputFile.getPath());
							
							Icon icon = new ImageIcon(image);
							
							tabbedPane.setIconAt(0,icon);
							label.setIcon(icon);
							
						}catch (Exception ex) {ex.printStackTrace();  }                 
					}   
		
		
				}
			}
		});
		
		
		
		
		//PREPERING MAIN FRAME
		
		window.add(label);
		window.setSize(1000,600);
		window.setLayout(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	
	public static void main(String [] args){
		
		new WindowTest();
	
	}
}