Implementirati sledeći sistem klasa

### Muzička numera
---
Muzička numera je opisana nazivom, izvođačem i trajanjem. Svi podaci mogu da se dohvate. Može da se sastavi tekstualni opis u datom formatu.

javni konstruktor: *Numera(String naziv, String izvodjac, String trajanje)*
privatna polja:
  - naziv [String]
  - izvodjac [String]
  - trajanje [String]
 
javne metode:
  - getNaziv() [String]
  - getIzvodjac() [String]
  - getTrajanje() [String]
  - toString() [String] : u formatu `izvodjac - naziv: trajanje`

### Album
---
Album je opisan imenom, izvođačem, kao i godinom kada je izdat. Takođe, sadrži i listu pesama koje se nalaze u albumu.

javni konstruktor: *Album(String naziv, String izvodjac, Date datum)*
privatna polja:
  - naziv [String]
  - izvodjac [String]
  - datum [Date]
  - lista [List<Numera>]
  
javne metode:
  - dodaj(Numera) [void] : vrsi dodavanje numere u album
  - dodaj(String name, String trajanje) [void] : kreira novu numeru sa prosledjenim parametrima, a izvodjac ce biti izvodjac albuma, pa tu numeru dodaje u listu
  - getNaziv() [String]
  - getIzvodjac() [String]
  - getTrajanje() [String] : vraca zbirno vreme svih pesama. (split po delimiteru ':' za svako trajanje, nulti element je minutaza, prvi element je sekundaza. To lepo saberite pa prepakujte)
  - getDatum() [Date]
  - getNumera(int index) [Numera] : vraca numeru po broju u listi
  - getNumera(String ime) [Numera] : vraca numeru po imenu
  - toString() [String] : u formatu `izvodjac - naziv(datum):[\n\t(Numera),\n\t(Numera), ... ]:trajanje`
  
---
Kod metode main koji ne treba dirati:
```java
public static void main(String[] args) {
    Album love_supreme = new Album("A Love Supreme", "John Coltrane", new Date(1965,1,12));
    
    love_supreme.dodaj("Part I: Acknowledgement", "7:42");
    love_supreme.dodaj("Part II: Resolution", "7:19");
    love_supreme.dodaj("Part III: Pursuance", "10:41");
    love_supreme.dodaj("Part IV: Psalm", "7:02");
    
    Album animals = new Album("Animals", "Pink Floyd", new Date(1977,1,23));
    animals.dodaj("Pigs on the wing 1","1:25");
    animals.dodaj("Dogs", "17:05");
    animals.dodaj("Pigs (Three diffrent ones)","11:26");
    animals.dodaj("Sheep","10:18");
    animals.dodaj("Pigs on the wing 2","1:28");
    
    System.out.println(love_supreme);
    System.out.println(animals);
} 
```
ispis koji se dobija:
```
John Coltrane - A Love Supreme(1965):[
	John Coltrane - Part I: Acknowledgement: 7:42
	John Coltrane - Part II: Resolution: 7:19
	John Coltrane - Part III: Pursuance: 10:41
	John Coltrane - Part IV: Psalm: 7:02
]: 32:44

Pink Floyd - Animals(1977):[
	Pink Floyd - Pigs on the wing 1: 1:25
	Pink Floyd - Dogs: 17:05
	Pink Floyd - Pigs (Three diffrent ones): 11:26
	Pink Floyd - Sheep: 10:18
	Pink Floyd - Pigs on the wing 2: 1:28
]: 41:42
```