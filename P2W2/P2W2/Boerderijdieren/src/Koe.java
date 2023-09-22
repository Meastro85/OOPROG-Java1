/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Koe extends Boerderijdier{
    private double literMelkPerDag;

    public Koe(String naam, double literMelkPerDag){
        super(naam, "Boeboe", "gras");
        this.literMelkPerDag = literMelkPerDag;
    }

    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s en geeft %f liter melk per dag",
                super.getNaam(),super.getGeluid(),super.getVoeding(),literMelkPerDag);
    }
}
