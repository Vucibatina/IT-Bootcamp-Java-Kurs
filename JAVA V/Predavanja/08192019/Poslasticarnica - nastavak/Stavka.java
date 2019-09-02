package poslasticarnica;

public class Stavka {
	
	private String naziv;
	private double cena;
	private boolean dostupno;
	
	public Stavka(String n, double c) {
		naziv = n;
		cena = c;
		dostupno = true;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public boolean isDostupno() {
		return dostupno;
	}

	public void setDostupno(boolean dostupno) {
		this.dostupno = dostupno;
	}
	
	
	
	
	
	
	
	
}
