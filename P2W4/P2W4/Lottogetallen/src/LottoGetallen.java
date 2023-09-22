import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SimpleTimeZone;

/**
 * Vincent Verboven
 * 8/12/2022
 */
public class LottoGetallen {
    private List<Integer> getallen;
    private int[] lottoGetallen;

    public LottoGetallen(){
        getallen = new ArrayList<>();
        for(int i = 1; i <= 45;i++){
            getallen.add(i);
        }
        lottoGetallen = new int[6];
    }

    public void genereerLottoGetallen(){
        Collections.shuffle(getallen);
        for(int i = 0; i < 6; i++){
            lottoGetallen[i] = getallen.get(i);
        }
    }

    public String toonLottoGetallen(){
        StringBuilder getalString = new StringBuilder();
        for(int i = 0; i < 6; i++){
            getalString.append(String.format("%3d",lottoGetallen[i]));
        }
        return getalString.toString();
    }

}