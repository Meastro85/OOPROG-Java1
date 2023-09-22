package rekenen.plugins;

/**
 * Vincent Verboven
 * 2/12/2022
 */
public class Macht implements Plugin{

    @Override
    public String getCommand() {
        return "^";
    }

    @Override
    public double bereken(double x, double y) {
        for(int i = 1; i < y; i++){
            x *= x;
        }
        return x;
    }

    @Override
    public String getAuteur() {
        return null;
    }

}
