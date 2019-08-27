package drugipaket;

import java.util.Scanner;

public class KalkulatorSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, o;
		System.out.println("A:");
		a = sc.nextInt();
		System.out.println("B:");
		b = sc.nextInt();
		System.out.println("O:");
		o = sc.nextInt();
		switch(o) {
		case 0:System.out.println(a+b);break;
		case 1:System.out.println(a-b);break;
		case 2:System.out.println(a*b);break;
		default: System.out.println("Los Unos!");break;
		case 3: System.out.println(a%b);break;
		}

	}

}
