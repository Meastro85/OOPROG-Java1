import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Vincent Verboven
 * 17/11/2022
 */
public class Wapenstilstand {
    public static void main(String[] args) {
        LocalDate wapenstilstand = LocalDate.of(1918,11,11);
        System.out.println("Wapenstilstand (11/11/1918) viel op een: " + wapenstilstand.getDayOfWeek());

        LocalDate[] zondagen = new LocalDate[10];
        for( int startYear = 1980, i = 0; startYear <= 2050; startYear++){
            LocalDate wss = LocalDate.of(startYear,11,11);
            if( wss.getDayOfWeek() == DayOfWeek.SUNDAY){
                zondagen[i] = wss;
                i++;
            }
        }

        System.out.println("In deze jaren valt wapenstilstand op een zondag:");
        for (LocalDate dag : zondagen
             ) {
            System.out.print(dag.getYear() + " ");
        }
    }
}
