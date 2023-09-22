/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Konijn extends Boerderijdier{

    private boolean isGraver;

    public Konijn(String naam, boolean isGraver){
        super(naam,"Snifsnif","gras");
        this.isGraver = isGraver;
    }

    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en graaft %s",
                super.getNaam(),super.getGeluid(),super.getVoeding(), isGraver ? "wel" : "niet");
    }
}
