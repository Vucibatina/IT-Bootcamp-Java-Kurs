package izvodj;

public class Test {

	public static void main(String[] args) {
		//Osoba o= new Osoba("Pera", "Peric", "54464", "6486846846");
		//System.out.println(o.getIme() + " " + o.getPrezime());
		
		Student s= new Student ("Mika", "Mikic", "4646", "46468", 25);
		System.out.println(s.getBrlk() + " " + s.getIme() + " " + s.getIndex());
		
		Osoba o= new Student ("Zika", "Mikic", "4646", "46468", 25);
		Student stud= (Student) o;
		Profesor p= new Profesor("Aleksa", "Mikic", "445646", "464568668", "javasjdfo", "java");
		
		s.ispis();
		o.ispis();
		p.ispis();
		
		/*
		int a= 55;
		double b= 60.1;
		a=  (int) b;
		*/
		
		System.out.println(stud.getIndex());
		
		//BACA IZUZETAK
		//Osoba osoba1= new Osoba("ana", "mikic", "5665", "565895");
		//Student student1= (Student) osoba1;
		
	}

}
