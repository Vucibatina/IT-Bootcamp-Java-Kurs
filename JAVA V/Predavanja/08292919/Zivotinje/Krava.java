package zivotinje;

public class Krava extends Zivotinja{
	private double kolicinaMleka;
	
	public Krava (String vrsta, String ime, String boja, int starost, double kolicinaMleka) {
		super(vrsta, ime, boja, starost);
		this.kolicinaMleka = kolicinaMleka;
	}
	
	public double getKolicinaMleka() {
		return kolicinaMleka;
	}

}
