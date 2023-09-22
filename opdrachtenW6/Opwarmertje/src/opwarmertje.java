/**
 * Vincent Verboven
 * 24/10/2022
 */
public class opwarmertje {
    public static void main(String[] args) {
        temperaturen temps = new temperaturen();
        temps.voerTemperaturenIn();
        System.out.println("\nOverzicht:\n" +
                "=================");
        temps.printTemperaturen();
        System.out.println("=================");
        System.out.printf("Gemiddelde: %.2f", temps.berekenGemiddelde());
    }
}
