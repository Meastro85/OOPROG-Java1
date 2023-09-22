/**
 * Vincent Verboven
 * 14/11/2022
 */
public class Lid {
    private int id;
    private String naam;
    private Soort soort;

    public Lid(int id, String naam, Soort soort) {
        this.id = id;
        this.naam = naam;
        this.soort = soort;
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public Soort getSoort() {
        return soort;
    }

    @Override
    public String toString() {
        return String.format("%-5d%-7s soort: %s",this.id,this.naam,this.getSoort().toString().toLowerCase());
    }
}
