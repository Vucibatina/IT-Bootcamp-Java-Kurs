package predavanja;

import java.util.Scanner;

public class Vezbanje {

	public static void main(String[] args) {
		boolean izlaz= false;
		
		while(izlaz==false) {
			System.out.println("Koja kljucna rec izlazi iz petlje u Java prograskom jeziku");
			System.out.println("a: int");
			System.out.println("b: break");
			System.out.println("c: continue");
			System.out.println("d: exit");
			
			Scanner s= new Scanner (System.in);
			String odgovor= s.next();
			
			if (odgovor.equals("b")) {
				System.out.println("Tacno ste odgovorili!");
				izlaz= true;
			}
			else {
				System.out.println("Vas odgovor je pogresan! Da li zelite da pokusate ponovo?");
				System.out.println("Ukucati y za da ili n za ne.");
				
				String nastavak= s.next();
				if (nastavak.equals("n") || nastavak.equals("N")) {
					izlaz= true;
				}
			}
		}

	}

}
