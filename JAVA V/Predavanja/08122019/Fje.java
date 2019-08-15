package chnpp;

public class Fje {

	public static void main(String[] args) {
		int x = 5;
		fun(x);
		System.out.println(x);
	}

	static int fun(int x) {
		x *= x;
		return x;
	}

	static void ispisi(int a) {
		if (a % 2 == 0)
			return;
		System.out.println(a);
	}

	static void ispisi(String s) {
		System.out.println(s);
	}

	static double saberi(double a, double b) {

		return a + b;
	}

}
