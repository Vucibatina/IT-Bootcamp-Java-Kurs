package ocene;

public class Ocena {
	private int brPoena;
	private String nazivPredmeta;
	private String rok;
	
	public Ocena(int poeni, String naziv, String r) {
		brPoena = poeni;
		nazivPredmeta = naziv;
		rok = r;
	}
	
	public int nadjiOcenu() {
		int ocena;
		
		if (brPoena <50) ocena = 5;
		else if (brPoena<60) ocena = 6;
		else if (brPoena <70) ocena = 7;
		else if (brPoena<80) ocena = 8;
		else if (brPoena<90) ocena = 9;
		else ocena = 10;
		
		//ili na osnovu celobrojnog deljenja
		
		return ocena;
	}
	
	public static double prosek(Ocena[] nizO) {
		double zbir = 0;
		int brPrelaznih = 0;
		
		for (Ocena o: nizO) {
			int ocena = o.nadjiOcenu();
			if (ocena >5 ) {
				zbir += ocena;
				brPrelaznih++;
			}
		}
		
		/*
		for (int i = 0; i<nizO.length; i++){
			if( nizO[i].nadjiOcenu() > 5) zbir += nizO[i].nadjiOcenu();
		}
		*/
		
		return zbir/brPrelaznih;
	}
	
}
