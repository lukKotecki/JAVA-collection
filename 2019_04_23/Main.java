
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;




public class Main{
	
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 720;
	

	public static void main(String[] args){
	
	System.out.println("Witaj w Main - random pixel maker :)");
	
	BufferedImage img = new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_ARGB);
	
	File file = null; //file object
	
	for(int y = 0; y < HEIGHT; y++){
		for(int x = 0; x < WIDTH; x++){
			int a = (int)(Math.random()*256);
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);

			int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel
			
			img.setRGB(x,y,p);
		}
	}
	//write image
	try{
		file = new File("output.png");
		ImageIO.write(img,"png",file);
	}catch(IOException e){
		System.out.println("ERROR "+e);
	}
	
		
	}
}