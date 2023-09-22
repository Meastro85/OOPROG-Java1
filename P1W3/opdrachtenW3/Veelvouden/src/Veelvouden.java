import java.util.Scanner;

/**
 * Vincent Verboven
 * 3/10/2022
 */
public class Veelvouden {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        final int maxWaarde = 100;
        double getal = 0;
        double veelvoud = 0;
        int teller =0;
        System.out.print("Van welk getal wil je de veelvouden? ");
        getal = Input.nextDouble();
        while( veelvoud <= maxWaarde){
            System.out.print(veelvoud + " ");
            veelvoud = getal * teller;
            teller++;
        }
    }
}
