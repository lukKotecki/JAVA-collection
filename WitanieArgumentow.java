import java.util.Scanner;

public class WitanieArgumentow{
	public static void main(String []args){
		
		String imie = new String();
		String imiona[]=new String [5];
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Podaj 5 imion");
		
		for(int i=0;i<5;i++){
			imie = odczyt.nextLine();
			imiona[i]=imie;
		}
		System.out.println();
		System.out.println("Powitanie obecnych:");
		for(int i =0;i<5;i++)
			System.out.println("Witaj "+imiona[i]);
		
		
	}
}