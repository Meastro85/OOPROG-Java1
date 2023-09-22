/**
 * Vincent Verboven
 * 24/10/2022
 */
public class ForEach {
    public static void main(String[] args) {
        int[] getallen = new int[20];
        for(int i = 0; i < 20; i++){
            getallen[i] = (i + 1) * 7;
        }
        for (int getal: getallen) {
            System.out.print(getal + " ");
        }
        System.out.println();
        for (int i = getallen.length -1 ; i >= 0 ; i--){
            System.out.print(getallen[i] + " ");
        }
    }
}
