package novipaket;

public class Garaza {
	private Vozilo[] parking;
	private String vlasnik;
	public Garaza(int max) {
		parking= new Vozilo[max];
	}
	public Garaza() {
		parking= new Vozilo[5];
	}
	public String getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}
	public int getBrojMesta() {
		return parking.length;
	}
	public void postaviVozilo(Vozilo v,int i) {
		if(i<0 || i>=parking.length) {
			System.out.println("Greska!");
			return;
		}
		if(parking[i]!=null) {
			System.out.println("Mesto zauzeto!");
		}else
		{
			parking[i]=v;
		}
		
	}
	public void ukloniVozilo(int i) {
		if(i<0 || i>=parking.length) {
			System.out.println("Greska!");
			return;
		}
		parking[i]=null;
	}
	public Vozilo dohvatiVozilo(int i) {
		if(i<0 || i>=parking.length) {
			System.out.println("Greska!");
			return null;
		}
		return parking[i];
	}
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Garaza ["+vlasnik+"]\n");
		for(int i=0;i<parking.length;i++) {
			if(parking[i]!=null) {
				sb.append(parking[i]+"\n");
			}
		}
		return sb.toString();
	}
	
	
	
}
