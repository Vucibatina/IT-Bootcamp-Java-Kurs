import java.util.Scanner;

public class SredinaReci {

	/*
	 * Napisati metodu koja ce naci srednji karakter stringa 
	    koji mu se prosledjuje kao argument. 
	    Ukoliko niz znakova
	    ima paran broj elemenata onda ce vratiti dva 
		srednja karaktera.
	 */
	
	public static String nadjiSredinu( String rec) {
		int duzina = rec.length();
		if (duzina % 2 == 1) {
			// neparno
			return rec.substring(duzina/2, duzina/2 + 1);
		}
		else {
			return rec.substring(duzina/2 - 1, duzina/2 + 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String unetaRec = sc.next();
		System.out.println(nadjiSredinu(unetaRec));
		
	}

}
