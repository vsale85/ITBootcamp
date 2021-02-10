package domaci15122020;

public class TreciZadatak {

	public static void main(String[] args) {
		
		int suma = 0;
		
		for (int i = 9; i <= 250; i++) {
			if (i % 3 == 0) {
				suma++;
			}
		}
		System.out.println("Ukupno brojeva od 9 do 250 deljivih sa 3 je: " + suma);

	}

}