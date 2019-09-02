package cet_15_08;

public class GlavniProgram {

	public static void main(String[] args) {
		Automobil a1 = new Automobil(15000.00, "volkswagen", "golf5", 2008);
		Automobil a2 = new Automobil("crvena", 1000, "yugo", "koral45", 1995);
		Automobil a3 = new Automobil();
		
		System.out.println(a2.getMarka());
		a2.setGodiste(-50);
		
		
		
		//a3.boja= "bela";
				
		//System.out.println(a2.godiste);
		//a2.godiste = 1998;
		//System.out.println(a2.godiste);
		
		/*System.out.println("Boja od a1 je: " + a1.boja);
		
		a1.boja= "crna";

		System.out.println("Boja od a1 je: " + a1.boja);
		*/
	}

}
