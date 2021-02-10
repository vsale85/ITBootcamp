package racun;

import java.io.IOException;

public class MainRacun {

	public static void main(String[] args) throws IOException {
		
		Racun racun = new Racun();
		
		racun.dodavanje(713);

		racun.ispisRacuna();
		
		racun.oduzimanje(0);
		
		racun.ispisRacuna();
			
		
	}
	

}
