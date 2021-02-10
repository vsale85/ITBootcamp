package zadatak1;

public class Sportista {

	private String ime;
	private String prezime;
	private int godinaRodjenja;
	
	public Sportista(String ime, String prezime, int godinaRodjenja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}
	
	@Override
	public String toString() {
		return ""+ ime + "_" + prezime + ": " + godinaRodjenja+"";
	}
	
	
	
}
