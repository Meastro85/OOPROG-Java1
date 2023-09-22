import java.time.LocalDate;
import java.util.Scanner;

/**
 * Vincent Verboven
 * 19/09/2022
 */
public class Leeftijd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Wat is je naam? ");
        String naam = keyboard.nextLine();
        System.out.print("Beste " + naam + ", geef je geboortejaar: ");
        int geboortejaar = keyboard.nextInt();
        int jaar = LocalDate.now().getYear();
        int leeftijd = jaar - geboortejaar;
        System.out.println("Als alles goed is wordt je dit jaar " + leeftijd);
    }
}
