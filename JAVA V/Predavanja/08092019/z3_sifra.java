package pet_09_08;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class z3_sifra {
	
	/*
	 * 
	 Napisati Java metodu koja ce proveravati da li je String 
	 validna sifra. 
 
	 Pravila na osnovu kojih se sifra proverava:
	
		Mora da ima najmanje deset karaktera.
		
		Sastoji se samo od slova i cifara.
		
		Mora da ima najmanje dve cifre.
		
		Ukoliko nije korektna, ispisati koje pravilo je 
		naruseno.
		
		Omoguciti da se sifra moze uneti ponovo ukoliko je bila pogresna.
		Ako je sifra validna, ispisati poruku da je sve u redu.
		 
	 */
	
	public static boolean jeCifra(char c) {
		if (c>= '0' && c<= '9') return true;
		else return false;
	}
	
	public static boolean jeSlovo (char c) {
		if ( (c>= 'a' && c<= 'z') || (c>= 'A' && c<= 'Z') ) return true;
		else return false;
	}
	
	public static boolean proveriSifru (String sifra) {
		boolean uspesno = true;
		
		if (sifra.length() < 10) {
			System.out.println("Duzina sifre mora biti barem 10 karaktera!");
			uspesno = false;
		}
		
		for (int i=0; i<sifra.length(); i++) {
			char c = sifra.charAt(i);
			if ( !(jeCifra(c) || jeSlovo(c))) {
				// !jeCifra(c) && !jeSlovo(c)
				// jeCifra(c)==false && jeSlovo(c)==false
				
				System.out.println("Sifra se mora sastojati samo od slova i cifara!");
				uspesno = false;
			}
		}
		
		return uspesno;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Uneti sifru: ");
		String sifra = sc.next();
		
		while (proveriSifru(sifra) == false) {
			System.out.println("Pokusajte ponovo: ");
			sifra = sc.next();
		}	

	}

}
