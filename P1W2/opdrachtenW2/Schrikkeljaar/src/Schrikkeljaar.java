import java.util.Scanner;

/**
 * Vincent Verboven
 * 26/09/2022
 */
public class Schrikkeljaar {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int jaartal;
        System.out.print("Geef een jaartal: ");
        jaartal = Input.nextInt();
        if( (jaartal%4) == 0 && (jaartal%100) != 0 || (jaartal%400) == 0){
            System.out.println("Het jaar " + jaartal + " is een schrikkeljaar.");
        }else{
            System.out.println("Het jaar " + jaartal + " is geen schrikkeljaar.");
        }
    }
}
