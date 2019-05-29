package izvodj;

public class Profesor extends Osoba {
	private String temaDoktorata;
	private String predmet;
	
	public Profesor(String i, String p, String lk, String jmbg, String dokt, String pred) {
		super(i, p, lk, jmbg);
		temaDoktorata = dokt;
		predmet= pred;
	}
	
	public String getTemaDoktorata() {
		return temaDoktorata;
	}
	
	public String getPredmet() {
		return predmet;
	}
	
	public void ispis() {
		System.out.println("Profesor: " + getIme() + " " + getPrezime());
	}
}
