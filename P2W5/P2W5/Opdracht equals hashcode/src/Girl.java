import java.util.Objects;

/**
 * Vincent Verboven
 * 12/12/2022
 */
public class Girl {
    private String naam;
    private int leeftijd;

    public Girl(String naam, int leeftijd){
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s leeftijd: %d ",naam,leeftijd);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return leeftijd == girl.leeftijd && Objects.equals(naam, girl.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, leeftijd);
    }
}
