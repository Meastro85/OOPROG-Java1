/**
 * Vincent Verboven
 * 3/10/2022
 */
public class WhileOpdracht {
    public static void main(String[] args) {
        int getal = 120;
        int product = 3;
        int teller = 1;
        int veelvoud = 0;
        int macht = 1;
        int letter = 'A';
        final int maxWaardeProduct = 50;
        final int maxWaardeMacht = 10000;
        while( getal >= 100 ) {
            System.out.println(getal + " ");
            getal--;
        }
        while ( veelvoud < maxWaardeProduct ) {
            System.out.println(veelvoud);
            veelvoud  = teller * product;
            teller++;
        }
        while ( macht < maxWaardeMacht ) {
            System.out.println(macht);
            macht *= 5;
        }
        while( letter <= 'Z'){
            System.out.print((char)letter + " ");
            letter++;
        }

    }
}
