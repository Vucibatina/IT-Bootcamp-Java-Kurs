package primeri;

public class Primer1 {
	
	public static void nadjiNajmanji(int a, int b, int c) {
		int min= a;
		if (b< min) min= b;
		if (c< min) min= c;
		
		System.out.println(min);
		
		//return min;
	}

	public static void main(String[] args) {
		 nadjiNajmanji(10, 15, -5);
		// int namanji= nadjiNajmanji(10, 15, -5); ako metoda vraca int
	}

}
