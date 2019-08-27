package drugipaket;

import java.util.Scanner;

public class Meseci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Mesec:");
		s = sc.nextLine();
		switch (s) {
		case "februar":
			System.out.println(28);
			break;

		case "januar":
		case "mart":
		case "maj":
		case "jul":
		case "avgust":
		case "oktobar":
		case "decembar":
			System.out.println(31);
			break;

		case "april":
		case "jun":
		case "septembar":
		case "novembar":
			System.out.println(30);
			break;

		default:
			System.out.println("Los unos");
			break;
		}

	}

}
