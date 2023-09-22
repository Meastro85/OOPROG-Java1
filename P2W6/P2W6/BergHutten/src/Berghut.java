/**
 * Vincent Verboven
 * 19/12/2022
 */
public class Berghut implements Comparable<Berghut>{
    private String naam;
    private int hoogte;
    private String locatie;

    public Berghut(String naam, int hoogte, String locatie) {
        this.naam = naam;
        this.hoogte = hoogte;
        this.locatie = locatie;
    }

    @Override
    public String toString() {
        return String.format("%-25s (%4dm) --> %s",naam,hoogte,locatie);
    }

    @Override
    public int compareTo(Berghut o) {
        return this.naam.compareTo(o.naam);
    }
}
