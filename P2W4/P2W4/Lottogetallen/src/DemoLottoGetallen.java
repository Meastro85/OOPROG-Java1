/**
 * Vincent Verboven
 * 8/12/2022
 */
public class DemoLottoGetallen {
    public static void main(String[] args) {
        LottoGetallen getallen = new LottoGetallen();
        for (int i = 0; i < 10; i++) {
            getallen.genereerLottoGetallen();
            System.out.println(getallen.toonLottoGetallen());
        }
    }
}
