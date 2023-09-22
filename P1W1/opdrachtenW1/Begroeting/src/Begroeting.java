import java.util.Scanner;

/**
 * Dit programma vraagt de naam van een persoen en begroet ze
 * Vincent Verboven
 * 19/09/2022
 */
public class Begroeting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Wat is je naam? ");
        String naam = keyboard.nextLine();
        System.out.println("Welkom " + naam + "!");
    }
}
