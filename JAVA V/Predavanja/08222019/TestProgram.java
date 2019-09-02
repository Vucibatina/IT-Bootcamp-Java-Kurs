package pncpp;
import java.time.LocalDate;
public class TestProgram {

	public static void main(String[] args) {
		Pacijent p1=new Pacijent("Milos Obilic",LocalDate.of(1389,6, 28));
		Doktor d1= new Doktor("Car Lazar",LocalDate.of(1329, 1, 7),"DIF",LocalDate.of(1389,6, 28));
		p1.setJMBG("2806897102451");
		p1.setAlergije("Sultan Murat");
		d1.setJMBG("0701297548641");
		ispisiDoktora(d1);
		ispisiPacijenta(p1);
		

	}
	public static void ispisiDoktora(Doktor d) {
		System.out.println(d.getImePrezime() +" "+d.getFakultet()+" "+d.getBrGIskustva());
	}
	public static void ispisiPacijenta(Pacijent p) {
		System.out.println(p.getImePrezime() +" "+p.getAlergije()+" "+p.getJMBG());
	}

}
