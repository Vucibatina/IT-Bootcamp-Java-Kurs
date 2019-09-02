package autodrum.drum;
import autodrum.vozila.Automobil;
import autodrum.vozila.ElektricniTrotinet;
import autodrum.vozila.Vozilo;
public class Autoput {

	public static void main(String[] args) {
		Vozilo[] kolovoz= new Vozilo[5];
		Automobil a1=new Automobil(5, 8.1, 30);
		Automobil a2=new Automobil(5, 6.5, 25);
		kolovoz[0]=a1;
		kolovoz[1]=a2;
		a1.changeTrGorivo(20);
		a2.changeTrGorivo(10);
		ispisiAutoput(kolovoz);
		System.out.println();
		ElektricniTrotinet t1=new ElektricniTrotinet();
		t1.menjaVrednostB(100);
		kolovoz[2]=t1;
		kolovoz[1].kreciSe(100);
		ispisiAutoput(kolovoz);
		System.out.println();
		for(Vozilo v: kolovoz) {
			if(v!=null) {
				v.kreciSe(10);
			}
		}
		ispisiAutoput(kolovoz);
		
		
	}
	public static void ispisiAutoput(Vozilo[] niz) {
		for(int i=0;i<niz.length;i++) {
			if(niz[i]!=null) {
				System.out.println(niz[i]);
			}
		}
	}

}
