import java.util.Scanner;

/**
 * Vincent Verboven
 * 21/09/2022
 */
public class Sommeren {
    public static void main(String[] args) {
        double Getal = 1;
        double uitkomst = 0;
        Scanner Input = new Scanner(System.in);
        while(Getal != 0){
            System.out.print("Geef een getal (stop met 0): ");
            Getal = Input.nextDouble();
            uitkomst = uitkomst + Getal;
        }
        System.out.print("De uitkomst is: "+ uitkomst);

    }
}
