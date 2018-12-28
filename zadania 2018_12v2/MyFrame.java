import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class MyFrame extends JFrame {

	public MyFrame() {
		super("Hello World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//setResizable(false);
		setSize(321,222);
		setLocation(444,222);
		// setLayout(new FlowLayout());
		setLayout(new GridLayout(3,6));
		
		add(new JButton("Przycisk 1"));
		add(new JButton("Przycisk 2"));
		add(new JButton("Przycisk 3"));
		
		for(int i =1;i<=10;i++){
			add(new JButton(""+i));
		}
		
	}
}