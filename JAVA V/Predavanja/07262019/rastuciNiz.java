package cetpak;

import java.util.Scanner;

public class rastuciNiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int x1,x2;
		boolean rastuci = true;
		System.out.println("Unesite broj n: ");
		n = sc.nextInt();
		System.out.println("Unesite 1.broj");
		x1 = sc.nextInt();
		
		for(int i = 0; i < n-1;i++) {
			System.out.println("Unesite " + (i+2) + ". broj");
			x2 = sc.nextInt();
			if(x2 < x1) {
				rastuci = false;
				break;
			}
			x1 = x2;
		}
		if(rastuci)
			System.out.println("Niz je rastuci");
		else
			System.out.println("Niz nije rastuci");
	}

}
