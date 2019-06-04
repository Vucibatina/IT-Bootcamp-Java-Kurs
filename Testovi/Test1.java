public class Dog 
{ 
    
    // Instance Variables 
    String name; 
    
    // Brojaci
    public int brojac1=0;
    public static int brojac2=0;

    // Constructor Declaration of Class 
    public Dog(String name, ) 
    { 
        this.name = name;
        brojac1+=1;
        brojac2+=1; 
    } 
}

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

                // Objekti - sta ocekujemo kao output
		Dog vucjak=new Dog("reks");
		Dog buldog=new Dog("dzeki");
		Dog dzukac=new Dog("baki");
		System.out.println(vucjak.brojac1);
		System.out.println(vucjak.brojac2);
			
		// Matrice - sta ocekujemo kao output
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }; 
		System.out.println(mat[0][2]);

	}

}


/*
SQL 

Tabela: radnici
Ime	Plata	MaticniBroj
Ana	1000	12345
Marko	800	23242
Jovana	2000	2343423
Goran	1200	23455

Tabela: Izostanci
MaticniBroj	Datum
23242		2/2/2019
23242		2/3/2019
2343423		2/2/2019

Problem 1:
Izlistaj imena radnika sa platom manjom od 1000

Problem 2:
Izlistaj imena ljudi i datum izostanka

Problem 3:
Izlistaj imena ljudi i broj izostanaka



*/
