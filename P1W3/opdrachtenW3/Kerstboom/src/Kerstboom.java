import java.util.Scanner;

/**
 * Vincent Verboven
 * 3/10/2022
 */
public class Kerstboom {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int boomBreedte;
        System.out.print("Geef de breedte van de kerstboom (oneven getal 13...29): ");
        boomBreedte = keyboard.nextInt();
        if(boomBreedte%2 != 1) boomBreedte = 13;

        for(int i = boomBreedte/2+1, j = 1; i != 0; i--, j++ ){
            for(int k = 0; k != boomBreedte/2+1-j;k++){
                System.out.print(" ");
            }
            for(int l = j-1;l!=0;l--){
                System.out.print("**");
            }
            System.out.print("*\n");
        }
        for(int i = 0; i !=4;i++){
            for(int j = 0; j !=boomBreedte/2-1;j++){
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}