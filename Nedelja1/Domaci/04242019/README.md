# Servis za konobare
Konobar Dule danas opslužuje goste kafane "Začarani Krug". Kada dođe do svakog stola uzima onoliko porudžbina koliko gost restorana naručuje. Iako je broj porudžbina nepoznat, Duletov softver pruža opciju unosa specijalnog terminalnog broja `0` za izlaz iz režima naručivanja. Ukoliko je Dule pogrešio kod pri unosu ispisati mu grešku: `Greška, željeni id nije u bazi podataka. Pokušajte ponovo`, i omogućiti mu da ponovo unese kod.

Menadžer kafane želi da sazna koliko je para zaradio. Dobit na cenu pića iznosi 10%, na cenu jela iznosi 15%.

| Ime | Id | Cena |
| --- | -- | ---- | 
| Rakija | 1 | 60
| Vinjak | 2 | 60 
| Pivo | 3 | 100
| Sok | 4 | 120

| Ime | Id | Cena |
| --------- | - | --- |
| Gurmanska pljeskavica | 41 | 250 |
| Ćevapi na kajmaku | 42 | 240 |
| Bela vešalica | 43 | 290 |

Izgled ispisa programa (tekst u zagradi predstavlja tip kornisckog unosa):
```h
Dobrodošli u pametni servis za konobare!
Unsesite porudžbine:
(int) (int) ...
```
Primer unosa (rakija, vinjak, sok, ćevapi, gurmanska, gurmanska)
```h
1 2 4 42 41 41 0
```
Nastavak ispisa:
```h
ukupno popijeno: 240din     zarada: 24din
ukupno pojedeno: 740din     zarada: 111din

ukupna zarada: 135din
```