package chnpp;

import java.util.Random;
import java.util.Scanner;

public class Flip {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Unesite broj kolona: ");
		int kol = sc.nextInt();
		System.out.println("Unesite broj redova: ");
		int red = sc.nextInt();
		int [][] matrica = new int [kol][red];
		unesiNiz (matrica);
		ispisiNiz(matrica);
		mirror(matrica);
		System.out.println("Okrenuto je:");
		ispisiNiz (matrica);
		
		
		
	}
	
	static void unesiNiz(int[][] a) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				int element = r.nextInt(1000);
				a[i][j] = element;
			}
		}
	}
	
	static void mirror (int [][] a) {
		int i = 0;
		int [][] mirror = new int [a.length][a[i].length];
		for ( i = 0 ; i < a.length; i++) {
			int z = a[i].length-1;
			for (int j = 0; j < a[i].length; j++, z--) {
				mirror[i][j] = a[i][z];
			}
		}
	}
	
	static void ispisiNiz(int[][] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}	


}
