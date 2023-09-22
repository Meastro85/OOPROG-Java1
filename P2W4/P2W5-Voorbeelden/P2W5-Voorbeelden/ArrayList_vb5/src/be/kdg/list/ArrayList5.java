package be.kdg.list;

import java.util.Arrays;
import java.util.List;

public class ArrayList5 {
    public static void main(String[] args) {
        String[] myArray = { "Alfa", "Bravo", "Charlie", "Delta" };
        List<String> myList = Arrays.asList(myArray);

        System.out.println(myList);

        myList.add("Jef"); // <-- UnsupportedOperationException!
    }
}
