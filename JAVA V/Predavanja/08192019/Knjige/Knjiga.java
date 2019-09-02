package knjige;
//automatsko generisanje jedinstvenog ida
public class Knjiga {
	
	private String imeAutora;
	private String prezimeAutora;
	private String naslov;
	private int brStrana;
	private static int globalID = 0;
	private int id;
	
	public Knjiga(String imeAutora, String prezimeAutora, String naslov, int brStrana) {
		this.imeAutora = imeAutora;
		this.prezimeAutora = prezimeAutora;
		this.naslov = naslov;
		this.brStrana = brStrana;
		id = globalID;
		globalID++;
	}
	
	public int getId() {
		return id;
	}


	public Knjiga(String imeAutora, String prezimeAutora, String naslov) {
		super();
		this.imeAutora = imeAutora;
		this.prezimeAutora = prezimeAutora;
		this.naslov = naslov;
	}


	public String getImeAutora() {
		return imeAutora;
	}


	public String getPrezimeAutora() {
		return prezimeAutora;
	}


	public String getNaslov() {
		return naslov;
	}


	public int getBrStrana() {
		return brStrana;
	}
	
	
	
	
	
	
	
	
}
