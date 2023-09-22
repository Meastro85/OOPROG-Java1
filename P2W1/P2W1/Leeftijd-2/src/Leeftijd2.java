import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Vincent Verboven
 * 17/11/2022
 */
public class Leeftijd2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Geef je geboortedag: ");
        int geboortedag = Input.nextInt();
        System.out.print("Geef je geboortemaand: ");
        int geboortemaand = Input.nextInt();
        System.out.print("Geef je geboortejaar: ");
        int geboortejaar = Input.nextInt();

        LocalDate nu = LocalDate.now();
        LocalDate geboorte = LocalDate.of(geboortejaar,geboortemaand, geboortedag);
        Period levenstijd = Period.between(geboorte,nu);
        System.out.printf("Je bent nu %d jaren %d maanden en %d dagen oud.\n", levenstijd.getYears(), levenstijd.getMonths(), levenstijd.getDays());
        System.out.printf("Je bent geboren op een %s.", geboorte.getDayOfWeek());
    }
}
