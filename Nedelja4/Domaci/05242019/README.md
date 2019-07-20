# Energija
Napravite sistem klasa koji modeluje sistem ishrane za potrebe nutritivne kalkulacije. Dat je dijagram implementacije kako bi rešenje lakše vizuelizovali kao i detaljan tekst implementacije. 

![Dijagram](https://i.imgur.com/5CnWVu6.png)
### Energent
---
Apstraktnom *energentu* može da se odredi energetska vrednost izražena u realnim kilo džulima.

### Namirnica
---
Apstraktna *namirnica* je energent koji ima ime i jedinstven, automatski generisan celobrojan identifikator, koji mogu da se dohvate. Tekstualni opis je u obliku `[id] ime_namirnice`.

### Hrana
---
Hrana je namirnica koja se zadaje težinom date namernice izraženom u gramima (realan broj) i procentualnim udelom belančevina, masti i ugljenih hidrata (realni brojevi) u ukupnoj težini. Mogu da se dohvate težinski udeo belančevina, masti i ugljenih hidrata i ukupna težina. Energetska vrednost 1g belančevina iznosi 16,7kJ, masti 37,6kJ, a ugljenih hidrata 17,2kJ. Tekstualni opis je u obliku: `[id] ime_hrane(težina,energetska_vrednost)`. Greška je ako zbir procentualnih udela belančevina, masti i ugljenih hidrata prelazi 100%.

### Piće
---
*Piće* je namirnica koje se zadaje količinom u litrima (realan broj) i energetskom vrednošću jednog litra izraženoj u kJ (realan broj). Može da se dohvati količina. Tekstualni opis je u obliku: `[id] ime_pića(količina,energetska_vrednost).`

### Meni
---
*Meni* sadrži niz namirnica. Stvara se prazan, zadatog kapaciteta, posle čega se namirnice dodaju jedna po jedna. Može da se odredi ukupna energetska vrednost menija i da se sastavi tekstualni opis u obliku: `Meni: \n (Namirnica) \n (Namirnica)...`

---
Kod metoda za potrebe testiranja koda i dobijanja ispisa koji ne treba dirati:
```java
//Program.java
public class Program {
    public static void main (String[] varg) {
        Meni meni = new Meni (10);
        
        meni.dodaj (new Hrana("Hleb",600,7.5,0.4,49));
        meni.dodaj (new Pice ("Sok", 0.2,18540));
        meni.dodaj (new Hrana("Sir", 200,17,1.2,4));
        
        System.out.println (meni);
    }
}
```
Ispis koji se dobija:
```bash
Meni (10402.18kJ):
 [1] Hleb(600.0g, 5898.5kJ)
 [2] Sok(0.2l, 3708.0kJ)
 [3] Sir(200.0g, 795.6kJ)

```