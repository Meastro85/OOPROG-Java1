/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Adres {

    private String straatNr;
    private int postnummer;

    public Adres(String straatNr, int postnummer) {
        this.straatNr = straatNr;
        this.postnummer = postnummer;
    }

    public String getStraatNr() {
        return straatNr;
    }

    public int getPostnummer() {
        return postnummer;
    }

    @Override
    public String toString() {
        return String.format("Adres: %s, %d",straatNr,postnummer);
    }
}
