/**
 * Vincent Verboven
 * 28/11/2022
 */
public class Struisvogel extends Dier implements Eierleggend {
    private int aantalEierenPerJaar;

    public Struisvogel(String naam, int eieren){
        super(naam);
        this.aantalEierenPerJaar = eieren;
    }


    @Override
    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    @Override
    public String toString() {
        return String.format("""
                Naam: %s
                Eieren: %d
                """, getNaam(), aantalEierenPerJaar);
    }
}
