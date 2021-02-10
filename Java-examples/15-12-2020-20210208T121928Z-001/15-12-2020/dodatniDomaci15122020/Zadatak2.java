package dodatniDomaci15122020;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		int a= 0;
		int b = 1;
		int unos;
		int fibonaci = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj:");
		unos = sc.nextInt();
		
		System.out.println("1. Fibonacijev broj je: "+ a);
		System.out.println("2. Fibonacijev broj je: "+ b);
			for (int i = 2; i < unos; i++) {
				fibonaci = a + b;
				System.out.println( (i+1)+ ". Fibonacijev broj je: " + fibonaci);
				a = b;
				b = fibonaci;	
			}	
		
	}

}
