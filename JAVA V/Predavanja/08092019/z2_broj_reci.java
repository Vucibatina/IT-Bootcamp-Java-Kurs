package pet_09_08;

public class z2_broj_reci {
	
	/*
		Napisati metodu koja ce da izbroji reci u 
		prosledjenom String-u uz pretpostavku da su reci odvojene
		jednim znakom razmaka.
		
		
		Dodatak: Smatrati da reci mogu biti odvojene proizvoljnim 
		brojem razmaka.
		
	*/
	
	public static int brReci(String s) {
		String[] reci = s.split(" ");
		return reci.length;
	}

	public static void main(String[] args) {
		
		System.out.println(brReci("Napisati metodu koja ce da izbroji reci"));

	}

}
