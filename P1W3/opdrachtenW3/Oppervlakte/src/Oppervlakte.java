/**
 * Vincent Verboven
 * 6/10/2022
 */
public class Oppervlakte {
    public static double oppDriehoek(double basis,double hoogte){
        double oppDriehoek = (basis*hoogte)/2;
        return oppDriehoek;
    }
    public static double oppRechthoek(double lengte,double breedte){
        double oppRechthoek = lengte*breedte;
        return oppRechthoek;
    }
    public static double oppCirkel(double straal){
        double oppCirkel = straal * straal * Math.PI;
        return oppCirkel;
    }
    public static void main(String[] args) {
        System.out.println("Oppervlakte van driehoek (5, 3): "
                + oppDriehoek(5,2));
        System.out.println("Oppervlakte van rechthoek (5, 3): "
                + oppRechthoek(5,2));
        System.out.println("Oppervlakte van cirkel (3): "
                + oppCirkel(3));
    }
}
