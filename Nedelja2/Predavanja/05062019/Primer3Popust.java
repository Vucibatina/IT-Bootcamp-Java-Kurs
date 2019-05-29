package predavanja;

import java.util.Scanner;

public class Primer3Popust {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		
		double iznos= s.nextDouble();
		int brojac= 0;
		
		while (iznos>0) {
			brojac++;
			if (brojac == 5) {
				iznos -= 0.1 * iznos;
				brojac= 0;
			}
			System.out.println("Vas racun je: " + iznos);

			iznos= s.nextDouble();
		}

	}

}
