import java.util.ArrayList;
import java.util.List;

/**
 * Vincent Verboven
 * 19/12/2022
 */
public class Getallen {
    private List<Double> getallen;

    public Getallen(){
        getallen = new ArrayList<>();
    }

    public Getallen(Getallen getal){
        this.getallen = getal.getallen;
    }

    public void voegToe(double d){
            if(Double.isNaN(d) || Double.isInfinite(d)){
                throw new ArithmeticException("Is oneindig of NaN");
            }
            getallen.add(d);
    }

    public double gemiddelde(){
        if (getallen.size() == 0){
            throw new ArithmeticException("Geen getallen");
        }
        double tot = 0;
        for (Double d : getallen) {
            tot += d;
        }
        return tot/getallen.size();
    }
}
