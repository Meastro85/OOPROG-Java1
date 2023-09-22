import java.util.Scanner;

/**
 * Dit programma berekent de BMI
 * Vincent Verboven
 * 19/09/2022
 */
public class Bmi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Beste patient, dit programma berekent je BMI.");
        System.out.print("Geef je gewicht in kilogram: ");
        double gewicht = keyboard.nextDouble();
        System.out.print("Geef je lengte in meters: ");
        double lengte = keyboard.nextDouble();
        double BMI = gewicht/(lengte * lengte);
        System.out.println("Je BMI is: " + BMI);
    }
}
