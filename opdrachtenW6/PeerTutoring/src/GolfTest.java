import golven.Golf;
import golven.GolvenGrafiek;

/**
 * Vincent Verboven
 * 28/10/2022
 */
public class GolfTest {
    public static void main(String[] args) {
        Golf demoGolf = new Golf();
        demoGolf.setFrequentie(2);
        for (double i = 1; i <= 5 ; i += 0.5 ){
            demoGolf.setAmplitude(i);
            System.out.println(demoGolf);
        }
        GolvenGrafiek grafiek = new GolvenGrafiek(5);
        grafiek.maakGolven();
        grafiek.tekenGolven();
    }
}
