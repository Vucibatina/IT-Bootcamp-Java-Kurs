package prvipaket;

import java.util.Scanner;

public class PovrsinaKvadrata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, p;
		System.out.println("Unesi duzinu stranice: ");
		a = sc.nextDouble();
		p = a * a;
		System.out.println("Povrsina kvadrata je: " + p);
	}

}
