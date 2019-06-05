package vezbanja;

import java.util.Scanner;

public class Z3 {

	public static void main(String[] args) {
		//Palindrom i inverzan broj.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0, p,nb=0,pom;
		pom=n;
		while (n != 0) {
			nb*=10;
			p = n % 10;
			nb+=p;
			n = n / 10;
		}
		if(nb==pom)System.out.println("Broj je palindrom");
		else System.out.println("Broj nije palindrom!");
		System.out.println("Inverzni broj je: " + nb);
	}

}
