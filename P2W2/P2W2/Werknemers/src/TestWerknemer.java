/**
 * Vincent Verboven
 * 21/11/2022
 */
public class TestWerknemer {
    public static void main(String[] args) {
        Werknemer[] werknemers = {
                new Arbeider("Jos", 57082332149L, 38),
                new Arbeider("Els", 61030350468L, 40),
                new Bediende("Erik", 54110774131L, 1.6)
        };
        double lonen = 0;
        for (Werknemer werknemer: werknemers
             ) {
            System.out.println(werknemer + "\n");
            lonen += werknemer.getLoon();
        }

        System.out.println("Som lonen: " + lonen);

    }
}
