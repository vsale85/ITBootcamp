package domaci25122020;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		int unosBroja;
		boolean prost = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj za proveru: ");
		unosBroja = sc.nextInt();
		if (unosBroja == 0 || unosBroja == 1) {
			System.out.println("Broj NIJE prost");
		} else {

			for (int i = 2; i <= unosBroja / 2; i++) {

				if (unosBroja % i == 0) {
					prost = false;
					break;
				}
			}
			if (prost) {
				System.out.println("Broj je prost");
			} else {
				System.out.println("Broj NIJE prost");
			}
		}
		System.out.println("     --\n    ----\n   ------\n  --------\n  The end");
	}

}
