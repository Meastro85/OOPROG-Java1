package wijnen;

import java.time.LocalDate;

public class Likeur extends Wijn {

    private double alcoholGehalte; //in procent

    public Likeur(String naam, String streek, LocalDate oogstDatum, double basisPrijs, double alcoholGehalte){
        super(naam,streek,oogstDatum,basisPrijs);
        this.alcoholGehalte = alcoholGehalte;
    }

    @Override
    public double berekenPrijs() {
        if(alcoholGehalte > 0.5){
            return getBasisPrijs() * 1.25;
        }
        return getBasisPrijs();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" --> %.0f%s alc",alcoholGehalte * 100,"%");
    }
}
