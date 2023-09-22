import java.util.Random;

/**
 * Vincent Verboven
 * 14/11/2022
 */
public class Kaart {
    Random generator = new Random();
    private KaartKleur kaartKleur;
    private KaartWaarde kaartWaarde;
    private int waarde;

    public Kaart(KaartKleur kaartKleur, KaartWaarde kaartWaarde){
        this.kaartKleur = kaartKleur;
        this.kaartWaarde = kaartWaarde;
    }

    public Kaart(){
        this.kaartKleur = KaartKleur.values()[generator.nextInt(KaartKleur.values().length)];
        this.kaartWaarde = KaartWaarde.values()[generator.nextInt(KaartWaarde.values().length)];
    }

    public KaartKleur getKaartKleur() {
        return kaartKleur;
    }

    public KaartWaarde getKaartWaarde() {
        return kaartWaarde;
    }

    public int getWaarde(){
        return this.getKaartWaarde().getWaarde();
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d)",this.getKaartKleur(), this.getKaartWaarde(), this.getKaartWaarde().getWaarde());
    }
}
