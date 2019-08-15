import java.util.Scanner;

public class TrazenjeReci {
	
	/*
	 * Napraviti niz koji ce da sadrzi reci. 
	 * Sve dok korisnik ne unese rec "stop"
	 * traziti da unese neku rec, 
	 * i vratiti da li ta rec postoji u nizu ili ne. 
	 * Ako
	 * postoji vrati i na kom mestu u nizu se nalazi. 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] reci = {"sto", "tabla", "racunar", "voda"};
		Scanner s= new Scanner(System.in);
		
		String uneto = s.next();
		
		while (!uneto.equals("stop")) {
			// while (uneto.equals("stop") == false) ....

			int i;
			for (i=0; i< reci.length; i++) {
				
				if (reci[i].equals(uneto)) {
					//pronasla sam unetu rec u svom nizu
					System.out.println("Pronasli ste rec na poziciji " + i);
					break;
				}
			}
			if (i == reci.length) System.out.println("Rec ne postoji u nizu!");
			
			uneto = s.next();
		}
		
		
		

		
		
		
	}

}
