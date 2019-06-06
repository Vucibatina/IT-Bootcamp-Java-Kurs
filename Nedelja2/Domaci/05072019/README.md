# Konzolni kalkulator

Napraviti uslužni program za procesiranje matematičkih operacija nad brojevima iliti digitron, koji omogućava sledeće:
  - Sabiranje
  - Oduzimanje
  - Množenje
  - Deljenje
  - Dizanje na stepen
  - Faktorijel

Podsetnik: 
> Faktorijel u oznaci n! je je proizvod svih pozitivnih brojeva manjih ili jednakih n
> 5! = 1 · 2 · 3 · 4 · 5
> 8! = 1 · 2 · 3 · 4 · 5 · 6 · 7 · 8

Sve operacije digitrona implemenitarti kao metode. Zabranjeno je koristiti ugrađene matematičke funkcije iz bilo kojeg paketa.

Simulacija rada programa (kompletan I/O*):
```java
Dobrodošli u 'konzolni kalkulator 9000'!
----------------------------------------
Komande:
-1) Izlaz iz programa
 0) Reset
 1) Saberi [double]
 2) Oduzmi [double]
 3) Pomnozi [double]
 4) Podeli [double != 0]
 5) Digni na stepen [int]
 ?) ... 
99) Ispis komandnog menija
---------------------------
trenutna vrednost: 0
komanda [arg]: 1 56.5
---------------------------
trenutna vrednost: 56.5
komanda [arg]: 2 11.5
---------------------------
trenutna vrednost: 40
komanda [arg]: 3 4.5
---------------------------
trenutna vrednost: 180
komanda [arg]: 4 45
---------------------------
trenutna vrednost: 4
komanda [arg]: 5 2
---------------------------
trenutna vrednost: 16
komanda [arg]: 0
---------------------------
trenutna vrednost: 0
komanda [arg]: 99
---------------------------
Komande:
-1) Izlaz iz programa
 0) Reset
 1) Saberi [double]
 2) Oduzmi [double]
 3) Pomnozi [double]
 4) Podeli [double != 0]
 5) Digni na stepen [int]
 ?) ... 
99) Ispis komandnog menija
---------------------------
trenutna vrednost: 0
komanda [arg]: -1
---------------------------
```

Modifikacije za radoznale: 
> Implementirati dodatne funkcije npr. deljenje po modulu, pretvaranje u binarni broj itd.

> Omogućiti ulančavanje više komandi ( može biti nova komanda koja traži prvo broj komandi pa učita ili učitava do terminalnog znaka )

\* I/O : Input/Output