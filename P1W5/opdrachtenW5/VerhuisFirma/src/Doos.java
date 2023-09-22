/**
 * Vincent Verboven
 * 17/10/2022
 */
public class Doos {
    private String type;
    private double lengte;
    private double breedte;
    private double hoogte;

    public Doos(String type, double lengte, double breedte, double hoogte){
        this.type = type;
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public Doos(String type){
        this.type = type;
        switch(type){
            case "Type1": this.lengte = 100; this.breedte = 50; this.hoogte = 50; break;
            case "Type2": this.lengte = 50; this.breedte = 25; this.hoogte = 25; break;
            case "Type3": this.lengte = 25; this.breedte = 12.5; this.hoogte = 12.5; break;
            default:
                System.out.println("Fout! De doos " + type + " bestaat niet.");
                this.lengte = -1; this.breedte = -1; this.hoogte = -1; break;
        }
    }

    public double oppervlakte(){
        double Oppervlakte = this.breedte * this.lengte;
        return Oppervlakte;
    }

    public double volume(){
        double volume = this.lengte * this.breedte * this.hoogte;
        return volume;
    }

    public double tapeLengte(){
        double tape = (2*this.lengte) + (2* this.hoogte);
        return tape;
    }

    public String toString(){
        return  "Doos van het type \"" + this.type + "\":\n" +
                this.lengte + " * " + this. breedte + " * " + this. hoogte + "\n" +
                "oppervlakte: " + oppervlakte() + "\n" +
                "volume: " + volume() + "\n" +
                "tape lengte: " + tapeLengte();
    }
}
