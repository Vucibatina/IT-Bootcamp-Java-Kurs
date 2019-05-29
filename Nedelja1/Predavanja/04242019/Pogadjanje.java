package yadaci12345;

import java.util.Random;
import java.util.Scanner;

public class Pogadjanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Racunar generise neki nasumican broj
		 * Korisnik ima 5 pokusaja da pogodi taj broj
		 * Ukoliko unese broj koji je manji od generisanog, program
		 * treba da ispise poruku broj je veci
		 * Ukoliko unese broj koji je veci od generisanog, program treba
		 * da ispise poruku broj je manji.
		 * Ukoliko unese broj koji je isti generisanom broju
		 * program treba da ispise Pogodak.
		 * 
		 * Random r= new Random();
		 * int n=r.nextInt(25);
		 * */
		
		Scanner sc= new Scanner(System.in);
		Random r= new Random();
		
		
		int brP=5,n,i,x;
		System.out.println("Racunar generise neki slucajan broj.");
		x=r.nextInt(25);
		System.out.println(x);
		i=1;
		while(i<=brP)
		{
			System.out.println("Unesi neki broj: ");
			n=sc.nextInt();
			if(x>n) {
				System.out.println("Broj je veci!");
			}else if(x<n) {
				System.out.println("Broj je manji!");
			}else if(x==n) {
				System.out.println("Pogodak!");
				break;
			}
			i+=1;
		}
		
		

	}

}
