package autodrum.vozila;

public final class Automobil extends Vozilo {
	private final double potrosnja,maxGoriva;
	private double trGorivo;
	public Automobil( int brSedista,double potrosnja,double maxGoriva) {
		super("Automobil", brSedista);
		this.potrosnja=potrosnja;
		this.maxGoriva=maxGoriva;
		this.trGorivo=0;
	}

	public double getTrGorivo() {
		return trGorivo;
	}

	public void changeTrGorivo(double value) {
		if(trGorivo+value>maxGoriva && value>0) {
			trGorivo+=maxGoriva-trGorivo;
		}else if(trGorivo+value<0) {
			trGorivo=0;
		}else {
			trGorivo+=value;
		}
	}

	public double getPotrosnja() {
		return potrosnja;
	}

	public double getMaxGoriva() {
		return maxGoriva;
	}

	///num je u KM
	@Override
	public void kreciSe(double put) {
		//pot / 100 km -> potr / put km
		double potroseno=potrosnja*put/100;
		changeTrGorivo(-potroseno);
	}
	public void dodajSedista(int num) {
		if(num<=0)return;
		brSedista+=num;
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(super.toString());
		sb.append("{"+potrosnja+"}("+trGorivo+"/"+maxGoriva+")");
		return sb.toString();
	}
	

}
