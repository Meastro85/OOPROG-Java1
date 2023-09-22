/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Persoon {

    private String naam;

    public Persoon(String naam){
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s \n",naam);
    }
}
