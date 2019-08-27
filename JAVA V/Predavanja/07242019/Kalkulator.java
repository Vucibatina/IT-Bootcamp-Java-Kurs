package drugipaket;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
		/*
		 * Napisati progrma koji ucitava 3 broja A,B,O Program u zavisnosti od O
		 * ispisuje sledece: O=0 -> A+B O=1 -> A-B O=2 -> A*B
		 */
		Scanner sc = new Scanner(System.in);
		double a, b, o;
		System.out.println("A:");
		a = sc.nextInt();
		System.out.println("B:");
		b = sc.nextInt();
		System.out.println("O:");
		o = sc.nextInt();
		if (o == 0) {
			System.out.println(a + b);
		} else if (o == 1) {
			System.out.println(a - b);
		} else if (o == 2) {
			System.out.println(a * b);
		} else {
			System.out.println("Los Unos!");
		}
	}

}
