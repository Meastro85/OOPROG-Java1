import java.util.Scanner;

/**
 * Vincent Verboven
 * 10/10/2022
 */
public class VatDemo {
    public static void main(String[] args) {
        int t = 0;
        Vat biervat = new Vat( 50 );
        System.out.println("Capaciteit: " + biervat.getCapaciteit() + " liter");
        System.out.println("Inhoud: " + biervat.getInhoud() + " liter");
        biervat.vulVolledig();
        biervat.verwijder(2);
        System.out.println("Inhoud na 8 pintjes: " + biervat.getInhoud()  + " liter");
        System.out.println("Percentage gevuld: " + biervat.getPercentageGevuld());
        System.out.println();
        Vat wijnvat = new Vat(100);
        System.out.println("Capaciteit: " + wijnvat.getCapaciteit() + " liter");
        wijnvat.vulVolledig();
        System.out.println("Inhoud: " + wijnvat.getInhoud() + " liter");
        wijnvat.verwijder(100);
        do {
            wijnvat.vul(3);
            t++;
        } while ( wijnvat.getInhoud() != 100);
        System.out.println("Aantal keer bijgevuld: " + t);
        System.out.println("Inhoud: " + wijnvat.getInhoud());
    }
}
