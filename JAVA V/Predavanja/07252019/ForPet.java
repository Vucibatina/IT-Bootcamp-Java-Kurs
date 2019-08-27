package trecipaket;

import java.util.Scanner;

public class ForPet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n;
		n = sc.nextInt();
		for (i = 0; i < n; i += 1) {
			if (i % 4 == 0)
				System.out.println(i);
		}
		System.out.println("Kraj programa!");

	}

}
