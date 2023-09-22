import java.util.Objects;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public class Acteur implements Comparable<Acteur>{
    private String naam;
    private int geboortejaar;

    public Acteur(String naam, int geboortejaar) {
        this.naam = naam;
        this.geboortejaar = geboortejaar;
    }

    public String getNaam() {
        return naam;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    @Override
    public String toString() {
        return String.format("%d %s",geboortejaar,naam);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acteur acteur = (Acteur) o;
        return geboortejaar == acteur.geboortejaar && Objects.equals(naam, acteur.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, geboortejaar);
    }

    @Override
    public int compareTo(Acteur o) {
        return geboortejaar - o.getGeboortejaar();
    }
}
