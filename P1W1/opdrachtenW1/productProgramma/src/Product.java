import java.util.Scanner;

/**
 * Dit programma neemt 3 getallen ingevoerd door de gebruiker en berekent hier het product van
 * Vincent Verboven
 * 19/09/2022
 */
public class Product {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef het eerste getal:");
        int eerste = keyboard.nextInt();
        System.out.print("Geef het tweede getal:");
        int tweede = keyboard.nextInt();
        System.out.print("Geef een derde getal:");
        int derde = keyboard.nextInt();
        int product = eerste * tweede * derde;
        System.out.println("Het product is:"+product);
    }
}
