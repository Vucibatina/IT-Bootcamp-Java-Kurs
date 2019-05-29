package bicikli;

public class Bicikl {
	private String tip;
	private int visinaSedista;
	private Lampa l;
	
	public Bicikl (String t, int visina, Lampa lampa) {
		tip= t;
		visinaSedista= visina;
		l= lampa;
	}
	
	public void ispis() {
		System.out.println("tip: " + tip);
		System.out.println("visina: " + visinaSedista);
		System.out.println("lampa \n" + l);
	}
}
