import java.util.Scanner;

/**
 * Vincent Verboven
 * 19/10/2022
 */
public class dungeonsNDragons {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Hoeveel zijden? ");
        Dobbelsteen Dobbel = new Dobbelsteen(Input.nextInt());
        Input.nextLine();
        for(int i = 0; i < 5 ; i++) {
            System.out.print("Druk <ENTER> om te gooien");
            String ENTER = Input.nextLine();
            if (ENTER.equals("")) {
                System.out.println(Dobbel.gooi());
            }
        }
    }
}