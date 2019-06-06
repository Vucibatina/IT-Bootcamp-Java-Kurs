# Sistem za pošiljke
Napravite uslužni program za potrebe državne pošte koji omogućava unos pristiglih pisama a potom omogućava pregled u zavisnosti od grada. Pismo realizovati kao klasu.

### Pismo:
polja:
  - Pošaljilac [String: Ime Prezime]
  - Primalac [String: Ime Prezime]
  - Poštanski Broj [int]
  - Težinu (u gramima) [double]
  - Prioritetna [boolean] 
 
metode:
  - cena( ) [double] : Metoda koja omogućava ispis cene zavisno od težine (težina data u [tabeli](http://www.posta.rs/dokumenta/cenovnici/Kompletan-cenovnik-UPS.pdf), gledamo samo kolone pismo i stopa mase) i prioritetnog statusa (prioritet dodaje 46din na cenu)
  - toString( ) [String] : Metoda koja omogućava univerzalni ispis svake pošiljke u formatu: `pošaljilac -> primalac : poštanski broj, težina [prioritet] => cena`

Ispis programa:
```java
Dobrodošli u pametni sistem pošte!
------------------------------------
Unesite pristigla pisma: 
[Pismo]
[Pismo]
...
kraj
```

Primer unosa:
```java
Jovan Milićević Milica Jovanović 11000 50 0
Živorad Živković Srba Nikolić 16000 5000 0
Miloš Stamenković Marija Stanković 21000 20 1
Jovana Janković Petar Petrović 11000 20 1
kraj
```

Nastavak ispisa:
```java
Pisma uspešno učitana!
------------------------------------
Unesite poštanski br. grada: [int]
```

Primer unosa:
```java
11000
```

Nastavak ispisa:
```java
Jovan Milićević -> Milica Jovanović : 11000, 50g => 7748din
Jovana Janković -> Petar Petrović : 11000, 20g prioritetna => 7748din
-----------------------------------------------------------------------
Unesite poštanski br. grada: [int]
```