package novipaket;

public class TestKlasa {

	public static void main(String[] args) {
		// Vozilo poseduje registracioni broj i godinu proizvodnje
		// Registracioni broj moze da se dohvati i postavi
		// Godina proizvodnje se postavlja prilikom kreiranja vozila
		// 
		//
		// Garaza poseduje ime vlasnika i parking mesta za vozila
		// Velicina garaze se zadaje prilikom kreiranja garaze
		// Moze da se vozilo doda/ukloni u/iz garaze na zadatom mesto
		// Moze da se dohvati ukupan broj parking mesta
		// Moze da se dohvati vozilo na nekom parking mestu
		
		Garaza usce= new Garaza();
		usce.setVlasnik("Usce");;
		Garaza gajba= new Garaza(2);
		gajba.setVlasnik("Pera Peric");
		Vozilo v1= new Vozilo(1995),v2=new Vozilo(2005);
		Vozilo v3=new Vozilo(2010);
		usce.postaviVozilo(v1,4);
		gajba.postaviVozilo(v2, 1);
		usce.postaviVozilo(v3, 3);
		Vozilo vt=usce.dohvatiVozilo(4);
		System.out.println(vt);
		System.out.println(usce);
		System.out.println(gajba);
	}

}
