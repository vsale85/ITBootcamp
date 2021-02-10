package zadatak1;

public class Osoba {

	private String ime;
	private String prezime;
	private String jmbg;
	private int godinaRodjenja;
	public Osoba() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Osoba(String ime, String prezime, String jmbg, int godinaRodjenja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}
	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}
	
	public void stampaj() {
		
		System.out.println("(" + ime + " " +prezime + "), (" + jmbg + "), (" + godinaRodjenja + ")");
	}
	
	
}
