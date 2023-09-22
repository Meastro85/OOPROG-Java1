/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Maten {

    private int borstomtrek;
    private int heupomtrek;
    private int taille;

    public Maten() {
    }

    public Maten(int borstomtrek, int heupomtrek, int taille) {
        this.borstomtrek = borstomtrek;
        this.heupomtrek = heupomtrek;
        this.taille = taille;
    }

    public int getBorstomtrek() {
        return borstomtrek;
    }

    public int getHeupomtrek() {
        return heupomtrek;
    }

    public int getTaille() {
        return taille;
    }


    @Override
    public String toString() {
        return String.format("Maten: %d %d %d",borstomtrek,heupomtrek,taille);
    }
}
