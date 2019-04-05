
import java.io.*;


public class MainClass{
	
	MainClass(){
		System.out.println("FileReader class test START");  
	}
	
  public static void main(String[] args) throws IOException {
	
	MainClass START = new MainClass();
	
	FileInputStream in = null;
	FileOutputStream out = null;
	
	try{
		in = new FileInputStream("input.txt");
		out = new FileOutputStream("output.txt");
		
		int c;
			while((c=in.read()) != -1){
				out.write(c);
			}
	}catch(IOException e){
		System.out.println("Zlapalem IOException");
		System.out.println("BLAD: "+e.getMessage());
		System.out.println("BLAD: "+e.getStackTrace());
		e.printStackTrace();
	}
	finally {
		System.out.println("Sekcja finally");
		if(in != null)
			in.close();
		if(out != null)
			out.close();
		
	}
	
}
}