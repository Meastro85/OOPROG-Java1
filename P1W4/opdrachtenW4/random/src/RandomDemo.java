import java.util.Random;

/**
 * Vincent Verboven
 * 10/10/2022
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random generator = new Random();
        for( int i = 0; i < 6 ; i++){
            System.out.print(generator.nextInt(1,7) + " ");
        }
        System.out.println();
        for( int t = 0; t < 4 ; t++) {
            System.out.print(generator.nextBoolean() + " ");
        }
        System.out.println();
        for ( int a = 0; a < 3 ; a++){
            System.out.print(generator.nextDouble() + " ");
        }
        System.out.println();
        for( int b = 0; b < 10; b++ ){
            System.out.print(generator.nextInt(900,1001) + " ");
        }
        System.out.println();
        for (int c = 0; c < 10 ; c++){
            double getal = generator.nextDouble(10);
            if ( getal > 5 && getal < 10 ) {
                System.out.print(getal + " ");
            } else {
                c--;
            }
        }
        System.out.println();
        for(int d = 0; d < 10 ; d++){
            System.out.print((generator.nextInt(51)*2) + " ");
        }
        System.out.println();
        for (int e = 0; e < 10; e++){
            System.out.print((generator.nextInt(33)*3)+ " ");
        }
    }
}
