package dnu;

public class Funkcije22 {

	public static void main(String[] args) {
		System.out.println(sum1(1000));

	}

	static double sum1(int n) {
		double s=0;
		for(double i=1;i<=n;i++) {
			s+=1/i;
		}
		return s;
	}
}
