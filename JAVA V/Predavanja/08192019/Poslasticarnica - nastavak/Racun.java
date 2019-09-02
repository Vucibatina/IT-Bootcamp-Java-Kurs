package poslasticarnica;

public class Racun {
	private Stavka[] stavke;
	private int brStavki = 0;
	
	
	public Racun(Stavka[] nizStavki) {
		stavke = nizStavki;
	}
	
	public Stavka[] getStavke() {
		return stavke;
	}
	
	public double ukupanIznos() {
		double iznos = 0;
		for (int i=0; i<stavke.length; i++) {
			iznos += stavke[i].getCena();
		}
		return iznos;
	}
	
	public void unesiStavku(Stavka s) {
		if (brStavki < stavke.length) {
			stavke[brStavki++] = s;
		}
	}
	
	
	
}
