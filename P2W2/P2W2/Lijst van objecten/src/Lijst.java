import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * Vincent Verboven
 * 24/11/2022
 */
public class Lijst {

    private final static int MAX_CAPACITEIT = 100;
    private Object[] objecten = new Object[MAX_CAPACITEIT];
    private int aantal = 0;

    public boolean voegToe(Object object){
        if(aantal < objecten.length){
            objecten[aantal] = object;
            aantal++;
            return true;
        }
        return false;
    }

    public Object zoek(int index){
        if(index < 0 || index > MAX_CAPACITEIT - 1){
            return null;
        }
        return objecten[index];
    }

    public boolean zoek(Object obj){
        for(int i = 0; i < aantal ; i++){
            if(objecten[i].getClass().isArray()){
                Object[] objects = (Object[]) objecten[i];
                if(Arrays.equals(objects, (Object[]) obj)) return true;
            }
            Object object = objecten[i];
            if(Objects.equals(object.toString(), obj.toString())) return true;
        }
        return false;
    }

    public int getAantal() {
        return aantal;
    }
}
