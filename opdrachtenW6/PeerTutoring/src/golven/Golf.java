package golven;

import static java.lang.String.format;

/**
 * Vincent Verboven
 * 28/10/2022
 */
public class Golf {
    private double frequentie;
    private double amplitude;
    private double fase;

    public Golf() {
        this.frequentie = 1.0;
        this.amplitude = 1.0;
        this.fase = 0;
    }

    public void setFrequentie(double frequentie) {
        if (frequentie > 0) {
            this.frequentie = frequentie;
        } else {
            System.out.println("Verkeerde frequentie!");
            System.exit(0);
        }
    }

    public void setAmplitude(double amplitude) {
        if (amplitude > 0) {
            this.amplitude = amplitude;
        } else {
            System.out.println("Verkeerde amplitude!");
            System.exit(0);
        }
    }

    public void setFase(double fase) {
        this.fase = fase;
    }

    public double getYwaarde(double x) {
        return this.amplitude * Math.sin(this.frequentie * x + this.fase);
    }

    @Override
    public String toString() {

        if (amplitude == 1 && frequentie == 1 && fase == 0)
            return String.format("y = sin(x)");
        else if (amplitude != 1 && frequentie != 1 && fase == 0)
            return String.format("y = %.1f * sin(%.1f * x)", amplitude, frequentie);
        else if (amplitude == 1 && fase == 0)
            return String.format("y = sin(%.1f * x)", frequentie);
        else if (frequentie == 1 && fase == 0)
            return String.format("y = %.1f * sin(x)", amplitude);
        else if (amplitude == 1 && fase != 0)
            return String.format("y = sin(%.1f * x %s %.1f)", frequentie, fase < 0 ? "" : "+", fase);
        else if (frequentie == 1 && fase != 0)
            return String.format("y = %.1f * sin(x %s %.1f)", amplitude, fase < 0 ? "" : "+", fase);
        else
            return String.format("y = %.1f * sin(%.1f * x %s %.1f)", amplitude, frequentie, fase < 0 ? "" : "+", fase);
        //  return "y = " + this.amplitude + " * sin(" + this.frequentie + " * x + " + this.fase + ")";
    }
}
