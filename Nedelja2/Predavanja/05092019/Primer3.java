import java.util.Scanner;

public class Niz3 {

	public static void main(String[] args) {
		/*
		 * Napraviti niz, koji ce da sadrzi reci. Sve dok korisnik ne unese rec "stop"
		 * traziti da unese neku rec, i vratiti da li ta rec postoji u nizu ili ne. Ako
		 * postoji vrati i na kom mestu u nizu se nalazi.
		 * 
		 */

		Scanner s = new Scanner(System.in);
		
		String[] niz= {"tabla", "kreda", "sto", "racunar", "kurs"};

		/* Ako zelim da korisnik popunjava niz
		String[] niz = new String[5];
		for (int i = 0; i < 5; i++) {
			niz[i] = s.next();
		}
		*/

		String rec = s.next();
		int i;
		while (!rec.equals("stop")) {
			for (i = 0; i < niz.length; i++) {
				if (rec.equals(niz[i])) {
					System.out.println("Rec je pronadjena na poziciji " + i);
					break;
				}
			}
			if (i == niz.length)
				System.out.println("Rec ne postoji u nizu. ");
			rec = s.next();
		}

	}

}
