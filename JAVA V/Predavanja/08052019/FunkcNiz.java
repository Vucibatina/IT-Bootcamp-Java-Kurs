package tnp;

import java.util.Scanner;

public class FunkcNiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		ispisiNiz(a);
		

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
	static void ispisiParne(int []niz) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0)
				System.out.println("Element: " + niz[i]);
		}
	}

}
