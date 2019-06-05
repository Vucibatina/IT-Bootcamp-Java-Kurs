package psi_pak;

public class Test {

	public static void main(String[] args) {
		Pas p= new Pas("Dzeki", "mesanac", 2, "Ivana", true);
		
		System.out.println(p.dohvatiIme());
		p.postaviGodine(3);
		
		System.out.println("Broj godina je sada: " + p.dohvatiBrGodina());
		
		System.out.println(p.ispisPsa());
		

	}

}
