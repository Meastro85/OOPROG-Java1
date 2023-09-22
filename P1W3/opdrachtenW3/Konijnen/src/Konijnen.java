import java.util.Scanner;

/**
 * Vincent Verboven
 * 6/10/2022
 */
public class Konijnen {
    public static int berekenKonijnen(int maanden){
        int getal1 = 1;
        int getal2 = 2;
        while( maanden > 2){
            int getal3 = getal1 + getal2;
            getal1 = getal2;
            getal2= getal3;
            maanden--;
        }
        return getal2;
    }
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Aantal maanden: ");
        int maanden = Input.nextInt();
        System.out.println("Na " + maanden + " maanden heb je " + berekenKonijnen(maanden) + " paar konijnen");
    }
}
