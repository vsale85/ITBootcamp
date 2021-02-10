package racun;

public class MainRacun {

	public static void main(String[] args) {
		
		Racun racun = new Racun();		
		racun.ispisRacuna();
		

		racun.dodavanje(450.0);
		racun.ispisRacuna();
		
		racun.uzimanje(200.50);
		racun.ispisRacuna();	
		
	}

}
