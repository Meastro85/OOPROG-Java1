import java.util.Scanner;

/**
 * Vincent Verboven
 * 3/10/2022
 */
public class Graad {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Wat is de graad? ");
        int graad = Input.nextInt();
        if( graad >= 90){
            System.out.println("A");
        } else if( graad >= 80 ){
            System.out.println("B");
        } else if( graad >= 70){
            System.out.println("C");
        } else if( graad >= 60){
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
