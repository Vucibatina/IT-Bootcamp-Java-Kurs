package frodo;

import java.util.Scanner;

public class ParNepar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//  {} 
		int x;
		// _x x x123
		x=sc.nextInt();
		if(x%2 == 0) {
			System.out.println("Broj "+x+" je paran!");
		}
		else{
			System.out.println("Broj "+x+" je neparan!");
		}
	}

}
