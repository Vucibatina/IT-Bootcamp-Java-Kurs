package poslasticarnica;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Stavka s1 = new Stavka("Reforma", 220);
		Stavka s2 = new Stavka("Limunada", 200);
		Stavka s3 = new Stavka("Moskva", 180);
		
		Meni m = new Meni();
		m.dodajStavku(s1);
		m.dodajStavku(s2);
		m.dodajStavku(s3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj stavki koje zelite da otkucate: ");
		int n = sc.nextInt();
		
		Racun r = new Racun(new Stavka[n]);
		System.out.println("Odabrati stavke: ");
		System.out.println(m.ispisStavki());
		
		for (int i=0; i<n; i++) {
			System.out.println("Uneti broj stavke: ");
			int redniBr = sc.nextInt(); //stavka u meniju
			
			Stavka st = m.dohvatiStavku(redniBr);
			r.unesiStavku(st);
				
			//r.unesiStavku(m.dohvatiStavku(redniBr));
			
		}
		
		System.out.println("Ukupan iznos: " + r.ukupanIznos());

	}

}
