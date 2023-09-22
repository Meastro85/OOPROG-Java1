package Transportmiddelen;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class Step extends Transportmiddel {
    private String geluid;
    private long aantal;

    public Step(double snelheid) {
        super(snelheid);
        geluid = "zzz";
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
