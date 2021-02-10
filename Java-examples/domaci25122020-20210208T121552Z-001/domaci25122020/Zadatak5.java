package domaci25122020;

public class Zadatak5 {

	public static void main(String[] args) {

		int poslednjaCifra;
		int novaCifra = 0;
		int privremena;
		int broj = 1234;

		privremena = broj;
		while (broj > 0) {
			poslednjaCifra = broj % 10;
			novaCifra = (novaCifra * 10) + poslednjaCifra;

			broj = broj / 10;

		}
		if (privremena == novaCifra) {
			System.out.println("Broj jeste palindrom");
		}else {
			System.out.println("Broj nije palindrom");
		}

		System.out.println("     --\n    ----\n   ------\n  --------\n  The end");
	}

}