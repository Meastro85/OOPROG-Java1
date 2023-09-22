/**
 * Vincent Verboven
 * 5/12/2022
 */
public abstract class Artikel {
    private String id;
    private double prijs;

    public Artikel(String id, double prijs) {
        this.id = id;
        this.prijs = prijs;
    }

    public String getId() {
        return id;
    }

    public double getPrijs() {
        return prijs;
    }
}
