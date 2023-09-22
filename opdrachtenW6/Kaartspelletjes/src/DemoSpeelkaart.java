import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Vincent Verboven
 * 24/10/2022
 */
public class DemoSpeelkaart {
    static Random generator = new Random();
    static String[] kleuren = { "Harten", "Schoppen", "Ruiten", "Klaveren" };
    static String[] waarden = {
            "Aas", "Twee", "Drie", "Vier", "Vijf",
            "Zes", "Zeven", "Acht", "Negen", "Tien",
            "Boer", "Dame", "Heer"};
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int aantalKaarten;
        System.out.print("Hoeveel kaarten wens je: ");
        aantalKaarten = Input.nextInt();
        toonSpeelKaarten(maakSpeelkaarten(aantalKaarten));
    }

    public static Speelkaart[] maakSpeelkaarten(int teller) {
        Speelkaart[] kaarten = new Speelkaart[teller];
        for(int i = 0; i < teller; i++){
            Speelkaart kaart = new Speelkaart(kleuren[generator.nextInt(kleuren.length)],waarden[generator.nextInt(waarden.length)]);
            kaarten[i] = kaart;
        }
        return kaarten;
    }

    public static void toonSpeelKaarten(Speelkaart[] kaarten){
        for(Speelkaart kaart : kaarten){
            System.out.println(kaart);
        }
    }
}
