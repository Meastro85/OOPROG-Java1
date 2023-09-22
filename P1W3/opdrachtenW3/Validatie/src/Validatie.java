import java.util.Scanner;

/**
 * Vincent Verboven
 * 6/10/2022
 */
public class Validatie {
    public static double leesGetal(double getal, double totaalgetal, int i){
        Scanner Input = new Scanner(System.in);
            boolean correctGetal = false;
            System.out.print("Geef het " + i + "e getal: ");
            while ( !correctGetal ) {
                getal = Input.nextInt();
                if (getal > 100) {
                    System.out.print("Getal moet kleiner zijn dan 100! Opnieuw: ");
                } else if (getal > 50 && getal % 2 != 0){
                    System.out.print("Getal boven 50 moet even zijn! Opnieuw: ");
                } else{
                    correctGetal = true;
                }
            }
            totaalgetal += getal;

        return totaalgetal;
    }
    public static void main(String[] args) {
        final int deler = 5;
        double getal = 0;
        double totaalgetal = 0;
        for ( int i = 1 ; i <= 5 ; i++){
            totaalgetal = leesGetal(getal, totaalgetal, i);
        }
        double gemiddelde = totaalgetal/deler;
        System.out.println(gemiddelde);
    }
}
