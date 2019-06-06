# Aproksimator alkohola
Gosti kafane "Začarani Krug" vole da uživaju u dobrom druženju i zaborave na svoje brige. Nažalost, to često povlači i da zaborave koliko je opasno i kažnjivo voziti u pijanom stanju. Napravite program koji će podsetiti nama drage goste i naterati ih da dobro porazmisle pre sedanja za volan.

| Piće | Id | Alkohol |
| --- | -- | ---- | 
| Rakija | 1 | 5o%
| Vinjak | 2 | 40%
| Pivo | 3 | 4.7%
| Vino | 4 | 11%

| Promil [mg/ml] | Cena [din] | Kazneni poeni | Zabrana [br. meseci] | Ime | 
| ---------- | --------------- | - | - | ---------------------- |
| 0.21 - 0.5 | 10.000            | 0  | 0 | Umerena alkoholisanost
| 0.51 - 0.8 | 10.000 - 20.000   | 6  | 3 | Srednja alkoholisanost
| 0.81 - 1.2 | 20.000 - 40.000   | 8  | 4 | Visoka alkoholisanost
| 1.21 - 1.6 | 100.000 - 120.000 | 9  | 8 | Teška alkoholisanost
| 1.61 - 2.0 | 100.000 - 120.000 | 14 | 8 | Visoka alkoholisanost
| 2.0 -      | 30-60 dana zatvora | 15 | 9 | Potpuna alkoholisanost

Formula za račun: 
> BAC: Blood Alcohol Count = Alcohol(ml) / BodyMass(g) * r
> r - korektivni faktor pola (M: 0.55, Ž: 0.68)

Program najpre traži unos težine i pola gosta jer su ti podaci neophodni za sračunavanje formule. Nakon toga traži listu popijenog pića. Iako broj pića nije poznat, program pruža opciju unosa specijalnog terminalnog broja `-1` za izlaz iz režima upisa. Takođe, pruža mogućnost korisniku da ukoliko je popio neko piće koje nije u tabeli unese specijalni id broj `0`. Ukoliko je korisnik pogrešio pri unosu ispisati mu grešku: `Greška, željeni id nije u bazi podataka. Pokušajte ponovo`, i omogućiti mu da ponovo unese kod.

Izgled ispisa programa (obojen tekst u zagradi predstavlja tip kornisckog unosa, tekst u uglastoj zagradi opcioni unos):
```java
Dobrodošli u alko aproksimator 9000!
Unesite vašu težinu (kg): (double)
Unesite vaš pol (M:0/Ž:1): (int)
Šta ste i koliko popili (id_pica kolicina_u_ml):
(int)[(double)](double) ...
```
Primer unosa 
```java
75.6
0
1 100
0 5.7 500
3 500
-1
```
Nastavak ispisa:
```java
-------------------------------
BAC: 1.6 - Teška alkoholisanost
-------------------------------
Kazna: 100.000-120.000din
Kazneni poeni: 9
Zabrana vožnje: 8 meseci
-------------------------------
Uzmite autobus!
```
