package domaci21122020;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		
		int elementNiza;
		int[] niz = new int[10];
		int trenutna;
		Scanner sc = new Scanner(System.in);	
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite " + (i+1) + ". elemenat niza: ");
			elementNiza = sc.nextInt();
			niz[i] = elementNiza;
			
		}
		
		System.out.println("Prvobitni niz: \n" + niz[0] + ", " + niz[1] + ", " + niz[2] + ", " + niz[3] + ", " + niz[4] + ", " + niz[5] + ", " + niz[6] + ", "
				 + niz[7] + ", " + niz[8] + ", " + niz[9]);
		
		for (int i = 0; i < niz.length; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[i] > niz[j]) {
					
				trenutna = niz[j];
				niz[j] = niz[i];
				niz[i] = trenutna;
				
				}
			}
			
		}
		System.out.println("Niz sortiran rastuce: \n" + niz[0] + ", " + niz[1] + ", " + niz[2] + ", " + niz[3] + ", " + niz[4] + ", " + niz[5] + ", " + niz[6] + ", "
				 + niz[7] + ", " + niz[8] + ", " + niz[9]);
		
		System.out.println("Kraj programa");
		
	}

}
