package domaci18122020;

import java.util.Scanner;

public class Domaci18122020 {

	public static void main(String[] args) {

		String mesec;
		String astroloskiZnak;
		int datum;
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite mesec rodjenja: ");
		mesec = sc.next();

		System.out.println("Unesite datum rodjenja: ");
		datum = sc.nextInt();

		switch (mesec) {

		case "januar":
			if (datum <= 31 && datum >= 1) {
				if (datum < 20) {
					astroloskiZnak = "jarac";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "vodolija";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "februar":
			if (datum <= 29 && datum >= 1) {
				if (datum < 19) {
					astroloskiZnak = "vodolija";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "ribe";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "mart":
			if (datum <= 31 && datum >= 1) {
				if (datum < 21) {
					astroloskiZnak = "ribe";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "ovan";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "april":
			if (datum <= 30 && datum >= 1) {
				if (datum < 20) {
					astroloskiZnak = "ovan";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "bik";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "maj":
			if (datum <= 31 && datum >= 1) {
				if (datum < 21) {
					astroloskiZnak = "bik";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "blizanci";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "jun":
			if (datum <= 30 && datum >= 1) {
				if (datum < 21) {
					astroloskiZnak = "blizanci";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "rak";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "jul":
			if (datum <= 31 && datum >= 1) {
				if (datum < 23) {
					astroloskiZnak = "rak";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "lav";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "avgust":
			if (datum <= 31 && datum >= 1) {
				if (datum < 23) {
					astroloskiZnak = "lav";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "devica";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "septembar":
			if (datum <= 30 && datum >= 1) {
				if (datum < 23) {
					astroloskiZnak = "devica";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "vaga";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "oktobar":
			if (datum <= 31 && datum >= 1) {
				if (datum < 23) {
					astroloskiZnak = "vaga";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "skorpija";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "novembar":
			if (datum <= 30 && datum >= 1) {
				if (datum < 22) {
					astroloskiZnak = "skorpija";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "strelac";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}
			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;
		case "decembar":
			if (datum <= 31 && datum >= 1) {
				if (datum < 22) {
					astroloskiZnak = "strelac";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				} else {
					astroloskiZnak = "jarac";
					System.out.println("Astrološki znak je: " + astroloskiZnak);
				}

			} else {
				System.out.println("Nije validan dan u mesecu");
			}
			break;

		default:
			System.out.println("Nije validan mesec");
			break;
		}// end switch
		System.out.println("Kraj programa");
	}

}
