/**
 * Vincent Verboven
 * 14/11/2022
 */
public class Lid {
    private int lidNr;
    private String naam;
    private static int volgendLidNr = 10000;

    public Lid(String naam) {
        this.naam = naam;
        this.lidNr=Lid.volgendLidNr++;
    }

    public int getLidNr() {
        return lidNr;
    }

    public String getNaam() {
        return naam;
    }

    public static int getVolgendLidNr() {
        return volgendLidNr;
    }

    @Override
    public String toString() {
        return String.format("%d %s", this.lidNr, this.naam);
    }
}
