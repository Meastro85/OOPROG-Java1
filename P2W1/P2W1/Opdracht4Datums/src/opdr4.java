import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Vincent Verboven
 * 17/11/2022
 */
public class opdr4 {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE dd-MMM-yyyy HH:mm:ss");
        LocalDateTime nu = LocalDateTime.now();
        System.out.printf("Het is vandaag %s.\n", nu.format(format));
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        LocalDateTime volgend = nu.plusDays(1000);
        System.out.printf("Binnen 1000 dagen is het %s", volgend.format(format2));

        System.out.println("De schrikkeljaren tussen 1995 en 2020 zijn:");
        for(LocalDate i = LocalDate.of(1995,1,1); i.getYear() <= 2020; i = i.plusYears(1)){
            if(i.isLeapYear()){
                System.out.print(i.getYear() + " ");
            }
        }



    }
}
