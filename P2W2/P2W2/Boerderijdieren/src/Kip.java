/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Kip extends Boerderijdier {

    private int eierenPerWeek;

    public Kip(String naam, int eierenPerWeek){
        super(naam, "Toktok", "mais");
        this.eierenPerWeek = eierenPerWeek;
    }

    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en legt %d eieren per week",
                super.getNaam(),super.getGeluid(),super.getVoeding(),eierenPerWeek);
    }
}
