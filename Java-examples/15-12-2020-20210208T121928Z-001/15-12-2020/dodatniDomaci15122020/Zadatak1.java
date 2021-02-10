package dodatniDomaci15122020;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		
		int izlaz = 0;
		int dodavanjeCene = 1;
		int naplata = 2;
		int korpa = 0;
		int cena;
		int novcanik = 0;
		int kusur = 0;
		int opcija;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Molimo izaberite jednu opciju: \n" + izlaz + " - za izlaz iz programa \n" 
		+ dodavanjeCene + " - za unos cene \n" + naplata + " - za naplatu");
		
		opcija = sc.nextInt();
		
		switch (opcija) {
		case 0:
			System.out.println("Kraj programa");
			break;
		case 1:
			System.out.println("Molimo unesite cenu: ");
			cena = sc.nextInt();
			korpa += cena;
			System.out.println("Dodato u korpu: "+ cena);
			break;
		case 2:
			System.out.println("Unesite kolicinu novca za naplatu racuna");
			novcanik = sc.nextInt();
			if (novcanik < korpa) {
				System.out.println("Greska, vas racun je " + korpa + ", uneto manje od potrebne kolicine novca!");
				System.out.println("Molimo izaberite jednu opciju: \n" + izlaz + " - za izlaz iz programa \n" 
						+ dodavanjeCene + " - za unos cene \n" + naplata + " - za naplatu");
			}else if (novcanik >= korpa) {
				kusur = novcanik - korpa;
				System.out.println("Vas kusur je: " + kusur);
				korpa = 0;
				System.out.println("Molimo izaberite jednu opciju: \n" + izlaz + " - za izlaz iz programa \n" 
						+ dodavanjeCene + " - za unos cene \n" + naplata + " - za naplatu");
			}
			break;
		
		default:
			System.out.println("error");
			break;
		}
		System.out.println("\nKraj aplikacije");
	}

}
