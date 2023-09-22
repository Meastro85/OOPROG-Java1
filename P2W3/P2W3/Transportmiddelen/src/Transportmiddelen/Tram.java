package Transportmiddelen;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class Tram extends Transportmiddel {

    private String geluid;
    private long aantal;

    public Tram(double snelheid) {
        super(snelheid);
        geluid = "ting";
    }

    @Override
    public void legAfstandAf(double afstand) {
        aantal = Math.round(afstand * 10 / getSnelheid());
        for (int i = 0; i < aantal; i++) {
            if (i == aantal - 1) {
                System.out.println(geluid);
            } else {
                System.out.print(geluid + "-");
            }
        }
    }
}
