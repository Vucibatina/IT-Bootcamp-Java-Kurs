package planinarenje;

import java.util.Calendar;
import java.util.Date;

public class Test {
	private static void popniSe(Planinar planinar, Planina planina) {
		if (planinar.popniSe(planina) == true)
			System.out.println(planinar + " - USPEH");
		else
			System.out.println(planinar + " " + planina + " - NEUSPEH");
	}

	public static void main(String[] args) {
		Planina montBlan = new Planina("Mont Blan", 4807);
		Planina zlatibor = new Planina("Zlatibor", 1496);
		PlaninarskoDrustvo drustvo = 
				new PlaninarskoDrustvo("Drustvo", 2000,
				new Planinar[] { new Alpinista("Ognjen", 5),
				new KlasicniPlaninar("Marko", 10) });
		drustvo.uclani(new Alpinista("Zoran", 15)).uclani(new KlasicniPlaninar("Milos", 2));
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 3, 3);
		drustvo.dohvatiPlaninara(1).popniSe(montBlan, cal.getTime() );
		//cal.getTime() vraca Date!
		//cal.getTimeInMillis(); vraca broj milisekundi od 1970. do datuma sacuvanog u cal
		popniSe(drustvo.dohvatiPlaninara(2), zlatibor);
		if (drustvo.dohvatiPlaninara(1) instanceof Alpinista)
			((Alpinista) drustvo.dohvatiPlaninara(1)).dodeli(drustvo.dohvatiPlaninara(3));
		if (drustvo.dohvatiPlaninara(3) instanceof Alpinista)
			((Alpinista) drustvo.dohvatiPlaninara(3)).dodeli(drustvo.dohvatiPlaninara(1));
		drustvo.dohvatiPlaninara(1).popniSe(montBlan);
		drustvo.dohvatiPlaninara(3).popniSe( montBlan);
		drustvo.dohvatiPlaninara(3).popniSe(zlatibor);
		System.out.println("----------------------------");
		drustvo.rangiranje();
		

		Date d1= new Date();
		//Date d2= new Date(2019, 4, 23);
		Calendar c= Calendar.getInstance();
		c.set(2019, 4, 23);
		Date d2= c.getTime();

		//System.out.println(d1.getTime() + " " + c.getTimeInMillis());
		System.out.println(d1.getTime() + " " + d2.getTime());
		
	}

}
