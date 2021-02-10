package drugiNacin;

public abstract class Autor {
	private String ime;
	private String prezime;
	
	public Autor(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
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
	
	public abstract void stampaAutora();
//	{
//		System.out.println("(" + ime + ") (" + prezime + ")");
//	}
}
