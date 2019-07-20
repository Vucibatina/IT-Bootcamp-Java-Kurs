# Tovar I/O
Napravite sistem klasa koji modeluje rad tovarne službe. Dat je dijagram implementacije kako bi rešenje lakše vizuelizovali kao i detaljan tekst implementacije. 

![Dijagram](https://i.imgur.com/KsvKXr8.png)
### Tovar
---
Apstraktnom *tovaru* može da se dohvati naziv vrste, odredi težina i sastaiv tekstualni opis u obliku: `vrsta(tezina)`

### Predmet
---
*Predmet* je tovar zadate vrste i težine 

### Paket
---
Paket je tovar koji može da sadrži proizvoljan broj tovara. Stvara se prazan posle čega se tovari dodaju pojedinačno. Naziv vrste je u formatu `paket[(Tovar),(Tovar),...] ` gde (Tovar) predstavlja vrstu jednog tovara iz liste

### Kamion
---
*Kamion* ima zadat registarski broj tipa *String* i može da bude natovaren tovarom do zadate ukupne težine (nosivosti). Stvara se prazan. Može da se stavi neki tovar na kraj tovarne liste, da se skine tovar sa kraja tovarne liste. Povratna vrednost pri stavljanju je indikator uspeha. Može da se sa sastavi tekstualni opis kamion u obliku: `regBroj(teret/nosivost)\n  (Tovar)\n  (Tovar)...` gde (Tovar) predstavlja ispis jednog tovara iz liste

---
Kod metoda za potrebe testiranja koda i dobijanja ispisa koji ne treba dirati:
```java
//Program.java
public class Program {
	public static void main(String[] args) {
		Kamion kam = new Kamion("BG 123-4567", 5000);
		kam.stavi(new Predmet("secer", 500));
		Paket p = new Paket();
		p.dodaj(new Predmet("radio", 3));
		p.dodaj(new Predmet("tv", 10));
		kam.stavi(p);
		kam.stavi(new Predmet("brasno", 300));
		System.out.println(kam);
	}
}
```
Ispis koji se dobija:
```bash
BG 123-4567(813.00/5000.00)
  secer(500.00)
  paket[radio,tv](13.00)
  brasno(300.00)
```