package autodrum.vozila;

public abstract class Vozilo {
	private String tip;
	protected int brSedista;

	public Vozilo(String tip,int brSedista) {
		this.tip=tip;
		this.brSedista=brSedista;
		
	}
	public abstract void kreciSe(double put);
	public String getTip() {
		return tip;
	}
	public int getBrSedista() {
		return brSedista;
	}
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(tip);
		sb.append("["+brSedista+"]");
		return sb.toString();
	}
	
	
}
