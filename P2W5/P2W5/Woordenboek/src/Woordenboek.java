import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

/**
 * Vincent Verboven
 * 15/12/2022
 */
public class Woordenboek {
    Map<String, String> woorden;

    public Woordenboek(){
        this.woorden = new TreeMap<>();
    }

    public void voegWoordToe(String woord, String vertaling){
        woorden.put(woord,vertaling);
    }

    public String vertaal(String woord){
        return woorden.getOrDefault(woord, "Vertaling niet gevonden");
    }

    public int aantalWoorden(){
        return woorden.size();
    }
}
