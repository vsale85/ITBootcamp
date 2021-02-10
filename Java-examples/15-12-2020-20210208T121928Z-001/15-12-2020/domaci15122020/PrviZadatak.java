package domaci15122020;

import java.util.Scanner;

public class PrviZadatak {
	public static void main(String[] args) {
		
		int broj;
		int suma = 0;
		int proizvod = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		
		broj = sc.nextInt();
		
		for (int i = 0; i <= broj; i+=2) {
			suma +=i;
			proizvod *=(i+1); 
		}
		System.out.println("Suma parnih brojeva od 0 do " + broj + " je: "+ suma);
		System.out.println("Proizvod neparnih brojeva od 0 do " + broj + " je: "+ proizvod);
		System.out.println("Kraj programa");
		
	}
}
