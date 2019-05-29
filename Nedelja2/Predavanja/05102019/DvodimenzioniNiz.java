package predavanja;

import java.util.Scanner;

public class DvodimenzioniNiz {
	
	/*
	 * U glavnom programu ucitavati poene studenata sa njihova
	 * tri poslednja domaca zadatka. (Ukupno ima 5 studenata)
	 * Zatim napraviti metodu koja ce da nadje osobu 
	 * (njen redni broj)koja je u proseku najbolje uradila domaci. 
	 * Ukoliko je vise osoba podjednako dobro, izabrati bilo koju.
	 * 
	 */
	public static void nadjiNajboljeg(double[][] poeni) {
		//double max = (poeni[0][0] + poeni[0][1] + poeni[0][2])/3;
		double max= 0;
		double pozicija= 0;
		
		for (int i=0; i<5; i++) {
			double sum= 0;
			double prosek= 0;
			
			for (int j=0; j<3; j++) {
				sum += poeni[i][j];
			}
			prosek= sum/3;
			if (prosek> max) {
				max= prosek;
				pozicija= i;
			}
		}
		
		System.out.println("Najbolji prosek je: " + max);
		System.out.println("Pozicija najboljeg studenta je: " + pozicija);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		int brTestova= 3;
		Scanner s= new Scanner(System.in);
		double testovi[][]= new double[5][3];
		
		System.out.println("Unesite poene za svakog studenta.");
		for (int i=0; i<n; i++) {
			for (int j= 0; j<brTestova; j++) {
				testovi[i][j]= s.nextDouble();
			}
		}
		
		nadjiNajboljeg(testovi);
	}

}
