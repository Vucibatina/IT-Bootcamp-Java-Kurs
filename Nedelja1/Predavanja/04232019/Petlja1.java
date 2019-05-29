package frodo;

import java.util.Scanner;

public class Petlja1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i;
		i=1;
		while(i<=n) {
			if(i%2==0) {
				System.out.println("Glavica kupusa "+i+ " je okej!");
			}
			else {
				System.out.println("GLavica kupusa "+i+" nije okej");
			}
			i=i+1;
		}
		
		
	}

}
