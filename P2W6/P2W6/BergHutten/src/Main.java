import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

/**
 * Vincent Verboven
 * 19/12/2022
 */
public class Main {
    public static void main(String[] args) {
        try {
            List<Berghut> berghutten = FileHandler.leesBerghutten("C:\\School\\OOPROG1\\practicum\\Java\\P2W6\\P2W6\\BergHutten\\Data\\berghutten.csv");
            Collections.sort(berghutten);
            for (Berghut berghut : berghutten) {
                System.out.println(berghut);
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
