package drugipaket;

import java.util.Scanner;

public class Parnost {

	public static void main(String[] args) {
		/*
		 * Napisati prgoram koji za uneti broj
		 * proverava da li je paran ili neparan
		 * */
		Scanner sc= new Scanner(System.in);
		int br;
		System.out.println("Unos");
		br=sc.nextInt();
		if(br%2==0) {
			System.out.println("PARAN");
		}
		else {
			System.out.println("NEPARAN");
		}
	}

}
