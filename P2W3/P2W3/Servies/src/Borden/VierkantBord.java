package Borden;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class VierkantBord extends Bord{

    private double zijde;

    public VierkantBord(String materiaal, String kleur, double zijde){
        super(materiaal, kleur);
        this.zijde = zijde;
    }

    @Override
    public double oppervlakte() {
        return zijde*zijde;
    }

    @Override
    public String toString() {
        return String.format("%-10s" + super.toString() + "%-10.2fcm²","Vierkant", oppervlakte());
    }
}
