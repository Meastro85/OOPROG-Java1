/**
 * Vincent Verboven
 * 19/12/2022
 */
public class Main {
    public static void main(String[] args) {
        Getallen getallen = new Getallen();
        getallen.voegToe(Math.PI);
        getallen.voegToe(42);
        getallen.voegToe(1.61803);
        getallen.voegToe(-7);
        Getallen getallen2 = new Getallen(getallen);
        double gemiddelde = getallen2.gemiddelde();
        System.out.println("gemiddelde = " + gemiddelde);
    }
}
