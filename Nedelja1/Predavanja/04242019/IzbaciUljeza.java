package yadaci12345;

import java.util.Scanner;

public class IzbaciUljeza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int a=5,c=4;
		//boolean uslov=a>c;
		boolean uslov=true;
		while(uslov) {
			System.out.println("Unesite neki broj:");
			int n=sc.nextInt();
			if(n==0) {
				break;
			}
			System.out.println("Uneli ste broj "+ n);
		}
		System.out.println("Uneta je nula");
	}

}
