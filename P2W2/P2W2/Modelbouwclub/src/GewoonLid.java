/**
 * Vincent Verboven
 * 24/11/2022
 */
public class GewoonLid extends Lid{

    private String specialiteit;

    public GewoonLid(String naam, long nummer, String specialiteit){
        super(naam, nummer);
        this.specialiteit = specialiteit;
    }

    public String getSpecialiteit() {
        return specialiteit;
    }

    @Override
    public String toString() {
        return "gewoon lid " + super.toString();
    }
}
