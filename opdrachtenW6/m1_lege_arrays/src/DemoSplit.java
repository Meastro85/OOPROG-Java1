import java.util.Scanner;

/**
 * Vincent Verboven
 * 27/10/2022
 */
public class DemoSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tik een zin in: ");
        String zin = input.nextLine();
        String[] woorden = zin.split(" ");

        System.out.println("\nAlle woorden: ");
        for (String woord : woorden) {
            System.out.print("\"" + woord + "\" ");
        }
        char[] characters = zin.toCharArray();
        System.out.println("\nAlle letters: ");
        for (char character : characters ) {
            System.out.print("'" + character + "' " );
        }
    }
}
