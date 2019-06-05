package yadaci12345;

import java.util.Random;
import java.util.Scanner;

public class SumaPoz {

	public static void main(String[] args) {
		//Napisati program koji unosi brojeve. 
		//Unete brojeve dodaje na sumu ukoliko su pozitivni
		//Ukoliko se unese 0, program mora da se prekine i da ispise
		//sumu
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		while(true) {
			System.out.println("Racunar generise N: ");
			//int n=sc.nextInt();
			Random r= new Random();
			int n=r.nextInt(10);
			System.out.println("Racunar je generisao "+n);
			if(n>0) {
				sum+=n;
				System.out.println("Trenutna suma je: "+sum);
			}
			else if(n==0) {
				break;
			}
		}
		System.out.println("Konacna suma je: "+sum);
	}

}
