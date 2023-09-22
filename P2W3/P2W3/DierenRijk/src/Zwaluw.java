/**
 * Vincent Verboven
 * 28/11/2022
 */
public class Zwaluw extends Dier implements Eierleggend, Vliegend{
    private int aantalEierenPerJaar;
    private double maxVliegsnelheid;

    public Zwaluw(String naam, int eieren, double snelheid){
        super(naam);
        this.aantalEierenPerJaar = eieren;
        this.maxVliegsnelheid = snelheid;
    }


    @Override
    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    @Override
    public double getMaxVliegsnelheid() {
        return maxVliegsnelheid;
    }

    @Override
    public String toString() {
        return String.format("""
                Naam: %s
                Eieren: %d
                Snelheid: %.0f
                """, getNaam(), aantalEierenPerJaar, maxVliegsnelheid);
    }
}
