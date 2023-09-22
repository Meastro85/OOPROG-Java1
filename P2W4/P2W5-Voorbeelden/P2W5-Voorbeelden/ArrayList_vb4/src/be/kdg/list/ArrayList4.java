package be.kdg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {
    public static void main(String[] args) {
        String[] myArray = { "Alfa", "Bravo", "Charlie", "Delta" };
        List<String> myList = new ArrayList<>();

        for (String name : myArray) {
            myList.add(name);
        }

        System.out.println(myList);
        // Collections.addAll(myList, myArray); /* beter alternatief (later) */
    }
}
