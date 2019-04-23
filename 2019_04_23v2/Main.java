
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.Scanner;

public class Main{
	
	public static final int WIDTH = 100;
	public static final int HEIGHT = 100;
	
	static BufferedImage image_0 = null;
	static BufferedImage image_1 = null;
	static BufferedImage image_2 = null;
	static BufferedImage image_3 = null;
	static File file_0 = null;
	static File file_1 = null;
	static File file_2 = null;
	static File file_3 = null;
	
	static boolean readFiles(){
		boolean isReadet = false;
		try{
			file_1 = new File("photo_1.png");
			image_1 = ImageIO.read(file_1);
			file_2 = new File("photo_2.png");
			image_2 = ImageIO.read(file_2);
			file_3 = new File("photo_3.png");
			image_3 = ImageIO.read(file_3);
			isReadet = true;
		}catch(IOException e){
			System.out.println("Error! Unable to upload files. Required names: \"photo_1.png\", \"photo_2.png\" and \"photo_3.png\".");
			//e.printStackTrace();
			isReadet = false;
		}
		return isReadet;
	}
	
	
	public static void main(String [] args){
		System.out.println("Witaj w Main 2019_04_23v2");
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean shouldReadAgain = true;
		do{	
			if(readFiles()){
				System.out.println("Files readet succesfull");
				shouldReadAgain = false;
			}else{
				System.out.println("Failure to read the file, try again? y/n . . . ");
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
		} while (shouldReadAgain);
		
		
	
	}
}