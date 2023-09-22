import Borden.Bord;
import Borden.RondBord;
import Borden.VierkantBord;

import java.util.Random;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class TestBord {
    private static final Random random = new Random();
    private static final int MAX_AANTAL = 10;

    public static void main(String[] args) {
        Bord[] borden = {
                new RondBord("karton", "groen", 30),
                new VierkantBord("porcelijn", "wit", 20),
                new RondBord("plastiek", "blauw", 35),
                new VierkantBord("inox", "zilver", 25)
        };
        Bord[] gekozenBorden = new Bord[MAX_AANTAL];
        for (int i = 0; i < MAX_AANTAL ; i++){
            gekozenBorden[i] = borden[random.nextInt(4)];
        }
        for (Bord bord : gekozenBorden) {
            System.out.println(bord);
        }
    }
}
