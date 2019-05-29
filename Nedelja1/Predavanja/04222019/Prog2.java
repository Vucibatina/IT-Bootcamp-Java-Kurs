package frodo;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program koji racuna obim kvadrata
		//Formula za obim kvadrata je: 4*a ; gde je a stranica kvadrata
		
		//Preformulisati program tako da proverava unos stranice.
		//Ukoliko je uneta stranica veca od 0 onda se ispisuje obim
		//U suprotnom se ispisuje poruka "Greska".
		
		Scanner sc=new Scanner(System.in);
		
		int a;
		System.out.println("Unesi vrednost a:");
		a=sc.nextInt();
		if(a>0) {
		int o=4*a;
		System.out.println(o);
		}else {
			System.out.println("Greska!");
		}
	}

}
