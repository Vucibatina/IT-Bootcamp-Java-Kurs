package trecipaket;

import java.util.Scanner;

public class SumCif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		n = sc.nextInt();
		while(n>0) {
			int c=n%10;
			//System.out.println(c); //ispis cifre
			sum+=c;
			n/=10;
			
		}
		System.out.println(sum);
	}

}
