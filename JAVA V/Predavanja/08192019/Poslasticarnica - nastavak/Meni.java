package poslasticarnica;

public class Meni {
	private Stavka[] artikli;
	private int brStavki;
	
	public Meni() {
		artikli = new Stavka[6];
		brStavki = 0;
	}
	
	public boolean dodajStavku(Stavka s) {
		if (brStavki == artikli.length) return false;
		else {
			artikli[brStavki++] = s;
			return true;
		}
	}
	
	public void ukloniStavku(int poz) {
		if (poz >=0 && poz < artikli.length) {
			artikli[poz] =null;
		}
	}
	
	public Stavka dohvatiStavku(int poz) {
		if (poz >=0 && poz < artikli.length) {
			return artikli[poz];
		}
		return null;
	}
	
	public String ispisStavki() {
		String s = "";
		for (int i=0; i<brStavki; i++ ) {
			s += i + ". ";
			s+= artikli[i].getNaziv() + "  " + artikli[i].getCena();
			s+= "\n";
		}
		return s;
	}
}
