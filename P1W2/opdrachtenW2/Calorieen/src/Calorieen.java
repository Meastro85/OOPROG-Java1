import java.util.Scanner;

/**
 * Vincent Verboven
 * 26/09/2022
 */
public class Calorieen {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String land;
        int inwoners = 0;
        long pizzas;
        final int MINIMUM_INWONERS = 1000000;
        final long GEMIDDELDE_CALORIEEN = 2256;
        final int CALORIEEN_IN_PIZZA = 906;
        long calorieenInwoners;
        System.out.print("Geef de naam van het land: ");
        land = Input.nextLine();
        while(inwoners < MINIMUM_INWONERS){
            System.out.print("Hoeveel mensen wonen er in " + land + "? ");
            inwoners = Input.nextInt();
            if(inwoners < MINIMUM_INWONERS){
                System.out.println("Fout! Dit getal is veel te klein!");
            } else {
                calorieenInwoners = inwoners * GEMIDDELDE_CALORIEEN;
                System.out.println("In " + land + " verbruiken alle inwoners samen " + calorieenInwoners + " calorieën per dag.");
                pizzas = calorieenInwoners / CALORIEEN_IN_PIZZA ;
                System.out.println("Dat komt overeen met " + pizzas + " pizza's per dag.");
            }
        }
    }
}
