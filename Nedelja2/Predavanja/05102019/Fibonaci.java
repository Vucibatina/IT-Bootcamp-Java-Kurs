package predavanja;

public class Fibonaci {
	/**
	 * Fibonacci program - Iterativna i rekurzivna varijanta
	 * 1,1,2,3,5,8,13....
	 *
	 */
	public static int fibonaciRekurzivno(int n) {
		if (n<=1) return 1;
		return fibonaciRekurzivno(n-1)+ fibonaciRekurzivno(n-2);
	}
	
	public static int fibonaciIterativno(int n) {
		int pre1=1, pre2=1;
		if (n<=1) return 1;
		for (int i=2; i<n; i++) {
			int pom= pre1;
			pre1= pre1+ pre2;
			pre2= pom;
		}
		
		return pre1+ pre2;
	}
	
	public static void main(String[] args) {
		int broj= fibonaciRekurzivno(6);
		int broj2= fibonaciIterativno(6);
		System.out.println(broj);
		System.out.println(broj2);

	}

}
