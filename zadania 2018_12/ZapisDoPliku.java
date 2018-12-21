import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class ZapisDoPliku{
	public static void main(String []args) throws FileNotFoundException{
		
		System.out.println("Podaj swoje imie ");
		Scanner klawiatura = new Scanner(System.in);
		String imie = new String(klawiatura.nextLine());
		
		System.out.println("Twoje imie to "+imie);
		
		PrintWriter imiePlik = new PrintWriter("imie.txt");
		imiePlik.println(imie);
		imiePlik.close();
		
		//String imieNapis = 
		System.out.println("Imie z pliku to: "+new Scanner(new File("imie.txt")).nextLine());
		
		
		// File plik = new File("plik.txt");
		// Scanner odczyt = new Scanner(plik);
		
		// String linia = odczyt.nextLine();
		
		// System.out.println(linia);
	
		// PrintWriter zapis = new PrintWriter("plik.txt");
		
		// zapis.println("Ala ma kota a kot ma Ale");
		// zapis.close();
		
		// linia = odczyt.nextLine();
		// System.out.println(linia);

	}
}