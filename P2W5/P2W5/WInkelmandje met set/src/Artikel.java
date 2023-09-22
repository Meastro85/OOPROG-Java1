import java.util.Objects;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public abstract class Artikel {
    private String titel;
    private String id;
    private double prijs;

    public Artikel(String id, double prijs, String titel) {
        this.id = id;
        this.prijs = prijs;
        this.titel = titel;
    }

    public String getId() {
        return id;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getTitel() {
        return titel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikel artikel = (Artikel) o;
        return Objects.equals(id, artikel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
