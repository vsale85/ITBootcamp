package zadatak1;

public class Igrac extends Osoba {

	private int broj;
	private String pozicija;
	private boolean kapiten;
	public Igrac() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Igrac(String ime, String prezime, String jmbg, int godinaRodjenja) {
		super(ime, prezime, jmbg, godinaRodjenja);
		// TODO Auto-generated constructor stub
	}
	public Igrac(int broj, String pozicija, boolean kapiten) {
		super();
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public boolean isKapiten() {
		return kapiten;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	public void stampajIgraca() {
		super.stampaj();
		System.out.println("Broj igraca: " + broj + ", igra na poziciji: " + pozicija + ", Igrac je kapiten: " + kapiten);
	}
}
