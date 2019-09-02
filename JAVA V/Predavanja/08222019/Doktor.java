package pncpp;

import java.time.LocalDate;

public class Doktor extends  Covek{
	private String fakultet;
	private LocalDate datumZF;
	public Doktor(String imePrezime, LocalDate datumRodjenja,String fakultet,LocalDate datumZF) {
		super(imePrezime, datumRodjenja);
		this.fakultet=fakultet;
		this.datumZF=datumZF;
	}
	public String getFakultet() {
		return fakultet;
	}
	public LocalDate getDatumZF() {
		return datumZF;
	}
	
	public int getBrGIskustva() {
		LocalDate danDatum=LocalDate.now();
		int brGod=danDatum.getYear()-datumZF.getYear();
		return brGod;
	}
	
}
