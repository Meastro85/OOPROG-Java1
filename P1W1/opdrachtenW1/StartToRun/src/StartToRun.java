import java.util.Scanner;

/**
 * Vincent Verboven
 * 22/09/2022
 */
public class StartToRun {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Deze applicatie berekent je ideale trainingshartslag aan de hand van de formule van Karvonen");
        System.out.print("Geef je leeftijd: ");
        int Leeftijd = Input.nextInt();
        int HartslagMax = 220 - Leeftijd;
        System.out.print("Geef je hartslag in rust: ");
        int HartslagRust = Input.nextInt();
        System.out.println("Welke soort training wil je doen?");
        System.out.println("1 : recuperatie training");
        System.out.println("2 : LSD training (Long Slow Distance)");
        System.out.println("3 : extensieve uithouding");
        System.out.println("4 : intensieve uithouding");
        System.out.println("5 : tempo-interval");
        System.out.println("6 : intensieve interval");
        System.out.print("Maak je keuze: ");
        int keuze = Input.nextInt();
        System.out.println("Je maximale hartslag is " + HartslagMax);
        if (keuze == 1) {
            double HartslagIdeaal = (HartslagRust + ((HartslagMax - HartslagRust) * 0.65));
            System.out.println("Je traint best met een hartslag rond de " + HartslagIdeaal);
        } else if( keuze == 2) {
            double HartslagIdeaal = (HartslagRust + ((HartslagMax - HartslagRust) * 0.70));
            System.out.println("Je traint best met een hartslag rond de " + HartslagIdeaal);
        } else if( keuze == 3) {
            double HartslagIdeaal = (HartslagRust + ((HartslagMax - HartslagRust) * 0.75 ));
            System.out.println("Je traint best met een hartslag rond de " + HartslagIdeaal);
        } else if( keuze == 4) {
            double HartslagIdeaal = (HartslagRust + ((HartslagMax - HartslagRust) * 0.85 ));
            System.out.println("Je traint best met een hartslag rond de " + HartslagIdeaal);
        } else if( keuze == 5) {
            double HartslagIdeaal = (HartslagRust + ((HartslagMax - HartslagRust) * 0.90 ));
            System.out.println("Je traint best met een hartslag rond de " + HartslagIdeaal);
        } else if( keuze == 6) {
            double HartslagIdeaal = (HartslagRust + ((HartslagMax - HartslagRust) * 0.95 ));
            System.out.println("Je traint best met een hartslag rond de " + HartslagIdeaal);
        }
    }
}
