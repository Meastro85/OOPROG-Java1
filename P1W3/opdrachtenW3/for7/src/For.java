/**
 * Vincent Verboven
 * 6/10/2022
 */
public class For {
    public static void main(String[] args) {
        for (int r = 1; r <= 10 ; r++){
            for (int k = 1; k <= 10 ; k++){
             int rk = k * r;
                System.out.print(rk + " \t");
            }
            System.out.println();
        }
    }
}
