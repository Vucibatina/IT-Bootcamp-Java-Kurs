
public class TestingVuk {

	public static void change(int i) {
		i=i+2;
		return;
	}
	
	public static void change(String s) {
		s="Katarina";
		return;
	}
	
	public static void main(String[] args) {
		
		// Pitanje 1 - Sta ocekujemo kao output
		int broj=7;
		change(broj);
		System.out.println(broj);  
		
		// Pitanje 2 - Sta ocekujemo kao output
		String ime="Jova";
		change(ime);
		System.out.println(ime);
		
		// Pitanje 3 - Sta ocekujemo kao output
		for (int i=0;i<10;i++) {
			if (i==5) break;
			System.out.println(i);
		}
		System.out.println("\n");

		// Pitanje 4 - Sta ocekujemo kao output
		for (int i=0;i<10;i++) {
			if (i%3==0) continue;
			System.out.println(i);
		}
				
	}

}
