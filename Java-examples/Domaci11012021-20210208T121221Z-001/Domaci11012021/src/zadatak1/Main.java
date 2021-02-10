package zadatak1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
		
		Sportista[] svi = new Sportista[3];
		svi[0] = new Sportista("Pedja", "Mijatovic", 1975);
		svi[1] = new Sportista("Sinisa", "Mihajlovic", 1976);
		svi[2] = new Sportista("Dejan", "Stankovic", 1977);
	
		Klub real = new Klub("Real", "Madrid", 1900, svi);	
		real.toString();
	
		for (int i = 0; i < svi.length; i++) {
			System.out.println(svi[i]);
		}

	}

}
