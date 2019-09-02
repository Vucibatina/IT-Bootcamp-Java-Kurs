package bicikl;

public class Bicikl {
	private String tip;
	private String boja;
	private int visina;
	private Lampica[] l;
	private int brLampi;
	
	public Bicikl(String t, String boja, int visina) {
		tip = t;
		this.boja = boja;
		this.visina = visina;
		brLampi = 0;
		l = new Lampica[3];
	}
	
	public void podigniSediste (int k) {
		visina += k;
	}
	
	public void dodajLampu(Lampica lamp) {
		if (brLampi == l.length) System.out.println("Vec postoje tri lampe!");
		else {
			l[brLampi] = lamp;
			brLampi++;
		}
	}
	
	public void spustiSediste(int k) {
		visina -= k;
	}
	
	public Lampica getLampa(int pozicija) {
		//treba obavezno proveriti da li je
		//prosledjena pozicija ok
		if (pozicija<0 || pozicija>= brLampi) return null;
		else return l[pozicija]; 
	}
	
	public String stanjeSvihLampica() {
		String stanje = "\n";
		for (int i=0; i<l.length; i++) {
			if (l[i] != null) {
				stanje +=  l[i].vratiStanje() + "\n";
			}
		}
		return stanje;
	}
	
	
	
}
