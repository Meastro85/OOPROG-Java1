import java.util.Collections;
import java.util.Comparator;

/**
 * Vincent Verboven
 * 8/12/2022
 */
public class Persoon implements Comparable<Persoon>{
    private String naam;
    private Datum verjaardag;

    public Persoon(String naam,Datum verjaardag){
        this.naam = naam;
        this.verjaardag = verjaardag;
    }

    public Persoon(String naam, int dag, Datum.Maand maand){
        this.naam = naam;
        this.verjaardag = new Datum(dag, maand);
    }

    public String getNaam() {
        return naam;
    }

    public Datum getVerjaardag() {
        return verjaardag;
    }

    @Override
    public String toString() {
        return String.format("%10s -> %s",naam,verjaardag);
    }

    @Override
    public int compareTo(Persoon o) {
        return this.naam.compareTo(o.naam);
    }

    public static class DatumComparator implements Comparator<Persoon>{

        @Override
        public int compare(Persoon o1, Persoon o2) {
            return o1.getVerjaardag().compareTo(o2.getVerjaardag());
        }
    }
}
