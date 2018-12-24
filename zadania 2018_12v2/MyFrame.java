import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		super("Hello World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//setResizable(false);
		setSize(321,222);
		setLocation(444,222);
	}
}