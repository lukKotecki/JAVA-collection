import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odczyt{
	public static void main(String args[]){
		
		int tab[]={1,2,3,4,5};
		BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
		int index =-1;
		
		System.out.println("Ktory element tablicy chcesz odczytac");
		boolean czyPoprawnie=false;
		
		while(!czyPoprawnie){
			try{
				index =Integer.parseInt(odczyt.readLine());
			}catch(NumberFormatException n){ System.out.println("Niepoprawne dane "+"Ktory element tablicy chcesz zobaczyc?"); 
			}catch(IOException e){System.out.println("Blad odczytu danych");
			}
			czyPoprawnie = index==-1?false:true;
		}
		try{
			System.out.println(tab[index-1]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
		}
	}
}











/*import java.util.Scanner;

public class Odczyt{
	public static void main(String args[]){
		
		int tab[] = {1,2,3,4,5};
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Podaj index tablicy ktory chcesz odczytac");
		int index = odczyt.nextInt();
		
		try{
			System.out.println(tab[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
		}
		
	}
}
*/