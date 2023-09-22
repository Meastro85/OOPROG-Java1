import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Vincent Verboven
 * 19/12/2022
 */
public class FileHandler {
    public static List<Berghut> leesBerghutten(String pad) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(pad));
        List<Berghut> berghutten = new ArrayList<>();
        while (scanner.hasNext()){
            String regel = scanner.nextLine();
            String[] tokens = regel.split(";");
            berghutten.add(new Berghut(tokens[0],Integer.parseInt(tokens[1]),tokens[2]));
        }
        return berghutten;
    }
}
