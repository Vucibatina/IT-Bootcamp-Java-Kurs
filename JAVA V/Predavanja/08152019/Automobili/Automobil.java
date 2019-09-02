package cet_15_08;

public class Automobil {
	private String marka;
	private String model;
	private int godiste;
	private double cena;
	public String boja;
	
	public Automobil() {
		
	}
	
	public Automobil(double c, String marka, String mod, int god) {
		this.marka = marka;
		model = mod;
		
		if (god < 0) {
			godiste = 0;
			System.out.println("Uneli ste nevalidnu vrednost za godiste!");
		}
		else godiste = god;
		
		cena = c;	
	}
	
	public Automobil(String b, double c, String mar, String mod, int god) {
		marka = mar;
		model = mod;
		if (god < 0) {
			godiste = 0;
			System.out.println("Uneli ste nevalidnu vrednost za godiste!");
		}
		else godiste = god;
		cena = c;
		boja = b;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public boolean setGodiste(int g) {
		if (g>0) {
			godiste = g;
			return true;
		}
		else return false;
	}
	
	
	
}
