package tel;

import java.util.LinkedList;

public class Korisnik {
	private Broj br;
	private LinkedList<Usluga> usluge;
	
	public Korisnik(Broj b, LinkedList<Usluga> listaUsluga) {
		br= b;
		usluge= listaUsluga;
	}
	
	public Korisnik(Broj b) {
		br= b;
		usluge= new LinkedList<Usluga>();
	}

	public Broj getBr() {
		return br;
	}

	public void setBr(Broj br) {
		this.br = br;
	}

	public LinkedList<Usluga> getUsluge() {
		return usluge;
	}

	public void setUsluge(LinkedList<Usluga> usluge) {
		this.usluge = usluge;
	}
	
	

}
