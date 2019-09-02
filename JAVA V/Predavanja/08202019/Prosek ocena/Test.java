package ocene;

public class Test {

	public static void main(String[] args) {
		Ocena o1 = new Ocena(85, "java programiranje", "septembar");
		System.out.println(o1.nadjiOcenu());
		
		Ocena o2 = new Ocena(100, "c++", "jun");
		
		Ocena[] nizOcena = {new Ocena(64, "c", "jun"), o1, o2};
		
		System.out.println(Ocena.prosek(nizOcena));
	}

}
