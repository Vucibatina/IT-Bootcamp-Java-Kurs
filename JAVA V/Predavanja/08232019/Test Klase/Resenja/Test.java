package TestKlase;

public class Test {
    public static final double procenatPotrebanZaPolaganje = 0.5;
    private String nazivTesta;
    private Pitanje[] nizPitanja;
    private int ukupanBrojPoenaOstvarenNaTestu;
    private int ukupanBrojPoenaKojiNosiTest;
    private int brPitanja;

    public Test(String nazivTesta) {
        this.nazivTesta = nazivTesta;
        this.nizPitanja = new Pitanje[5];
        this.ukupanBrojPoenaOstvarenNaTestu = 0;
        this.ukupanBrojPoenaKojiNosiTest = 0;
        this.brPitanja = 0;
    }

    public String getNazivTesta() {
        return nazivTesta;
    }

    public int getUkupanBrojPoenaOstvarenNaTestu() {
        return ukupanBrojPoenaOstvarenNaTestu;
    }

    public int getUkupanBrojPoenaKojiNosiTest() {
        return ukupanBrojPoenaKojiNosiTest;
    }

    public int getBrPitanja() {
        return brPitanja;
    }

    public Pitanje getPitanje(int redBr) {
        redBr--;
        if(redBr>=0 && redBr< nizPitanja.length)return nizPitanja[redBr];
        else return null;
    }

    public void dodajPitanje(Pitanje p){
        if(brPitanja < nizPitanja.length){
            nizPitanja[brPitanja++]=p;
        }
        else{
            Pitanje[] odgovori2 = new Pitanje[2* nizPitanja.length];
            for(int i = 0; i< nizPitanja.length; i++){
                odgovori2[i] = nizPitanja[i];
            }
            nizPitanja = odgovori2;
            nizPitanja[brPitanja++] = p;
        }
        ukupanBrojPoenaKojiNosiTest += p.getBrPoena();
    }

    public void odgovoriNaPitanje(int redBrPitanja, int redBrPonudjenogOdgovora){
        if(redBrPitanja >= 0 && redBrPitanja < nizPitanja.length) {
            Pitanje p = nizPitanja[redBrPitanja];
            int poeni = p.odgovoriNaPitanje(redBrPonudjenogOdgovora);
            ukupanBrojPoenaOstvarenNaTestu+=poeni;
        }
        else {
            System.out.println("Pitanje sa unetim rednim brojem ne postoji");
        }

    }

    public String toStirng(){
        StringBuilder sb = new StringBuilder();
        sb.append(nazivTesta + "\n");
        for(int i = 0; i<brPitanja; i++){
            sb.append((i+1) + ".) " + nizPitanja[i].toString() + "\n");
        }
        return sb.toString();
    }
}
