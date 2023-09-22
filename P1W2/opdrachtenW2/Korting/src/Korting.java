import java.util.Scanner;

/**
 * Vincent Verboven
 * 26/09/2022
 */
public class Korting {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double bedrag;
        int artikelen;
        System.out.print("Geef het bedrag: ");
        bedrag = Input.nextDouble();
        System.out.print("Geef het aantal artikelen: ");
        artikelen = Input.nextInt();
        if( bedrag > 150  && artikelen <= 20 && artikelen >= 10 || artikelen > 100){
            System.out.println("De klant krijgt WEL korting.");
        } else {
            System.out.println("De klant krijgt GEEN korting.");
        }
    }
}
