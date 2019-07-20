# Pozorištance
Napravite sistem klasa koji modeluje rad pozorišta. Dat je dijagram implementacije kako bi rešenje lakše vizuelizovali kao i detaljan tekst implementacije. 

![Dijagram](https://i.imgur.com/YjgnJAI.png)
### Pozorište
---
Pozorište ima jedonznačan automatski generisan celobrojni identifikator i naziv koji mogu da se dohvate. Može da se sastavi tekstualni opis u obliku: `naziv [id]`. Pozorište poseduje metodu *getSkraceniNaziv* kojom generiše skraćenicu pozorišta iz naziva (prvo slovo svake reči kapitalizovano npr. za "Jugoslovensko dramsko pozorište" -> "JDP")

### Zaposleni
---
Zaposleni u pozorištu je opisan imenom i pozorištem u kojem je zaposlen. Svi podaci mogu da se dohvate. Može da se dohvati jednoslovna oznaka vrste posla koju obavlja, da se sastavi tekstualni opis u obliku: `ime (imePosla, skraceniNaziv]` gde je imePosla rezultat poziva metode zaposlenog imePosla() a skraceniNaziv rezultat poziva metode pozorišta getSkraceniNaziv().

### Glumac, reditelj i kostimograf
---
Glumac, reditelj i kostimograf su zaposleni u pozorištu. Javna metoda imePosla vraća respektivni naziv klase.

### Predstava
---
Predstava je opisana *nazivom*, *pozorištem* u kojem se održava i sadrži proizvoljan broj *zaposlenih* koji učestvuju u realizaciji predstave. U realizaciji predstave mogu učestvovati samo zaposleni u pozorištu u kome se predstava održava, pri čemu tačno **jedan reditelj**, najviše **dva kostimografa** i **proizvoljno glumaca**. Predstava se stvara sa rediteljem, nakon čega se kostimografi i glumci dodaju pojedinčano. Povravtna vrednost pri dodavanju zaposlenog je indikator uspeha. Može da se dohvati naziv predstave, da se dohvati pozorište u kojem se održava predstavva i da se sastavi tekstualni opus predstave u obliku: `nazivPedstave: \n\t(Zaposleni)\n\t(Zaposleni)...`

### Repertoar
---
Pozorišni repertoar sadrži pozorište kojem pripada i može sadržati proizvoljan broj predstava. Može da se doda predstava na repertoar, da se ukloni predstava zadatog naziva sa repertoara i da se sastavi tekstualni opis repertoara u obliku: `nazivPozorista: [  (Predstava)\n  (Predstava)\n...]`

---
Kod metoda za potrebe testiranja koda i dobijanja ispisa koji ne treba dirati:
```java
//Program.java
public class Program { 
 public static void main(String[] argv){
     Pozoriste p =  new Pozoriste("Jugoslovensko dramsko pozorište");
     Repertoar r = new Repertoar (p);
     Predstava p1 = new Predstava("Princeza na zrnu graska", p, new Reditelj("Iva Milosevic", p));
     p1.dodaj(new Kostimograf("Maja Mirkovic", p));
     p1.dodaj(new Glumac("Jovo Maksic", p));
     Predstava p2 = new Predstava("Cudne ljubavi", p, new Reditelj("Djurdja Tesic", p));
     p2.dodaj(new Kostimograf("Zorana Petrov", p));
     p2.dodaj(new Glumac("Milos Samolov", p));
     p2.dodaj(new Glumac("Jelena Ilic", p));
     p2.dodaj(new Glumac("Sandra Rodic", p));
     r.dodaj(p1);
     r.dodaj(p2);
     System.out.print(r);
 }
} 
```
Ispis koji se dobija:
```bash
Jugoslovensko dramsko pozorište: [
  Princeza na zrnu graska:
    Iva Milosevic (Reditelj, JDP)
	Maja Mirkovic (Kostimograf, JDP)
	Jovo Maksic (Glumac, JDP)
  Cudne ljubavi:
	Djurdja Tesic (Reditelj, JDP)
	Zorana Petrov (Kostimograf, JDP)
	Milos Samolov (Glumac, JDP)
	Jelena Ilic (Glumac, JDP)
	Sandra Rodic (Glumac, JDP)
]
```