package tel;

public class Broj {
	private String kod;
	private String pozivni;
	private String broj;
	private boolean fiksni;
	
	public Broj(String kod, String pozivni, String broj, boolean fiksni) {
		this.kod= kod;
		this.pozivni= pozivni;
		this.broj= broj;
		this.fiksni= fiksni;
	}
	
	public Broj() {
		
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getPozivni() {
		return pozivni;
	}

	public void setPozivni(String pozivni) {
		this.pozivni = pozivni;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public boolean isFiksni() {
		return fiksni;
	}

	public void setFiksni(boolean fiksni) {
		this.fiksni = fiksni;
	}
	
	public boolean istaDrzava(Broj b) {
		
		if (b.getKod().equals(kod) ) return true;
		else return false;
		
		/*
		boolean ret= true;
		if (! (b.getKod().equals(kod))) ret= false;
		return ret;
		*/
	}
	
	public String toString() {
		String s= "+" + kod + pozivni + broj;
		return s;
	}
	
	
}
