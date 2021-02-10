package drugiNacin;

public class Main {

	public static void main(String[] args) {		
		
		Knjiga k1 = new Knjiga("Ivo", "Andric", "123-4567-89", "Na Drini cuprija", 1945);		
		Autor[] a = new Autor[3];
		
		a[0] = k1;
		a[1] = new Knjiga("Ivo", "Andric", "1987-654-321", "Most na Zepi", 1925);
		a[2] = new Knjiga("Ivo", "Andric", "951-753-852-1234", "Prokleta avlija", 1954);

		
		for (int i = 0; i < a.length; i++) {
			a[i].stampaAutora();
			System.out.println("*******************");
		}
	}

}
