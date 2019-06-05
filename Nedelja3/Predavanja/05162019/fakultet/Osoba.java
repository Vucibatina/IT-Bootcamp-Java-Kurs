package izvodj;

/*
 * 
Svaka osoba ima svoje ime i prezime, broj licne karte, 
datum rodjenja.
Za studenta je vazno znati ime, prezime, broj indeksa,
 godinu studija, prosek.
Takodje se prikupljaju neke informacije o profesorima
- ime, prezime, broj licne karte, predmet koji predaju 
(samo jedan).
Napraviti opisani sistem i prikazati njegovu upotrebu.
Zatim dodati i listu ocena.
 */

public class Osoba {
	private String ime;
	private String prezime;
	private String brlk;
	private String jmbg;
	
	public Osoba(String ime, String prezime, String brlk, String jmbg) {
		//super();
		this.ime = ime;
		this.prezime = prezime;
		this.brlk = brlk;
		this.jmbg = jmbg;
	}
	
	public void ispis() {
		System.out.println("Osoba: " + ime + " " + prezime);
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getBrlk() {
		return brlk;
	}
	public void setBrlk(String brlk) {
		this.brlk = brlk;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	
	
}
