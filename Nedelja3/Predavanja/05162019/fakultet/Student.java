package izvodj;

public class Student extends Osoba {
	private int index;
	
	public Student (String i, String p, String brlk, String jmbg, int ind) {
		super(i, p, brlk, jmbg);
		index= ind;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public void ispis() {
		System.out.println("Student: " + getIme() + " " + getPrezime());
	}
	
}
