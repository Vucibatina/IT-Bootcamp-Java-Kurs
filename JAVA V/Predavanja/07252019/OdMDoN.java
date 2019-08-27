package trecipaket;

import java.util.Scanner;

public class OdMDoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n,d,g;
		m = sc.nextInt();
		n = sc.nextInt();
		if(m>n) {
			int c;
			c=m;
			m=n;
			n=c;
		}
		for(;m<=n;m+=1) {
			System.out.println(m);
		}
	}

}
