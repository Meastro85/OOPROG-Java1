import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public class DemoArrayList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Alfa");
        myList.add("Bravo");

        String[] myArray = myList.toArray(new String[0]);
        for (String s : myArray) {
            System.out.println(s + " ");
        }
    }
}
