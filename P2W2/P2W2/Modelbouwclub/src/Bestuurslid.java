/**
 * Vincent Verboven
 * 24/11/2022
 */
public class Bestuurslid extends Lid{

    private String functie;

    public Bestuurslid(String naam, long nummer, String functie){
        super(naam,nummer);
        this.functie = functie;
    }

    public String getFunctie() {
        return functie;
    }

    @Override
    public String toString() {
        return "bestuurslid " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        Bestuurslid lid = (Bestuurslid) obj;
        return this.getNaam().equals(lid.getNaam()) && this.getNummer() == lid.getNummer() && this.getFunctie().equals(lid.getFunctie());
    }
}
