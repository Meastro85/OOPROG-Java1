import Transportmiddelen.*;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class DemoTransportMiddelen {
    public static void main(String[] args) {
        Transportmiddel[] transportmiddelen = new Transportmiddel[] {
                new Bus(50), new Tram(40), new Trein(120), new Fiets(25),
                new TeVoet(5), new Step(20)
        };
        // schrijf hier code zodat ieder transportmiddel 10 km moet afleggen
        for (Transportmiddel transportmiddel : transportmiddelen) {
            transportmiddel.legAfstandAf(10);
        }
    }
}
