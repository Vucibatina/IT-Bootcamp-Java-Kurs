
package Planinari;

public abstract class Planinar {
    private String ime;
    private String prezime;
    private int ID;
    private static int globalID = 1;
    public Planinar(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ID = globalID++;
    }

    public abstract boolean penjeSe(Planina p);

    @Override
    public String toString() {
        return ime + "-" + ID;
    }
}
