package primeri;

import java.util.Scanner;

public class Primer3 {
	/*
	 * Napisati Java metodu koja ce proveravati da li je String 
	 * validna sifra. 
	 * 
	Pravila na osnovu kojih se sifra proverava:
	Mora da ima najmanje deset karaktera.
	Sastoji se samo od slova i cifara.
	Mora da ima najmanje dve cifre.
	Ukoliko nije korektna, ispisati koje pravilo je naruseno.
	Omoguciti da se sifra moze uneti ponovo ukoliko je bila pogresna.
	Ako je sifra validna, ispisati poruku da je sve u redu.
		 
	 */
	
	public static boolean validacija (String sifra) {
		boolean validno= true;
		
		if (sifra.length()<10) {
			System.out.println("Vasa sifra je previse kratka!");
			validno= false;
		}
		
		int brojacCifara= 0;
		
		for (int i= 0; i< sifra.length(); i++) {
			char c= sifra.charAt(i);
			
			if ( !( (c>= 'a' && c<= 'z') || (c >= 'A' && c<= 'Z') || 
					(c>= '0' && c<= '9')) ) {
				validno= false;
				System.out.println("Vasa sifra se mora satojati"
						+ " samo od slova i brojeva! Pogresan karakter je: " +
						c);
			}
			
			if (c>= '0' && c<= '9') {
				brojacCifara++;
			}
		}
		
		if (brojacCifara <2) {
			System.out.println("Vasa sifra mora sadrzati barem dve cifre!");
			validno= false;
		}
		
		return validno;
	
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		String sifra= s.next();
		
		boolean okSifra = validacija(sifra);
		
		while (okSifra== false) {
			sifra= s.next();
			okSifra= validacija(sifra);
		}
		
		System.out.println("Uspesno ste postavili sifru!");

	}

}
