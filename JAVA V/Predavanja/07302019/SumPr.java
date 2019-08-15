package dnu;

import java.util.Scanner;

public class SumPr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k=10;
		System.out.println("n?");
		n=sc.nextInt();
		int s=suma(n);
		int s2=suma(k);
		System.out.println(s);
		System.out.println(proizvod(n));
		s+=10;
	}
	static int suma(int n) {
		int i,s=0;
		for(i=0;i<=n;i++) {
			s+=i;
		}
		return s;
	}
	static int proizvod(int n) {
		int i,s=1;
		for(i=1;i<=n;i++) {
			s*=i;
		}
		return s;
	}
}
