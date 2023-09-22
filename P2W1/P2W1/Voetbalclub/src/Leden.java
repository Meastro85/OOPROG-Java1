/**
 * Vincent Verboven
 * 14/11/2022
 */
public class Leden {
    private static final int capaciteit = 100;
    private Lid[] ledenLijst;
    private int aantal;
    private int actieveLeden;

    public Leden(){
        this.ledenLijst = new Lid[capaciteit];
        this.aantal = 0;
    }

    public void voegLidToe(Lid lid){
        this.ledenLijst[aantal] = lid;
        this.aantal++;
    }

    public Lid getLid(int index) {
        return ledenLijst[index];
    }

    public int getAantal() {
        return aantal;
    }

    public int getAantalActieveLeden(){
        actieveLeden = 0;
        for (int i = 0; i < this.aantal; i++) {
            if (ledenLijst[i].getSoort() != Soort.STEUNEND){
                actieveLeden++;
            }
        }
        return actieveLeden;
    }

    public void printActieveLeden(){
        System.out.println("Aantal actieve leden: " + this.getAantalActieveLeden());
        for (int i = 0; i < this.aantal; i++) {
            if (ledenLijst[i].getSoort() != Soort.STEUNEND){
                System.out.println(ledenLijst[i]);
            }
        }
    }

}
