package testKlase;

public class Main {

	public static void main(String[] args) {

		Planina kop = new Planina("Kopaonik", "Srbija", 2000);

		Planinar[] planinari = new Planinar[6];

		planinari[0] = new RekreativniPlaninar(1, "Marko", "Markovic", 5, "okrug1", 2500);
		planinari[1] = new RekreativniPlaninar(2, "Petar", "Petrovic", 10, "okrug2", 2500);
		planinari[2] = new RekreativniPlaninar(3, "Zarko", "Zarkovic", 12, "okrug3", 1900);

		planinari[3] = new Alpinista(4, "Slavisa", "Jokanovic", 4);
		planinari[4] = new Alpinista(5, "Mira", "Banjac", 5);
		
		Alpinista sasa = new Alpinista(6, "Sasa", "Vasiljevic", 6);		
		planinari[5] = sasa;
		sasa.setBrojPoena(2);

		int sumaClanarina = 0;
		for (int i = 0; i < planinari.length; i++) {
			planinari[i].stampaj();
			System.out.println("Uspesan uspon: " + planinari[i].uspesanUspon(kop));
			System.out.println("*********************************");
			sumaClanarina += planinari[i].clanarinaPlaninara();
		}
		System.out.println("Ukupna vrednost clanarina je: " + sumaClanarina);
	}

}
