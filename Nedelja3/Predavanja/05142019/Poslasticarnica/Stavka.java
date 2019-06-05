package posl;

public class Stavka {
	private String naziv;
	private double cena;
	private boolean dostupna;
	
	public Stavka (String n) {
		naziv= n;
	}
	
	public Stavka (String n, double c, boolean dostupnost) {
		naziv= n;
		cena= c;
		dostupna= dostupnost;
	}
	
	public void promeniCenu(double novaCena) {
		cena= novaCena;
	}
	
	public void postaviDostupno() {
		dostupna= true;
	}
	
	public void postaviNedostupno() {
		dostupna= false;
	}
	
	public String dohvatiNaziv() {
		return naziv;
	}
	
	public double dohvatiCenu() {
		return cena;
	}
	
	public boolean dohvatiDostupna() {
		return dostupna;
	}
	
	public String toString() {
		String st= "Naziv: " + naziv;
		st += "\nCena: " + cena;
		if (dostupna== true) st+= "\nDostupna je.";
		else st+= "\nNedostupna je.";
		return st;
	}
}
