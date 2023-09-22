/**
 * Vincent Verboven
 * 28/11/2022
 */
public class Dieren{

    private Dier[] dieren;
    private int aantal;

    public Dieren(){
        this.dieren = new Dier[100];
        this.aantal = 0;
    }

    public void voegToe(Dier dier){
        if(aantal < dieren.length){
            dieren[aantal++] = dier;
        }
    }

    public void toon(){
        for (Dier dier : dieren) {
            if(dier != null) System.out.println(dier);
        }
    }
}
