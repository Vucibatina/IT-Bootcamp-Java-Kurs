package chnpp;

public class Square {

	public static void main(String[] args) {
		int[] niz = { 2, 1, 6, 4, 0 };
        sortirajNiz(niz);
        kvadratBr(niz);
        sortirajNiz(niz);
        ispisiNiz(niz);
    }
    static int[] sortirajNiz(int[] niz) {
        for (int i = 0; i < niz.length - 1; i++) {
            for (int j = i + 1; j < niz.length; j++) {
                if (niz[j] < niz[i]) {
                    int temp = niz[j];
                    niz[j] = niz[i];
                    niz[i] = temp;
                }
            }
        }
        return niz;
    }
    static void ispisiNiz(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
    }
    static int[] kvadratBr(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            niz[i] *= niz[i];
        }
        return niz;

	}

}
