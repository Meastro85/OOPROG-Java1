import java.util.HashMap;
import java.util.Map;

/**
 * Vincent Verboven
 * 15/12/2022
 */
public class Huisartsen {
    static int volgendeId = 0;
    private Map<Integer,Huisarts> huisartsen;

    public Huisartsen() {
        huisartsen = new HashMap<>();
    }

    public void insert(Huisarts huisarts){
        huisarts.setId(volgendeId++);
        huisartsen.put(huisarts.getId(),huisarts);
    }

    public boolean delete(int id){
        if(huisartsen.containsKey(id)){
            huisartsen.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public Huisarts findById(int id){
        return huisartsen.get(id);
    }
}
