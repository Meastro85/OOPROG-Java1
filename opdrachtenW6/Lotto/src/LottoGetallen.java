/**
 * Vincent Verboven
 * 24/10/2022
 */
public class LottoGetallen {
    public static void main(String[] args) {
        int[] lottoGetallen = {3, 6, 17, 31, 32, 43};
        for (int lottoGetal : lottoGetallen) {
            System.out.print(lottoGetal + " ");
        }
        System.out.println();
        lottoGetallen[1] = 13;
        for(int i = lottoGetallen.length - 1 ; i >= 0 ; i--){
            System.out.print(lottoGetallen[i] + " ");
        }
    }
}