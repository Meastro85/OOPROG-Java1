package be.kdg.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {
        String[] fruitStrings = {"banaan", "peer", "appel", "pruim", "kokosnoot"};
        List<String> fruitList = new ArrayList<>(Arrays.asList(fruitStrings));
        Collections.sort(fruitList);
        System.out.println("na sort: " + fruitList);
        Collections.shuffle(fruitList);
        System.out.println("na shuffle: " + fruitList);
        Collections.reverse(fruitList);
        System.out.println("na reverse: " + fruitList);
        System.out.println("min: " + Collections.min(fruitList));
        System.out.println("max: " + Collections.max(fruitList));
    }
}

/*
na sort: [appel, banaan, kokosnoot, peer, pruim]
na shuffle: [banaan, pruim, appel, peer, kokosnoot]
na reverse: [kokosnoot, peer, appel, pruim, banaan]
min: appel
max: pruim
 */