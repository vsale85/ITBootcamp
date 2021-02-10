package javaTest;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int[] niz = {3, 5, 4, 11, -1, 23, 5, 43, 0, 5};
		int najmanjiBroj = 0;
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i]< najmanjiBroj) {
				najmanjiBroj = niz[i];
			}
		}
		System.out.println("Najmanji broj u nizu je: " + najmanjiBroj);

	}

}

//Napisite niz od 10 elemenata i koristeci petlju pronadjite najmanji broj u nizu
//Primer niza {3, 5, 4, 11, -1, 23, 5, 43, 0, 5}
//Primer ispisa resenja u konzoli: 
//Najmanji broj u nizu je -1
