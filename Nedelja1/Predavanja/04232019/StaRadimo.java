package frodo;

import java.util.Scanner;

public class StaRadimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// I -> && ILI -> ||
		int x = sc.nextInt();

		if (x > 0)
			System.out.println("Broj je pozitivan!");
		else if (x < 0)
			System.out.println("Broj je negativan!");
		else
			System.out.println("Broj je nula!");

		/*if (x > 0) {
			if (x > 5)
				System.out.println("Poruka!");
			else
				System.out.println("Poruka111");
		}*/

	}

}
