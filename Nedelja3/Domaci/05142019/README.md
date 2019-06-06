# Sistematski pregled
Napravite uslužni program za potrebe obaveznog sistematskog pregleda. Nakon unosa osoba, program štampa osobe shodno priloženom formatu kao i statistiku u obliku vertikalnog histagrama shodno BMI kategoriji osoba. 

id | BMI Kategorija | Skraćenica | Vrednost 
 - |  ------------- | ---------- | --------
 0 | Neuhranjenost | N          | <18,5 
 1 | Idealna masa | IM          | 18.5 - 24.9
 2 | Prekomerna masa | PM       | 25 - 29.9
 3 | Gojaznost (blaga, teška i ekestremna) | G | >30
(tabela preuzeta sa [linka](https://sr.wikipedia.org/wiki/%D0%98%D0%BD%D0%B4%D0%B5%D0%BA%D1%81_%D1%82%D0%B5%D0%BB%D0%B5%D1%81%D0%BD%D0%B5_%D0%BC%D0%B0%D1%81%D0%B5) uz manje modifikacije)
> Formula za izračunavanje vrednosti: BMI = mass / height²  [kg/m²]

Zadatak realizovati sistemom klasa pri čemu BMI i Osoba predstavljaju klase u tom sistemu.

### BMI:
javni konstruktor: *BMI(double visina, double tezina)*
javna finalna polja:
  - id [int]
  - kategorija [String]
  - skracenica [String]
  - vrednost [double] : vrednost izračunata preko formule
### Osoba:
javni konstruktor: *Osoba(String ime, String prezime, double visina, double tezina)*
privatna polja:
  - ime [String: Ime Prezime]
  - visina (u metrima) [double]
  - tezina (u kilogramima) [double]
 
metode:
  - bmi( ) [BMI] : Metoda koja vraća novi bmi objekat konstruisan shodno težini i visini osobe
  - toString( ) [String] : Metoda koja omogućava univerzalni ispis svake osobe u formatu: `ime (visina, težina): bmi => bmi_kategorija`

Ispis programa:
```java
Dobrodošli na sistematski pregled!
------------------------------------------
Unesite osobe: 
[Osoba: String String double double]
[Osoba: String String double double]
...
kraj
```

Primer unosa:
```java
Jovan Milićević 1.76 62
Srboljub Nikolić 1.87 85.4
Milovan Glišić 1.80 77.3
Jovana Janković 1.72 53
Marija Jovanović 1.74 44.4
Petar Petrović 1.92 120
kraj
```

Nastavak ispisa:
```java
Osobe uspešno učitane!
------------------------------------------------------
Jovan Milićević (1.76m, 62.00kg): 20.02 => Idealna Masa
Srboljub Nikolić (1.87m, 85.40kg): 24.42 => Idealna Masa
Milovan Glišić (1.80m, 77.30): 23.86 => Idealna Masa
Jovana Janković (1.72m, 53.00): 17.92 => Neuhranjenost
Marija Jovanović (1.74m, 44.40): 14.67 => Neuhranjenost
Petar Petrović (1.92m, 120.00): 32.55 => Gojaznost
-----------------------------------------------------
Statistika: 
3		*			
2	*	*			
1	*	*		*	
	N	IM	PM	G
```

Sugestije:
> Za potrebe histograma najpre napravite brojački niz veličine broja kategorija gde svaki element predstavlja broj osoba koji pripadaju kategoriji iz indeksa. Gornji broj histograma predstavlja maksimalni element u nizu brojača (najveći broj).