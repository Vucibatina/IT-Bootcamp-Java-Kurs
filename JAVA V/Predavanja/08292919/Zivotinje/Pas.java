package zivotinje;

public class Pas  extends Zivotinja{
	private boolean pasos;
	private boolean korpa;
	
	public Pas(String vrsta, String ime, String boja, int starost, boolean pasos, boolean korpa) {
		super(vrsta, ime, boja, starost);
		this.pasos = pasos;
		this.korpa = korpa;
	}

	public boolean isPasos() {
		return pasos;
	}

	public boolean isKorpa() {
		return korpa;
	}
	
	
	
	
}
