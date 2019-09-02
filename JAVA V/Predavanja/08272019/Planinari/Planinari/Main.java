package Planinari;

public class Main {
    public static void main(String[] args) {
        Planinar[] nizPlaninara = new Planinar[5];
        nizPlaninara[0] = new Alpinista("Zika","Alpic");
        nizPlaninara[1] = new Alpinista("Pera","Peric");
        ((Alpinista)nizPlaninara[1]).setPartner((Alpinista) nizPlaninara[0]);
        nizPlaninara[2] = new KlasicniPlaninar("Katarina","Katic");
        nizPlaninara[3] = new KlasicniPlaninar("Mont","Verest");
        nizPlaninara[4] = new KlasicniPlaninar("Kata","Katic");

        Planina pl1 = new Planina("K1" , 7321,nizPlaninara);
        pl1.ispisiPlaninare();

        System.out.println();

        for(Planinar p : nizPlaninara) {
            if(p.penjeSe(pl1))
                System.out.println(p + " moze da se popne na " + pl1);
        }


    }
}
