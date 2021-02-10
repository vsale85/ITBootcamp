package zadatak1;

public class Main {

	public static void main(String[] args) {
		
		Putnik putnik = new Putnik("Pedja", "Jankovic", 100.0);
		Vozac vozac = new Vozac("Misko", "Krstic", "Sofer");
		
		putnik.stampaPutnika();
		putnik.dodaj(50);
		putnik.stampaPutnika();
		putnik.oduzmi(20);
		putnik.stampaPutnika();
	
		
		Autobus bus = new Autobus("bbb", vozac, 100, putnik);
		bus.stampaAutobusa();
		boolean oduzmi = false;
		bus.dodajPutnika(oduzmi);
		bus.stampaAutobusa();

	}

}
