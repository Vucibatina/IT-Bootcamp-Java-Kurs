package trecipaket;

import java.util.Scanner;

public class Petlje2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0,n;
		n = sc.nextInt();
		while(i<n) {
			if(i%4==0) {
				System.out.println(i);
			}
			i+=1;	
		}
		System.out.println("Kraj programa!");
	}
}
