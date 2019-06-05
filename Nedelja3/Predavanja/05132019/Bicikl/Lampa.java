package bicikli;

public class Lampa {
/*
Lampa ima svoj status (on ili off) i boju kojom svetli. 
Bicikl ima svoj tip, boju, visinu sedista koja moze da 
se podesava i moze da sadrzi lampe.
*/
	private boolean ukljucena;
	private String boja;
	private int jacina;
	
	public Lampa (boolean u, String b, int j) {
		ukljucena= u;
		boja= b;
		jacina= j;
	}
	
	public boolean getUkljucena() {
		return ukljucena;
	}
	
	public String getBoja() {
		return boja;
	}
	
	public int getJacina() {
		return jacina;
	}
	
	public String toString() {
		String str= "status: " + ukljucena +"\n";
		str += "boja: " + boja;
		return str;
	}
	

}
