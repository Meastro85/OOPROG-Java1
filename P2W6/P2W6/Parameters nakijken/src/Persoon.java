/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Persoon {

    private String naam;

    public Persoon(String naam){
        try {
            checkNaam(naam);
            this.naam = naam;
        }catch(IllegalArgumentException e){
            System.out.println("Exception occured: " + e);
        }
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s \n",naam);
    }

    static void checkNaam(String naam) throws IllegalArgumentException{
        if(naam == null || naam.isEmpty()){
            throw new IllegalArgumentException("Naam is leeg of gelijk aan null");
        }
    }
}
