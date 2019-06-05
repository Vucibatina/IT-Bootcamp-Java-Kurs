import java.util.Scanner;

public class Primer7 {

	public static void main(String[] args) {
	/* Napisati Java program koji iscrtava na standardnom izlazu 'dijamant' strukuturu kao sa slike.
	 * Test Data
	   Ulaz broj redova (pola dijamanta) : 7 
       Ocekivani izlaz :

		                                                                                 
		      *                                                                                 
		     ***                                                                      
		    *****                                                                        
		   *******                                                                       
		  *********                                                                      
		 ***********                                                                     
		*************                                                                    
		 ***********                                                                     
		  *********                                                                      
		   *******                                                                       
		    *****                                                                        
		     ***                                                                         
		      *              
	 */
		
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		
		
		for (int i= 0; i<= size; i++) {
			for (int j= 1; j<= size - i; j++) System.out.print(" ");
			for (int j=1; j<= 2*i - 1; j++) System.out.print("*");
			System.out.println(" ");
		}
		
		for (int i= size-1; i>=1; i--) {
			for (int j=1; j<=size-i; j++) System.out.print(" ");
			for (int j=1; j<=2*i-1; j++) System.out.print("*");
			System.out.println(" ");
		}
		
		
		

	}

}
