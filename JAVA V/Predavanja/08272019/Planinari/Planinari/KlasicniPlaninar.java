package Planinari;

public class KlasicniPlaninar extends Planinar {

    public KlasicniPlaninar(String ime, String prezime) {
        super(ime, prezime);
    }

    @Override
    public boolean penjeSe(Planina p) {
        return p.getVisina() < 2000;
    }

    @Override
    public String toString() {
        return "K_" + super.toString();
    }
}
