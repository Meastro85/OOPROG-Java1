import java.util.Scanner;

/**
 * Dit programma vraagt 2 getallen aan de gebruikerµ
 * en berekent vervolgens de som van de getallen
 * Vincent Verboven
 * 19/09/2022
 */
public class Som {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef het eerste getal:");
        int eerste = keyboard.nextInt();
        System.out.print("Geef het tweede getal:");
        int tweede = keyboard.nextInt();
        int som = eerste + tweede;
        System.out.println("De som is:" + som);
    }
}