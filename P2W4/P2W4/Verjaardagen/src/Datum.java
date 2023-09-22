/**
 * Vincent Verboven
 * 8/12/2022
 */
public class Datum implements Comparable<Datum>{
    enum Maand {
        JANUARI,FEBRUARI,MAART,APRIL,MEI,JUNI,JULI,AUGUSTUS,SEPTEMBER,OKTOBER,NOVEMBER,DECEMBER
    }

    private int dag;
    private Maand maand;

    public Datum(int dag, Maand maand){
        this.dag = dag;
        this.maand = maand;
    }

    public int getDag() {
        return dag;
    }

    public Maand getMaand() {
        return maand;
    }

    @Override
    public String toString() {
        return String.format("%d %s",dag,maand.toString().toLowerCase());
    }

    @Override
    public int compareTo(Datum datum){
        if(maand == datum.maand){
            return dag - datum.dag;
        } else {
            return maand.compareTo(datum.maand);
        }
    }
}
