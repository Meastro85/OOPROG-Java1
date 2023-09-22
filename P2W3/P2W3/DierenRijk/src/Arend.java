/**
 * Vincent Verboven
 * 28/11/2022
 */
public class Arend extends Dier implements Eierleggend, Vliegend{

    private int aantalEierenPerJaar;
    private double maxVliegsnelheid;
    private double duiksnelheid;

    public Arend(String naam, int eieren, double snelheid, double duiksnelheid){
        super(naam);
        this.aantalEierenPerJaar = eieren;
        this.maxVliegsnelheid = snelheid;
        this.duiksnelheid = duiksnelheid;
    }

    @Override
    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    @Override
    public double getMaxVliegsnelheid() {
        return maxVliegsnelheid;
    }

    public double getDuiksnelheid(){
        return duiksnelheid;
    }

    @Override
    public String toString() {
        return String.format("""
                Naam: %s
                Eieren: %d
                Snelheid: %.0f
                Duiksnelheid: %.0f
                """, getNaam(), aantalEierenPerJaar, maxVliegsnelheid, duiksnelheid);
    }
}
