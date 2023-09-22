import java.util.*;
import java.util.stream.Collectors;

/**
 * Vincent Verboven
 * 12/12/2022
 */
public class Dubbels {
    private List<String> stringList;

    public Dubbels(List<String> list){
        stringList = new ArrayList<>();
        stringList.addAll(list);
    }

    public void verwijderDubbels(){
        Set<String> geenDubbel = new HashSet<>(stringList);
        stringList = new ArrayList<>(geenDubbel);
        Collections.sort(stringList);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 1; i <= stringList.size(); i++) {
            string.append(String.format("%-15s",stringList.get(i-1)));
            if(i % 4 == 0){
                string.append("\n");
            }
        }
        return string.toString() ;
    }
}
