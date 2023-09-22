import java.util.Scanner;

/**
 * Vincent Verboven
 * 24/10/2022
 */
public class WoordLengtes {
    public static void main(String[] args) {
        String[] woorden;
        Scanner Input = new Scanner(System.in);

        System.out.print("Hoeveel woorden ga je intikken? ");
        woorden = new String[Input.nextInt()];

        for(int i = 0; i < woorden.length; i++){
            System.out.print("Woord " + (i +1) + ": ");
            woorden[i] = Input.next();
        }

        int maxLengte = 0;
        for (String woord: woorden){
            if(woord.length()>maxLengte){
                maxLengte = woord.length();
            }
        }

        int minLengte = maxLengte;
        for(String woord: woorden){
            if(woord.length() < minLengte){
                minLengte = woord.length();
            }
        }
        for (String woord: woorden) {
            if (woord.length() == minLengte){
                System.out.println("kortste woord: " + woord);
            } else if (woord.length() == maxLengte) {
                System.out.println("langste woord: " + woord);
            }
        }
    }

}
