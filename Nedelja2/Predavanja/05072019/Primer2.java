package primeri;

public class Primer2 {
	
	/*
	    Napisati metodu koja ce naci srednji karakter stringa 
	    koji mu se prosledjuje kao argument. Ukoliko niz znakova
	    ima paran broj elemenata onda ce vratiti dva 
		srednja karaktera.
		
		
		Napisati metodu koja ce da izbroji samoglasnike u prosledjenoj 
		reci.
		Napisati metodu koja ce da izbroji reci u prosledjenom 
		String-u.		
		Testirati prethodno napisane metode.
	 */
	
	public static String nadjiSredinu (String rec) {
		String sredina;
		int duzina= rec.length();
		
		int brojac= 0;
		
		for (int i= 0; i< rec.length(); i++) {
			char znak= rec.charAt(i);
			if ( znak == 'a' || znak == 'e' || znak=='i' || znak== 'o' 
					|| znak== 'u') {
				brojac++;
			}
		}
		System.out.println("Broj samoglasnika je: " + brojac);
		
		if (duzina % 2 == 0) {
			/*
			 * d 0
			 * u 1
			 * g 2
			 * o 3
			 * 
			 * duzina = 4; duzina/2 -> 2
			 */
			
			sredina= rec.substring(duzina/2-1, duzina/2+1);
		}
		else {
			sredina= rec.substring(duzina/2, duzina/2+1);
		}
		return sredina;
		
	
	}

	public static void main(String[] args) {
		
		String sredinaReci = nadjiSredinu("recima");
		System.out.println(sredinaReci);

	}

}
