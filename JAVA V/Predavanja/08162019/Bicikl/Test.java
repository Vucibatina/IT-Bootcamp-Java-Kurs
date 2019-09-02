package bicikl;

public class Test {

	public static void main(String[] args) {
		int broj = 10;
		Lampica lampa1 = new Lampica("crvena");
		lampa1.ukljuci();
		System.out.println(lampa1.vratiStanje());
		
		Lampica lampa2 = new Lampica("crvena");
		
		Bicikl b1 = new Bicikl("gradski", "roze", 5);
		b1.dodajLampu(lampa1);
		b1.dodajLampu(lampa2);
		b1.getLampa(0).iskljuci();
		b1.getLampa(1).ukljuci();
		
		System.out.println(b1.stanjeSvihLampica());
		
		
		
	}

}
