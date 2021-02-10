package domaci25122020;

import java.util.Arrays;

public class Zadatak2 {

	public static void main(String[] args) {

		String prostiBrojevi = "";
		boolean prost = false;

		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					prost = true;
					break;
				} else {
					prost = false;
				}

			}
			if (prost == false) {
				prostiBrojevi = prostiBrojevi + i + " ";
			}

		}
		System.out.println("Prosti brojevi od 0 do 100 su: ");
		System.out.println(prostiBrojevi);

	}

}
