package zivotinje;

public class Testiranje {

	public static void main(String[] args) {
		Krava k1 = new Krava("holshtajn", "Cveta", "crnobela", 2, 6);
		Zivotinja k2 = new Krava("..","Ruza", "braonbela", 3, 5);
		Krava ruza = (Krava)k2;
		System.out.println(ruza.getKolicinaMleka());
		Zivotinja p1 = new Pas("ovcar", "Maza", "braon", 8, true, false);
		Pas p2 = new Pas("ovcar", "carli", "braon", 3, false, true);
		System.out.println(((Pas)p1).isKorpa());
		//((Krava)k2).getKolicinaMleka();
		
		
		Krava[] krave = new Krava[2];
		krave[0]= k1;
		//krave[1] = p2;
		
		Zivotinja[] zivotinje = new Zivotinja[4];
		zivotinje[0]= k1;
		zivotinje[1]= k2;
		zivotinje[2]= p1;
		zivotinje[3] = p2;
		
		//proci kroz niz i ispisati imena svih pasa
		for (int i=0; i< zivotinje.length; i++) {
			if (zivotinje[i] instanceof Pas) {
				System.out.println(zivotinje[i].getIme());
			}
		}
		
		//proci kroz niz i ispisati za sve krave njihovo ime
		// i kolicinu mleka
		
		for (int i=0; i<zivotinje.length; i++) {
			if (zivotinje[i] instanceof Krava) {
				System.out.print(zivotinje[i].getIme() + " ");
				System.out.println(((Krava)zivotinje[i]).getKolicinaMleka());	
			}
		}
		
	}

}
