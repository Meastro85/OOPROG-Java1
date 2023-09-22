/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Arbeider extends Werknemer{

    private static final double MAX_UREN_PER_WEEK = 38;
    private int aantalUren;

    public Arbeider(String naam, long rijksregisternummer, int aantalUren){
        super(naam, rijksregisternummer);
        this.aantalUren = aantalUren;
    }
    @Override
    public double getLoon(){
        double loon;
        if(aantalUren > MAX_UREN_PER_WEEK){
            loon = MAX_UREN_PER_WEEK * UURLOON + ((aantalUren - MAX_UREN_PER_WEEK) * (UURLOON *1.5));
        } else {
            loon = aantalUren * UURLOON;
        }
        return loon;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "Loon: %.1f",getLoon());
    }

}
