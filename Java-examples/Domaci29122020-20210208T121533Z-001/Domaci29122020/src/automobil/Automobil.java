package automobil;

public class Automobil {

	private String marka;
	private String model;
	private int serijskiBroj;
	public String vlasnik;

	public Automobil() {

	}

	public Automobil(String marka, String model, int serijskiBroj, String vlasnik) {
		super();
		this.marka = marka;
		this.model = model;
		this.serijskiBroj = serijskiBroj;
		this.vlasnik = vlasnik;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getSerijskiBroj() {
		return serijskiBroj;
	}

	public void ispisAuto() {

		System.out.println("Marka automobila: " + this.marka + "\nModel automobila: " + this.model
				+ "\nSerijski broj automobila: " + this.serijskiBroj + "\nVlasnik: " + this.vlasnik);
	}

}
