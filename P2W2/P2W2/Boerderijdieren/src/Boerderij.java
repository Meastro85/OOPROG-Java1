/**
 * Vincent Verboven
 * 24/11/2022
 */
public class Boerderij{

    private Boerderijdier[] dieren;
    private int aantalDieren;

    public Boerderij(){
        dieren = new Boerderijdier[5];
        aantalDieren = 0;
    }

    public void voegDierToe(Boerderijdier dier){
        if(this.aantalDieren < 5){
            this.dieren[aantalDieren] = dier;
            this.aantalDieren++;
        } else {
            System.out.println("Er is geen plaats meer voor " + dier.getNaam() + ". De stal zit vol!");
        }
    }

    public void toonDieren(){
        for (Boerderijdier dier : dieren ){
            System.out.println(dier);
        }
    }

    public void toonGeluiden(){
        for (Boerderijdier dier: dieren) {
            System.out.printf("%s maakt geluid \"%s\"\n",dier.getNaam(), dier.getGeluid());
        }
    }

    public void toonVoeding(){
        for (Boerderijdier dier: dieren) {
            System.out.printf("%s eet %s\n",dier.getNaam(), dier.getVoeding());
        }
    }

    public Boerderijdier zoekDierOpNaam(String naam){
        for (Boerderijdier dier: dieren) if(naam.equals(dier.getNaam())) return dier;
        return null;
    }

}
