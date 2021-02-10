package domaci15122020;

import java.util.Scanner;

public class DrugiZadatak {

	public static void main(String[] args) {
		
		int broj = 0;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki broj: ");
		
		
		
		while (broj >= 0) {
			
			broj = sc.nextInt();
			
			if (broj < 0) {
				System.out.println("Ukupna suma je: " + suma);
			}else {
				suma = suma + broj;
				System.out.println("Trenutna suma je: " + suma);
			}
					
		}
		System.out.println("Kraj programa");
	}

}
