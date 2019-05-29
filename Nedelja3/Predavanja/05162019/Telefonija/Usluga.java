package tel;

public class Usluga {
	private Broj inicijator;
	private Broj primalac;
	private double cena;
	
	public Usluga(Broj inic, Broj prim, double cena) {
		this.inicijator= inic;
		this.primalac= prim;
		this.cena= cena;
	}
	
	public double getCena() {
		return cena;
	}
	
	public String toString() {
		String s ="";
		s+= inicijator;
		s+= "->" + primalac;	
		return s;
	}
}
