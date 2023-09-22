import java.util.Scanner;

/**
 * Vincent Verboven
 * 21/09/2022
 */
public class Bewerkingen {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Geef het eerste getal: ");
        Double getal1 = Input.nextDouble();
        System.out.print("Geef het tweede getal: ");
        Double getal2 = Input.nextDouble();
        System.out.println("Kies een bewerking: " + "\n" +
                "1 optellen" + "\n" +
                "2 aftrekken" + "\n" +
                "3 vermenigvuldigen" + "\n" +
                "4 delen");
        int bewerking = Input.nextInt();
        System.out.println("Jouw keuze: " + bewerking);
        if(bewerking == 1){
            double uitkomst = getal1 + getal2;
            System.out.println("De uitkomst is: " + uitkomst);
        } else if (bewerking == 2){
            double uitkomst = getal1 - getal2;
            System.out.println("De uitkomst is: " + uitkomst);
        } else if (bewerking == 3){
            double uitkomst = getal1 * getal2;
            System.out.println("De uitkomst is: " + uitkomst);
        } else if(bewerking == 4){
            double uitkomst = getal1/getal2;
            System.out.println("De uitkomst is: " + uitkomst);
        }else {
            System.out.println("Geen bewerking gevonden");
        }
    }
}
