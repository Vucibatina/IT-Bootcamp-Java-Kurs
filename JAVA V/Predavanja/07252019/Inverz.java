package trecipaket;

import java.util.Scanner;

public class Inverz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,novB=0;
		n = sc.nextInt();
		while(n>0) {
			int c=n%10;
			novB*=10;
			novB+=c;
			n/=10;
		}
		System.out.println(novB);
	}

}
