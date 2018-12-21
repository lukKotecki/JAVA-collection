public class Lekarz extends Pracownik{
	private double premia;

	
	public Lekarz(String imie, String nazwisko, double wyplata,double _premia) {
		super(imie, nazwisko, wyplata);
		premia = _premia;
	}
public Lekarz(String imie, String nazwisko, double wyplata) {
		super(imie, nazwisko, wyplata);
		premia = 132;
	}
	public double getPremia(){ return premia; }
	public void setPremia(double d){
		premia = d;
	}
}