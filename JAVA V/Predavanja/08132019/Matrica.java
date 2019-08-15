import java.util.Random;
import java.util.Scanner;

public class Matrica {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj redova matrice: ");
        int n = sc.nextInt();
        System.out.println("Unesite broj kolona matrice: ");
        int m = sc.nextInt();

        int [][] matrica =  new int[n][m];

        generisiELementeMatrice(matrica, 5);
        ispisiMatricu(matrica);

        System.out.println("Unesite broj kolone: ");
        int brKolone1 = sc.nextInt();
        System.out.println("Unesite broj kolone: ");
        int brKolone2 = sc.nextInt();

        int [] a = kolonaKaoNiz(matrica, brKolone1);
        int[] b = kolonaKaoNiz(matrica, brKolone2);

        int[] unijaSaPon = napraviUnijuSaPonavljenjem(a, b);
        int[] unijaBezPonavljanja = ukloniElementeKojiSePonavljaju(unijaSaPon);

        System.out.println("Kolona " + brKolone1 + ": ");
        ispisiNiz(a);
        System.out.println("Kolona " + brKolone2 + ": ");
        ispisiNiz(b);
        System.out.println("Unija sa ponavljanjem: ");
        ispisiNiz(unijaSaPon);
        System.out.println("Unija bez ponavaljanja: ");
        ispisiNiz(unijaBezPonavljanja);

    }

    public static void generisiELementeMatrice(int [][] matrica, int gornjagranica){
        Random r = new Random();
        for(int i = 0 ; i<matrica.length; i++){
            for(int j = 0 ; j<matrica[i].length; j++){
                matrica[i][j] = r.nextInt(gornjagranica);
            }
        }
    }

    public static int[] kolonaKaoNiz(int [][] matrica, int brKolone){
        int[] niz = new int[matrica.length];

        for(int i = 0; i<matrica.length; i++){
            niz[i] = matrica[i][brKolone];
        }

        return niz;
    }

    public static int[] napraviUnijuSaPonavljenjem(int []a, int []b){
        int duzinaUnije = a.length + b.length;
        int[] unija = new int[duzinaUnije];
        int i = 0;

        for(i = 0 ; i<a.length; i++){
            unija[i] = a[i];
        }

        for(i = 0; i<b.length; i++){
            unija[a.length + i] = b[i];
        }

        return unija;
    }

    public static int[] ukloniElementeKojiSePonavljaju(int [] niz){
        int ponavljanje = 0;
        boolean flag = false;
        for(int i = 0; i<niz.length; i++){
            flag = false;

            for(int j = i+1; j<niz.length; j++){
                if(niz[i]==niz[j]) flag = true;
            }

            if(flag == true){
                ponavljanje++;
            }
        }
        int duzina = niz.length - ponavljanje;

        int[] nizBezPonavljanja = new int[duzina];
        int k = 0;
        for(int i = 0 ; i<niz.length; i++){
            if(postojiUNizu(nizBezPonavljanja, niz[i], k) == false){
                nizBezPonavljanja[k] = niz[i];
                k++;
            }
        }
        return nizBezPonavljanja;
    }

    public static boolean postojiUNizu(int[] niz, int broj, int index){
        for(int i = 0 ; i<index; i++){
            if(niz[i] == broj) return true;
        }
        return false;
    }

    public static void ispisiMatricu(int[][] matrica){
        for(int i = 0 ; i<matrica.length; i++){
            for(int j = 0; j<matrica[i].length; j++){
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ispisiNiz(int [] niz){
        for(int i = 0 ; i<niz.length; i++){
            System.out.print(niz[i]  + " ");
        }
        System.out.println();
    }
}

