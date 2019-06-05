package psi_pak;

public class Pas {
	private String ime;
	private String rasa;
	private int brGodina;
	private String vlasnik;
	private boolean udomljen;
	
	
	public Pas(String i, String r, int br, String vl, boolean udom) {
		ime= i; 
		rasa= r;
		brGodina= br;
		vlasnik= vl;
		udomljen= udom;
	}
	
	public Pas(String i, String r, int br, String vl) {
		ime= i; 
		rasa= r;
		brGodina= br;
		vlasnik= vl;
		//udomljen= udom;
	}
	
	public String dohvatiIme() {
		return ime;
	}
	
	public int dohvatiBrGodina() {
		return brGodina;
	}
	
	public void postaviGodine(int br) {
		brGodina  = br;
	}
	
	public String ispisPsa() {
		String str= "Ime psa: " + ime + " Br godina: " + brGodina;
		return str;
	}
}
