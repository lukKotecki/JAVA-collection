import java.util.Scanner;

public class PrimeCheck{
	public static void main(String args[]){
	
	int temp;
	boolean isPrime = true;
	Scanner odczyt = new Scanner(System.in);
	
	System.out.println("Podaj liczbe do sprawdzenia");
	int liczba=odczyt.nextInt();
	odczyt.close();
	
	for(int i=2;i<=liczba/2;i++){
		temp = liczba%i;
		
		if(temp==0){
			isPrime=false;
			break;
		}
	}
	
	if(isPrime)
		System.out.println("Liczba "+liczba+" jest liczba pierwsza");
	else
		System.out.println("Liczba "+liczba+" nie jest liczba pierwsza");
	
	
	
	}
}