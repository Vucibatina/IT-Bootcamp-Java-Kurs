package bicikli;

public class Test {

	public static void main(String[] args) {
		Lampa lampica= new Lampa(true, "bela", 4);
		Bicikl b= new Bicikl("drumski", 20, lampica);
		b.ispis();

	}

}
