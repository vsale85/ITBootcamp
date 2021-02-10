package domaci25122020;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		String ime;
		String prezime;
		String pol;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vase ime:");
		ime = sc.next();
		System.out.println("Unesite vase prezime:");
		prezime = sc.next();
		System.out.println("Unesite vas pol (M / W)");
		pol = sc.next();
		
		if (pol.equals("M")) {
			System.out.println("Dobrodosao u IT " + ime + " " + prezime);
		}else if (pol.equals("W")) {
			System.out.println("Dobrodosla u IT " + ime + " " + prezime);
		}else {
			System.out.println("Uneti pol nije validan");
		}
		System.out.println("     --\n    ----\n   ------\n  --------\n  The end");
	}

}
