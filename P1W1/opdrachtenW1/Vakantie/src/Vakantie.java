import java.util.Scanner;

/**
 * Vincent Verboven
 * 19/09/2022
 */
public class Vakantie {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hoeveel heeft Yousra uitgegeven? ");
        double BedragYousra = keyboard.nextDouble();
        System.out.print("Hoeveel heeft Quinten uitgegeven? ");
        double BedragQuinten = keyboard.nextDouble();
        double SomBedrag = BedragQuinten + BedragYousra;
        System.out.println("Het totale uitgegeven bedrag is: " + SomBedrag + " EUR");
        double BedragPerPersoon = SomBedrag/2;
        System.out.println("Dat is " + BedragPerPersoon + " EUR per persoon");
        if (BedragYousra > BedragQuinten) {
            double TerugBetalenBedrag = BedragYousra - BedragPerPersoon;
            System.out.println("Quinten moet " + TerugBetalenBedrag + " EUR betalen aan Yousra");
        } else if ( BedragQuinten > BedragYousra){
            double TerugBetalenBedrag = BedragQuinten - BedragPerPersoon;
            System.out.println("Yousra moet " + TerugBetalenBedrag + " EUR betalen aan Quinten");
        } else {
            System.out.println("Niemand moet terugbetalen");
        }
    }
}
