package izuzeci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Deljenje2 {

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Uneti dva broja: ");
			int br1 = sc.nextInt();
			if (br1== 5) throw new MojIzuzetak();
			int br2 = sc.nextInt();
			int rez= br1/ br2;
			
			System.out.println("Rezultat deljenja je: " + rez);
			
		}
		catch (MojIzuzetak izuzetak) {
			System.out.println(izuzetak);
		}
		
		catch (java.lang.ArithmeticException e) {
			System.out.println("Nije dozvoljeno deljenje sa nulom!");
			//e.printStackTrace();
		}
		catch (InputMismatchException e1) {
			System.out.println("Niste uneli ceo broj");
		}
		catch (Exception ex) {
			System.out.println("Exception");
			ex.printStackTrace();
		}
		finally {
			
		}

	}

}
