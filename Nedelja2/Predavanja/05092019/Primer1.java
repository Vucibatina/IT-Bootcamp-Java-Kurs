package predavanja;

import java.util.Scanner;

public class Primer1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji od korisnika trazi da unese broj stavki u nizu
		 * (nenegativan int). Zatim popunjava niz vrednostima koje korisnik unosi (celi
		 * brojevi), a zatim ispisuje elemente niza u sledecem formatu: [x1, x2, ...,
		 * xn] Zatim, prikazati tri najmanja broja u nizu (proveriti da li ima vise od 2
		 * elementa uz to)
		 * 
		 * Uneti broj stavki u nizu: 5 Uneti vrednosti elemenata niza (razdvojenih
		 * razmakom): 3 2 5 6 9 Vrednosti su: [3, 2, 5, 6, 9]
		 * 
		 */
		Scanner s = new Scanner(System.in);
		int brElem = s.nextInt();

		int[] mojNiz = new int[brElem];

		for (int i = 0; i < brElem; i++) {
			int broj = s.nextInt();
			mojNiz[i] = broj;
		}

		System.out.print('[');
		for (int i = 0; i < brElem; i++) {
			System.out.print(mojNiz[i]);
			if (i != brElem - 1) {
				System.out.print(", ");
			}
		}
		System.out.print(']');

	}

}
