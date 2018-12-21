import java.util.Scanner;

public class Fibonacci{
	public static void main(String args[]){
	
	System.out.println("Fibonacci");
	Scanner odczyt = new Scanner(System.in);
	
	System.out.println("Podaj ile liczb ma zawierac ciag");
	int liczba = odczyt.nextInt();
	
	FibonacciSeries(liczba);
	
	}	
	
	public static void FibonacciSeries(int n){
		int a=0;
		int b=1;
		int c=1;
		for (int i=0;i<n;i++){
			System.out.print(a+", ");
			a=b;
			b=c;
			c=a+b;
		}
		
	}
	
	
}