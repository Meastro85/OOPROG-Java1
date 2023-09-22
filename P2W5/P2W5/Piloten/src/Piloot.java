import java.util.Set;
import java.util.TreeSet;

/**
 * Vincent Verboven
 * 15/12/2022
 */
public class Piloot {
    private String nationaliteit;
    private String naam;
    private int aantalTitels;
    private Set<Integer> seizoenen;

    public Piloot(String nat, String naam, int aantalTitels){
        this.nationaliteit = nat;
        this.naam = naam;
        this.aantalTitels = aantalTitels;
        this.seizoenen = new TreeSet<>();
    }

    public void voegSeizoenToe(int jaar){
        seizoenen.add(jaar);
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalTitels() {
        return aantalTitels;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-25s %-3d %s",nationaliteit,naam,aantalTitels,seizoenen);
    }
}
