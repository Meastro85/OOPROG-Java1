import java.util.Scanner;

/**
 * Vincent Verboven
 * 3/10/2022
 */
public class Maanden {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int maand;
        boolean isSchrikkeljaar = false;
        int jaar;
        System.out.print("Geef een maand in in de vorm van een cijfer (1 = januari): ");
        maand = Input.nextInt();
        System.out.print("Geef een jaar (met 4 cijers): ");
        jaar = Input.nextInt();
        if ((jaar % 400 == 0) || ((jaar % 4 == 0) && (jaar % 100 != 0))) {
            isSchrikkeljaar = true;
        }
        switch (maand) {
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10  : case 12 :
                System.out.println("In het jaar " + jaar + " telt de " + maand + "e maand 31 dagen.");
                break;
            case 2 :
                if(isSchrikkeljaar) {
                    System.out.println("In het jaar " + jaar + " telt de 2e maand 29 dagen.");
                } else {
                    System.out.println("In het jaar " + jaar + " telt de 2e maand 28 dagen.");
                }
                break;
            case 4 : case 6 : case 9 : case 11 :
                System.out.println("In het jaar " + jaar + " telt de " + maand + "e maand 30 dagen.");
                break;
            default :
                System.out.println("Ongeldige maand ingegeven. Einde!");
                break;
        }
    }
}
