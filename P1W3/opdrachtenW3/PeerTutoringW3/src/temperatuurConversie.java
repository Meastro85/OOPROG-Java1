import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/**
 * Vincent Verboven
 * 7/10/2022
 */
public class temperatuurConversie {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int conversieType = 3;
        double gradenCelsius;
        double gradenFahrenheit;
        while (conversieType != 0) {
            System.out.println("Conversie graden Celsius - Fahrenheit");
            System.out.println("=====================================");
            System.out.println("Welke conversie wens je te doen? ");
            System.out.println("    1) °C naar °F");
            System.out.println("    2) °F naar °C");
            System.out.print("Uw keuze? ");
            conversieType = Input.nextInt();
            if (conversieType == 1) {
                System.out.print("Geef de waarde in °C: ");
                gradenCelsius = Input.nextInt();
                gradenFahrenheit = (gradenCelsius * 1.8) + 32;
                System.out.println(gradenCelsius + "°C = " + gradenFahrenheit + "°F");
            } else if (conversieType == 2) {
                System.out.print("Geef de waarde in °F: ");
                gradenFahrenheit = Input.nextInt();
                gradenCelsius = (gradenFahrenheit - 32) * 5 / 9;
                System.out.println(gradenFahrenheit + "°F = " + gradenCelsius + "°C");
            } else if (conversieType > 2) {
                System.out.println("Fout type");
            }
        }
        System.out.println("Tot ziens!");
    }
}
