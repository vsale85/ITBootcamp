package automobil;

public class MainAutomobil {

	public static void main(String[] args) {
		
		Automobil bmw = new Automobil("Bmw", "525d", 1234567891,"Sasa Vasiljevic");
		
		bmw.ispisAuto();
		System.out.println("*******************************");
		
		bmw.setVlasnik("Novi Vlasnik");
		bmw.ispisAuto();
	}

}
