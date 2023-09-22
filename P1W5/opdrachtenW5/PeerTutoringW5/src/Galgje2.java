import java.util.Scanner;

/**
 * Vincent Verboven
 * 21/10/2022
 */
public class Galgje2 {
    public static void main(String[] args) {
        String woord;
        char letter;
        int teller = 0;
        Scanner Input = new Scanner(System.in);
        do {
            System.out.print("Geef een woord (max 10 letters): ");
            woord = Input.next();
        } while(woord.length() > 10 || woord.length() < 5);
        for(int i = 0; i < 20; i++){
            System.out.println();
        }
        System.out.print("Het te zoeken woord: ");
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < woord.length(); i++){
            string.append(".");
        }
        System.out.print(string + "\n");
        do{
            System.out.print("Raad een letter: ");
            letter = Input.next().charAt(0);
            for(int i = 0; i < woord.length(); i++){
                if(woord.charAt(i) == letter){
                    string.setCharAt(i, letter);
                }
            }
            System.out.println("Het te zoeken woord: " + string);
            teller++;
        } while(!woord.equalsIgnoreCase(String.valueOf(string)) && teller != 8);
        if(woord.equalsIgnoreCase(String.valueOf(string))){
            System.out.println("Proficiat, je hebt het woord geraden in " + teller + " beurten!");
        } else if(!woord.equalsIgnoreCase(String.valueOf(string)) && teller == 8){
            System.exit(0);
        }
    }
}
