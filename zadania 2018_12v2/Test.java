import java.awt.EventQueue;



public class Test {
	public static void main(String[] args) {
		
		
		
		System.out.println(System.getProperty("sun.arch.data.model"));
		
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MyFrame();
			}
		});
	}
}