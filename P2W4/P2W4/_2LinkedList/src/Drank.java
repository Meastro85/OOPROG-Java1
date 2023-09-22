/**
 * Vincent Verboven
 * 5/12/2022
 */
public class Drank {
    private String naam;
    private double prijs;
    private boolean isAlcoholisch;

    public Drank(String naam, double prijs, boolean isAlcoholisch) {
        this.naam = naam;
        this.prijs = prijs;
        this.isAlcoholisch = isAlcoholisch;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public boolean isAlcoholisch() {
        return isAlcoholisch;
    }

    @Override
    public String toString() {
        return String.format("%s €%.2f",naam,prijs);
    }
}
