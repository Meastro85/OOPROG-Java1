import java.util.Scanner;

/**
 * Vincent Verboven
 * 22/09/2022
 */
public class HogerLager {
    public static void main(String[] args) {
        int teZoekenGetal = (int) (Math.random() * 100);
        /* Of: Random random = new Random()
        *      int teZoekenGetal = random.nextInt(100) */
        int gok = 0;
        int teller = 0;
        Scanner Input = new Scanner(System.in);
        while(gok != teZoekenGetal){
            teller = teller + 1;
            System.out.print("Geef een getal tussen 0 en 100: ");
            gok = Input.nextInt();
            if (gok == teZoekenGetal){
                System.out.print("Proficiat u hebt het getal geraden na " + teller + " pogingen!");
            } else if ( gok < teZoekenGetal){
                System.out.print("Te klein! ");
            } else {
                System.out.print("Te groot! ");
            }
        }
    }
}
