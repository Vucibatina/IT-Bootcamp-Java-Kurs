package knjige;

public class GlavniProgram {

	public static void main(String[] args) {
		Knjiga k1 = new Knjiga("Ivo", "Andric", "Prokleta avlija", 200);
		Knjiga k2 = new Knjiga("Milos", "Crnjanski", "Seobe 1", 400);
		Knjiga k3 = new Knjiga("Milos", "Crnjanski", "Roman o Londonu");
		
		System.out.println(k2.getId());
		System.out.println(k1.getId());

	}

}
