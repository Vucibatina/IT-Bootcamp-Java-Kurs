package kkkk;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        System.out.println("Unesite broj elementata niza:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] niz = new int[n];
        int brElemenata=0;
        System.out.println("Unesite elementate niza:");
        for(int i = 0 ; i<niz.length; i++){
            int k = sc.nextInt();

            int j = 0;
            for(; j<brElemenata; j++){
              if(niz[j]>k)break;
            }

            if(j==niz.length) {
                niz[j-1] = k;
                brElemenata++;
            }
            else {
                int temp = niz[j];
                niz[j]=k;
                brElemenata++;
                for (; j < niz.length - 1; j++) {
                    int temp2 = niz[j + 1];
                    niz[j + 1] = temp;
                    temp = temp2;
                }
            }
        }
        System.out.println("\nSortiran niz izgleda ovako");
        for(int o:niz){
            System.out.print(o + " ");
        }
    }
}
