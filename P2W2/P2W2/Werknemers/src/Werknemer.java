/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Werknemer {
    public static final double UURLOON = 12.5;
    private long rijksregisternummer;
    private String naam;

    public Werknemer(String naam, long rijksregisternummer){
        this.naam = naam;
        this.rijksregisternummer = rijksregisternummer;
    }

    public double getLoon() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s\n" +
                "Nummer: %d\n"
                ,naam,rijksregisternummer);
    }
}
