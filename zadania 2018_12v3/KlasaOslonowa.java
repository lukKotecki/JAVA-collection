import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KlasaOslonowa{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Podaj imie: ");
		String imie = br.readLine();

		System.out.println("Podaj wiek: ");
		int wiek = Integer.parseInt(br.readLine());
	}
}