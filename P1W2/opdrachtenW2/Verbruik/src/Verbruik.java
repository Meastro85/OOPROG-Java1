import java.util.Scanner;

/**
 * Vincent Verboven
 * 26/09/2022
 */
public class Verbruik {
    public static void main(String[] args) {
        int vorigeKilometerstand;
        int huidigeKilometerstand;
        int totaleAfstand;
        double aantalGetankteLiters;
        double gemiddeldVerbruik;
        Scanner Input = new Scanner(System.in);
        System.out.print("Geef de vorige kilometerstand: ");
        vorigeKilometerstand = Input.nextInt();
        System.out.print("Geef de huidige kilometerstand: ");
        huidigeKilometerstand = Input.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        aantalGetankteLiters = Input.nextDouble();
        totaleAfstand = huidigeKilometerstand - vorigeKilometerstand;
        gemiddeldVerbruik = ( aantalGetankteLiters * 100)/ totaleAfstand;
        System.out.println("Vebruik voor " + totaleAfstand + "km    : " + gemiddeldVerbruik + " liter/100km.");

    }
}
