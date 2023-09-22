/**
 * Vincent Verboven
 * 24/11/2022
 */
public class Rectangle {

    private int lengte;
    private int breedte;

    public Rectangle(int lengte, int breedte){
        this.lengte = lengte;
        this.breedte = breedte;
    }

    @Override
    public String toString() {
        return String.format("rechthoek met lengte %d en breedte %d", lengte, breedte);
    }
}
