package tel;

public class Poziv extends Usluga {
	private int trajanje;
	private double cenaUsp;
	private double cenaZapMin;
	
	
	
	public Poziv(Broj inic, Broj prim, int trajanje) {
		super(inic, prim);
		this.trajanje = trajanje;
		//this.cenaUsp = cenaUsp;
		//this.cenaZapMin = cenaZapMin;
		if (inic.istaDrzava(prim) == true) {
			cenaUsp = 0;
			cenaZapMin= 10;
		}
		else {
			cenaUsp= 30;
			cenaZapMin= 50;
		}
		
		//if (inic.getKod().equals(prim.getKod())) { }
	}

	public double cenaUsluge() {
		double cena = 0;
		if (trajanje>0) {
			cena += cenaUsp + cenaZapMin*(trajanje/60 +1);
		}
		return cena;
	}
	
	
	public String toString() {
		String str= super.toString() + " " + 
	                trajanje/60 + ":" + trajanje%60;
		return str;
	}

}
