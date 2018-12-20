import java.util.Scanner;




public class OdwracanieArgumentow{
	public static void main(String []args){
		
		System.out.println("Zadanie9");
		
		
		int liczba = args.length;
		
		for(int i=0;i<liczba;i++){
			String linia = new String(args[i]);
			String rev = new StringBuffer(linia).reverse().toString();
			
			System.out.println("Argument podany: "+linia);
			System.out.println("Argument odwrocony: "+rev);
			
		}
	
		System.out.println();
	
		String napis = "To jest napis";
		
		String reverse = new StringBuffer(napis).reverse().toString();
	
		System.out.println("String przed odwroceniem: "+napis);
		System.out.println("String po odwroceniu: "+reverse);
	
	}	
}




