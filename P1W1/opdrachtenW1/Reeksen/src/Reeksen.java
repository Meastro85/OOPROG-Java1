import java.util.Scanner;

/**
 * Vincent Verboven
 * 22/09/2022
 */
public class Reeksen {
    public static void main(String[] args) {
        int teller = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Hoeveel getallen wil je afdrukken? ");
        int Rij = Input.nextInt();
        System.out.print("Met welke waarde wil je starten? ");
        double StartWaarde = Input.nextDouble();
        System.out.print("Met welke waarde wil je verhogen? ");
        double Verhoging = Input.nextDouble();
        while (teller != Rij){
            System.out.print(StartWaarde + " ");
            StartWaarde = StartWaarde + Verhoging;
            teller = teller + 1;
        }

    }
}
