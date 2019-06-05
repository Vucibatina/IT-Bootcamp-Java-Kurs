package posl;

public class Meni {
	private Stavka[] meni;
	
	public Meni( int brStavki) {
		meni= new Stavka[brStavki];
	}
	
	public Stavka dohvatiStavku(int pozicija) {
		if (pozicija<0 || pozicija> meni.length) {
			System.out.println("Neadekvatna pozicija!");
			return null;
		}
		return meni[pozicija];
	}
	
	public void postaviStavku(int pozicija, Stavka s) {
		if (pozicija<0 || pozicija> meni.length) {
			System.out.println("Neadekvatna pozicija!");
			return;
		}
		//meni[pozicija]= s;
		if (meni[pozicija] != null) {
			System.out.println("Stavka na toj poziciji vec postoji!");
		}
		else {
			meni[pozicija]= s;
		}
	}
}
