import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Vincent Verboven
 * 12/12/2022
 */
public class DemoHashSet {
    public static void main(String[] args) {
        String[] girls = {"An", "Bea", "Bea", "Diana",
                "Zoë", "Katleen", "Kristin", "Bea", "Kristin",
                "Gertrude"};

        Set<String> namenSet = new HashSet<>(Arrays.asList(girls));
        System.out.println(namenSet);
        System.out.println("via foreach loop");
        for (String naam : namenSet) {
            System.out.print(naam + " ");
        }

        System.out.println("\nvia iterator");
        for (Iterator<String> iterator = namenSet.iterator(); iterator.hasNext(); ) {
            String next =  iterator.next();
            System.out.print(next + " ");
        }

    }
}
