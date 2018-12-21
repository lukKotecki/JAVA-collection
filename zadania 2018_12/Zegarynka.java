import java.util.Scanner;


public class Zegarynka{
	public static void main(String [] args){
		
		System.out.println("Podaj liczbe calkowita dodatnia ");
		Scanner odczyt = new Scanner(System.in);
		int liczba = odczyt.nextInt();
		
		System.out.println("Odliczanie w petli while: ");
		int iWhile = liczba;
		while(iWhile>=0)
			System.out.println("Bomba wybuchnie za "+(iWhile--));
		
		System.out.println();
		System.out.println("Odliczanie w petli do while");
		int doWhile=liczba;
		do{
			System.out.println("Bomba wybuchnie za "+(doWhile--));
		}while(doWhile>=0);
		
		System.out.println();
		System.out.println("Odliczanie za pomoca petli for");
		for(int i = liczba;i>=0;i--)
			System.out.println("Bomba wybuchnie za "+i);
		
	
	}
}