/**
 * Vincent Verboven
 * 24/10/2022
 */
public class Speelkaart {
    private String soort;
    private String waarde;

    public Speelkaart(String soort, String waarde){
        this.soort = soort;
        this.waarde = waarde;
    }

    public String getSoort(){
        return soort;
    }

    public String getWaarde(){
        return waarde;
    }

    public String toString() {
        return this.soort + " " + this.waarde;
    }
}
