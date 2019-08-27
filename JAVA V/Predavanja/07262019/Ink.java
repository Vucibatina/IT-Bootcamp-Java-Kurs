package cetpak;

public class Ink {

	public static void main(String[] args) {
		int i,j,k;
		i=10;
		j=i++;
		j=++i;
		k=j--;
		k=--j;
		j--;
		//--------
		i=15;
		j=7;
		k=8;
		k=i--;
		j=k++;
		i=++k;
		j=k++ + ++i;
		
		k=j-- + i++ + k;
		
	}

}
