import java.util.Random;

/**
 * Vincent Verboven
 * 10/10/2022
 */
public class lottoGetallen {
    public static void main(String[] args) {
        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            int getal = generator.nextInt(45) + 1;
            System.out.print(getal + " ");
        }
        System.out.println();
        for (int t = 0; t < 5; t++) {
            int evenGetal = generator.nextInt(30) * 2;
            System.out.print(evenGetal + " ");
        }
    }
}