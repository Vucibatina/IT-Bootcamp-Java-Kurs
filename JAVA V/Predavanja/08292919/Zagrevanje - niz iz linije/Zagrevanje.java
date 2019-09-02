package zad1;

import java.util.Scanner;

public class Zagrevanje {
	

	public static void main(String[] args) {
	
		/*
		 *  Jedan niz celih brojeva ( int[]...) 
		 *  Hocu da ucitam jednu liniju sa standardnog ulaza
		 *  (celu liniju) (s.nextLine())
		 *  U toj liniji se nalaze svi elementi koje treba smestiti u 
		 *  kreirani niz  (pri cemu su elementi razdvojeni 
		 *  jednim razmakom) 
		 *  nakon ucitavanja linije.
		 */
		
		int[] nizBrojeva = new int[5];
		Scanner sc = new Scanner(System.in);
		String linija = sc.nextLine();
		
		String[] brojeviStr = linija.split(" ");
		
		for (int i=0; i<5; i++) {
			String broj = brojeviStr[i];
			
			nizBrojeva[i] = Integer.parseInt(broj) ;
		}
		
		
		
		

	}

}
