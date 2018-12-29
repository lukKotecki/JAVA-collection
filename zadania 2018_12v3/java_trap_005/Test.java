public class Test {

	static void metoda1(Zmienna z) {
		z.x = -1;
		z = null;
	}

	static void metoda2(final Zmienna z) {
		z.x = -2;
	}

	public static void main(String[] args) {
		Zmienna a = new Zmienna(1);
		final Zmienna b = new Zmienna(2);

		//instrukcja 1
		metoda1(a);
		System.out.print(a.x + " ");
		//instrukcja 2
		metoda1(b);
		System.out.print(b.x + " ");

		Zmienna c = new Zmienna(1);
		final Zmienna d = new Zmienna(2);

		//instrukcja 3
		metoda2(c);
		System.out.print(c.x + " ");
		//instrukcja 4
		metoda2(d);
		System.out.print(d.x + " ");
	}
}