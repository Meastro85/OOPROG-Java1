import java.time.LocalDate;

/**
 * Vincent Verboven
 * 17/11/2022
 */
public class Ramadan {
    public static void main(String[] args) {
        double volgendeRamadan = 29.53*12;
        for(LocalDate ramadan = LocalDate.of(2022,4,2).plusDays((long) volgendeRamadan); ramadan.getYear() <= 2025; ramadan = ramadan.plusDays((long) volgendeRamadan)){
            System.out.println(ramadan);
        }
    }
}
