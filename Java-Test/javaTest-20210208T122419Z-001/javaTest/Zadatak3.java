package javaTest;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int unosBroja;
		int suma = 0;
		int privremeniUnos = 1;
		int brojac = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while (privremeniUnos != 0) {
			System.out.println("Molimo unesite " + brojac + ". broj");
			unosBroja = sc.nextInt();
			suma += unosBroja; 
			if (unosBroja !=0) {
				System.out.println("Trenutni zbir je: " + suma);
			}
			
			privremeniUnos = unosBroja;
			brojac++;
		}
		
		System.out.println("Uneli ste 0 Kraj programa");

	}

}

//Napisite program koji, koristeci petlju, racuna zbir unetih brojeva, sve dok korisnik ne unese 0
//Primer ispisa resenja:
//Molim vas unesite 1. broj
//4
//Trenutni zbir je 4
//Molim vas unesite 2. broj
//5
//Trenutni zbir je 9
//Molim vas unesite 3. broj
//0
//Uneli ste 0 Kraj programa
