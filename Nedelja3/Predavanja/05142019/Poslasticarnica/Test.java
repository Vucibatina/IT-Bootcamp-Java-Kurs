package posl;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Stavka s1= new Stavka("limunada");
		s1.promeniCenu(150.99);
		s1.postaviDostupno();
		
		Stavka s2= new Stavka("kafa", 120, true);
		
		Stavka s3= new Stavka("reforma");
		s3.promeniCenu(200);
		s3.postaviDostupno();

		Stavka s4= new Stavka("dobos");
		s4.promeniCenu(210);
		s4.postaviNedostupno();
		
		System.out.println("Uneti broj stavki.");
		Scanner s= new Scanner(System.in);
		int brojStavki= s.nextInt();
		Meni m= new Meni(brojStavki);
		m.postaviStavku(0, s1);
		String str= m.dohvatiStavku(0).dohvatiNaziv();
		System.out.println(str);
		m.postaviStavku(0, s2);
		System.out.println(m.dohvatiStavku(0).dohvatiNaziv());
		
		
		System.out.println(s1.dohvatiNaziv());
		System.out.println(s1.dohvatiCenu());
		
		
		System.out.println("\n\n");
		System.out.println(m.dohvatiStavku(0));
		
		s.close();

	}

}
