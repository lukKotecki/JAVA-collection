// import java.awt.*;
// import javax.swing.JPanel;

// public class MyPanel extends JPanel{
	// public MyPanel(){
		// setPreferredSize(new Dimension(400,400));
	// }
	
	// @Override
	// protected void paintComponent(Graphics g) {
		// super.paintComponent(g);
		// Graphics2D g2d = (Graphics2D) g;

		// // prostokat
		// g2d.drawRect(10, 10, 380, 380);
		// // kolo
		// g2d.drawOval(10, 10, 380, 380);
	// }
// }



import java.awt.*;
import java.awt.geom.*;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public MyPanel() {
		setPreferredSize(new Dimension(400, 400));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		// prostokat
		Rectangle2D rectangle = new Rectangle2D.Double(10, 10, 380, 380);
		// kolo
		Ellipse2D circle = new Ellipse2D.Double(10, 10, 380, 380);

		g2d.draw(rectangle);
		g2d.draw(circle);
	}
}