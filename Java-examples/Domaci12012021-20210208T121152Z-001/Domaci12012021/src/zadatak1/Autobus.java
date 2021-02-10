package zadatak1;

public class Autobus {

	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private Putnik putnik;
	public Autobus(String naziv, Vozac vozac, double cenaKarte, Putnik putnik) {
		super();
		this.naziv = naziv;
		this.vozac = vozac;
		this.cenaKarte = cenaKarte;
		this.putnik = putnik;
	}
	public String getNaziv() {
		return naziv;
	}
	public Vozac getVozac() {
		return vozac;
	}
	public double getCenaKarte() {
		return cenaKarte;
	}
	public Putnik getPutnik() {
		return putnik;
	}
	
	public void dodajPutnika(boolean dodaj) {
		if (dodaj) {
			putnik = putnik;
		}else {
			putnik = null;
		}
	}
	
	public void stampaAutobusa() {
		System.out.print(naziv + " putnik je: ");
		if (putnik == null) {
			System.out.println("nema putnika");
		}else {
			putnik.stampaPutnika();
		}
		
	}
	
	
	
}
