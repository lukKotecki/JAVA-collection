
public class Firma{
	public static void main(String args[]){
		System.out.println("Witaj w Firma");
		
		Pracownik prac = new Pracownik("Wlodek", "Zieba", 3000);
        System.out.println("Imie: "+prac.imie);
        System.out.println("Nazwisko: "+prac.nazwisko);
        System.out.println("Wyplata: "+prac.wyplata+"\n");

        //najpierw stwórzmy obiekt klasy Szef korzystając z domyślnego konstruktora
        Szef szef = new Szef();

        //zobaczmy jak wyglądają odpowiednie pola
        System.out.println("Imie: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wyplata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia+"\n");

        //teraz ustawiamy dane szefa
        szef.imie = "Tadeusz";
        szef.nazwisko = "Kowalski";
        szef.wyplata = 10000;
        szef.premia = 2000;
        System.out.println("Imie: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wyplata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia);
		
	}
}


class Pracownik{
	String imie;
	String nazwisko;
	int wyplata;
	
	public Pracownik(){
		imie="";
		nazwisko="";
		wyplata=0;
	}
	public Pracownik(String i,String n,int w){
		imie=i;
		nazwisko=n;
		wyplata=w;
	}
}

class Szef extends Pracownik {
	int premia;
	
	public Szef(){
		super("Szef","Szefunio",999);
		premia =10;
	}
	
}