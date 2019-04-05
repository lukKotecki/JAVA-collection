
class Book {
	String title = "unknown";
	int price = 0;
	
	
	Book(){
	}
	
	Book(String t,int p){
		title = t;
		price = p;
	}
	
	void printBook(){
		System.out.println("Book: "+title+" price: "+price);
	}
	
	
}




public class MainClass{
	

  public static void main(String[] args){
    System.out.println("MainClass 2019_04_05");
	
	Book laGranja = new Book("LaGranja",30);
	Book unknown = new Book();
	
	
	laGranja.printBook();
	unknown.printBook();
	
  }
}