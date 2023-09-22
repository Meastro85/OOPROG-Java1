import java.util.Comparator;

/**
 * Vincent Verboven
 * 8/12/2022
 */
public class Kind implements Comparable<Kind>{
    private String naam;
    private int leeftijd;
    private double lengte; // in meter

    public Kind(String naam, int leeftijd, double lengte) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.lengte = lengte;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public double getLengte() {
        return lengte;
    }

    @Override
    public String toString() {
        return String.format("%s (%dj) is %.0fcm groot", naam,leeftijd,lengte*100);
    }

    @Override
    public int compareTo(Kind o) {
        return Double.compare(this.lengte, o.lengte);
    }
    public static class LeeftijdComparator implements Comparator<Kind>{

        @Override
        public int compare(Kind o1, Kind o2) {
            return o1.getLeeftijd() - o2.getLeeftijd();
        }
    }


}
