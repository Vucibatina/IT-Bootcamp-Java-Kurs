package ppp;

import java.util.Scanner;

public class NajCif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,max=0,c,tmp;
		System.out.println("N?");
		n=sc.nextInt();
		tmp=n;
		while(n>0) {
			c=n%10;
			n/=10;
			if(c>max) {
				max=c;
			}
			if(max==9)break;
		}
		System.out.println("Najveca cifra broja "+tmp+" je: "+max);
	}

}
