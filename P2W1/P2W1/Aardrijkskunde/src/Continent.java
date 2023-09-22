/**
 * Vincent Verboven
 * 14/11/2022
 */
public enum Continent {
    NOORD_AMERIKA(24256000, 470),
    LATIJNS_AMERIKA(17819000, 331),
    EUROPA(10530750, 728),
    AZIE(44579000, 3604),
    AFRIKA(30665000, 654.5),
    AUSTRALIE(8535117, 29.5),
    ANTARCTICA(13209000, 0);

    private long oppervlakte;
    private double inwoners;

    private Continent(long oppervlakte, double inwoners){
        this.oppervlakte = oppervlakte;
        this.inwoners = inwoners;
    }

    public double bevolkingsDichtheid(){
        return (inwoners*1000000)/oppervlakte;
    }

    @Override
    public String toString() {
        return String.format("%s (bev.dichth: %.0f)",name(),bevolkingsDichtheid());
    }
}
