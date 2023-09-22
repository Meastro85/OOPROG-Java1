import java.lang.reflect.Array;
import java.util.*;

/**
 * Vincent Verboven
 * 12/12/2022
 */
public class DemoGirl {
    public static void main(String[] args) {
        Girl[] girls = {new Girl("An", 20),new Girl("Bea", 20),
                new Girl("Bea", 25), new Girl("Diana", 25),
                new Girl("Zoë", 18), new Girl("Katleen", 18),
                new Girl("Bea", 20)};

        List<Girl> girlsList = new ArrayList<>(Arrays.asList(girls));
        Set<Girl> girlsSet = new HashSet<>(Arrays.asList(girls));

        System.out.println(girlsList);
        System.out.println(girlsSet);


    }
}
