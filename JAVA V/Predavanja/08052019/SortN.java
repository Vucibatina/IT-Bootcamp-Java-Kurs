package tnp;

import java.util.Random;
import java.util.Scanner;

public class SortN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		sortirajNiz(a);
		ispisiNiz(a);
		generisiNiz(a, 100);
		ispisiNiz(a);
	}

	static void generisiNiz(int[] niz, int gornjaGranica) {
		Random r = new Random();
		for (int i = 0; i < niz.length; i++) {
			int broj = r.nextInt(gornjaGranica);
			niz[i] = broj;
		}
	}

	static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Element: " + niz[i]);
		}
	}

	static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element: ");
			niz[i] = sc.nextInt();
		}
	}

	static void sortirajNiz(int[] niz) {
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[j] < niz[i]) {
					// vinjak i vodka
					int temp = niz[j];
					niz[j] = niz[i];
					niz[i] = temp;
				}
			}
		}
	}
}
