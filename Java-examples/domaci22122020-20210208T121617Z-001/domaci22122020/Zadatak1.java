package domaci22122020;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		double broj1;
		double broj2;
		String unos = "izadji";

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Unesite naziv figure za izracunavanje(kvadrat, pravougaonik ili krug)\nizadji - za izlaz iz programa");
		unos = sc.next();

		while (!unos.equals("izadji")) {

			switch (unos) {
			case "krug":
				System.out.println("Unesite poluprecnik kruga: ");
				broj1 = sc.nextDouble();
				System.out.println("Povrsina kruga je: " + kalkulator(broj1, 0, unos));
				break;
			case "kvadrat":
				System.out.println("Unesite duzinu stranice kvadrata: ");
				broj1 = sc.nextDouble();
				System.out.println("Povrsina kvadrata je: " + kalkulator(broj1, 0, unos));
				break;
			case "pravougaonik":
				System.out.println("Unesite duzinu stranice \"a\" : ");
				broj1 = sc.nextDouble();
				System.out.println("Unesite duzinu stranice \"b\" : ");
				broj2 = sc.nextDouble();
				System.out.println("Povrsina pravougaonika je: " + kalkulator(broj1, broj2, unos));
				break;

			default:
				System.out.println("Nepostojeca figura");
				break;
			} 

			System.out.println(
					"Unesite naziv figure za izracunavanje povrsine(kvadrat, pravougaonik ili krug)\nizadji - za izlaz iz programa");
			unos = sc.next();
		}
		System.out.println("Kraj programa");

	}

	public static double kalkulator(double broj1, double broj2, String figura) {

		switch (figura) {
		case "kvadrat":

			return broj1 * broj1;

		case "pravougaonik":
			return broj1 * broj2;

		case "krug":

			return broj1 * broj1 * 3.14;

		default:
			return -0.0;
		}

	}

}

// Napraviti kalkulator povrsina kvadrata, pravougaonika i kruga.
// Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
// Ukoliko se unese 'izadji', program treba da se zavrsi.
// Program treba da se ponavlja dokle god se ne unese izadji.
