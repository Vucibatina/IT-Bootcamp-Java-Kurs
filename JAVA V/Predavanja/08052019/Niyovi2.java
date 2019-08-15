package tnp;

import java.util.Scanner;

public class Niyovi2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Unesi element: ");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Element: " + a[i]);
		}
	}

}
