package zadatak1;

public class Putnik extends Covek{

	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public void setNovac(double novac) {
		this.novac = novac;
	}
	
	public void oduzmi(double iznos) {
		novac -= iznos;	
	}
	public void dodaj(double iznos) {
		novac += iznos;	
	}	
	
	public void stampaPutnika() {
		super.stampaCovek();
		System.out.println(", stanje racuna: " + novac);
	}
}
