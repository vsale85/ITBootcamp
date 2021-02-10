package domaci21122020;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int duzinaNiza;
		int elementNiza;
		int checkNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		duzinaNiza = sc.nextInt();		
		int[] niz = new int[duzinaNiza];
		
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i+1) + ". elemenat niza: ");
			elementNiza = sc.nextInt();
			niz[i] = elementNiza;
		}
		
		System.out.println("Unesite broj za proveru deljivosti");
		checkNum = sc.nextInt();
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % checkNum == 0) {
				System.out.println("Broj " + niz[i] + " je deljiv sa brojem " + checkNum);
			}
		}
		
		System.out.println("Kraj programa");
		
	}

}
