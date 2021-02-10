package domaci21122020;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int duzinaNiza;
		int elementNiza;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		duzinaNiza = sc.nextInt();		
		int[] niz = new int[duzinaNiza];
		
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i+1) + ". elemenat niza: ");
			elementNiza = sc.nextInt();
			niz[i] = elementNiza;
		}
		
		int check = 0;
		
		for (int i = 0; i < niz.length; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[i] > niz[j]) {
					check++;
				}
			}
		}
		if (check ==0) {
			System.out.println("Niz je rastuci");
		}else {
			System.out.println("Niz NIJE rastuci");
		}
		System.out.println("Kraj programa");
		
	}

}
