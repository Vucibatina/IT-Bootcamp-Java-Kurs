package tnp;

import java.util.Scanner;

public class NizFZadatak {

	public static void main(String[] args) {
		// Ucitati niz od N elemenata.
		// Napisati funkciju koja vraca indikator
		// da li je poslati niz palindrom
		//Napisati funkciju koja vraca indikator
		//da li je poslati niz rastuci
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		if(jePalindrom(a)==true)System.out.println("Jeste P");
		else {
			System.out.println("Nije planidrom");
		}
	}
	static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element: ");
			niz[i] = sc.nextInt();
		}
	}
	static void ispisiNiz(int []niz) {
		for (int i = 0; i <niz.length; i++) {
			System.out.println("Element: " + niz[i]);
		}
	}
	static boolean jePalindrom(int[] niz) {
		for(int i=0,j=niz.length-1;i<j;i++,j--) {
			if(niz[i]!=niz[j])
				return false;
		}
		return true;
	}

}
