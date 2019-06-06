# Takmičenje u kucanju uskršnjim jajima

Napisati  program na  koji  pomaže  organizatorima takmičenja u  kucanju uskršnjim  jajima  da  izaberu  pobednika.  Svakog takmičara i njegovo jaje je organizaciona komisija opisala sledećim podacima: 
  - rednim brojem takmičara koji odgovara indeksu u nizu (ceo broj)
  - jačinom ljuske jajeta (realan broj)
  
Program najpre treba da učita ukupan broj takmičara, a zatim i podatke o svakom pojedinačnom takmičaru razdvojene blanko znakom, za svakog takmičara iz posebnog reda. 
Nakon učitavanja, program treba da ispiše podatke o pobedničkom jajetu zajedno sa id-em takmičara čije je jaje.

Smatrati da će unos biti korektan, i da će svi indeksi biti popunjeni. Takođe uneti pretpostavku da se jačine svih jaja razlikuju tako da neće biti preklapanja pobednika.

Zabranjeno je koristiti ugrađene metode za sortiranje nizova.

Primer unosa (7 takmičara, prvi: indeks(5), jačina(8.4), ... , sedmi: indeks(0), jačina(3.4)):
```java
7
5 8.4
1 4.3
3 3.7
6 5.2
2 6.2
4 8.1
0 3.4
```
Primer ispisa:
```bash
Pobedio je takmičar #5 sa jačinom jajeta 8.4!
```

Sugestije:
> Napravite 2 identična niza veličine broja takmičara. Prvi niz neka bude identifikacioni niz takmičara kako bi kad sortirate drugi mogli da provalite čije je bilo pobedničko jaje.