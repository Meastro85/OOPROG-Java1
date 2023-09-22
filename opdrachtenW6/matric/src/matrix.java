/**
 * Vincent Verboven
 * 27/10/2022
 */
public class matrix {
    public static void main(String[] args) {
        int[][] demoArray = new int[4][6];
        for(int i = 0; i < demoArray.length; i++ ){
            for(int i2 = 0; i2 < demoArray[i].length; i2++){
                demoArray[i][i2] = (i+1) * (i2+1);
            }
        }

        for (int[] rij : demoArray) {
            for (int kolom : rij){
                System.out.print(kolom + "\t");
            }
            System.out.println();
        }
    }
}
