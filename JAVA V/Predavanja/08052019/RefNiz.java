package tnp;

public class RefNiz {

	public static void main(String[] args) {
		int a=5;
		int[] b;
		b=new int[5];
		b[3]=2;
		System.out.println(b[3]);
		int c=a;
		int[] d;
		d=b;
		d[3]=7;
		System.out.println(b[3]);
	}

}
