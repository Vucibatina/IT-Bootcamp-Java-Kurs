package drugipaket;

import java.util.Scanner;

public class PovrsinaObimKuga {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double r,p,o;
		System.out.println("Unesi poluprecnik: ");
		r=sc.nextDouble();
		
		if(r>0) {
			p=r*r*Math.PI;
			o=2*r*Math.PI;
			System.out.println("Povrs kruga od " + r +" je "+p);
			System.out.println("Obim kruga od " + r +" je "+o);
		}else {
			System.out.println("Los unos!");
		}

	}

}
