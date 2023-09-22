/**
 * Vincent Verboven
 * 27/10/2022
 */
public class MatrixSom {
    public static void main(String[] args) {
        int[][] eerste = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] tweede = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        int[][] som = new int[3][3];
        //...

        for(int e = 0; e < 3 ; e++){
            for(int t = 0; t < 3; t++){
                som[e][t] = eerste[e][t] + tweede[e][t];
            }
        }
        for(int e = 0; e < 3 ; e++){
            for(int t = 0; t < 3; t++){
                System.out.print(som[e][t] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for ( int[] rij : som) {
            for (int kolom: rij) {
                System.out.print(kolom + " ");
            }
            System.out.println();
        }
    }
}
