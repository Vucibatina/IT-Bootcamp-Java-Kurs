package auto;

public class Automobil {
	public static int IDglobal= 1;
	public static final double pi= 3.14;
	public static int duzina= 10;
	
	private int id;
	private String model;
	private String marka;
	private double cena;
	private final int godiste;
	private String boja;
	
	public Automobil(String model, String mar, double c, int g, String b) {
		this.model= model;
		marka= mar; 
		cena= c;
		godiste= g;
		boja= b;
		id= IDglobal;
		IDglobal++;
	}
	
	public static double zbirDveCene(Automobil a1, Automobil a2) {
		return a1.getCena() + a2.getCena();
	}
	
	public double zbirDve(Automobil a2) {
		return a2.getCena() + cena;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		godiste = godiste;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public int getId() {
		return id;
	}
	
	
	
}
