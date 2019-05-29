package vezbanja;

import java.util.Scanner;

public class Z4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0, pr=1,p;
		
		while (n != 0) {
			
			p = n % 10;
			if(p%2==0) {
				sum+=p;
			}
			else {
				pr*=p;
			}
			n = n / 10;
		}
		System.out.println("Suma\tparnih je: "+sum+"\nProizvod neparnih je: "+pr);
		
	}

}
