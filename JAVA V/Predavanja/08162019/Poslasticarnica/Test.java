package poslasticarnica;

public class Test {

	public static void main(String[] args) {
		Stavka s1 = new Stavka("Reforma", 220);
		Stavka s2 = new Stavka("Limunada", 200);
		
		Meni m = new Meni();
		m.dodajStavku(s1);
		m.dodajStavku(s2);

	}

}
