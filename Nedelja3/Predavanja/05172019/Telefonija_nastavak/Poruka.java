package tel;

public class Poruka extends Usluga {
	private String tekst;
	
	public Poruka (Broj b1, Broj b2, String t) {
		super(b1, b2);
		tekst= t;
	}
	
	public boolean poslata() {
		//if (!getInic().isFiksni() && !getPrim().isFiksni())
		//	return true;
		//else return false;
		
		if (getInic().isFiksni() || getPrim().isFiksni())
			return false;
		else return true;
	}

	@Override
	public double cenaUsluge() {
		double cena=0;
		if (poslata()) {
			if (getInic().istaDrzava(getPrim())) {
				cena= 3;
			}
			else cena= 20;
		}
		return cena;
	}
	
	public String toString() {
		String s = super.toString() + " " + tekst;
		return s;
	}
}
