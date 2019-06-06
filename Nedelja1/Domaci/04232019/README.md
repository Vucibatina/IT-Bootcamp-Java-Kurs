# Servis za porudžbine
Nama najdraža picerija Braško++ raspisala je konkurs za java programere kako bi automatizovala proces naručivanja pice.

| Naziv | Sastojci |
| ------ | ------ | 
| Capricciosa | Kačkavalj, Šunka, Pečurke
| Pepperoni | Kačkavalj, Čajna
| Vesuvio | Čajna, Pečurke, Šunka

| Sastojak | Id | Cena |
| --------- | - | --- |
| Kačkavalj | 2 | 50 |
| Šunka | 3 | 40 |
| Pečurke | 5 | 30 |
| Čajna | 7 |40 |

Cena pizze bez sastojaka iznosi 200din. Ukoliko pizza nije u ponudi nazovite je *Kombinacija*. Ukoliko sastojak nije u ponudi ispisati korisniku: `Greška, željeni sastojak ne postoji u bazi podataka. Pokušajte ponovo`.
Pomozite Brašku da postane najbolja picerija u gradu.

Izgled ispisa programa (tekst u zagradi predstavlja tip kornisckog unosa):
```h
Dobrodošli u Braško++ servis za naručivanje!
Koliko sastojaka želite: (int)
sastojci: (int) (int) ...
```
Primer unosa (3 sastojka: kačkavalj, šunka, pečurke)
```h
3
2 3 5
```
Nastavak ispisa:
```h
Izabrali ste pizzu Capricciosa.
Cena pizze je 320din.
```

Sugestije:
> Primetite da su identifikacioni brojevi prosti. Ukoliko bismo pomnožili sve sastojke pizze dobili bismo broj koji bi je jednoznačno odredio (npr. tako dobijeni jedinstveni id pizze Vesuvio bi iznosio 7 · 5 · 3 = 105)

> Možete koristiti `System.out.print()` kako ispis ne bi presao u novu liniju i ```System.err.println()``` za ispis gresaka.

