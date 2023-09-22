import java.util.Scanner;

/**
 * Vincent Verboven
 * 7/10/2022
 */
public class temperatuurTabel {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Conversietabel °C naar °F");
        System.out.println("=========================");
        System.out.print("Geef de begintemperatuur in °C: ");
        int beginGraden = Input.nextInt();
        System.out.print("Geef de eindtemperatuur in °C: ");
        double eindGraden = Input.nextDouble();
        if (beginGraden < eindGraden) {
            System.out.print("Geef de stapwaarde: ");
            int stapwaarde = Input.nextInt();
            System.out.println("=================");
            System.out.println("|  °C   |   °F  |");
            System.out.println("|---------------|");
            for (int i = beginGraden; i <= eindGraden; i += stapwaarde) {
                double gradenFahrenheit = (i * 1.8) + 32;
                System.out.printf("| %4d  | %5.1f |\n", i , gradenFahrenheit);
            }
            System.out.println("=================");
        } else {
            System.out.println("De begintemperatuur moet kleiner zijn dan de eindtemperatuur!");
        }
    }
}
