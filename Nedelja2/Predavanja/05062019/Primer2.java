package predavanja;

import java.util.Scanner;

public class Primer2 {

	public static void main(String[] args) {
		/*
		 * Sve dok korisnik ne unese negativan broj za ukupan 
		 * broj ocena raditi sledece: 
		  Racunati prosek, ukoliko broj moze biti ocena. 
		  Ako broj ne moze biti ocenena, samo
		  je preskociti i nastaviti dalju obradu.
		  
		  Dodatak: Naci najbolju ocenu i ispisati je.
		  		   Naci dve najbolje ocene i ispisati ih.
		 */

		int brOcena;
		Scanner s= new Scanner (System.in);
		brOcena= s.nextInt();
		
		while (brOcena > 0) {
			double suma =0;
			int max1=0;
			int max2=0;
			
			for (int i=0; i<brOcena; i++) {
				int ocena= s.nextInt();
				if (ocena<6 || ocena>10) {
					i--;
					continue;
				}
				suma += ocena;
				if (ocena > max1 && ocena> max2) {
					if (max1> max2) max2= ocena;
					else max1= ocena;
				}
				else if (ocena > max1 && ocena <= max2) max1= ocena;
				else if (ocena> max2 && ocena <= max1) max2= ocena;

			}
			double prosek= suma/brOcena;
			System.out.println("Prosek ocena je: " + prosek);
			System.out.println("Dve najbolje ocene su: " + max1 + ", " + max2);
			brOcena= s.nextInt();
		}
	}

}
