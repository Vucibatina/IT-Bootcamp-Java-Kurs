package chnpp;

import java.util.Scanner;

public class Atoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.length() == 0) {
			System.out.println("Los unos. Izlaz!");
			return;
		}
		int broj = 0;
		int mul = 1;
		int i = 0;
		if (!isDigit(s.charAt(i)) && s.charAt(i) != '+' && s.charAt(i) != '-') {
			System.out.println("ERROR!");
			return;
		}
		switch (s.charAt(i)) {
		case '-':
			mul = -1;
			i++;
			break;
		case '+':
			i++;
		default:
			mul = 1;break;
		}
		for (; i < s.length(); i++) {
			if (!isDigit(s.charAt(i))) {
				System.out.println("ERROR!");
				return;
			}
			broj *= 10;
			broj += s.charAt(i)-'0';
		}
		broj*=mul;
		System.out.println(broj);
	}

	public static boolean isDigit(char c) {
		if (c >= '0' && c <= '9')
			return true;
		return false;
	}

}
