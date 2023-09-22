/**
 * Vincent Verboven
 * 15/12/2022
 */
public class Patiënt {
    private int id;
    private String naam;
    private int huisartsId;

    public Patiënt(String naam){
        this.naam=naam;
        this.id=-1;
        this.huisartsId=-1;
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public int getHuisartsId() {
        return huisartsId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHuisartsId(int huisartsId) {
        this.huisartsId = huisartsId;
    }

    @Override
    public String toString() {
        return  String.format("%8d | %-20s | ",id,naam);
    }
}
