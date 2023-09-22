package Transportmiddelen;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class Bus extends Transportmiddel{

    private String geluid;
    private long aantal;

    public Bus(double snelheid) {
        super(snelheid);
        geluid = "vroem";
    }

    @Override
    public void legAfstandAf(double afstand) {
        aantal = Math.round(afstand*10/getSnelheid());
        System.out.println(aantal);
        for (int i = 0; i < aantal; i++){
            if(i == aantal - 1){
                System.out.println(geluid);
            } else {
                System.out.print(geluid + "-");
            }
        }
    }
}
