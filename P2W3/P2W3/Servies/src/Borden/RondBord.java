package Borden;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class RondBord extends Bord{

    private double diameter;

    public RondBord(String materiaal, String kleur, double diameter){
        super(materiaal, kleur);
        this.diameter = diameter;
    }

    @Override
    public double oppervlakte() {
        return Math.PI * (diameter/2) * (diameter/2);
    }

    @Override
    public String toString() {
        return String.format("%-10s" + super.toString() + "%-10.2fcm²","rond", oppervlakte() );
    }
}
