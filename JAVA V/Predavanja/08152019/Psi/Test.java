package psi;

public class Test {

	public static void main(String[] args) {
		Pas dzeki = new Pas("Dzeki", "retriver" , 2 , "Ivana Stepanovic");
		System.out.println(dzeki.getIme());
		System.out.println(dzeki.ispisPsa());
		
		dzeki.setUdomljen(true);
		System.out.println(dzeki.ispisPsa());

	}

}
