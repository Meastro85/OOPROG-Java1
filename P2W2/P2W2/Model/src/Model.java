/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Model extends Persoon{

    private Maten maten;
    private Adres adres;

    public Model(String naam) {
        super(naam);
        this.maten = new Maten(90,60,90);
        this.adres = null;
    }

    public Model(String naam, int borst, int heup, int taille){
        super(naam);
        this.maten = new Maten(borst,heup,taille);
        this.adres = null;
    }

    public int getBorstomtrek(){
        return maten.getBorstomtrek();
    }

    public int getHeupomtrek(){
        return maten.getHeupomtrek();
    }

    public int getTaille(){
        return maten.getTaille();
    }

    public Adres getAdres(){
        return adres;
    }

    public void setAdres(Adres adres){
        this.adres = adres;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s \n",adres == null ? "onbekend" : adres) + maten.toString();
    }
}
