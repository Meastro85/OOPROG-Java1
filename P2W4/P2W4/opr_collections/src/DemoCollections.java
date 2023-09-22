import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Vincent Verboven
 * 8/12/2022
 */
public class DemoCollections {
    public static void main(String[] args) {
        List<Integer> getallenList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            getallenList.add(random.nextInt(1,51));
        }
        System.out.println(getallenList);
        System.out.println("gesorteerd klein -> groot");
        Collections.sort(getallenList);
        System.out.println(getallenList);
        System.out.println("soorteer van groot -> klein");
        Collections.reverse(getallenList);
        System.out.println(getallenList);
        System.out.println("schud doorgeen");
        Collections.shuffle(getallenList);
        System.out.println(getallenList);
        System.out.println("toon de grootste");
        System.out.println(Collections.max(getallenList));
        System.out.println("Druk het aantal x af dat 49 voorkomt");
        System.out.println(Collections.frequency(getallenList,49));
        System.out.println("Alle getallen op 49");
        Collections.fill(getallenList,49);
        System.out.println(getallenList);
    }
}
