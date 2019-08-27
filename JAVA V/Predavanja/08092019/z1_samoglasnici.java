package pet_09_08;

public class z1_samoglasnici {
	
	/*
	
	Napisati metodu koja ce da izbroji samoglasnike 
	u prosledjenoj reci.
		
	Testirati prethodno napisanu metodu.
	 
	 */
	
	public static int brSamoglasnika(String str) {
		str = str.toLowerCase();
		int brSam = 0;
		
		for (int i=0; i<str.length(); i++) {
			char znak = str.charAt(i);
			if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u') {
				brSam++;
			}
		}
		
		return brSam;
	}

	public static void main(String[] args) {
		String str = "BROJaCI";
		int broj = brSamoglasnika(str);
		System.out.println(broj);
	
	}

}
