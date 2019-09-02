package Planinari;

public class Alpinista extends Planinar {
    //Alpinista je planinar kome moze da se dodeli drugi alpinista kao partner i koji se penje
    // po planinama visim od 3000m. Ukoliko alpinista nema dodeljenog partnera ili je
    // planina manja od 3000m, penjanje je neuspesno. Tekstualni opsi je *A_*_ime_ - ident.
    private Alpinista partner;

    public void setPartner(Alpinista partner) {
        if(this.partner==null) {
            this.partner = partner;
            this.partner.setPartner(this);
        }
    }

    public Alpinista(String ime, String prezime ) {
        super(ime, prezime);

    }

    @Override
    public boolean penjeSe(Planina p) {
       return p.getVisina() >= 3000 && partner != null;
    }

    @Override
    public String toString() {
        return "A_" + super.toString();
    }
}
