import java.util.Scanner;

/**
 * Vincent Verboven
 * 21/09/2022
 */
public class BMI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Beste patient, dit programma berekent je BMI.");
        System.out.print("Geef je gewicht in kilogram: ");
        double gewicht = keyboard.nextDouble();
        System.out.print("Geef je lengte in meters: ");
        double lengte = keyboard.nextDouble();
        double BMI = gewicht/(lengte * lengte);
        System.out.println("Je BMI is: " + BMI);
        if(BMI < 18){
            System.out.println("Je hebt ondergewicht");
        } else if( BMI > 18 && BMI < 25){
            System.out.println("Dat is in orde");
        } else if ( BMI > 25 && BMI < 30){
            System.out.println("Je hebt overgewicht");
        } else{
            System.out.println("Je hebt obesitas");
        }
    }
}
