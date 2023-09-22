import java.util.Scanner;

/**
 * Vincent Verboven
 * 7/10/2022
 */
public class Conversie {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Conversies");
        System.out.println("==========");
        System.out.print("Geef de te converteren eenheid: ");
        String convEenheid = Input.nextLine();
        System.out.print("Geef de eenheid naar waar geconverteerd wordt: ");
        String eenheid = Input.nextLine();
        System.out.print("Geef de waarde van a: ");
        double a = Input.nextDouble();
        System.out.print("Geef de waarde van b:");
        double b = Input.nextDouble();
        System.out.print("Geef de startwaarde in " + convEenheid + ": ");
        int startWaarde = Input.nextInt();
        System.out.print("Geef de eindwaarde in " + convEenheid + ": ");
        int eindWaarde = Input.nextInt();
        System.out.println("Geef de stapwaarde: ");
        int stapWaarde = Input.nextInt();
        System.out.println("==================");
        System.out.printf("| %s | %s |", convEenheid, eenheid);
        System.out.println("|----------------|");
        for ( int i = startWaarde; i <= eindWaarde; i += stapWaarde){
            
        }
    }
}
