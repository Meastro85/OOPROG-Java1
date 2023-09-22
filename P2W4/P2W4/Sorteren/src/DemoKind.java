import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Vincent Verboven
 * 8/12/2022
 */
public class DemoKind {
    public static void main(String[] args) {
        List<Kind> kinderen = new ArrayList<>();
        kinderen.add(new Kind("Dorien",8,1.40));
        kinderen.add(new Kind("Stevie",2,0.72));
        kinderen.add(new Kind("Wouter",5,1.05));
        System.out.println(kinderen);
        kinderen.sort(new Kind.LeeftijdComparator());
        System.out.println(kinderen);

        // met anonieme klasse:
        kinderen.sort(Comparator.comparingDouble(Kind::getLengte));

        Collections.sort(kinderen, new Comparator<>() {
            @Override
            public int compare(Kind o1, Kind o2) {
                return Double.compare(o1.getLengte(), o2.getLengte());
            }
        });
    }
}