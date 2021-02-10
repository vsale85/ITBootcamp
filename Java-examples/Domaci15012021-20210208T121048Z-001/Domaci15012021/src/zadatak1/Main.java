package zadatak1;

public class Main {

	public static void main(String[] args) {
		
		Igrac i1 = new Igrac("Pedja", "Mijatovic", "12345677891011", 1970);
		i1.setBroj(10);
		i1.setPozicija("Sredina");
		i1.setKapiten(true);
		Igrac i2 = new Igrac("dejan", "Stankovic", "5874692231", 1983);
		i2.setBroj(11);
		i2.setPozicija("Napad");
		i2.setKapiten(false);
		
		Trener t1 = new Trener("Petar", "Petrovic", "987456623211", 1965);
		t1.setGodineIskustva(5);
		t1.setTipTrenera("Kondicioni");
		Trener t2 = new Trener("Marko", "Markovic", "65423985200", 1970);
		t2.setGodineIskustva(5);
		t2.setTipTrenera("Pomocni");
		
		i1.stampajIgraca();
		System.out.println("************************************************");
		i2.stampajIgraca();
		System.out.println("************************************************");
		t1.stampajTrenera();
		System.out.println("************************************************");
		t2.stampajTrenera();

	}

}
