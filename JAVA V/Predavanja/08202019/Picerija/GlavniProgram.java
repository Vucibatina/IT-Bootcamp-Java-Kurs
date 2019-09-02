package pice;

public class GlavniProgram {
	public static void main(String[] a) {
		Pica p1= new Pica("kapricoza", 20);
		p1.getCena(); 
		p1.kupiPicu();
		p1.kupiPicu(4);
		
		//System.out.println(Pica.zarada);
		System.out.println(Pica.getZarada());
		System.out.println(Pica.getBrProdatih());
	}
}
