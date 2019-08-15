package chnpp;

import java.util.Scanner;

public class Skyline {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite c: (a/b/c/d/)");
		char c = sc.next().charAt(0);

		int[][] skyline = { { 3, 2, 0 }, { 1, 4, 6 }, { 2, 1, 8 } };
		switch(c){
		case 'a': a(skyline, c); break;
		case 'b': b(skyline, c); break;
		case 'c': c(skyline, c); break;
		case 'd': d(skyline, c); break;
		}

	}

	static void a(int[][] skyline, char c) {
		int nBroj = 0;
		for (int i = skyline.length - 1; i >= 0; i--) {
			nBroj = 0;
			for (int j = 0; j < skyline.length; j++) {
				if (skyline[j][i] > nBroj) {
					nBroj = skyline[j][i];
				}
			}
			System.out.println(nBroj);
		}
	}

	static void c(int[][] skyline, char c) {
		int nBroj = 0;
		for (int i = 0; i < skyline.length; i++) {
			nBroj = 0;
			for (int j = skyline.length - 1; j >= 0; j--) {
				if (skyline[j][i] > nBroj) {
					nBroj = skyline[j][i];
				}
			}
			System.out.println(nBroj);
		}
	}

	static void b(int[][] skyline, char c) {
		int nBroj = 0;
		for (int i = skyline.length - 1; i >= 0; i--) {
			nBroj = 0;
			for (int j = skyline[i].length - 1; j >= 0; j--) {
				if (skyline[i][j] > nBroj) {
					nBroj = skyline[i][j];
				}
			}
			System.out.println(nBroj);
		}
	}

	static void d(int[][] skyline, char c) {
		int nBroj = 0;

		for (int i = 0; i < skyline.length; i++) {
			nBroj = 0;
			for (int j = 0; j < skyline[i].length; j++) {

				if (skyline[i][j] > nBroj) {
					nBroj = skyline[i][j];
				}
			}
		}
	}
}