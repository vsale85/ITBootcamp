package domaci21122020;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int niz[] = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int mesec;
		int dan;
		int brDana = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite redni broj meseca: ");
		mesec = sc.nextInt();
		System.out.println("Unesite dan u mesecu: ");
		dan = sc.nextInt();
		if (dan > 0 && dan < 32 && mesec > 0 && mesec < 13) {
			for (int i = 0; i < mesec; i++) {
				brDana += niz[i];
			}
			System.out.println("To je " + (brDana  + dan) + ". dan u godini");
		}else {
			System.out.println("Mesec ili dan u mesecu, nije validan");
		}
		
		System.out.println("Kraj programa");
	}
}
