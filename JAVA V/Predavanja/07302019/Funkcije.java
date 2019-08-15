package dnu;

import java.util.Scanner;

public class Funkcije {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b,c;
		a = 5;
		b = 6;
		c=saberi(a,b);
		System.out.println(c);
	}
	static int saberi(int a, int b) {
		int c = a + b;
		return c;
	}

}
