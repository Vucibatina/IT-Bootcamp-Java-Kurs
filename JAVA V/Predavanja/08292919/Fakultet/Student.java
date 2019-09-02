package fakultet;


public class Student extends Osoba {
	private int index;
	private int god;
	private Ocena[] ocene; //bolje bi bilo da je ovo lista -> resenje unaprediti nakon
							// sto se ta tema obradi na predavanjima
	
	public Student (String i, String p, String brlk, String jmbg, int ind, int god) {
		super(i, p, brlk, jmbg);
		index= ind;
		this.god = god;
		ocene = new Ocena[10];
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
	
	public void ispisOcena() {
		for (int i=0; i<ocene.length; i++) {
			if (ocene[i] != null) {
				System.out.println(ocene[i].getVrednost() + " " + ocene[i].getProfesor().getPredmet());
			}
		}
	}
	
	public void dodajOcenu(Ocena o) {
		for (int i=0; i< ocene.length; i++) {
			if (ocene[i]== null) {
				ocene[i]= o;
				break;
			}
		}
	}
	
	public double izracunajProsek() {
		double suma = 0;
		int brO = 0;
		
		for (int i=0; i<ocene.length; i++) {
			
			if (ocene[i] != null && ocene[i].getVrednost() >5 ) {
				suma += ocene[i].getVrednost();
				brO++;
			}
		}
		return suma/brO;
	}
	
}
