/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Adres {

    private String straatNr;
    private int postnummer;

    public Adres(String straatNr, int postnummer) {
        try {
            checkStraatNr(straatNr,postnummer);
            this.straatNr = straatNr;
        this.postnummer = postnummer;
        }catch(IllegalArgumentException e){
            System.out.println("Exception occured: " + e);
        }
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

    static void checkStraatNr(String straatNr, int postnummer) throws IllegalArgumentException{
        if(straatNr.isEmpty() || straatNr == null){
            throw new IllegalArgumentException("Straatnr is leeg of null");
        }
        if(postnummer < 0 | postnummer > 9999){
            throw new IllegalArgumentException("Postnummer is invalid");
        }
    }
}
