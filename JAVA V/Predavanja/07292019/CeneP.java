package ppp;

import java.util.Scanner;

public class CeneP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj?");
		int brPr = sc.nextInt();
		int cena, zbir = 0, kusur, novac;
		while (brPr > 0) {
			System.out.println("Unesi cenu pr: ");
			cena = sc.nextInt();
			if (cena > 0) {
				zbir += cena;
				brPr--;
			}
		}
		/*
		 * System.out.println("Unesi novac: "); while((novac=sc.nextInt())<= 0) { }
		 */
		do {
			System.out.println("Unesi novac: ");
			novac = sc.nextInt();
		} while (novac <= 0);
		if (novac < zbir) {
			System.out.println(":(");
		} else {
			kusur = novac - zbir;
			System.out.println("Kusur je: " + kusur);
			int b200, b100, b50, b20, b10, b5, b2, b1;
			b200 = b100 = b50 = b20 = b10 = b5 = b2 = b1 = 0;
			while (kusur > 0) {
				//ovde idu veci apoeni
				if (kusur >= 200) {
					kusur -= 200;
					b200++;
				} else if (kusur >= 100) {
					kusur -= 100;
					b100++;
				} else if (kusur >= 50) {
					kusur -= 50;
					b50++;
				} else if (kusur >= 20) {
					kusur -= 20;
					b20++;
				} else if (kusur >= 10) {
					kusur -= 10;
					b10++;
				} else if (kusur >= 5) {
					kusur -= 5;
					b5++;
				} else if (kusur >= 2) {
					kusur -= 2;
					b2++;
				} else if (kusur >= 1) {
					kusur -= 1;
					b1++;
				}

			}
			System.out.println("200:"+b200);
			System.out.println("100:"+b100);
			System.out.println("50:"+b50);
			System.out.println("20:"+b20);
			System.out.println("10:"+b10);
			System.out.println("5:"+b5);
			System.out.println("2:"+b2);
			System.out.println("1:"+b1);
			

		}

	}

}
