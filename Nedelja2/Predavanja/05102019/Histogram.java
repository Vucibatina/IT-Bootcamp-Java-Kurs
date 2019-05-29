package predavanja;

import java.util.Scanner;

public class Histogram {
	
	public static void iscrtajHistogram(int[] niz) {
		int[] grupe= new int[4];
		for (int i=0; i<4; i++) {
			grupe[i]= 0;
		}
		
		for (int i=0; i<niz.length; i++ ) {
			if (niz[i] <160) {
				grupe[0]++;
			}
			else if ( niz[i] >= 160 && niz[i]<170) {
				grupe[1]++;
			}
			else if ( niz[i] >= 170 && niz[i]<180) {
				grupe[2]++;
			}
			else {
				grupe[3]++;
			}
		}
		
		System.out.print("<160    ");
		for (int i=0; i<grupe[0]; i++) System.out.print("*");
		System.out.print("\n");
		// System.out.println(" ");
		
		System.out.print("160 <= x < 170 ");
		for (int i=0; i<grupe[1]; i++) System.out.print("*");
		System.out.print("\n");

		System.out.print("170 <= x < 180 ");
		for (int i=0; i<grupe[2]; i++) System.out.print("*");
		System.out.print("\n");
		
		System.out.print("x >= 180 ");
		for (int i=0; i<grupe[3]; i++) System.out.print("*");
		System.out.print("\n");
		
	}

	public static void main(String[] args) {
		/*
		Napisati metodu koja od datog niza pravi histogram. 
		Moze se uzeti visina osoba koje se grupisu u cetiri grupe:
		manje od 160; 160-170; 170-185; preko 185.
		Glavni program ucitava broj elemenata niza i elemente.
		
			<160     **
			160-170  **** 
			170-185  ***
			>185     *
		*/	
		Scanner s= new Scanner (System.in);
		
		int[] visine;
		int n= s.nextInt();
		visine= new int[n];
		
		for (int i=0; i<n; i++) {
			visine[i]= s.nextInt();
		}
		
		iscrtajHistogram(visine);
		
	}

}
