package testKlase;

public class Alpinista extends Planinar{

	private int brojPoena;

	public Alpinista(int id, String ime, String prezime, int brojPoena) {
		super(id, ime, prezime);
		this.brojPoena = brojPoena;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id: " + id + "\nime: " + ime + " " + prezime + "\nBroj poena: " + brojPoena);
		
	}

	@Override
	public int clanarinaPlaninara() {
		int clanarina = 1500;
		if (brojPoena > 0) {
			clanarina = 1500 - (brojPoena * 50);
			return clanarina;
		}else {
			return clanarina;
		}
			
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisinaPlanine() < 4000) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
}
