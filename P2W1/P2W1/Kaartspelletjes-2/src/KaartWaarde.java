/**
 * Vincent Verboven
 * 14/11/2022
 */
public enum KaartWaarde {
    AAS(1), TWEE(2), DRIE(3), VIER(4), VIJF(5), ZES(6), ZEVEN(7), ACHT(8), NEGEN(9), TIEN(10), BOER(10), DAME(10), HEER(10);

    private int waarde;

    private KaartWaarde(int waarde){
        this.waarde = waarde;
    }

    public int getWaarde() {
        return waarde;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
