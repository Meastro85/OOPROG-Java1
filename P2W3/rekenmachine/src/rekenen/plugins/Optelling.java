package rekenen.plugins;

/**
 * Vincent Verboven
 * 2/12/2022
 */
public class Optelling implements Plugin {

    @Override
    public String getCommand() {
        return "+";
    }

    @Override
    public String getAuteur() {
        return null;
    }

    @Override
    public double bereken(double x, double y) {
        return x + y;

    }
}
