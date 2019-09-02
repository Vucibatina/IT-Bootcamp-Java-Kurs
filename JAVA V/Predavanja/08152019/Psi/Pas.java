package psi;

/*
 * Za pse relevantne informacije su ime, rasa, starost, 
 * ime i prezime vlasnika, da li je udomljen.
 * Objekat klase Pas moze da se kreira sa ili bez informacije
 * o tome da li je udomljen.
 * Starost i informacija o udomljavanju mogu da se procitaju
 *  i da se promene. Ostale atribute nije moguce menjati nakon
 *  kreiranja.
 *  Napisati metodu koja ce ispisivati 'psa' u sledecem formatu:
 *      
 *      Ime: Dzeki
 *      Rasa: Retriver
 *      Starost: 2
 *      Vlasnik: Marko Peric
 *      Udomljen: da
 * Testirati prethhodno napisanu klasu.
 * 
 */
public class Pas {
	private String ime;
	private String rasa;
	private int starost;
	private String vlasnik;
	private boolean udomljen;
	
	public Pas (String ime, String rasa, int starost, String vlasnik, boolean udomljen) {
		this.ime = ime;
		this.rasa = rasa;
		this.starost = starost;
		this.vlasnik = vlasnik;
		this.udomljen = udomljen;
	}
	
	public Pas (String ime, String rasa, int starost, String vlasnik) {
		this.ime = ime;
		this.rasa = rasa;
		this.starost = starost;
		this.vlasnik = vlasnik;
	}
	
	public void setStarost(int godine) {
		starost = godine;
	}
	
	public int getStarost() {
		return starost;
	}
	
	public boolean getUdomljen() {
		return udomljen;
	}
	
	public void setUdomljen(boolean u) {
		udomljen = u;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getVlasnik() {
		return vlasnik;
	}
	
	public String ispisPsa() {
		String ispis = "";
		ispis = ispis + "Ime: " + ime + "\nRasa: " + rasa;
		ispis = ispis + "\nStarost: "  + starost;
		ispis = ispis + "\nVlasnik: " + vlasnik;
		ispis += "\nUdomljen: ";
		if (udomljen) ispis += "da";
		else ispis += "ne";
		
		return ispis;
	}
	
	
	
	
	
}
