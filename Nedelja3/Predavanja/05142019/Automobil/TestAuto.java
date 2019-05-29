package auto;

public class TestAuto {

	public static void main(String[] args) {
		Automobil a1= new Automobil("golf7", "volkswagen", 16000, 2017, "crna" );
		String s= " " + a1.getCena();
		System.out.println(s);
		
		a1.setGodiste(2008);
		s= " " + a1.getGodiste();
		System.out.println(s);
		System.out.println("idGlobalno: " + Automobil.IDglobal );
		
		Automobil a2= new Automobil ("koral45", "yogo", 500, 1995, "crvena" );
		System.out.println("id je: " + a2.getId());
		System.out.println("id globalno: " + Automobil.IDglobal);
	}

}
