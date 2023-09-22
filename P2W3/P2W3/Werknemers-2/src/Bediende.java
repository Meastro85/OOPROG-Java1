/**
 * Vincent Verboven
 * 28/11/2022
 */
public class Bediende extends Werknemer {
    public static final int LOONFACTOR = 192;
    private double weddeBarema;

    public Bediende(String naam, long nummer, double barema){
        super(naam, nummer);
        this.weddeBarema = barema;
    }

    @Override
    public double getLoon() {
        return UURLOON * LOONFACTOR * weddeBarema;
    }

    @Override
    public String toString() {
        return String.format(""" 
                %s
                loon: €%.1f
                """, super.toString(), getLoon());
    }
}
