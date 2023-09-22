import java.util.Scanner;

/**
 * Vincent Verboven
 * 3/10/2022
 */
public class Sparen {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        final int aantalJaren = 10;
        double bedrag;
        double interest;
        int teller = 0;
        System.out.print("Geef het bedrag: ");
        bedrag = Input.nextDouble();
        System.out.print("Geef het percentage: ");
        interest = Input.nextDouble();
        while( teller < aantalJaren ){
            bedrag += bedrag*(interest/100);
            System.out.println("Bedrag na jaar " + teller++ + ": " + bedrag);
        }
    }
}
