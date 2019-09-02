package Planinari;

public class Planina {
    private String ime;
    private double visina; // U metrima
    private Planinar[] nizPlaninara;
    private int brPlaninara;

    public Planina(String ime, double visina,Planinar[] nizPlaninara) {
        this.ime = ime;
        this.visina = visina;
        this.nizPlaninara = nizPlaninara;
        brPlaninara = nizPlaninara.length;
    }

    public String getIme() {
        return ime;
    }

    public double getVisina() {
        return visina;
    }

    public void dodajPlaninara(Planinar p){
        if(p.penjeSe(this) == false)
            return;
        if(brPlaninara == nizPlaninara.length){
            Planinar[] temp = new Planinar[nizPlaninara.length * 2];
            int i = 0;
            for(Planinar p2 : nizPlaninara){
                temp[i++] = p2;
            }
            nizPlaninara = temp;
        }
        nizPlaninara[brPlaninara++] = p;
    }

    public void ispisiPlaninare(){
        System.out.print("[ ");
        for(Planinar p : nizPlaninara){
            if(p == null)
                continue;
            System.out.print(p + " ");
        }
        System.out.print("]");
    }

    @Override
    public String toString() {
        return ime + " (" + visina + ")";
    }
}
