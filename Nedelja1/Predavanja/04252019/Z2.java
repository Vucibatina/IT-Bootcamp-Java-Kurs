package vezbanja;

import java.util.Scanner;

public class Z2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),sum=0,p;
		while(n!=0) {
			p=n%10;
			sum+=p;
			n=n/10;
		}
		System.out.println("Suma cifara je: "+sum);
	}

}
