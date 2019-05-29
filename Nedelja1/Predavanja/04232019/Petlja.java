package frodo;

import java.util.Scanner;

public class Petlja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj ponavljanja: ");
		int n= sc.nextInt();
		
		while(n>0) {
			System.out.println("Hello World!");
			n=n-1;
		}

	}

}
