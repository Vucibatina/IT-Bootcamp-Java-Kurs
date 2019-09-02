package pncpp;

import java.time.LocalDate;

public class Covek {
	private String imePrezime;
	private LocalDate datumRodjenja;
	private String JMBG;
	
	public Covek(String imePrezime,LocalDate datumRodjenja){
		this.imePrezime=imePrezime;
		this.datumRodjenja=datumRodjenja;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}

	public LocalDate getDatumRodjenja() {
		return datumRodjenja;
	}
}
