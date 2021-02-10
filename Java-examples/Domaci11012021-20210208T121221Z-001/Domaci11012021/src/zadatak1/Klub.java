package zadatak1;

import java.util.Arrays;

public class Klub {

	private String naziv;
	private String sediste;
	private int godOsnivanja;
	private Sportista[] sviIgraci;
	
	
	public Klub(String naziv, String sediste, int godOsnivanja, Sportista[] sviIgraci) {
		super();
		this.naziv = naziv;
		this.sediste = sediste;
		this.godOsnivanja = godOsnivanja;
		this.sviIgraci = sviIgraci;
		
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSediste() {
		return sediste;
	}
	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public Sportista[] getSviIgraci() {
		return sviIgraci;
	}
	

	public void setSviIgraci(Sportista[] sviIgraci) {
		this.sviIgraci = sviIgraci;
	}

	public Sportista[] dodavanjeIgraca(Sportista noviIgrac) {
		int i = 0;
	
			sviIgraci[i] = noviIgrac;
			i++;
			
		return sviIgraci;
	}

	
	public String toString() {
		System.out.println(naziv + ", " + sediste + ", " + godOsnivanja + ", Igraci kluba: ");
		
		return  Arrays.toString(sviIgraci);
		
		
	}
	
	
	
}
