package be.kdg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<String> myStringList = new ArrayList<>();

        myStringList.add(0, "Alfa");
        myStringList.add(0, "Bravo");
        myStringList.add(0, "Charlie");
        myStringList.add(0, "Delta");

        for (String string : myStringList) {
            System.out.print(string + " ");

        }

        System.out.println(myStringList.size());
        // myStringList.clear();
    }
}

/*
Delta Charlie Bravo Alfa 4
 */

