package vezbanja;

import java.util.Scanner;

public class Z1 {

	public static void main(String[] args) {
		// Most ima nosivost 2000kg.
		// Napisati program koji prvo ucitava broj automobila
		// koji dolaze na most a zatim njihove tezine.
		// Proveriti da li most moze da podrzi sve automobile
		Scanner sc = new Scanner(System.in);
		int nmosta = 2000;
		System.out.println("Dobrodisli u simulator!");
		System.out.println("Unesite broj automobila: ");
		int n = sc.nextInt(), sumt = 0, p;
		while (n > 0) {
			System.out.println("Unesi masu automobila!");
			p = sc.nextInt();
			sumt += p;
			n -= 1;
		}
		if (sumt <= nmosta) {
			System.out.println("Most moze da izdrzi masu " + sumt);
		} else {

			System.out.println("Most ne moze da izdrzi masu " + sumt);
		}
	}

}
