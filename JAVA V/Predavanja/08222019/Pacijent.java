package pncpp;

import java.time.LocalDate;

public class Pacijent extends Covek{

	private String alergije;
	public Pacijent(String imePrezime, LocalDate datumRodjenja) {
		super(imePrezime, datumRodjenja);
		
	}
	public String getAlergije() {
		return alergije;
	}
	public void setAlergije(String alergije) {
		this.alergije = alergije;
	}
	
}
