package wijnen;

import java.time.LocalDate;

public class Champagne extends Wijn {

    private Smaak smaak;

    public Champagne(String naam, String streek, LocalDate oogstDatum, double basisPrijs, Smaak smaak){
        super(naam, streek, oogstDatum, basisPrijs);
        this.smaak = smaak;
    }

    @Override
    public double berekenPrijs() {
        if(smaak.toString().toLowerCase().contains("brut")){
            return getBasisPrijs() * 1.1;
        }
        return getBasisPrijs();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" --> Type: %s",smaak);
    }
}
