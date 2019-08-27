package cetpak;

import java.util.Scanner;

public class Brk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, zbir = 0;
		while (true) {
			System.out.println("N?");
			n = sc.nextInt();
			if (n % 2 == 1) {
				continue;
			} else if (n == 0) {
				break;
			}
			zbir += n;
		}
		System.out.println(zbir);

	}

}
