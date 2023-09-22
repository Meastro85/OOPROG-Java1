package Transportmiddelen;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public abstract class Transportmiddel {

    private double snelheid;

    public Transportmiddel(double snelheid){
        this.snelheid = snelheid;
    }

    public double getSnelheid() {
        return snelheid;
    }

    public abstract void legAfstandAf(double afstand);

}
