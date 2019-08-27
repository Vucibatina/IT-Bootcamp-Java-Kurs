import java.util.Scanner;

public class Niz_2d {
	
	/*
	 * U glavnom programu ucitavati poene studenata sa njihova
	 * tri poslednja domaca zadatka. (Ukupno ima 5 studenata)
	 * Zatim napraviti metodu koja ce da nadje osobu 
	 * (njen redni broj)koja je u proseku najbolje uradila domaci. 
	 * Ukoliko je vise osoba uradilo zadatke podjednako dobro, 
	 * izabrati bilo koju.
	 * 
	 */
	
	public static int nadjiNajboljeg (double[][] niz) {
		int pozicija = 0;
		double prosek = 0;
		
		for (int i=0; i<5; i++) {
			double trenutniPr = (niz[i][0] + niz[i][1] + niz[i][2])/3;
			if (trenutniPr > prosek) {
				prosek = trenutniPr;
				pozicija= i;
			}
		}
		
		return pozicija;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] poeni = new double[5][3];
		Scanner s = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.println("Uneti poene za studenta broj "  + i);
			for (int j = 0; j<3; j++) {
				double ocena = s.nextDouble();
				poeni[i][j] = ocena;
			}
		}
		
		System.out.print("Najbolji je na poziciji : ");
		System.out.println(nadjiNajboljeg(poeni));
	}

}
