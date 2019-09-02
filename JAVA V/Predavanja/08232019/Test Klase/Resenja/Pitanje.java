package TestKlase;

public class Pitanje {
    private String tekst;
    private int brPoena;
    private PonudjeniOdgovor[] nizOdgovora;
    private int brojPonudjenih;

    public Pitanje(String tekst, int brPoena) {
        this.tekst = tekst;
        this.brPoena = brPoena;
        this.nizOdgovora = new PonudjeniOdgovor[5];
        this.brojPonudjenih = 0;
    }

    public String getTekst() {
        return tekst;
    }

    public int getBrPoena() {
        return brPoena;
    }

    public PonudjeniOdgovor getPonudjeniOdgovor(int redBr){
        redBr--;
        if(redBr>=0 && redBr< nizOdgovora.length)return nizOdgovora[redBr];
        else return null;
    }

    public void dodajOdgovor(PonudjeniOdgovor po){
        if(po.isTacan() == true){
            for(int i = 0;  i<brojPonudjenih; i++){
                if(nizOdgovora[i].isTacan() == true){
                    System.out.println("Vec postoji tacan odgovor za ovo pitanje");
                    return;
                }
            }
        }
        if(brojPonudjenih < nizOdgovora.length){
            nizOdgovora[brojPonudjenih]=po;
            brojPonudjenih++;
        }
        else{
            PonudjeniOdgovor[] odgovori2 = new PonudjeniOdgovor[2* nizOdgovora.length];
            for(int i = 0; i< nizOdgovora.length; i++){
                odgovori2[i] = nizOdgovora[i];
            }
            nizOdgovora = odgovori2;
            nizOdgovora[brojPonudjenih++] = po;
        }
    }

    public int odgovoriNaPitanje(int redBr){
        redBr--;
        if(redBr >=0 && redBr< brojPonudjenih){
            if(nizOdgovora[redBr].isTacan()==true) return brPoena;
            else return 0;
        }
        else{
            System.out.println("Ponudjeni odgovor sa unetim rednim brojem ne postoji");
            return 0;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(tekst + " (" + brPoena + ") \n");
        for(int i = 0; i<brojPonudjenih; i++){
            sb.append("\t" + (i+1) + ". " + nizOdgovora[i].toString() + "\n");
        }
        return sb.toString();
    }

}
