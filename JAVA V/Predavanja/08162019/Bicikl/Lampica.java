package bicikl;

/*
Lampa ima svoj status (on ili off) i boju kojom svetli. 
Bicikl ima svoj tip, boju, visinu sedista koja moze da 
se podesava i moze da sadrzi lampe. Moguce je procitati stanje svih 
lampica. Podrazumevati da ih ima najvise 3.
Testirati prethodno napisane klase.
*/

public class Lampica {
	private boolean status;
	private String boja;
	
	public Lampica (String boja) {
		this.boja = boja;
		status = false; // suvisno
	}
	
	public void ukljuci() {
		status = true;
	}
	
	public void iskljuci() {
		status = false;
	}
	
	public String vratiStanje() {
		String s = "Boja: " + boja;
		s += "\nStatus: ";
		if (status == true) {
			s+= "on";
		}
		else s+= "off";
		
		return s;
	}
}
