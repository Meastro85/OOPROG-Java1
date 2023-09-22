/**
 * Vincent Verboven
 * 5/12/2022
 */
public class TestKaart {
    public static void main(String[] args) {
        DrankKaart drankKaart = new DrankKaart();
        drankKaart.voegDrankToe(
                new Drank("Stella Artois", 2, true));
        drankKaart.voegDrankToe(
                new Drank("Cola", 2, false));
        drankKaart.voegDrankToe(
                new Drank("Sprite", 2, false));
        drankKaart.voegDrankToe(
                new Drank("Mojito", 7.5, true));
        drankKaart.voegDrankToe(
                new Drank("Plat water", 1.75, false));
        drankKaart.voegDrankToe(
                new Drank("Leffe blond", 4.55, true));
        drankKaart.voegDrankToe(
                new Drank("Leffe donker", 4.45, true));
        drankKaart.voegDrankToe(
                new Drank("Negroni", 10.5, true));
        drankKaart.voegDrankToe(
                new Drank("Fruitsap", 3.20, false));

        System.out.println(drankKaart);
        System.out.println(drankKaart.getTotaleprijs());
        System.out.println(drankKaart.duurste());
        System.out.println(drankKaart.getAlcoholischeDranken());

    }
}
