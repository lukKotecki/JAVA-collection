interface Price{
	//int price;
		abstract void printPrice();
}





class Book{
	String title;
	int price;
	
	Book(String t,int p){
		title =t;
		price =p;
	}
	
	void printPrice(){
		System.out.println("Book: "+title);
		System.out.println("Price: "+price);
		System.out.println();
	}
}

class SellBook extends Book{
	int discount;
	
	SellBook(String t,int p,int d){
		super(t,p);
		discount=d;
	}
	
	void printPrice(){
		System.out.println("Book: "+title);
		System.out.println("Price: "+(price-discount));
		System.out.println();
	}
}



public class MainClass{
	
	MainClass(){
		System.out.println("Methods implementation an extending TEST");  
	}
	
  public static void main(String[] args) {
	
	Book laGranja = new Book("La Granja",46);
	laGranja.printPrice();
	SellBook sLaGranja = new SellBook("Broken La Granha",46,7);
	sLaGranja.printPrice();
}
}