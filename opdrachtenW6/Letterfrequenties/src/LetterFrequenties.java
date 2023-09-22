import java.util.Scanner;

/**
 * Vincent Verboven
 * 24/10/2022
 */
public class LetterFrequenties {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Geef een zin: ");
        String zin = Input.nextLine();
        char[] alfabet = new char[26];
        for(int i = 0; i < 26 ; i++){
            alfabet[i] = (char) (65 + i);
        }
        int[] tellers = new int[26];
        for(int i = 0; i < zin.length(); i++ ){
            for (int t = 0; t < alfabet.length; t++){
                if(zin.toUpperCase().charAt(i) == alfabet[t]){
                    tellers[t]++;
                }
            }
        }
        System.out.println("Letterfrequenties:");
        int t = 1;
        for (int i = 0; i < alfabet.length; i++) {
            if (i == 6 * t ){
                System.out.println();
                t++;
            }
            System.out.printf("%c --> %dx ", alfabet[i], tellers[i]);
        }
        int som = 0;
        for (int teller: tellers) {
            som += teller;
        }
        System.out.println("\nTotaal aantal letters: " + som);
    }
}
