package zadatak1;

public class Vozac extends Covek{

	private String zvanje;
	

	public Vozac(String ime, String prezime, String zvanje) {
		super(ime, prezime);
		this.zvanje = zvanje;
	}

	public String getZvanje() {
		return zvanje;
	}
	
	public void stampaVozaca() {
		super.stampaCovek();
		System.out.println(", " + zvanje);
	}
	
}
