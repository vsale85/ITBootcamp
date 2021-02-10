package domaci21122020;

import java.util.Scanner;

public class Zadatak1 {

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
		System.out.println("Trenutna pozicija elemenata u nizu:");
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		
		System.out.println("Obrnuta pozicija elemenata niza:");
		for (int i = niz.length-1; i >= 0; i--) {
			System.out.println(niz[i]);
		}
		
	}

}
