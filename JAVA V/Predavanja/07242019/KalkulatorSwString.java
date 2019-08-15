package drugipaket;

import java.util.Scanner;

public class KalkulatorSwString {
	public static void main(String[] args) {
		/*
		 * Napisati program gde KORISNIK
		 *  unosi String S
		 * Zatim brojeve A i B,
		 * Program ispisuje u zavisnosti od unesenog
		 * stringa zbir,razliku, prozivod i kolicnik
		 * */
		Scanner sc = new Scanner(System.in);
		int a, b;
		String s;
		System.out.println("Operacija:");
		s=sc.nextLine();
		System.out.println("A:");
		a = sc.nextInt();
		System.out.println("B:");
		b = sc.nextInt();

		switch(s) {
		case "sabiranje":System.out.println(a+b);break;
		case "oduzimanje":System.out.println(a-b);break;
		case "mnozenje":System.out.println(a*b);break;
		default: System.out.println("Los Unos!");break;
		}

	}
}
