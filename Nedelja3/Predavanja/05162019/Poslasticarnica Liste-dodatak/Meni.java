package posl;

import java.util.LinkedList;
import java.util.List;

public class Meni {
	
	private Stavka[] meni;
	
	public LinkedList<Stavka> stavkePoCeni(double c) {
		LinkedList<Stavka> stavke= new LinkedList<Stavka>();
		
		for (int i=0; i< meni.length; i++) {
			if (meni[i].dohvatiCenu() == c) {
				stavke.add(meni[i]);
			}
		}
		
		return stavke;
	}
	
	public Meni( int brStavki) {
		meni= new Stavka[brStavki];
	}
	
	public int duzina() {
		return meni.length;
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
