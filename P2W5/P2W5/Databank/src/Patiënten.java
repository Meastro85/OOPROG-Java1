import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Vincent Verboven
 * 15/12/2022
 */
public class Patiënten {
    static int volgendeId = 0;
    private Map<Integer,Patiënt> patiënten;

    public Patiënten(){
        patiënten = new HashMap<>();
    }

    public void insert(Patiënt patiënt){
        patiënt.setId(volgendeId++);
        patiënten.put(patiënt.getId(),patiënt);
    }

    public boolean delete(int id){
        if(patiënten.containsKey(id)){
            patiënten.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public Patiënt findById(int id){
        return patiënten.get(id);
    }

    public Set<Patiënt> findByHuisarts(int id){
        Set<Patiënt> temp = null;
        for (Patiënt value : patiënten.values()) {
            if(value.getHuisartsId() == id){
                temp.add(value);
            }
        }
        return null;
    }
}
