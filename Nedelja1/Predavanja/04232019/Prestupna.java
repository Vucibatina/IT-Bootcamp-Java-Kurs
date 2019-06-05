package frodo;

import java.util.Scanner;

public class Prestupna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//I -> &&    ILI -> ||
		int x=sc.nextInt();
		if((x%4==0 && x%100!=0) || x%400==0) {
			System.out.println("Godina"+x+" je prestupna");
		}
		else {
			System.out.println("Godina"+x+" nije prestupna");
		}
	}

}
