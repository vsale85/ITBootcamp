package zadatak1;

public class Covek {

	protected String ime;
	private String prezime;
	
	public Covek(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}
	
	public void stampaCovek() {
		System.out.print(ime + " " + prezime);
	}
	
}
