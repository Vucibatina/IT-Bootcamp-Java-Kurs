package dnu;

public class Pravougaonik {

	public static void main(String[] args) {
		stampajP(3,5,'+');
		stampajP(5,5,'*');
	}
	static void stampajP(int n, int k,char c) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
