/**
 * Vincent Verboven
 * 14/11/2022
 */
public class demoKaart {
    public static void main(String[] args) {
        Kaart k1 = new Kaart();
        Kaart k2 = new Kaart();
        Kaart k3 = new Kaart();
        Kaart k4 = new Kaart();
        Kaart k5 = new Kaart();

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);
        System.out.println(k5);

        System.out.println("Totale waarde: " + (k1.getWaarde() + k2.getWaarde() + k3.getWaarde() + k4.getWaarde() + k5.getWaarde()));
    }
}
