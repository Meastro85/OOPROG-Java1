import java.util.Scanner;

/**
 * Vincent Verboven
 * 26/09/2022
 */
public class Belasting {
    public static void main(String[] args) {
        double btw;
        double bedrag;
        int keuze;
        double totaalbedrag;
        double bedragGeenBtw;
        Scanner Input = new Scanner(System.in);
        System.out.print("Geef het BTW percentage: ");
        btw = Input.nextInt();
        System.out.print("Geef het bedrag in €: ");
        bedrag = Input.nextInt();
        System.out.print("Maak je keuze (1 = inclusief, 2 = exclusief): ");
        keuze = Input.nextInt();
        if(keuze == 1){
            bedragGeenBtw = bedrag / (1 + (btw/100));
            System.out.println("€" + bedragGeenBtw + " + " + btw + "% BTW = €" + bedrag);
        }else if(keuze == 2){
            totaalbedrag = bedrag * (1 + (btw/100));
            System.out.println("€" + bedrag + " + " + btw + "% BTW = €" + totaalbedrag);
        } else {
            System.out.println("Foutieve keuze!");
        }
    }
}
