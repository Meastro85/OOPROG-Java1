import java.util.Objects;
import java.util.Scanner;

/**
 * Vincent Verboven
 * 22/09/2022
 */
public class Tafels {
    public static void main(String[] args) {
        String JaNee = null;
        int teller = 0;
        Scanner Input = new Scanner(System.in);
        while (!Objects.equals(JaNee, "n")) {
            System.out.print("Welke tafel wil je krijgen? ");
            int tafel = Input.nextInt();
            Input.nextLine();
            while (teller != 11) {
                int uitkomst = tafel * teller;
                System.out.println(teller + " x " + tafel + " = " + uitkomst);
                teller = teller + 1;
            }
            if (teller == 11) {
                System.out.print("Wil je nog een tafel afdrukken? (j/n): ");
                JaNee = Input.nextLine();
                if (Objects.equals(JaNee, "j")) {
                    teller = 0;
                } else {
                    teller = teller + 1;
                }
            }
        }
    }
}
