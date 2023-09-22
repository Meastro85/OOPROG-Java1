import java.util.Scanner;

/**
 * Vincent Verboven
 * 22/09/2022
 */
public class Kassa {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double TotalePrijs10Man;
        double TotalePrijsKleinKind;
        double PrijsKinderen = 26;
        double PrijsVolwassenen = 31;
        double PrijsSenioren = 15.50;
        System.out.print("Aantal kinderen <1m: ");
        int Onder1m = Input.nextInt();
        System.out.print("Aantal kinderen tussen 1m en 1,40m: ");
        int Tussen1m140m = Input.nextInt();
        System.out.print("Aantal volwassenen of kinderen boven 1,40m: ");
        int Volwassenen = Input.nextInt();
        System.out.print("Aantal senioren (55+): ");
        int Senioren = Input.nextInt();
        int AantalPersonen = Onder1m + Tussen1m140m + Volwassenen + Senioren;
        double PrijsZonderKorting = (PrijsKinderen * Tussen1m140m) + (PrijsVolwassenen * Volwassenen) + (PrijsSenioren * Senioren);
        double Grootouderkorting = (PrijsKinderen*Tussen1m140m)/2;
        double Groepskorting = PrijsZonderKorting * 0.1;
        TotalePrijs10Man = PrijsZonderKorting - Groepskorting;
        TotalePrijsKleinKind = PrijsZonderKorting - Grootouderkorting;
        if (TotalePrijsKleinKind < TotalePrijs10Man && Senioren == 2){
            System.out.println("Prijs: " + PrijsZonderKorting);
            System.out.println("Grootouderkorting: -" + Grootouderkorting);
            System.out.println("Totaal: " + TotalePrijsKleinKind);
        } else if (TotalePrijs10Man < TotalePrijsKleinKind && AantalPersonen >= 10){
            System.out.println("Prijs: " + PrijsZonderKorting);
            System.out.println("Groepskorting: -" + Groepskorting);
            System.out.print("Totaal: " + TotalePrijs10Man);
        } else {
            System.out.print("Totaal: " + PrijsZonderKorting);
        }
    }
}
