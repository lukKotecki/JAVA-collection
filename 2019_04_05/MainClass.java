
class Book {
	String title = "unknown";
	int price = 0;
	
	public static int count = 0;
	
	Book(){
		count++;
	}
	
	Book(String t,int p){
		title = t;
		price = p;
		count++;
	}
	
	void printBook(){
		System.out.println("Book: "+title+" price: "+price);
		System.out.println("Books in store: "+count);
	}
	
	
}




public class MainClass{
	

  public static void main(String[] args){
    System.out.println("MainClass 2019_04_05");
	
	Book laGranja = new Book("LaGranja",30);
	Book unknown = new Book();
	
	System.out.println("Books: "+Book.count);
	
	laGranja.printBook();
	unknown.printBook();
	
	
	
	
  }
}