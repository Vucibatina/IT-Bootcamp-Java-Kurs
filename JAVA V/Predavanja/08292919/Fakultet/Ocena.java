package fakultet;

public class Ocena {
	Profesor profesor;
	int vrednost;
	
	public Profesor getProfesor() {
		return profesor;
	}
	public int getVrednost() {
		return vrednost;
	}
	public Ocena(Profesor profesor, int vrednost) {
		super();
		this.profesor = profesor;
		this.vrednost = vrednost;
	}
	
	
	
	
}
