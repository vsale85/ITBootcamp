package domaci17122020;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int brGod = 0;
		double brObuce = 0;
		double suma;
		double proizvod;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj vasih godina: ");
		brGod = sc.nextInt();
		System.out.println("Unesite broj obuce: ");
		brObuce = sc.nextDouble();	
		
		
		if (brGod >= 0 && brObuce >= 0) {
			
			if (brGod % 2 == 0 && brObuce % 2 == 0) {
				suma = brGod + brObuce;
				System.out.println("Suma broja godina i broja obuce je: " + suma);
			}else {
				proizvod = brGod * brObuce;
				System.out.println("Proizvod broja godina i broja obuce je: " + proizvod);
			}
		}else {
			System.out.println(" Broj godina ili obuce ne moze biti negativan!");
		}
		
		System.out.println("Kraj programa");
		

	}

}
