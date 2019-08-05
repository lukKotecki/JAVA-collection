
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;

public class GrayScale{
	
	public static int WIDTH = 1024;
	public static int HEIGHT = 640;
	
	public static void main(String[] args){
		System.out.println("Hello in GrayScale Maker");
		BufferedImage inputImage = null;
		BufferedImage outputImage = null;
		File inputFile = null;
		File outputFile = null;
		
		try{
			
			inputFile = new File("image.jpg");
			inputImage = ImageIO.read(inputFile);
			WIDTH = inputImage.getWidth();
			HEIGHT = inputImage.getHeight();
			outputImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
			
			
			for(int y=0; y<HEIGHT; y++){
				for(int x=0; x<WIDTH; x++){
					
					Color c = new Color(inputImage.getRGB(x,y));
					int red = (int)(c.getRed()*0.299);
					int green = (int)(c.getGreen()*0.587);
					int blue = (int)(c.getBlue()*0.114);
					
					int suma = red+green+blue;
					int roznica = 255 - suma;
					//Color grayColor = new Color(suma,roznica,roznica);//red
					//Color grayColor = new Color(roznica,suma,roznica);//green
					//Color grayColor = new Color(roznica,roznica,suma);//blue
					if(suma>127)
						suma*=1.2;
					else
						suma*=0.8;
					if(suma>255)
						suma = 255;
					
					Color grayColor = new Color(suma,suma,suma);
					
					if(x<10){
						System.out.print("x = "+x+" y = "+y+"   ");
						System.out.print(" red = "+red);
						System.out.print(" green = "+green);
						System.out.print(" blue = "+blue+"    ");
						System.out.print(" suma = "+suma+"    ");
						
						System.out.println(" getRGB = "+grayColor.getRGB());
					}
					
					outputImage.setRGB(x,y,grayColor.getRGB());
				}
			}			
			System.out.println("Trying to write output file");
			outputFile = new File("output.png");
			ImageIO.write(outputImage,"png", outputFile);
			
		}catch(Exception e){
			System.out.println("An Error occured!");
			e.printStackTrace();
		}
		
		
		
		
		
	}
}