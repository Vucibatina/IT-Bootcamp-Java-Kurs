package drugipaket;

import java.util.Scanner;

public class Nosivost {

	public static void main(String[] args) {
		/* Napisati progrma koji testira nosivost mosta na Adi.
		 * Korisnik unosi nosivost mosta, kao i masu tereta.
		 * Program ispisuje OK ukoliko most moze da ponese teret.
		 * U suprotnom program ispisuje NIJE OK.
		 */
		double nos,ter;
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesi nosivost:");
		nos=sc.nextDouble();
		System.out.println("Unesi teret:");
		ter=sc.nextDouble();
		if(nos>ter) {
			System.out.println("OK");
		}else if(nos==ter) {
			System.out.println("KRITICNO");
		}else {
			System.out.println("NIJE OK");
		}
	}

}
