import java.util.Random;

/**
 * Vincent Verboven
 * 19/10/2022
 */
public class Dobbelsteen {
    private int zijden;

    public Dobbelsteen(int zijden){
        this.zijden = zijden;
    }

    public void setZijden(int zijden){
        this.zijden = zijden;
    }

    public int gooi(){
        Random generator = new Random();
        int getal = generator.nextInt(1,zijden + 1);
        return getal;
    }
}
