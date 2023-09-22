package be.kdg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList6 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Alfa");
        myList.add("Bravo");
        myList.add("Charlie");
        myList.add("Delta");

        String[] myArray = myList.toArray(new String[0]);
        for (String woord : myArray) {
            System.out.print(woord + " ");
        }
        System.out.println();
    }
}
