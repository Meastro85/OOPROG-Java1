/**
 * Vincent Verboven
 * 28/11/2022
 */
public class TestWerknemer {
    public static void main(String[] args) {
        Werknemer[] werknemers = {
                new Arbeider("Jos", 57082332149L, 38),
                new Arbeider("Els", 61030350468L, 40),
                new Bediende("Erik", 54110774131L, 1.6)
        };

        // vul hier aan
        double somLonen = 0;
        for (Werknemer werknemer : werknemers) {
            System.out.println(werknemer);
            somLonen += werknemer.getLoon();
        }
        System.out.println("Som lonen: " + somLonen);
    }
}
