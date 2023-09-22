import java.util.Scanner;

/**
 * Vincent Verboven
 * 6/10/2022
 */
public class Rangschikken {
    public static long faculteit(int n){
        long i = 1;
        for(int t = 1; t <= n; t++){
            i *= t;
        }
        return i;
    }
    public static void main(String[] args) {
        for(int n = 1; n <= 20; n++ ){
            System.out.println("De faculteit van " + n + " is " + faculteit(n));
        }
    }
}
