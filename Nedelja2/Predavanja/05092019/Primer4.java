
public class Niz4 {
	/*
	 * Da li su dva niza jednaka? Dodatak: Nakon toga sortirati oba niza i ispisati
	 * ih.
	 */

	public static void sortiraj(int[] niz) {
		for (int i = 0; i < niz.length - 1; i++) {
			int min = niz[i];
			int pozicija = i;
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[j] < min) {
					min = niz[j];
					pozicija = j;
				}
			}
			niz[pozicija] = niz[i];
			niz[i] = min;
		}
	}

	public static void main(String[] args) {

		int[] niz1 = { 1, 2, 0 };
		int[] niz2 = { 1, 2, 4 };

		boolean jednaki = true;
		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i]) {
				jednaki = false;
				break;
			}
		}
		if (jednaki)
			System.out.println("Nizovi su jednaki");
		else
			System.out.println("Nisu jednaki");

		sortiraj(niz1);
		for (int i = 0; i < niz1.length; i++) {
			System.out.println(niz1[i]);
		}

	}

}
