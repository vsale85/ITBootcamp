package domaci25122020;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int[] niz = {10,50,40,50};
		
		sredinaNiza(niz);
		System.out.println("     --\n    ----\n   ------\n  --------\n  The end");
	}
	public static void sredinaNiza(int[] niz) {
		int el = niz.length;
		double suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma+= niz[i];
		}
		double avg = suma/el;
		
		System.out.println("Aritmeticka sredina niza je: " + avg);
	}
}
