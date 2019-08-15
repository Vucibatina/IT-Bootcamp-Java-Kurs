package ppp;

import java.util.Scanner;

public class FibNiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		int a = 0, b = 1,i,t=0;
		if (n == 1)
			System.out.println(0);
		else if (n == 2)
			System.out.println(1);
		else {
			for(i=3;i<=n;i++) {
				t=a+b;
				a=b;
				b=t;
			}
			System.out.println(t);
		}
	}

}
