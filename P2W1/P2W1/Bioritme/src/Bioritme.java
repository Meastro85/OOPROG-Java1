import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Vincent Verboven
 * 17/11/2022
 */
public class Bioritme {
    public static void main(String[] args) {

        String fys = " ";
        String emo = " ";
        String intel = " ";

        Scanner Input = new Scanner(System.in);
        System.out.print("Geef je geboortedag: ");
        int geboortedag = Input.nextInt();
        System.out.print("Geef je geboortemaand: ");
        int geboortemaand = Input.nextInt();
        System.out.print("Geef je geboortejaar: ");
        int geboortejaar = Input.nextInt();

        LocalDate nu = LocalDate.now();
        LocalDate geboorte = LocalDate.of(geboortejaar,geboortemaand, geboortedag);
        long dagenOud = ChronoUnit.DAYS.between(geboorte,nu);

        System.out.println("Je bent vandaag " + dagenOud + " dagen oud.");
        double fysiek = Math.abs(Math.sin(dagenOud / 23.0 * 2 * Math.PI));
        double emotioneel = Math.abs(Math.sin(dagenOud / 28.0 * 2 * Math.PI));
        double intellectueel = Math.abs(Math.sin(dagenOud / 33.0 * 2 * Math.PI));

        if(fysiek <= 0.2){
            fys = "kritieke waarde";
        } else if( fysiek <= 0.5){
            fys = "oké";
        } else if( fysiek <= 0.8){
            fys = "goed";
        } else if( fysiek > 0.8){
            fys = "topconditie";
        }

        if(emotioneel <= 0.2){
            emo = "kritieke waarde";
        } else if( emotioneel <= 0.5){
            emo = "oké";
        } else if( emotioneel <= 0.8){
            emo = "goed";
        } else if( emotioneel > 0.8){
            emo = "topconditie";
        }

        if(intellectueel <= 0.2){
            intel = "kritieke waarde";
        } else if( intellectueel <= 0.5){
            intel = "oké";
        } else if( intellectueel <= 0.8){
            intel = "goed";
        } else if( intellectueel > 0.8){
            intel = "topconditie";
        }

        System.out.printf("""
                Je bioritmes zijn:
                 - fysiek: %s
                 - emotioneel: %s
                 - intellectueel: %s
                """, fys,emo,intel );
    }
}
