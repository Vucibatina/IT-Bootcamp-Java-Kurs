package novipaket;

public class Vozilo {
	public static int id=0;
	private int godProiz;
	private String regBroj;
	private int uid;
	public Vozilo(int godProiz) {
		this.godProiz = godProiz;
		uid=id;
		id++;
	}
	public String getRegBroj() {
		return regBroj;
	}
	public void setRegBroj(String regBroj) {
		this.regBroj = regBroj;
	}
	public int getGodProiz() {
		return godProiz;
	}
	@Override
	public String toString() {
		return "Vozilo [godProiz=" + godProiz + ", regBroj=" + regBroj + "]";
	}
	
	
	
}
