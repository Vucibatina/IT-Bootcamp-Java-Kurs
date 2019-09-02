package zivotinje;
/*
 * Za svaku zivotinju se cuvaju vrsta zivotinje, njeno ime,
 * boja i starost.
 * Krava je zivotinja za koju je vazno zapamtiti i prosecnu
 * kolicinu mleka koju daje.
 * Za psa da li ima pasos i da li je potrebno da nosi korpu.
 * Napraviti nekoliko krava i nekoliko pasa i onda ih sve 
 * dodati u jedan niz.
 */
public class Zivotinja {
	private String vrsta;
	private String ime;
	private String boja;
	private int starost;
	
	public Zivotinja(String vrsta, String ime, String boja, int starost) {
		super();
		this.vrsta = vrsta;
		this.ime = ime;
		this.boja = boja;
		this.starost = starost;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}
	
	
	
	
	
	
}
