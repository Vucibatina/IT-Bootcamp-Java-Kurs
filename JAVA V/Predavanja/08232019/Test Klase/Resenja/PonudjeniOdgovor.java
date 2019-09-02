package TestKlase;

public class PonudjeniOdgovor {
    private String tekst;
    private boolean tacan;

    public PonudjeniOdgovor(String tekst, boolean tacan) {
        this.tekst = tekst;
        this.tacan = tacan;
    }

    public String getTekst() {
        return tekst;
    }

    public boolean isTacan() {
        return tacan;
    }

    public void setTacan(boolean tacan) {
        this.tacan = tacan;
    }

    public String toString(){
        return tekst;
    }
}
