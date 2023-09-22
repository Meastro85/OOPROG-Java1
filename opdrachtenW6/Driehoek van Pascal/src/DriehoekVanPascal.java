import java.util.Scanner;

/**
 * Vincent Verboven
 * 27/10/2022
 */
public class DriehoekVanPascal {
    public static void main(String[] args) {
        int rijen;
        int kolommen;
        Scanner input = new Scanner(System.in);
        System.out.print("Geef het aantal rijen: ");
        rijen = input.nextInt();
        if(rijen > 12){
            rijen = 12;
        }
        kolommen = rijen;
        int[][] waardes = new int[rijen][kolommen];
        for (int i = 0; i < rijen; i++){
            for( int i2 = 0; i2 < kolommen; i2++){
                if(i2 == 0){
                    waardes[i][i2] = 1;
                } else if(i2 != 0 && i != 0) {
                    waardes[i][i2] = waardes[i - 1][i2] + waardes[i - 1][i2 - 1];
                }
            }
        }
        for ( int[] rij : waardes) {
            for (int kolom: rij) {
                if(kolom == 0){
                    System.out.print(" ");
                } else {
                    System.out.print(kolom + "\t");
                }
            }
            System.out.println();
        }
    }
}
