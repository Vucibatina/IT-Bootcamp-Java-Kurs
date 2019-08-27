import java.util.Random;
import java.util.Scanner;

public class Transponivanje {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj redova matrice: ");
        int n = sc.nextInt();
        System.out.println("Unesite broj kolona matrice: ");
        int m = sc.nextInt();

        int [][] matrica =  new int[n][m];

        generisiELementeMatrice(matrica, 5);
        ispisiMatricu(matrica);

        System.out.println("Transponovana matrica je: ");
        int [][] transponovana = transponuj(matrica);
        ispisiMatricu(transponovana);


    }

    public static int[][] transponuj(int [][] matrica){
        int brRedovaOrig = matrica.length;
        int brKolonaOrig = matrica[0].length;
        int[][] transponovanaMatrica = new int[brKolonaOrig][brRedovaOrig];

        for(int i =0 ; i<matrica.length; i++){
            for(int j =0; j<matrica[i].length; j++){
                transponovanaMatrica[j][i] = matrica[i][j];
            }
        }

        return transponovanaMatrica;
    }

    public static void generisiELementeMatrice(int [][] matrica, int gornjagranica){
        Random r = new Random();
        for(int i = 0 ; i<matrica.length; i++){
            for(int j = 0 ; j<matrica[i].length; j++){
                matrica[i][j] = r.nextInt(gornjagranica);
            }
        }
    }



    public static void ispisiMatricu(int[][] matrica){
        for(int i = 0 ; i<matrica.length; i++){
            for(int j = 0; j<matrica[i].length; j++){
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
    }


}

