/**
 * Vincent Verboven
 * 26/09/2022
 */
public class ASCII {
    public static void main(String[] args) {
        int teller = 0;
        for(int i = 32; i <= 383; i++)
        {
            teller = 0;
            while(teller <= 5 && i <= 383) {
                System.out.print((char)i + "(" + i + ") ");
                i = i + 1;
                teller = teller + 1;
            }
            System.out.println();
        }
    }
}
