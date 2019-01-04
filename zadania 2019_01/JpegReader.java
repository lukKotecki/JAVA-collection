import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;


public class JpegReader{
	public static void main(String args[]){
	System.out.println("JpegReader");
	
	BufferedImage img = null;
	try{
		img = ImageIO.read(new File("strawberry.jpg"));
	}catch(IOException e){
		System.out.println("Nie udalo sie otworzyc pliku");
		System.out.println("Kod bledu?:"+e);
	}
	
	
	}
}