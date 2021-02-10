package domaci24122020;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int broj1 = 5;
		int broj2 = 11;
		int broj3 = 15;
		
		System.out.println(proveraZbira(broj1, broj2, broj3));

	}

	public static boolean proveraZbira(int num1, int num2, int num3) {
		
		boolean provera;
		
		if (num1 + num2 == num3) {
			provera = true;
			return provera;
		}else {
			provera = false;
			return provera;
		}
		
	}
}
