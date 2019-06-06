# Problem specijalnih popusta
Nama najdraža picerija Braško++ rešila je da uvede specijalan program akcija kako bi privukla što više mušterija. 

  - Svaka _**10**_. pizza u toku dana je gratis
  - 3+1 gratis. Ako mušterija naruči _**4**_ pizze, poslednja se ne naplaćuje
  - Program dnevnih popusta, dat u tabeli

Id | Naziv | Cena | 
- | ------ | ------ | 
1 | Capricciosa | 320
2 | Pepperoni | 290
3 | Vesuvio | 310

| Dan | Akcija |
| --------- | --- |
| Utorak | 10% Vesuvio |
| Četvrtak | 10% Cappriciosa  |
| Subota, Nedelja | 15% na sve pizze |

Na početku programa radnik unosi koji je dan danas u formatu preciznije datom u ispisu. Ukoliko je radnik pogrešio pri unosu ispisati mu grešku: `Greška u unosu. Pokušajte ponovo: ` i omogućiti ispravku greške. Nakon toga program ulazi u mod uzimanja porudžbina od individualnih mušterija. Radnik ne zna unapred koliko će mušterija biti, ali program omogućava unos specijalnog terminalnog znaka `-1` za izlzak iz rezima procesuiranja musterija. Svaka mušterija najpre kaže koliki broj pizza naručuje a onda zatim id-eve individualnih pizza.


```java
Dobrodošli u Braško++ pametnu kasu!
Koji je danas dan (Pon/Uto/Sre/Čet/Pet/Sub/Ned): (String)

Mušterija id#1: (int) (int) ...
Mušterija id#2: (int) (int) ...
...
Mušterija id#?: (int) (int) ...
Mušterija id#?: -1 //kraj programa
```
Primer unosa (Utorak, {mušterija id#1: 4pizze, Cappriciosa, Vesuvio, Peperoni, Cappriciosa}, {mušterija id#2: 3pizze, Vesuvio, Vesuvio, Vesuvio} )
```h
Uto
4 1 3 2 1
3 3 3 3 
-1

```
Nastavak ispisa:
```h
-- Račun za mušteriju id#1 ---
Pizza Capricciosa       320 
Pizza Vesuvio           290
Pizza Pepperoni         310
Pizza Capricciosa       320 
                ukupno: 1240
AKCIJA 3+1  Cappriciosa -320
DNEVNA 10%  Vesuvio     -31
                ukupno: 889
------------------------------
-- Račun za mušteriju id#2 ---
- Pizza Vesuvio         310 -
- Pizza Vesuvio         310 -
- Pizza Vesuvio         310 -
                ukupno: 930 -
DNEVNA 10%  Vesuvio     -93 -
                ukupno: 837 -
------------------------------
```

Sugestije:
> Primetite da su identifikacioni brojevi prosti. Ukoliko bismo pomnožili sve sastojke pizze dobili bismo broj koji bi je jednoznačno odredio (npr. tako dobijeni jedinstveni id pizze Vesuvio bi iznosio 7 · 5 · 3 = 105)

> Možete koristiti `System.out.print()` kako ispis ne bi presao u novu liniju i ```System.err.println()``` za ispis gresaka.

