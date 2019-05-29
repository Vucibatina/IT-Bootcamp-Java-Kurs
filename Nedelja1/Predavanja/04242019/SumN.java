package yadaci12345;

import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		/*
		 * Napisati program koji sumira brojeve od
		 * 1 do N. Gde je N broj koji unosi korisnik
		 * 
		 * Primer: Za broj 5 rezultat je 15
		 * 
		 * 		   Za broj 6 rezultat je 21
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n: ");
		int n= sc.nextInt(),i=1,sum=0;
		while(i<=n) {
			//sum=sum+i;
			sum+=i;
			i+=1;
			//i=i+1;
		}
		System.out.println("Suma prvih " + n+" brojeva je: "+sum);

	}

}
