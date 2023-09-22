import java.util.Scanner;

/**
 * Vincent Verboven
 * 10/10/2022
 */
public class Koortsmeetsysteemstrook {
    public static boolean isPalindroom(String woord){
        boolean palindroom = false;
        for( int i = 0; i < (woord.length());i++){
            if(woord.charAt(i) == woord.charAt(woord.length()- 1 - i)){
                palindroom = true;
            } else {
                palindroom = false;
            }
        }
        return palindroom;
    }
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        String woord = Input.nextLine();
        if(isPalindroom(woord)){
            System.out.println("\"" + woord + "\"" + " is een palindroom!");
        } else{
            System.out.println("\"" + woord + "\"" + " is geen palindroom");
        }
    }
}
