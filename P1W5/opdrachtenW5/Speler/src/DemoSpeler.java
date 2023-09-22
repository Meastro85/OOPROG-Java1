import Labyrint.Speler;

import java.util.Scanner;

/**
 * Vincent Verboven
 * 17/10/2022
 */
public class DemoSpeler {
    public static void main(String[] args) {
        Speler speler1 = new Speler();
        System.out.printf("speler %s bevindt zich %d, %d (%d levens)\n",
                speler1.getNaam(), speler1.getX(), speler1.getY(), speler1.getLevens());
        Scanner Input = new Scanner(System.in);
        for(int i = 0; i < 20; i++){
            speler1.verplaats();
        }
        System.out.printf("speler %s bevindt zich %d, %d (%d levens)\n",
                speler1.getNaam(), speler1.getX(), speler1.getY(), speler1.getLevens());
    }
}
