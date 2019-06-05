package tel;

public class Test {

	public static void main(String[] args) {
		Broj inicijator= new Broj("381", "11", "2975855", true);
		Broj primalac= new Broj("381", "65", "2979995", false);
		Poziv p= new Poziv(inicijator, primalac, 62);
		
		System.out.println(p);
	}

}
