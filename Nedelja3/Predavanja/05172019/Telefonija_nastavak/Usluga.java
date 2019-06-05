package tel;

public abstract class Usluga {
	private Broj inicijator;
	private Broj primalac;
	private double cena;
	
	public abstract double cenaUsluge();
	
	public Usluga(Broj inic, Broj prim) {
		this.inicijator= inic;
		this.primalac= prim;
		//this.cena= cena;
	}
	
	public double getCena() {
		return cena;
	}
	
	public void setCena(double novaCena) {
	     cena= novaCena;
	}
	
	public String toString() {
		String s ="";
		s+= inicijator;
		s+= "->" + primalac;	
		return s;
	}
	
	public Broj getPrim() {
		return primalac;
	}
	
	public Broj getInic() {
		return inicijator;
	}
}
