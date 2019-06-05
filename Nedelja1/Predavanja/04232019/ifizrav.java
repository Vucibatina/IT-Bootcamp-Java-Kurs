package frodo;

import java.util.Scanner;

public class ifizrav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//I -> &&    ILI -> ||
		int x=sc.nextInt();
		if(x%5==0  && x%3==0) {
			System.out.println("Broj "+x+"je deljiv sa 3 i sa 5");
		}else {
			System.out.println("Broj nije deljiv sa 3 i 5");
		}
	}

}
