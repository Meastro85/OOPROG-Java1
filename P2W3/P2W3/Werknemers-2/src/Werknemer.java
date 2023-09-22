/**
 * Vincent Verboven
 * 28/11/2022
 */
public abstract class Werknemer {
    public static final double UURLOON = 12.5;
    private String naam;
    private long rijksregisternummer;

    public Werknemer(String naam, long rijksregisternummer){
        this.naam = naam;
        this.rijksregisternummer = rijksregisternummer;
    }

    public String getNaam() {
        return naam;
    }

    public long getRijksregisternummer() {
        return rijksregisternummer;
    }

    public abstract double getLoon();

    @Override
    public String toString() {
        return String.format(""" 
                Naam: %s
                Nummer: %d""", naam, rijksregisternummer);
    }
}
