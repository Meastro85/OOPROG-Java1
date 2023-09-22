import java.util.Scanner;

/**
 * Vincent Verboven
 * 6/10/2022
 */
public class Wachtwoorden {
    public static boolean controleerWachtwoord(String wachtwoord) {
        boolean Digit = false;
        boolean Letter = false;
        boolean kleineLetter = false;
        boolean groteLetter = false;
        boolean goedWachtwoord = false;
        String error = "";
        if (wachtwoord.length() > 8) {
            for (int i = 0; i < wachtwoord.length(); i++) {
                if (Character.isDigit(wachtwoord.charAt(i)) && !Digit) {
                    Digit = true;
                } else if (!Digit) {
                    error = "minstens 1 cijfer";
                }
                if (Character.isAlphabetic(wachtwoord.charAt(i)) && !Letter) {
                    Letter = true;
                } else if (!Letter) {
                    error = "minstens 1 letter";
                }
                if (Character.isLowerCase(wachtwoord.charAt(i)) && !kleineLetter) {
                    kleineLetter = true;
                } else if (!kleineLetter){
                    error = "minstens 1 kleine letter";
                }
                if (Character.isUpperCase(wachtwoord.charAt(i)) && !groteLetter) {
                    groteLetter = true;
                } else if (!groteLetter) {
                    error = "minstens 1 grote letter";
                }
            }
        } else {
            error = "minstens 8 karakters";
        }
        if (Digit && Letter && kleineLetter && groteLetter){
            goedWachtwoord = true;
        } else {
            System.out.println("FOUT! " + error);
        }
        return goedWachtwoord;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        boolean goedWachtwoord = false;
        String wachtwoord;
        while (goedWachtwoord == false){
            System.out.print("Geef een nieuw wachtwoord: ");
            wachtwoord = Input.nextLine();
            goedWachtwoord = controleerWachtwoord(wachtwoord);
            if (goedWachtwoord){
                System.out.print("Je nieuwe wachtwoord is goedgekeurd!");
            }
        }

    }
}