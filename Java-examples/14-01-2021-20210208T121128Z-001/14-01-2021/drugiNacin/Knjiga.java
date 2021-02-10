package drugiNacin;

public class Knjiga extends Autor {

	private String isbn;
	private String naziv;
	private int godIzdanja;

	public Knjiga(String ime, String prezime, String isbn, String naziv, int godIzdanja) {
		super(ime, prezime);
		this.isbn = isbn;
		this.naziv = naziv;
		this.godIzdanja = godIzdanja;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodIzdanja() {
		return godIzdanja;
	}

	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;
	}

//	public void stampaKnjige() {
//
//		System.out.println("(" + isbn + ")\n(" + naziv + ")-(" + godIzdanja + ")" );
//		 super.stampaAutora();
//	//	autor.stampaAutora();
//	}

	@Override
	public void stampaAutora() {
		System.out.println("(" + isbn + ")\n(" + naziv + ")-(" + godIzdanja + ")" );
		System.out.println("(" + getIme() + ") (" + getPrezime() + ")");
		
	}
}
