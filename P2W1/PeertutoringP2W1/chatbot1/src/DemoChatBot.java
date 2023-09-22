import java.util.Scanner;

/**
 * Vincent Verboven
 * 18/11/2022
 */
public class DemoChatBot {
    public static void main(String[] args) {
        String vraag;
        Scanner Input = new Scanner(System.in);
        ChatBot bot1 = new ChatBot("Veronica");
        System.out.println(bot1);
        do {
            vraag = Input.nextLine();
            System.out.println(bot1.antwoordOpVraag(vraag));
        } while(!vraag.equalsIgnoreCase("stop"));

    }

}
