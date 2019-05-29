package frodo;

import java.util.Scanner;

public class Elif {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//I -> &&    ILI -> ||
		int x=sc.nextInt();
		if(x==1) {
			System.out.println("Ponedeljak");
		}
		else if(x==2) {
			System.out.println("Utorak");
		}else if(x==3) {
			System.out.println("Sreda");
		}
		else if(x==4) {
			System.out.println("Cetvrtak");
		}
		else if(x==5) {
			System.out.println("Petak");
		}
		else if(x==6) {
			System.out.println("Subota");
		}
		else if(x==7) {
			System.out.println("Nedelja");
		}else {
			System.out.println("Greska u unosu!");
		}
	}
}
