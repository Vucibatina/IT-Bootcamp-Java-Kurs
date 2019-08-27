package chnpp;

import java.util.Scanner;

public class CezarSifrovanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Upisite rec koju zelite da sifrujete");
		String rec = sc.nextLine();
		System.out.println("Broj za koji zelite da pomerite svako slovo: ");
		int n = sc.nextInt();
		String sifrovan = sifruj(rec, n);
		System.out.println(sifrovan);
	}

	static String sifruj(String rec, int n) {
		String sifrovan = "";
		for (int i = 0; i < rec.length(); i++) {
			char slovo = rec.charAt(i);
			if (slovo >= 'a' && slovo <= 'z') {
				sifrovan += (char) ((slovo - 97 + n) % 26 + 97);
			}

			else if (slovo >= 'A' && slovo <= 'Z') {
				sifrovan += (char) ((slovo -'A' + n) % 26 + 'A');
			} else {
				sifrovan += slovo;
			}
		}
		return sifrovan;
	}
}
