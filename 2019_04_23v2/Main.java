
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.Scanner;
import java.util.Vector;

public class Main{
	
	public static int WIDTH = 1024;
	public static int HEIGHT = 640;
	public static int NUMBER_OF_PHOTOS = 4;
	public static int pixelSizeX = 15;
	public static int pixelSizeY = 5;
	
	static BufferedImage outputImage = null;
	static File outputFile = null;
	
	static Vector<BufferedImage> image = new Vector<BufferedImage>(NUMBER_OF_PHOTOS);
	static Vector<File> file = new Vector<File>(NUMBER_OF_PHOTOS);
	
	
	static int positionX = 0;
	static int positionY = 0;
	
	static Scanner keyboard = new Scanner(System.in);
	
	static void prepareFiles(){
		boolean shouldReadAgain = true;
		
		do{
			try{
				outputImage = new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_ARGB);
				
				for(int i = 0; i<NUMBER_OF_PHOTOS;i++){
					file.add(i,new File("photo_"+(i+1)+".png"));
					image.add(i,ImageIO.read(file.get(i)));
				}
				
				shouldReadAgain = false;
			}catch(IOException e){
				System.out.println("Error! Unable to upload files. Required names: \"photo_1.png\", \"photo_2.png\" and \"photo_3.png\" ....");
				//e.printStackTrace();
				System.out.println("Try again? y/n . . . ");
				char scannedChar = keyboard.next().charAt(0);
				switch(scannedChar){
					case 'y':
					shouldReadAgain = true;
					break;
					case 'n':
					shouldReadAgain = false;
					System.out.println("EXITING PROGRAM");
					break;
					default:
					shouldReadAgain = true;
					System.out.println("Unknown choice");
					break;
				}
			}
		}while(shouldReadAgain);
	}
	
	static void writeImageToFile(BufferedImage imageToWrite){
		try{
			outputFile = new File("output.png");
			ImageIO.write(imageToWrite,"png",outputFile);
		}catch(IOException e){
			System.out.println("ERROR IOException");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("ERROR (...)");
			
		}
		finally{
			System.out.println("FINALLY trying to close outputFile");
			//outputFile.close();
		}
	}
	
	static int pixelARGBtoInt(int alpha, int red, int green, int blue){
		int p = 0;
		p = (alpha<<24) | (red<<16) | (green<<8) | blue;
		return p;
	}
	
	static void pixelRainbowPainter(BufferedImage img){
		
		int a=255;
		int r=0;
		int g=0;
		int b=255;
		
		int p=0; //pixelColorToSet
		
		int xPositionOrder =0;
		int yPositionOrder =0;
		int imageToReadOrder =0;
		
		//nt endOfRow = 0;
		
		for(int y=0; y<HEIGHT; y++){
			for(int x=0; x<WIDTH;x++){
				
				p = pixelARGBtoInt(a,r,g,b); //this is just for tests - coloring output.png
				
				imageToReadOrder = (xPositionOrder+yPositionOrder)%NUMBER_OF_PHOTOS;
				
				//p = image.get(imageToReadOrder).getRGB(x,y);
				
				img.setRGB(x,y,p);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				if(x%pixelSizeX ==0)
					xPositionOrder++;
			}
			if(y%pixelSizeY ==0)
				yPositionOrder++;
			xPositionOrder = 0; //yPositionOrder not work correctly without this
		}
	}
	
	
	
	
	public static void main(String [] args){
		System.out.println("Witaj w Main 2019_04_23v2");
		
		prepareFiles();
		pixelRainbowPainter(outputImage);
		writeImageToFile(outputImage);
		
	}
}