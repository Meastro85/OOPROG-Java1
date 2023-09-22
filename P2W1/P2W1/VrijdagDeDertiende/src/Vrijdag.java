import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Vincent Verboven
 * 17/11/2022
 */
public class Vrijdag {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");

        LocalDate startDate = LocalDate.of(2020,1,1);
        LocalDate eindDate = LocalDate.of(2029,12,31);
        while(!startDate.equals(eindDate)){
            if(startDate.getDayOfWeek() == DayOfWeek.FRIDAY && startDate.getDayOfMonth() == 13){
                System.out.println(startDate.format(format));
            }
            startDate = startDate.plusDays(1);
        }
    }
}
