package domaci24122020;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int[] niz1 = {1,2,3,100};
		int [] niz2 = {10,20,30,40};
		
		veciNiz(niz1, niz2);

	}

	
	public static void veciNiz(int[] nizX, int[] nizY) {
		
		int sumaX = 0;
		int sumaY = 0;
		int finalSuma=0;
		boolean veci;
		
		for (int i = 0; i < nizX.length; i++) {
			sumaX += nizX[i];
		}
		for (int i = 0; i < nizY.length; i++) {
			sumaY += nizY[i];
		}
		if (sumaX > sumaY) {
			finalSuma = sumaX - sumaY;
			if (finalSuma > sumaX) {
				veci = true;
				System.out.println("Prvi niz je veci od drugog\nDa li je i posle oduzimanja sume drugog veca suma prvog: " + veci);
			}else {
				veci = false;
				System.out.println("Prvi niz je veci od drugog\nDa li je i posle oduzimanja sume drugog veca suma prvog: " + veci);		
			}
		}else {
			finalSuma = sumaY - sumaX;
			if (finalSuma > sumaY) {
				veci = true;
				System.out.println("Drugi niz je veci od prvog\nDa li je i posle oduzimanja sume prvog veca suma drugog: " + veci);
			}else {
				veci = false;
				System.out.println("Drugi niz je veci od prvog\nDa li je i posle oduzimanja sume prvog veca suma drugog: " + veci);		
			}
		}
	}
}
