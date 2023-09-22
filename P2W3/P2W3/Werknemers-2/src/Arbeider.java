/**
 * Vincent Verboven
 * 28/11/2022
 */
public class Arbeider extends Werknemer {
    public static final int MAX_UREN_PER_WEEK = 38;
    public int aantalUren;

    public Arbeider(String naam, long nummer, int aantalUren){
        super(naam, nummer);
        this.aantalUren = aantalUren;
    }

    @Override
    public double getLoon() {
        if (aantalUren > MAX_UREN_PER_WEEK){
            return (UURLOON * MAX_UREN_PER_WEEK) + (UURLOON * (aantalUren - MAX_UREN_PER_WEEK))* 1.5;
        }
        return UURLOON * aantalUren;
    }

    @Override
    public String toString() {
        return String.format(""" 
                %s
                loon: €%.1f
                """, super.toString(), getLoon());
    }
}
