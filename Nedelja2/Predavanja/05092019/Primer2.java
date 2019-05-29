package predavanja;

import java.util.Scanner;

public class Primer2 {
	/*
	 * Napraviti niz u kome se cuvaju imena i prezimena polaznika nekog kursa. U
	 * drugom nizu mozemo da cuvamo njihove poene na testu. Ispisati imena i njihove
	 * ocene na istom. Korisnik unosi broj polaznika, nakon toga ostale podatke.
	 */

	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int brElem = s.nextInt();

		String[] polaznici = new String[brElem];
		double[] poeni = new double[brElem];

		for (int i = 0; i < brElem; i++) {
			String ime = s.next();
			String prezime = s.next();
			polaznici[i] = ime + " " + prezime;
		}

		for (int i = 0; i < brElem; i++) {
			poeni[i] = s.nextDouble();
		}

		for (int i = 0; i < brElem; i++) {
			System.out.print(polaznici[i] + " ");
			double brPoena = poeni[i];
			int ocena;

			if (brPoena < 51)
				ocena = 5;
			else if (brPoena >= 51 && brPoena < 61)
				ocena = 6;
			else if (brPoena >= 61 && brPoena < 71)
				ocena = 7;
			else if (brPoena >= 71 && brPoena < 81)
				ocena = 8;
			else if (brPoena >= 81 && brPoena < 91)
				ocena = 9;
			else
				ocena = 10;

			System.out.println(ocena);
		}
	}
}
