/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Bediende extends Werknemer {

    private static final int LOONFACTOR = 192;
    private double weddeBarema;

    public Bediende(String naam, long rijksregisternummer, double weddeBarema){
        super(naam, rijksregisternummer);
        this.weddeBarema = weddeBarema;
    }

    @Override
    public double getLoon() {
        return UURLOON * LOONFACTOR * weddeBarema;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "Loon: %.1f",getLoon());
    }

}
