import java.util.Scanner;

/**
 * Vincent Verboven
 * 21/10/2022
 */
public class Galgje1 {
    public static void main(String[] args) {
        String woord;
        String gok;
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
        for(int i = 0; i < woord.length(); i++){
            System.out.print(".");
        }

        System.out.println();
        System.out.print("Doe een gok: ");
        gok = Input.next();
        teller++;
        while(!gok.equalsIgnoreCase(woord) && teller != 5){
            System.out.println("Fout! Doe een gok: ");
            gok = Input.next();
            teller++;
        }
        if (gok.equalsIgnoreCase(woord)){
            System.out.println("Proficiat, je hebt het woord geraden in " + teller + " beurten!");
        } else if(teller == 5 && !gok.equalsIgnoreCase(woord)){
            System.exit(0);
        }
    }
}
