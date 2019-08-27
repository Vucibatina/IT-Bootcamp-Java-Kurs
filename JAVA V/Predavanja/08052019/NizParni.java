package tnp;

import java.util.Scanner;

public class NizParni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Unesi n elemenata: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println("Element: " + a[i]);
		}

	}

}
