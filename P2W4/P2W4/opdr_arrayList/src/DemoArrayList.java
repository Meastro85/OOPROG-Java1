import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public class DemoArrayList {
    public static void main(String[] args) {
        List<String> namen = new ArrayList<>();
        namen.add("Albert");
        namen.add("Hendrik");
        namen.add("Jozefien");
        namen.add("Annabel");
        namen.add("Adelbert");
        System.out.println(namen.get(0) + " " + namen.get(namen.size() - 1) );
        for (String naam : namen) {
            System.out.println(naam);
        }
        System.out.println();
        System.out.println(namen.contains("Joske"));
        for(Iterator<String> it = namen.iterator(); it.hasNext(); ){
            if(it.next().toUpperCase().startsWith("A")){
                it.remove();
            }
        }
        System.out.println();
        for (int i = 0; i < namen.size(); i++){
            System.out.println(namen.get(i).toString());
        }
        System.out.println(namen);
    }
}
