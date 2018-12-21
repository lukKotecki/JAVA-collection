import java.util.*;


public class UzycieKlasyPunkt{
	public static void main(String []args){
	
	Scanner odczyt = new Scanner(System.in);
	
	System.out.println("Zadanie7");
	System.out.println("Tworze nowy punkt");
	
	Punkt punkt= new Punkt();
	Punkt punkt2= new Punkt(2,2);
	Punkt punkt3= new Punkt(3,4);
	
	punkt2.ustawPunkt(0,1);
	
	punkt.x = 10;
	punkt.y = 12;
	
	
	
	System.out.println("Wspolrzedne: x = "+punkt.x+" y = "+punkt.y);
	System.out.println("Wspolrzedne2: x = "+punkt2.x+" y = "+punkt2.y);
	System.out.println("Wspolrzedne3: x = "+punkt3.x+" y = "+punkt3.y);
	System.out.println("Aktualnie w uzyciu jest: "+Punkt.ile+" punktow");
	
	//FileOutputStream strumienWyjsciowy = new FileOutputStream("maruda.txt");
	
	
	
	
	}
}
