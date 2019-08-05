import javax.swing.*;

public class FirstSwingExample{
	
	JFrame f;
	FirstSwingExample(){
		f = new JFrame();
		
		JButton b = new JButton("click");
		b.setBounds(230,20,100,130);
		
		f.add(b);
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	

public static void main(String[] args){
	
	new FirstSwingExample();
	
	
}
}