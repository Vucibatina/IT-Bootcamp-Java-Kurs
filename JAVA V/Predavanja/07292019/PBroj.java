package ppp;

import java.util.Scanner;

public class PBroj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n, i;
		boolean b = true;
		System.out.println("N?");
		n = sc.nextLong();
		if (n <= 3) {
			System.out.println("Jeste prost!");
		} else {
			i = 2;
			while (i < n) {
				if (n % i == 0) {
					b = false;
					break;
				}
				i++;
			}
			/*
			 * for(i=2;i<n;i++){ if(n%i==0){ b=false; break; } }
			 * 
			 * 
			 * 
			 */
			if (b == true) {
				System.out.println("Jeste prost!");
			} else {
				System.out.println("Nije prost!");
			}
		}
	}

}
