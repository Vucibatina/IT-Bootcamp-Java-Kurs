package pice;

public class Pica {
	public static final double PI = 3.14159;
	private String naziv;
	private double  cena;
	private static int brProdatih=0; //ukupno prodatih
	private static double zarada = 0;
	//private static double zarada = 0;

	private double r;
	
	public Pica(String naziv, double cena, double r) {
		super();
		this.naziv = naziv;
		this.cena = cena;
		this.r = r;
	}
	
	public Pica(String naziv, double r) {
		super();
		this.naziv = naziv;
		this.r = r;
		cena = 500;
		
	}
	
	public double povrsina() {
		return r*r*PI;
	}
	
	public void kupiPicu(int broj) {
		brProdatih += broj;
		zarada += cena*broj;
	}
	
	public void kupiPicu() {
		brProdatih ++;
		zarada += cena; 
	}


	public String getNaziv() {
		return naziv;
	}


	public double getCena() {
		return cena;
	}


	public static int getBrProdatih() {
		return brProdatih;
	}


	public static double getZarada() {
		return zarada;
	}
	
	public void cena (double novaCena) {
		cena = novaCena;
	}
	
	public void cena() {
		System.out.println("Cena je: " + cena);
	}
	
	
	
	
	
	
}
