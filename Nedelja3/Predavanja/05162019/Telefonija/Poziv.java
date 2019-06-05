package tel;

public class Poziv extends Usluga {
	private int trajanje;
	private double cenaUsp;
	private double cenaZapMin;
	
	
	
	public Poziv(Broj inic, Broj prim, double cena, int trajanje, double cenaUsp, double cenaZapMin) {
		super(inic, prim, cena);
		this.trajanje = trajanje;
		this.cenaUsp = cenaUsp;
		this.cenaZapMin = cenaZapMin;
	}

	public double cenaPoziva() {
		double cena = 0;
		if (trajanje>0) {
			cena += cenaUsp + cenaZapMin*(trajanje/60 +1);
		}
		return cena;
	}
}
