/**
 * Vincent Verboven
 * 15/12/2022
 */
public class Huisarts {
    private int id;
    private String naam;

    public Huisarts(String naam){
        this.naam = naam;
        this.id = -1;
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setId(int id) {
        this.id = id;
    }
}
