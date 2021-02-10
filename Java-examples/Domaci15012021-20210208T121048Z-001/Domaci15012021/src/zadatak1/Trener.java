package zadatak1;

public class Trener extends Osoba{

	
	private int godineIskustva;
	private String tipTrenera;
	
	public Trener(int godineIskustva, String tipTrenera) {
		super();
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	public Trener() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trener(String ime, String prezime, String jmbg, int godinaRodjenja) {
		super(ime, prezime, jmbg, godinaRodjenja);
		// TODO Auto-generated constructor stub
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}
	
	public void stampajTrenera() {
		super.stampaj();
		System.out.println("Godine trenerskog iskustva: " + godineIskustva + ", Tip trenera je: " + tipTrenera);
	}
	
}
