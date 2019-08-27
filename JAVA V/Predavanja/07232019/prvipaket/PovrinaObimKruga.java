package prvipaket;

import java.util.Scanner;

public class PovrinaObimKruga {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double r,p,o;
		System.out.println("Unesi poluprecnik: ");
		r=sc.nextDouble();
		p=r*r*Math.PI;
		//System.out.print("Poruke");//Domaci - Istrazi
		//System.out.printf(format, args)();//Domaci - Istrazi
		//System.out.println("Povrs kruga od " + r +" je "+p);
		System.out.printf("Povrs kruga od %.3f je %.3f\n",r,p);
		o=2*r*Math.PI;
		System.out.println("Obim kruga od " + r +" je "+o);
		
	}

}
