package be.kdg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> myStringList = new ArrayList<>();

        myStringList.add("Alfa");
        myStringList.add("Bravo");
        myStringList.add("Charlie");
        myStringList.add("Delta");

        for (String element : myStringList) {
            System.out.print(element + " ");
        }

        System.out.println(myStringList.size());
        // myStringList.clear();

    }
}

/*
Alfa Bravo Charlie Delta 4
 */






