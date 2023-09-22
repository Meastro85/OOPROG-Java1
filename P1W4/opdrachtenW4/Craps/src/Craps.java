import java.util.Random;
import java.util.Scanner;

/**
 * Vincent Verboven
 * 10/10/2022
 */
public class Craps {
    public static int gooi(){
        int somOgen = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Druk <ENTER> om te gooien");
        String ENTER = Input.nextLine();
        if ( ENTER.equals("")) {
            Random dobbelsteen1 = new Random();
            Random dobbelsteen2 = new Random();
            int getal1 = dobbelsteen1.nextInt(1, 7);
            int getal2 = dobbelsteen2.nextInt(1, 7);
            somOgen = getal1 + getal2;
        }
        return somOgen;
    }
    public static void main(String[] args) {
        int doelWorp = gooi();
        int worp;
        int teller = 0;
        if( doelWorp == 2 | doelWorp == 3 | doelWorp == 12){
            System.out.println("Je gooide " + doelWorp);
            System.out.println("Je bent verloren");
            System.exit(0);
        } else if( doelWorp == 7 | doelWorp == 11) {
            System.out.println("Je gooide " + doelWorp);
            System.out.println("Je bent gewonnen");
            System.exit(0);
        } else {
            System.out.println("De doelworp is: " + doelWorp);
        }
        do {
            worp = gooi();
            teller++;
            System.out.println("Je gooide " + worp);
            if (worp == 7){
                System.out.println("Je bent verloren");
                System.exit(0);
            } else if (worp == doelWorp){
                System.out.println("Je bent gewonnen in " + teller + " beurten!");
            }
        } while (worp != doelWorp);
    }
}
