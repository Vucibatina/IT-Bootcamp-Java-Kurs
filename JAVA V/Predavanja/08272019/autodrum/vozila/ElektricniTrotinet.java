package autodrum.vozila;

public class ElektricniTrotinet extends Vozilo{

	//U kWh
	double baterija;
	public ElektricniTrotinet() {
		super("NuklearniElektricniTrotinet", 1);
		this.baterija=0;
	}

	@Override
	public void kreciSe(double put) {
		menjaVrednostB(-0.1*put);
		
	}
	public void menjaVrednostB(double value) {
		baterija+=value;
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(super.toString());
		sb.append("("+baterija+")");
		return sb.toString();
	}
	
}
