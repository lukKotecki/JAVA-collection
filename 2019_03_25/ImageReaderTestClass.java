

// import java.io.ByteArrayOutputStream;
// import java.awt.image.BufferedImage;
// import java.io.File;
// import javax.imageio.ImageIO;
// public class ImageReaderTestClass {
   // public static void main(String args[]) throws Exception{
	   
      // BufferedImage bImage = ImageIO.read(new File("sample.jpg")); 		//Read the image using the read() method of the ImageIO class.
      // ByteArrayOutputStream bos = new ByteArrayOutputStream();			//    Create a ByteArrayOutputStream object.
      // ImageIO.write(bImage, "jpg", bos );								//Write the image to the ByteArrayOutputStream object created above using the write() method of the ImageIO class.
      // byte [] data = bos.toByteArray();									//Finally convert the contents of the ByteArrayOutputStream to a byte array using the toByteArray() method.

		
   // }
// }







import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageReaderTestClass {
  public static void main(String[] args) throws Exception {
    BufferedImage bsrc = ImageIO.read(new File("sample.jpg"));
    BufferedImage bdest = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
    Graphics2D g = bdest.createGraphics();
    AffineTransform at = AffineTransform.getScaleInstance(2, 2);
    g.drawRenderedImage(bsrc, at);
    ImageIO.write(bdest, "JPG", new File("b.jpg"));
  }
}











// import java.awt.Graphics;

// import javax.swing.JComponent;
// import javax.swing.JFrame;

// class MyCanvas extends JComponent {

  // public void paint(Graphics g) {
    // g.drawString (Long.toString(System.currentTimeMillis()), 10, 30); 
    // repaint(1000);
  // }
// }

// public class ImageReaderTestClass {
  // public static void main(String[] a) {
    // JFrame window = new JFrame();
    // window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // window.setBounds(30, 30, 300, 300);
    // window.getContentPane().add(new MyCanvas());
    // window.setVisible(true);
  // }
// }