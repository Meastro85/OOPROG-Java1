import java.util.Scanner;

/**
 * Vincent Verboven
 * 24/10/2022
 */
public class temperaturen {
    Scanner Input = new Scanner(System.in);
    private final int AANTAL_TEMPERATUREN = 3;
    private double[] temps = new double[AANTAL_TEMPERATUREN];

    public void voerTemperaturenIn(){
        System.out.println("Geef de " + AANTAL_TEMPERATUREN + " temperaturen:");
        for (int i = 0 ; i < this.temps.length ; i++ ) {
            System.out.print("Dag " + (i +1) + ": ");
            this.temps[i] = Input.nextDouble();
        }
    }

    public void printTemperaturen(){
        for (int i = 0; i < this.temps.length; i++) {
            System.out.printf("Dag %d:       %.1f \n", i +1 , this.temps[i]);
        }
    }

    public double berekenGemiddelde(){
        double som = 0;
        for (double temp : temps) {
            som += temp;
        }
        return som/temps.length;
    }
}