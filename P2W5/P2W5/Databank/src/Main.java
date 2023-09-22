import java.util.Iterator;

/**
 * Vincent Verboven
 * 15/12/2022
 */
public class Main {
    public static void main(String[] args) {
        Patiënten patiënten = new Patiënten();
        Huisartsen huisartsen = new Huisartsen();

        Huisarts huisarts = new Huisarts("Paulien Vermeiren");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Haron Verheyen");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Nikolai Van Wouwe");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Matthieu Saleh");
        huisartsen.insert(huisarts);

        Patiënt patiënt = new Patiënt("Flor Wan");
        patiënt.setHuisartsId(0);
        patiënten.insert(patiënt);
        patiënt = new Patiënt("Bart Matondo");
        patiënt.setHuisartsId(3);
        patiënten.insert(patiënt);
        patiënt = new Patiënt("Elias Magnus");
        patiënt.setHuisartsId(2);
        patiënten.insert(patiënt);
        patiënt = new Patiënt("Kevin Koch");
        patiënt.setHuisartsId(1);
        patiënten.insert(patiënt);
        patiënt = new Patiënt("Lien Krasnovitski");
        patiënt.setHuisartsId(0);
        patiënten.insert(patiënt);
        patiënt = new Patiënt("Kay Adib");
        patiënt.setHuisartsId(6);
        patiënten.insert(patiënt);

        for (int i = 0; i < Patiënten.volgendeId; i++) {
            if (patiënten.findById(i).getHuisartsId() == -1 || patiënten.findById(i).getHuisartsId() >= Huisartsen.volgendeId) {
                System.out.println("Patiënt " + patiënten.findById(i).getNaam() + " Heeft geen geldige huisarts. Deze wordt verwijderd.");
                patiënten.delete(i);
            }
        }
        System.out.println("""
                Alle patiënten:
                ID       | NAAM                 | HUISARTS
                ------------------------------------------------------""");
        for (int i = 0; i < Patiënten.volgendeId; i++) {
            if (patiënten.findById(i) != null) {
                System.out.println(patiënten.findById(i) + huisartsen.findById(patiënten.findById(i).getHuisartsId()).getNaam());
            }
        }

        System.out.println("""
                Alle patiënten bij P. Vermeiren:
                ID       | NAAM                 | HUISARTS
                ------------------------------------------------------""");
        for (int i = 0; i < Patiënten.volgendeId; i++) {
            if (patiënten.findById(i) != null && huisartsen.findById(patiënten.findById(i).getHuisartsId()).getNaam().equals("Paulien Vermeiren")) {
                System.out.println(patiënten.findById(i) + huisartsen.findById(patiënten.findById(i).getHuisartsId()).getNaam());
            }
        }
    }
}