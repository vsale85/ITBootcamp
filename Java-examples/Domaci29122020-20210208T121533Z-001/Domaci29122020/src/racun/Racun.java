package racun;

public class Racun {
	private String brRacuna = "123AB45";
	private double stanje = 0.0;
	
	

	public Racun() {
		
	}

	public Racun(String brRacuna, double stanje) {

		this.brRacuna = brRacuna;
		this.stanje = stanje;
	}

	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}

	public String getBrRacuna() {
		
		return brRacuna;
	}
	
	public double dodavanje(double plus) {
		this.stanje += plus;
		return stanje;
	}
	public double uzimanje(double minus) {
		this.stanje -= minus;
		return stanje;
	}

	public void ispisRacuna() {

		System.out.println("Broj racuna: " + this.brRacuna + "\nStanje racuna: " + this.stanje);
	}

}
