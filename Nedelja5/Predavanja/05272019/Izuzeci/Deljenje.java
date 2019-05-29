package izuzeci;

import java.util.Scanner;

public class Deljenje {

	public static void main(String[] args) {
		boolean kraj = false;
		while (kraj == false) {
			try {
				Scanner sc= new Scanner(System.in);
				System.out.println("Uneti dva broja: ");
				int br1 = sc.nextInt();
				int br2 = sc.nextInt();
				int rez= br1/ br2;
				
				System.out.println("Rezultat deljenja je: " + rez);
				kraj = true;
			}
			catch (java.lang.ArithmeticException e) {
				System.out.println("Nije dozvoljeno deljenje sa nulom!");
			}
		}
		
		
	}

}
