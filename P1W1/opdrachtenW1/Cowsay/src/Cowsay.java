import java.util.Scanner;

/**
 * Vincent Verboven
 * 21/09/2022
 */
public class Cowsay {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Geef een zin: ");
        String zin = Input.nextLine();
        System.out.print(
                "----------------------"+ "\n" +
                        "< " + zin + " >" + "\n" +
                "----------------------" + "\n" +
                        "     \\   ^__^" + "\n" +
                        "      \\  (oo)\\_______" + "\n" +
                        "         (__)\\       )\\/\\ " + "\n" +
        "          U ||----w |" + "\n"+
                "            ||      ||"

        );
    }
}
