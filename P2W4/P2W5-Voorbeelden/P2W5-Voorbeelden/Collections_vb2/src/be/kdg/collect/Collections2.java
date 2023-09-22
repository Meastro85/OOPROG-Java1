package be.kdg.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections2 {
    public static void main(String[] args) {
        String[] fruit = {"banaan", "peer", "appel", "pruim", "kokosnoot"};
        String[] groenten = {"sla", "witloof", "tomaat"};
        List<String> fruitList = new ArrayList<>(Arrays.asList(fruit));
        List<String> groentenList = new ArrayList<>(Arrays.asList(groenten));

        Collections.fill(fruitList, "kiwi");
        System.out.println("na fill: " + fruitList);
        System.out.println("freqency: " +
        Collections.frequency(fruitList,"kiwi"));
        Collections.copy(fruitList, groentenList);
        System.out.println("Na copy: " + fruitList);
        boolean verschillend = Collections.disjoint(groentenList, fruitList);
        System.out.println("disjoint: " + verschillend);
    }
}
