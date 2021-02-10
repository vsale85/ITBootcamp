package javaTest;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		double distanca;
		String tipVozila;
		double potrosnja = 0;
		
		System.out.println(potrosnja);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Molimo vas unesite distancu u kilometrima:");
		distanca = sc.nextDouble();
		System.out.println("Molim vas unesite tip vozila:");
		tipVozila = sc.next();

		if (tipVozila.equals("Motor") || tipVozila.equals("Automobil") || tipVozila.equals("Kombi")
				|| tipVozila.equals("Kamion")) {

			switch (tipVozila) {
			case "Motor":
				potrosnja = 5 * distanca /100;

				break;
			case "Automobil":
				potrosnja = 7 * distanca /100;
				break;
			case "Kombi":
				potrosnja = 11 * distanca /100;
				break;
			case "Kamion":
				potrosnja = 15 * distanca /100;
				break;
			default:
				break;
			}
			System.out.println(tipVozila + " na " + distanca + " km potrosi " + potrosnja + " litara goriva");
		} else {
			System.out.println("Tip vozila nije validan!");
		}

	}

}

// Napisati program koji racuna potrosnju goriva
// Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva
// biti potroseno
// Motor trosi 5 litara goriva na 100 kilometara, automobil trosi 7 litara na
// 100 kilometara,
// kombi trosi 11 litara na 100km, dok kamion trosi 15 litara na 100km

// Primeri ispisa u konzoli:

// Molim vas unesite distancu u kilometrima:
// 134
// Molim vas unesite tip vozila:
// Kombi
// Kombi na 134.0 km potrosi 14.74 litara goriva
// Primer ispisa kad se unese pogresno vozilo

// Molim vas unesite distancu u kilometrima:
// 133
// Molim vas unesite tip vozila:
// Tenk
// Uneli ste pogresan tip vozila
