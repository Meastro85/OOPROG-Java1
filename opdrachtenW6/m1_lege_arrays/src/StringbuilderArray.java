/**
 * Vincent Verboven
 * 27/10/2022
 */
public class StringbuilderArray {
    public static void main(String[] args) {
        StringBuilder[] kleuren = {
        new StringBuilder("harten"),
        new StringBuilder("schoppen"),
        new StringBuilder("ruiten"),
        new StringBuilder("klaveren"),};

        for (StringBuilder kleur : kleuren) {
            System.out.println(kleur);
        }
    }
}
