package rekenen.plugins;

/**
 * Vincent Verboven
 * 2/12/2022
 */
public class Aftrekking implements Plugin{

    @Override
    public String getCommand() {
        return "-";
    }

    @Override
    public double bereken(double x, double y) {
        return x - y;
    }

    @Override
    public String getAuteur() {
        return null;
    }
}
